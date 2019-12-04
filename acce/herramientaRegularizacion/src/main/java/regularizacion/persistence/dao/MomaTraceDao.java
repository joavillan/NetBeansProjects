package regularizacion.persistence.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import regularizacion.persistence.entity.MomaTraceLog;

@Repository("momaTraceDao")
public class MomaTraceDao {
	@Autowired
	private SessionFactory sessionFactory;

	public Map<String, String> getTrazaCreacionByOrders(List<String> numerosOrden) {
		Map<String, String> mapaTrazas = new HashMap<String, String>();
		Session sesion = sessionFactory.getCurrentSession();
		try {
			MomaTraceLog ret = null;
			List<MomaTraceLog> traceLogs = null;
			
			sesion.beginTransaction();
			final org.hibernate.Criteria criteria = sesion.createCriteria(MomaTraceLog.class);
			criteria.add(Restrictions.in("workOrder", numerosOrden));
			criteria.add(Restrictions.eq("envelopeId", "MOMAES0000010000"));

			criteria.addOrder(org.hibernate.criterion.Order.desc("createDate"));
			traceLogs = new ArrayList<MomaTraceLog>(criteria.list());

			if (traceLogs != null && !traceLogs.isEmpty()) {
				for (MomaTraceLog momaTraceLog : traceLogs) {
					if (!mapaTrazas.containsKey(momaTraceLog.getWorkOrder())) {

						mapaTrazas.put(momaTraceLog.getWorkOrder(), new String(momaTraceLog.getMessageStatus()
								.getBytes(1l, (int) momaTraceLog.getMessageStatus().length())));

					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			sesion.close();
		}

		return mapaTrazas;
	}
}

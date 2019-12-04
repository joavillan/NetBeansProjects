package regularizacion.persistence.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import regularizacion.persistence.dao.MomaTraceDao;
@Service("traceService")
public class TraceServiceImpl implements TraceService {
	@Autowired
	private MomaTraceDao momaTraceDao;

	
	@Override
	public Map<String, String> getTrazaCreacionByOrders(List<String> numerosOrden){
		return momaTraceDao.getTrazaCreacionByOrders(numerosOrden);
	}
}

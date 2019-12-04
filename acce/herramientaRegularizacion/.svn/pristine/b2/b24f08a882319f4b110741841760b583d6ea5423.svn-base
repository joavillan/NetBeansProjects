-------- 15.Act x estado Calculo
Select count(distinct act.id_work_order) as num, aux.astatus as estado, to_char(act.create_date, 'YYYY/MM/DD') as dia 
 from MOMAKPIP.MKPI_TL_MOMACON_ACTIVITY act, 
	(select act.id_work_order as id_work_order, act.astatus as astatus 
	 from MOMAKPIP.MKPI_TL_MOMACON_ACTIVITY act, 
		(select id_work_order, max(appt_number) as appt_number 
		 from MOMAKPIP.MKPI_TL_MOMACON_ACTIVITY
		 group by id_work_order 
		) act2
	 where act.id_work_order = act2.id_work_order
	   and act.appt_number=act2.appt_number 
	) aux 
 where act.id_work_order=aux.id_work_order
  and act.create_date > to_date(20160417, 'YYYYMMDD')
  and act.create_date <  (Select trunc(sysdate-7,'IW')+7 from dual)
  and act.id_work_order not in (
		select id_work_order 
		from MOMAKPIP.MKPI_TL_MOMACON_ACTIVITY 
		where create_date < act.create_date
	)
 group by aux.astatus, to_char(act.create_date, 'YYYY/MM/DD')
 order by 3 asc,1 desc
-------------  Intentos de concertación 01.Prod_Cartera Calculo
select count(id_work_order) as num, to_char(sh.create_date, 'YYYY/MM/DD') as fecha 
from MOMAKPIP.MKPI_TL_MOMACON_SCHEDULING_HIS sh 
where sh.create_date > to_date(20160417, 'YYYYMMDD')
  and sh.create_date <  (Select trunc(sysdate-7,'IW')+7 from dual)
  and scheduling_history_action in ('Intento de concertación')
  and id_work_order in (
		select id_work_order 
		from MOMAKPIP.MKPI_TL_MOMACON_ACTIVITY act 
		where act.create_date <= sh.create_date 
	)
  and id_work_order not in (
		select id_work_order 
		from MOMAKPIP.MKPI_TL_MOMACON_SCHEDULING_HIS 
		where to_char(create_date, 'YYYY/MM/DD') = to_char(sh.create_date, 'YYYY/MM/DD') 
		  and scheduling_history_action not in ('Intento de concertación', 'Anulación de concertación') 
	)
group by to_char(sh.create_date, 'YYYY/MM/DD')
order by 2
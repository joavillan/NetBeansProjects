------------- Actividades nuevas 01.Prod_Cartera Calculo
Select count(distinct id_work_order) as num, to_char(act.create_date, 'YYYY/MM/DD') as fecha 
from MOMAKPIP.MKPI_TL_MOMACON_ACTIVITY act 
where act.create_date > to_date(20160417, 'YYYYMMDD')
  and act.create_date <  (Select trunc(sysdate-7,'IW')+7 from dual)
  and id_work_order not in (
	select id_work_order 
	from MOMAKPIP.MKPI_TL_MOMACON_ACTIVITY act2 
	where act2.create_date < act.create_date
	)
group by to_char(act.create_date, 'YYYY/MM/DD')
order by 2
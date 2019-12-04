-------------  Actividades concertadas 01.Prod_Cartera Calculo
SELECT count(DISTINCT id_work_order)AS num, to_char(sh.create_date, 'YYYY/MM/DD') as fecha 
FROM momakpip.mkpi_tl_momacon_scheduling_his sh 
WHERE sh.create_date > to_date(20160417, 'YYYYMMDD')
  and sh.create_date <  (Select trunc(sysdate-7,'IW')+7 from dual)
  AND scheduling_history_action NOT IN ('Intento de concertación', 'Anulación de concertación')
  AND id_work_order IN 
	(SELECT id_work_order FROM momakpip.mkpi_tl_momacon_activity act 
	 WHERE sh.create_date <= sh.create_date)
GROUP BY to_char(sh.create_date, 'YYYY/MM/DD')
ORDER BY 2
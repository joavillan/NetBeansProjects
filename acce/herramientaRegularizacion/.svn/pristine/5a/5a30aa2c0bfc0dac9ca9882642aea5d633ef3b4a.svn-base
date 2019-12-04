--------------------03. Conc x timeslot calculo
select count (distinct sh.id_work_order) as num, to_char(sh.scheduling_date, 'YYYY/MM/DD') as fecha, sh.time_slot as slot 
 from MOMAKPIP.MKPI_TL_MOMACON_SCHEDULING_HIS sh 
 where sh.scheduling_date > to_date(20160417, 'YYYYMMDD')
   and sh.scheduling_date <  (Select trunc(sysdate-7,'IW')+7 from dual)
   and scheduling_history_action  not in ('Intento de concertación', 'Anulación de concertación')
 group by to_char(sh.scheduling_date, 'YYYY/MM/DD'), sh.time_slot
 order by 2, 3
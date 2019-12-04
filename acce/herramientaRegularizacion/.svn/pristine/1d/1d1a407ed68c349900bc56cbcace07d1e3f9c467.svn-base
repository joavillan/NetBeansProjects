--------------------02.Cartera Calculo
select * from (
 select count(distinct id_work_order) as num,  astatus, process_status, bucket from MOMAKPIP.MKPI_TL_MOMACON_ACTIVITY
 where astatus in ('No iniciada')
 group by astatus, process_status, bucket
 Union
 select count(distinct id_work_order) as num,  astatus, process_status, bucket from MOMAKPIP.MKPI_TL_MOMACON_ACTIVITY
 where astatus in ('Fallida')
 and process_status not in ('Finalizada')
 group by astatus, process_status, bucket)
 order by 1 desc
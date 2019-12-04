-------08. Duraci�n de actividades Cal
select a.queue_date as fecha, a.aworktype as tipo, ROUND(SUM(b.length)/count(a.aid), 2) average, a.astatus as estado
 from MOMAKPIP.MKPI_TL_ACTIVITY_DETAILS a, MOMAKPIP.MKPI_TL_ACTIVITY_DET_KPI_H b
 where a.aid=b.aid
 and a.aworktype in ( '35', '34', '53', '29', '15')
 and a.queue_date >= '2016-04-18'
 and a.queue_date is not null
 and a.queue_date = b.queue_date
 and b.length > 0
 and a.astatus in ('complete', 'notdone')
 group by a.queue_date, a.aworktype, a.astatus
 order by 1, 3
--------------------04. Cumplimiento FC calculo
select 
	a1.fwnWeek as fwnWeek, 
	sum(a1.late) as iTotal_Late, 
	sum(a1.ontime) as iTotal_OnTime, 
	sum(a1.early) as iTotal_Early
 from (
	select 
		a.QUEUE_DATE as fwnWeek,
		1 as late, 
		0 as ontime, 
		0 as early
	from MOMAKPIP.MKPI_TL_ACTIVITY_DETAILS a
	where 
		a.SERVICE_WINDOW_START is not null 
		and a.queue_date >= '2016-04-18'
		and a.ETA is not null
		and a.ASTATUS not in ('cancelled', 'pending')
		and a.AWORKTYPE in (15,29,34,35,53)
		and EXTRACT (MINUTE FROM TO_TIMESTAMP( a.ETA , 'YYYY-mm-dd HH24:mi:ss' ) - TO_TIMESTAMP(concat(concat(a.QUEUE_DATE, ' '), a.SERVICE_WINDOW_END), 'YYYY-mm-dd HH24:mi')) > 0
					
	union all

	select 
		a.QUEUE_DATE as fwnWeek,
		0 as late, 
		1 as ontime, 
		0 as early
	from MOMAKPIP.MKPI_TL_ACTIVITY_DETAILS a
	where 
		a.SERVICE_WINDOW_START is not null 
		and a.queue_date >= '2016-04-18'
		and a.ETA is not null
		and a.ASTATUS not in ('cancelled', 'pending')
		and a.AWORKTYPE in (15,29,34,35,53)
		and a.ETA between concat(concat(a.QUEUE_DATE, ' '), a.SERVICE_WINDOW_START) and concat(concat(a.QUEUE_DATE, ' '), a.SERVICE_WINDOW_END)
					
	union all

	select 
		a.QUEUE_DATE as fwnWeek,
		0 as late, 
		0 as ontime, 
		1 as early
	from MOMAKPIP.MKPI_TL_ACTIVITY_DETAILS a
	where 
		a.SERVICE_WINDOW_START is not null 
		and a.queue_date >= '2016-04-18'
		and a.ETA is not null
		and a.ASTATUS not in ('cancelled', 'pending')
		and a.AWORKTYPE in (15,29,34,35,53)
		and a.ETA < concat(concat(a.QUEUE_DATE, ' '), a.SERVICE_WINDOW_START)

	) a1
 group by a1.fwnWeek
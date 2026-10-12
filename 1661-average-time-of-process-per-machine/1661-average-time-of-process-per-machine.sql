# Write your MySQL query statement below
with t1 as(
    select machine_id, ROUND(sum(timestamp),3) as end_time
from Activity
where activity_type="end"
group by machine_id
),
t2 as(
select machine_id, ROUND(sum(timestamp),3) as start_time
from Activity
where activity_type="start"
group by machine_id
),
t3 as(
select machine_id,count(process_id)/2 as total
from Activity
group by machine_id
),
t4 as(
select t1.machine_id, t1.end_time, t2.start_time, t3.total
from t1
join t2 on t1.machine_id=t2.machine_id
join t3 on t2.machine_id=t3.machine_id
)
select machine_id, ROUND((end_time-start_time)/total,3) as processing_time
from t4
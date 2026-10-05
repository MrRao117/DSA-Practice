# Write your MySQL query statement below
with t1 as(
select t.* from Trips t
join Users u1 on t.client_id = u1.users_id
    join Users u2 on t.driver_id = u2.users_id
    where u1.banned = 'No' and u2.banned = 'No'
    and t.request_at between '2013-10-01' and '2013-10-03')

, t2 as (
    select count(id) as total , request_at from t1 group by request_at
)

, t3 as (
    select count(id) as cancelled, request_at from t1 where status='cancelled_by_driver' or status='cancelled_by_client' group by request_at
)

, t4 as (
    select t2.total, t3.cancelled, t2.request_at
    from t2
    left join t3
    on t2.request_at=t3.request_at
)

, t5 as (
    select request_at as Day, ROUND(CAST(COALESCE(cancelled, 0) AS DECIMAL(10, 4)) / total, 2) AS 'Cancellation Rate'
    from t4
)
select * from t5;
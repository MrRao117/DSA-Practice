# Write your MySQL query statement below
with t1 as (
    select count(players) as total from(
    select distinct player_id as players from Activity
    ) as f1
),
first_login as(
    select player_id, min(event_date) as firstLogin
    from Activity
    group by player_id
),
t2 as (
    select count(a1.player_id) as single
    from Activity as a1
    join first_login as f
    on a1.player_id=f.player_id
    and a1.event_date=date_add(f.firstLogin, interval 1 day)
    -- where a1.event_date = a2.event_date(interval )
)

select round(cast(t2.single as decimal(10,4))/t1.total,2) as fraction
from t1
cross join t2;
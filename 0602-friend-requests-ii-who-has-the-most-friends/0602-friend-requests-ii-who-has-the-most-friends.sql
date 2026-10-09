# Write your MySQL query statement below
-- select r1.accepter_id as id
-- from RequestAccepted r1
-- join RequestAccepted r2 
-- on 

-- select if
-- from RequestAccepted r1
-- where id in (
--     select count(accepter_id) as id
--     from RequestAccepted
--     group by requester_id

--     union

--     select count(requester_id) as id
--     from RequestAccepted
--     group by accepter_id
-- )

with t1 as 
(select requester_id as id, count(accepter_id) as num
    from RequestAccepted
    group by requester_id

    union all

    select accepter_id as id, count(requester_id) as num
    from RequestAccepted
    group by accepter_id
),
t2 as(
    select id, sum(num) as num
    from t1
    group by id
)
select id, num
from t2
order by num desc
limit 1;
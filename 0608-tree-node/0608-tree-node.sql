# Write your MySQL query statement below
-- with t1 as(
--     select id, p_id
-- from Tree 
-- order by p_id desc
-- ),
-- t2 as(

-- )

select id, 
    case
        when p_id is null then 'Root'
        when id not in (select p_id from Tree where p_id is not null) then 'Leaf'
        else 'Inner'
        end as 'type'
from Tree
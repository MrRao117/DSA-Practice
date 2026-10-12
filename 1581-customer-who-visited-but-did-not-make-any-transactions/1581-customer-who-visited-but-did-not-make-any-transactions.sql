# Write your MySQL query statement below
with t1 as(
select v.customer_id, t.transaction_id
from Visits v
left join Transactions t
on v.visit_id = t.visit_id
),
t2 as( 
select customer_id,transaction_id
from t1
where transaction_id is null
)
select customer_id, count(*) as count_no_trans
from t2
group by customer_id
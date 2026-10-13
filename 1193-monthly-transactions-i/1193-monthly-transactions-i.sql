# Write your MySQL query statement below
-- with t1 as(
--     select date_format(trans_date, '%Y-%m') as month, country,
-- count(id) as approved_count, sum(amount) as approved_total_amount
-- from Transactions
-- where state='approved'
-- group by country,month
-- ),
-- t2 as(
--     select date_format(trans_date, '%Y-%m') as month, country, count(id) as trans_count, sum(amount) as trans_total_amount
--     from Transactions
--     group by month, country
-- )
-- select distinct t1.month, t1.country, t1.approved_count, approved_total_amount, t2.trans_count, trans_total_amount
-- from t2
-- left join t1
-- on t1.month=t2.month

select  date_format(trans_date, '%Y-%m') as month,
country,
count(id) as trans_count,
sum(state="approved") as approved_count,
sum(amount) as trans_total_amount,
sum(case when state="approved" then amount else 0 end) as approved_total_amount
from Transactions
group by date_format(trans_date, '%Y-%m'), country
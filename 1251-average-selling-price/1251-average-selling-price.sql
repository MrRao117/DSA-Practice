# Write your MySQL query statement below
with t1 as(
    select p.product_id, coalesce(p.price, 0.00) as price, coalesce(u.units,0.00) as units
from Prices p
left join UnitsSold u
on p.product_id = u.product_id
and u.purchase_date
between p.start_date
and p.end_date
),
t2 as(
    select product_id, (units*price) as total, units
from t1
)
select product_id, coalesce(round(sum(total)/sum(units), 2),0) as average_price
from t2
group by product_id

# Write your MySQL query statement below
with ranked_data as (
    select 
    delivery_id,
    customer_id, 
    order_date,
    customer_pref_delivery_date, 
    row_number() over( partition by customer_id order by order_date asc) as rn
    from Delivery
)

select round(
    sum(order_date=customer_pref_delivery_date)*100.0/count(*), 2) 
    as immediate_percentage
from ranked_data
where rn=1 
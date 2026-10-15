# Write your MySQL query statement below
-- with t1 as(
--     select product_id, 10 as price
-- from Products
-- where change_date>'2019-08-16'
-- and product_id not in (
--     select product_id 
--     from Products
--     where change_date<'2019-08-16'
-- )),
-- t2 as(
-- select product_id , new_price as price
-- from Products
-- where change_date='2019-08-16'
-- ),
-- t3 as(
-- select product_id, new_price as price
-- from Products
-- where change_date<'2019-08-16' and 
-- product_id in (
--     select product_id
--     from Products
--     where change_date>'2019-08-16'
-- )),
-- t4 as (
--     select product_id, new_price as price
--     from Products
--     where change_date<'2019-08-16'
--     and product_id not in (
--         select product_id 
--         from Products
--         where change_date>='2019-08-16'
--     )
-- )

-- select * from t1
-- union
-- select * from t2
-- union
-- select * from t3
-- union 
-- select * from t4

SELECT product_id, new_price AS price
FROM Products
WHERE (product_id, change_date) IN (
    SELECT product_id, MAX(change_date)
    FROM Products
    WHERE change_date <= '2019-08-16'
    GROUP BY product_id
)

UNION

SELECT DISTINCT product_id, 10 AS price
FROM Products
WHERE product_id NOT IN (
    SELECT product_id
    FROM Products
    WHERE change_date <= '2019-08-16'
);
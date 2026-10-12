# Write your MySQL query statement below
-- with t1 as(
--     select s.user_id, c.action
--     from Signups s
--     left join Confirmations c
--     on s.user_id=c.user_id
-- ),
-- t2 as(
--     select user_id, count(action) as total
--     from t1
--     group by user_id
-- ),
-- t3 as(
--     select user_id, count(user_id) as confirmed
--     from t1
--     where action='confirmed'
--     group by user_id
-- )
-- select t2.user_id, ROUND(t3.confirmed/t2.total,2) as confirmation_rate
-- from t2
-- join t3
-- on t2.user_id=t3.user_id



select s.user_id,
    round(ifnull(sum(c.action='confirmed')/count(c.user_id),0),2) as confirmation_rate
    from Signups s
    left join Confirmations c
    on s.user_id=c.user_id
    group by s.user_id
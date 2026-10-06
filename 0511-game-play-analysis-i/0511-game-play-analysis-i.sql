# Write your MySQL query statement below

-- with t1 as (
--     SELECT player_id, event_date,
-- dense_rank() over(
--     partition by player_id order by event_date) as ranking
-- from Activity)

-- select player_id, event_date as first_login from t1 where ranking=1;

select player_id, MIN(event_date) as first_login from Activity group by player_id;
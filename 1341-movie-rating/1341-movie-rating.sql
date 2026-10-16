# Write your MySQL query statement below
with t1 as(
    select u.name as results
from Users u
join MovieRating r
on u.user_id = r.user_id
group by r.user_id
order by count(r.movie_id) desc , u.name 
limit 1
),
t2 as(
    select m.title as results
    from Movies m
    join MovieRating r
    on m.movie_id = r.movie_id
    where year(r.created_at)='2020' and month(r.created_at)='02'
    group by r.movie_id
    order by avg(r.rating) desc, m.title asc
    limit 1
)
select * from t1 
union all
select * from t2


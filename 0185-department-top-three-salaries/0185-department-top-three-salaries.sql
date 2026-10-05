# Write your MySQL query statement below

with t1 as 
(select d.name as Department, e.name as Employee, e.salary as Salary,
dense_rank() over (partition by d.name order by e.salary desc) as ranking
from Employee e
join Department d
on e.departmentId=d.id)
-- order by e.departmentId)

select Department, Employee, Salary 
from t1 where ranking<=3;

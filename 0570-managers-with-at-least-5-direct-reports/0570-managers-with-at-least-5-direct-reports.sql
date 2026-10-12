# Write your MySQL query statement below
with t1 as(
    select  managerId from Employee 
    group by managerId
    having count(id)>4
)

select name from 
Employee e
join t1 
on e.id=t1.managerId
-- where id in t1;

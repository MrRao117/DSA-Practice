# Write your MySQL query statement below

SELECT d.name AS Department, e.name AS Employee, e.salary as Salary
FROM Employee e
JOIN Department d
on e.departmentId=d.id
where e.salary = (
    select max(e2.salary)
    from Employee e2
    where e2.departmentId = d.id
);

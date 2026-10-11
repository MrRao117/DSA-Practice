# Write your MySQL query statement below
-- select id, name,
--     case sex
--     when 'm' then sex='f'
--     else sex='m'
--     end as sex, salary
--     from Salary

update Salary
set sex =  case
    when sex='m' then 'f'
    else 'm'
    end
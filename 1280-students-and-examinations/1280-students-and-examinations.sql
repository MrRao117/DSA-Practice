# Write your MySQL query statement below
-- select s.student_id,s.student_name,
-- e.subject_name, count(*)
-- from Students s
-- join Examinations e 
-- on s.student_id=e.student_id
-- right join Subjects s1
-- on s1.subject_name=e.subject_name
-- group by student_name,subject_name
-- order by s.student_id

select s1.student_id, s1.student_name, s2.subject_name, count(e.subject_name) as attended_exams
from Students s1
cross join Subjects s2
left join Examinations e
on s1.student_id=e.student_id and s2.subject_name=e.subject_name
group by s1.student_id, s1.student_name, s2.subject_name
order by s1.student_id, s2.subject_name
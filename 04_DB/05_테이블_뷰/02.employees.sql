use employees;

create view employees_view
as
select e.emp_no, e.birth_date, e.first_name, e.last_name, e.gender, e.hire_date, t.title, t.from_date as t_from, t.to_date as t_to, s.salary, s.from_date as s_from, s.to_date as s_to
from employees e
inner join salaries s on e.emp_no = s.emp_no
inner join titles t on e.emp_no = t.emp_no;

select *
from employees_view
where s_to = '9999-01-01' and t_to = '9999-01-01';

create view emp_dept_info
as
select e.emp_no, e.dept_no, d.dept_name, e.from_date, e.to_date
from dept_emp e
inner join departments d on e.dept_no = d.dept_no
order by e.emp_no;

select *
from emp_dept_info
where to_date='9999-01-01';
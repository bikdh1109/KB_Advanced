use employees;

select *
from dept_manager;

select *
from employees;

select *
from employees
where emp_no in (select emp_no from dept_manager where year(to_date) = 9999);

select *
from employees
where emp_no in (select emp_no from dept_manager where dept_no = 'd005' and year(to_date) = 9999);

select *
from employees
order by hire_date desc
limit 20 offset 140;

select count(*)
from dept_emp
where year(to_date) = 9999;

select avg(salary) as 평균급여
from salaries
where year(to_date) = 9999;

select *
from employees
where emp_no in
      (select emp_no
       from salaries
       where salary >= (select avg(salary)
                        from salaries
                        where year(to_date) = 9999) and year(to_date) =9999);

select  dept_no,count(*) as 재직자수
from dept_emp
where year(to_date) = 9999
group by dept_no;
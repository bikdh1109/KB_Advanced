use employees;

-- 현재 재직 중인 직원의 정보를 출력하세요
-- 출력 항목: emp_no, first_name, last_name, title
select e.emp_no, e.first_name, e.last_name, t.title
from employees e
         inner join titles t on e.emp_no = t.emp_no
where t.to_date = '9999-01-01';

-- 현재 재직 중인 직원 정보를 출력하세요
-- 출력항목: 직원의 기본 정보 모두, title, salary
select e.emp_no,
       e.birth_date,
       e.first_name,
       e.last_name,
       e.gender,
       e.hire_date,
       t.title,
       s.salary
from employees e
         inner join titles t on e.emp_no = t.emp_no
         inner join salaries s on e.emp_no = s.emp_no;

-- 현재 재직중인 직원의 정보를 출력하세요.
-- 출력항목: emp_no, first_name, last_name, department
-- 정렬: emp_no 오름 차순

select e.emp_no, e.first_name, e.last_name, d.dept_name
from employees e
inner join dept_emp de on e.emp_no = de.emp_no
inner join departments d on de.dept_no = d.dept_no
where de.to_date='9999-01-01'
order by emp_no;

-- 부서별 재직중인 직원의 수를 출력하세요.
-- 출력 항목: 부서 번호, 부서명, 인원수
-- 정렬: 부서 번호 오름차순
select de.dept_no, d.dept_name, count(*) as '직원수'
from dept_emp de
inner join departments d on de.dept_no = d.dept_no
where de.to_date='9999-01-01'
group by de.dept_no
order by de.dept_no;

-- 직원 번호가 10209인 직원의 부서 이동 히스토리를 출력하세요.
-- 출력항목: emp_no, first_name, last_name, dept_name, from_date, to_date
select *
from dept_emp
where emp_no=10209;

select e.emp_no, e.first_name, e.last_name, d.dept_name, de.from_date, de.to_date
from employees e
inner join dept_emp de on e.emp_no = de.emp_no
inner join departments d on de.dept_no = d.dept_no
where de.emp_no = 10209;
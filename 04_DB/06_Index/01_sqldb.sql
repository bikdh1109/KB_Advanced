use sqldb;

select *
from usertbl;

show index from usertbl;

create index idx_usertbl_addr on usertbl(addr);
show index from usertbl;

analyze table usertbl;


select *
from usertbl;

-- birthYear 컬럼에 대해 idx_usertbl_birthYear 이름의 인덱스를 만드세요.
-- 에러가 난다면 그 이유를 설명하세요.
-- name 컬럼에 대해 idx_usertbl_nam 이름의 인덱스를 만드세요
-- 생성된 인덱스의 목록을 확인하세요.
create index idx_usertbl_birthYear on usertbl(birthYear);
create index idx_usertbl_nam on usertbl(name);
show index from usertbl;

drop index idx_usertbl_nam on usertbl;

create index idx_usertbl_name_birthYear on usertbl(name,birthYear);
show index from usertbl;

drop index idx_usertbl_name_birthYear on usertbl;

create user 'scoula'@'localhost' identified by '1234';
grant all privileges on scoula_db.* to 'scoula'@'localhost';

create table demo.emp_photo(
id int not null,
photo bytea not null,
primary key(id)
);

create or replace function sum(IN n1 numeric, IN n2 numeric, OUT result numeric)
AS $$
BEGIN
	result := n1 + n2;
END; $$
LANGUAGE plpgsql;

select sum(10,20);
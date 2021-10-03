create table if not exists сhat.users
(
	id serial
		constraint users_pk
			primary key,
	name varchar(32)
);

alter table сhat.users owner to postgres;

create unique index if not exists users_name_index
	on сhat.users (upper(name::text));


create table if not exists сhat.chats
(
	id serial
		constraint chats_pk
			primary key,
	name varchar(255)
);

alter table сhat.chats owner to postgres;


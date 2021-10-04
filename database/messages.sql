create table if not exists сhat.messages
(
	id bigint default nextval('"сhat".messages_id_seq'::regclass) not null
		constraint messages_pk
			primary key,
	chat_id integer
		constraint messages_chats_id_fk
			references сhat.chats,
	user_id integer
		constraint messages_users_id_fk
			references сhat.users,
	message varchar(4096)
)
partition by RANGE (id);

alter table сhat.messages owner to postgres;


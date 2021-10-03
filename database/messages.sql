create table if not exists сhat.messages
(
	id bigserial
		constraint messages_pk
			primary key,
	chat_id integer
		constraint messages_chats_id_fk
			references сhat.chats,
	user_id integer
		constraint messages_users_id_fk
			references сhat.users,
	message varchar(4096)
);

alter table сhat.messages owner to postgres;

create index if not exists messages_chat_id_id_index
	on сhat.messages (chat_id, id);


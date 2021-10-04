create table if not exists сhat.chats_users
(
	chat_id integer not null
		constraint chats_users_chats_id_fk
			references сhat.chats
		constraint chats_users_users_id_fk
			references сhat.users,
	user_id integer not null,
	constraint chats_users_pk
		primary key (chat_id, user_id)
);

alter table сhat.chats_users owner to postgres;

create index if not exists chats_users_chat_id_index
	on сhat.chats_users (chat_id);

create index if not exists chats_users_user_id_index
	on сhat.chats_users (user_id);


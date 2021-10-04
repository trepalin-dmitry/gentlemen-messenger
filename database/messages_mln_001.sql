create table if not exists сhat.messages_mln_001
partition of сhat.messages
(
	constraint messages_mln_001_pkey
		primary key (id),
	constraint messages_chats_id_fk
		foreign key (chat_id) references сhat.chats,
	constraint messages_users_id_fk
		foreign key (user_id) references сhat.users
)
FOR VALUES FROM ('1') TO ('1000001');

alter table сhat.messages_mln_001 owner to postgres;

create index if not exists messages_mln_001_chat_id_id_idx
	on сhat.messages_mln_001 (chat_id, id);


create sequence сhat.chats_id_seq
	as integer;

alter sequence сhat.chats_id_seq owner to postgres;

alter sequence сhat.chats_id_seq owned by сhat.chats.id;


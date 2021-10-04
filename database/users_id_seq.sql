create sequence сhat.users_id_seq
	as integer;

alter sequence сhat.users_id_seq owner to postgres;

alter sequence сhat.users_id_seq owned by сhat.users.id;


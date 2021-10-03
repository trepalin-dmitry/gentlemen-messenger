create sequence сhat.messages_id_seq;

alter sequence сhat.messages_id_seq owner to postgres;

alter sequence сhat.messages_id_seq owned by сhat.messages.id;


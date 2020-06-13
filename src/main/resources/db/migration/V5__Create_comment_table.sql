create table comment
(
	id BIGINT auto_increment PRIMARY KEY,
	parent_id BIGINT not null,
	type int not null,
	commenter int not null,
	gmt_create BIGINT not null,
	gmt_modify BIGINT not null,
	like_counter BIGINT default 0,
);

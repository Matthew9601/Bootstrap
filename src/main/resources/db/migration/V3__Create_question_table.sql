CREATE TABLE question
(
    id INT AUTO_INCREMENT PRIMARY KEY,
	title VARCHAR(50),
	description TEXT,
	gmt_create BIGINT,
	gmt_modify BIGINT,
	creator INT,
	comment_counter INT DEFAULT 0,
	view_counter INT DEFAULT 0,
	like_counter INT DEFAULT 0,
	tag VARCHAR(256)
);
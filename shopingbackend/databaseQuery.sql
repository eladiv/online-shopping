CREATE TABLE category (
	id int  AUTO_INCREMENT,
	name VARCHAR(50),
	description VARCHAR(255),
	imageURL VARCHAR (50),
	is_active BOOLEAN,
	
	CONSTRAINT pk_category_id PRIMARY KEY (id)
);
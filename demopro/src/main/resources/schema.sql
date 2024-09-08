DROP TABLE Book_Tbl IF EXISTS;

CREATE TABLE Book_Tbl (
	book_Id bigint NOT NULL AUTO_INCREMENT,
	title VARCHAR(50) NOT NULL,
	author VARCHAR(20) NOT NULL,
	price integer NOT NULL,
	Read_Date_Time timestamp(4),
	PRIMARY KEY(book_Id)
);
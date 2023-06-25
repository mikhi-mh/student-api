CREATE TABLE student (
                         roll_number INT PRIMARY KEY AUTO_INCREMENT,
                         first_name VARCHAR(50) NOT NULL,
                         last_name VARCHAR(50) NOT NULL,
                         middle_name VARCHAR(50),
                         email_id VARCHAR(50) NOT NULL,
                         gender VARCHAR(10) NOT NULL,
                         birth_date DATE NOT NULL,
                         percentage DOUBLE NOT NULL,
                         mobile_number BIGINT NOT NULL
);
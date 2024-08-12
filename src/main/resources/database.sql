-- Drop the database if it exists
DROP DATABASE IF EXISTS `web_customer_tracker`;

-- Create the database if it does not exist
CREATE DATABASE IF NOT EXISTS `web_customer_tracker`;

-- Use the newly created database
USE `web_customer_tracker`;

-- Create the `customer` table
CREATE TABLE `customer` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) DEFAULT NULL,
  `last_name` VARCHAR(45) DEFAULT NULL,
  `email` VARCHAR(45) NOT NULL UNIQUE,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- Insert sample data into the `customer` table
INSERT INTO `customer` (`id`, `first_name`, `last_name`, `email`) VALUES 
	(1, 'David', 'Adams', 'david@luv2code.com'),
	(2, 'John', 'Doe', 'john@luv2code.com'),
	(3, 'Ajay', 'Rao', 'ajay@luv2code.com'),
	(4, 'Mary', 'Public', 'mary@luv2code.com'),
	(5, 'Maxwell', 'Dixon', 'max@luv2code.com');

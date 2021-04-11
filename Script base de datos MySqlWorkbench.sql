CREATE database db_products;

use  db_products;

CREATE TABLE productos(
id_product MEDIUMINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
title VARCHAR(100) NOT NULL,
some_description TEXT NOT NULL,
price DOUBLE NOT NULL,
discount INT,
image TEXT
);

select * from productos;

drop table productos;
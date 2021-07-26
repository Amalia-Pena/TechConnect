BEGIN TRANSACTION;

CREATE TABLE customer
(
	customerId serial,
	name varchar(64) not null,
	address varchar(100) not null,
	phone varchar(11) null,

	constraint pk_customer primary key (customerId)
);

CREATE TABLE artist
(
	artistId serial,
	firstName varchar(64) not null,
	lastName varchar(64) not null,

	constraint pk_artist primary key (artistId)
);

CREATE TABLE art
(
	artId serial,
	title varchar(64) not null,
	artistId int not null,

	constraint pk_art primary key (artId),
	constraint fk_art_artists foreign key (artistId) references artists (artistId)
);

CREATE TABLE customer_purchase
(
	customerId int not null,
	artId int not null,
	purchaseDate date not null,
	price money not null,

	constraint pk_customer_purchases primary key (customerId, artId, purchaseDate),
	constraint fk_customer_purchases_customer foreign key (customerId) references customers (customerId),
	constraint fk_customer_purchases_art foreign key (artId) references art(artId)
);


COMMIT TRANSACTION;




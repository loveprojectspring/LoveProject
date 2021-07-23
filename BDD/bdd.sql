drop database if exists `loveAppDB`;

create database if not exists `loveAppDB`;

use loveAppDB;

create table if not exists `Lover` (
    `id` int unsigned auto_increment,
    `name` varchar(255) not null,

    primary key (`id`)
);

create table if not exists `Match` (
    `id` int unsigned auto_increment,
    `id_lover1` int unsigned,
    `id_lover2` int unsigned,
    `percentage` varchar(10),
    `result` varchar(255),
    `bestMatch` boolean,

    primary key (`id`),
    foreign key (`id_lover1`)
        references Lover(`id`),
    foreign key (`id_lover2`)
        references Lover(`id`)
    );


INSERT INTO `Lover` (`id`, `name`)
VALUES
(1, 'Eslam'),
(2, 'Nicolas'),
(3, 'Matthieu'),
(4, 'Clément');

INSERT INTO `Match` (`id`, `id_lover1`, `id_lover2`, `percentage`, `result`, `bestMatch`)
VALUES
(1, 2, 4, '99%', 'love at first sight', 1),
(1, 1, 3, '97%', 'meant for each other', 0);


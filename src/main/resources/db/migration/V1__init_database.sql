create sequence customers_seq start with 1 increment by 50;

create table customers
(
    id    bigint DEFAULT nextval('customers_seq') not null,
    name  varchar                                 not null,
    email varchar                                 not null,
    primary key (id)
);

insert into customers(name, email)
values ('john', 'john@mail.com'),
       ('rambo', 'rambo@mail.com');

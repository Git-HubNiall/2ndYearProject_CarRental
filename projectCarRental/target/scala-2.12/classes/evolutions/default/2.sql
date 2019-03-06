# --- Sample dataset
 
# --- !Ups
 
delete from item_on_sale;
 
insert into category (id,name) values ( 1,'Five seaters' );
insert into category (id,name) values ( 2,'Seven seaters' );
insert into category (id,name) values ( 3,'Mini Buses' );

 
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 1,1,'Kia Sportage','2017 1.7 5dr diesel estate,',5, 10.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 2,1,'Citreon','2015 2.0 5dr diesel',5, 8.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 3,1,'Range Rover Evoque','2016 2.2 2WD diesel hatchback',8, 8.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 4,1,'Nissan Qashqui','2017 1.6 5dr diesel',10, 10.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 5,2,'Volkswagen Sharan','2018 automatic diesel',6,8.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 6,2,'Vauxall Zafira','2018 2.0 diesel',5,8.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 7,2,'Audi Q7','2017 5dr Tip auto diesel estate',8, 10.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 8,3,'Citreon Space-tourer','2016 1.5 9-seat diesel',8, 15.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 9,3,'Toyota Proace verso','2017 2.0 diesel estate',8,15.00 );
insert into item_on_sale (id,category_id,name,description,stock,price) values ( 10,3,'Peugeot Expert','2015 1.6 5dr diesel estate',6,10.00 );
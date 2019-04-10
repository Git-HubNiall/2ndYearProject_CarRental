# --- Sample dataset
 
# --- !Ups
 
delete from item_on_sale;

insert into category (id,name) values ( 1,'Five seaters' );
insert into category (id,name) values ( 2,'Seven seaters' );
insert into category (id,name) values ( 3,'Mini Buses' );

 
insert into item_on_sale (id,name,description,stock,price) values ( 1,'Kia Sportage','2017 1.7 5dr diesel estate,',140, 10.00 );
insert into item_on_sale (id,name,description,stock,price) values ( 2,'Citreon','2015 2.0 5dr diesel',140, 8.00 );
insert into item_on_sale (id,name,description,stock,price) values ( 3,'Range Rover Evoque','2016 2.2 2WD diesel hatchback',140, 8.00 );
insert into item_on_sale (id,name,description,stock,price) values ( 4,'Nissan Qashqui','2017 1.6 5dr diesel',140, 10.00 );
insert into item_on_sale (id,name,description,stock,price) values ( 5,'Volkswagen Sharan','2018 automatic diesel',154,8.00 );
insert into item_on_sale (id,name,description,stock,price) values ( 6,'Vauxall Zafira','2018 2.0 diesel',126,8.00 );
insert into item_on_sale (id,name,description,stock,price) values ( 7,'Audi Q7','2017 5dr Tip auto diesel estate',140, 10.00 );
insert into item_on_sale (id,name,description,stock,price) values ( 8,'Citreon Space-tourer','2016 1.5 9-seat diesel',168, 15.00 );
insert into item_on_sale (id,name,description,stock,price) values ( 9,'Toyota Proace verso','2017 2.0 diesel estate',140,15.00 );
insert into item_on_sale (id,name,description,stock,price) values ( 10,'Peugeot Expert','2015 1.6 5dr diesel estate',140,10.00 );


insert into CATEGORY_ITEM_ON_SALE(category_id,item_on_sale_id) values (1,1);
insert into CATEGORY_ITEM_ON_SALE(category_id,item_on_sale_id) values (1,2); 
insert into CATEGORY_ITEM_ON_SALE(category_id,item_on_sale_id) values (1,3);
insert into CATEGORY_ITEM_ON_SALE(category_id,item_on_sale_id) values (1,4);
insert into CATEGORY_ITEM_ON_SALE(category_id,item_on_sale_id) values (2,5);
insert into CATEGORY_ITEM_ON_SALE(category_id,item_on_sale_id) values (2,6);
insert into CATEGORY_ITEM_ON_SALE(category_id,item_on_sale_id) values (2,7);
insert into CATEGORY_ITEM_ON_SALE(category_id,item_on_sale_id) values (3,8);
insert into CATEGORY_ITEM_ON_SALE(category_id,item_on_sale_id) values (3,9);
insert into CATEGORY_ITEM_ON_SALE(category_id,item_on_sale_id) values (3,10);

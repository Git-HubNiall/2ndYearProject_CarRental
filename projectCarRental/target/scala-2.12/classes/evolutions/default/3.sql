# --- !Ups

delete from user;

insert into user (type, email, role, name, password, Street1, Street2, Town, Post_code, credit_card) values ( 'a','admin@ocr.com', 'Alice Admin', 'password', 'admin', null, null, null, null, null); 
insert into user (type, email, role, name, password, Street1, Street2, Town, Post_code, credit_card) values ( 'c','joy@ocr.com', 'Joy Thompson', 'password', 'customer', 'Dublin', 'Dublin', 'Dublin', 'Dublin', '4000056655665556');
insert into user (type, email, role, name, password, Street1, Street2, Town, Post_code, credit_card) values ( 'c','aaron@ocr.com', 'Aaron OConnor', 'password', 'customer', 'Dublin', 'Dublin', 'Dublin', 'Dublin', '4242424242424242');
insert into user (type, email, role, name, password, Street1, Street2, Town, Post_code, credit_card) values ( 'c','Niall@ocr.com', 'Niall OReilly', 'password', 'customer', 'Wicklow', 'Wicklow', 'Wicklow', 'Wicklow', '5555 5555 5555 4444'); 

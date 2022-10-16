create database game_Card
use game_Card
create table Product_Detail(
	Product_Card_Number varchar(255) primary key,
	Product_Name varchar(255)  null,
	Product_Level int   null,
	Product_Attribute varchar(255)  null,
	Product_Type varchar(255)  null,
	Product_Attack_Points int  null,
	Product_Defense_Points int  null,
	Product_Description varchar(5000)  null,
	Product_Img text null,
	Product_Price int  null,
	Product_Quantity int  null
); 
drop table Product_Detail


create table Customer (
	CustomerID varchar(255) primary key,
	Customer_Name varchar(255) null,
	Customer_Address varchar(255) null,
	Cutomer_Phone int,
	Customer_UserName varchar(255) null,
	Customer_PassWord varchar(255 ) null
);
drop table Administrators
create table Administrators (
	Admin_UserName varchar(255) primary key,
	Admin_PassWord varchar(255)
);

create table Order_Detail(
	OrderID varchar(255) primary key,
	Product_Card_Numberr varchar(255) FOREIGN KEY REFERENCES Product_Detail(Product_Card_Number),
	CustomerIDd varchar(255) FOREIGN KEY REFERENCES Customer(CustomerID),
	Order_Quantity int null,
	Order_Total_Prices int null,
 date_dh date default null );
drop table Order_Detail





/*
bổ sung thêm 1 table 
*/
CREATE TABLE Order_chitiet (
  id varchar(255)   primary key not null,
  	pd_Num varchar(255) FOREIGN KEY REFERENCES Product_Detail(Product_Card_Number) not null,
 Oid varchar(255) FOREIGN KEY REFERENCES Order_Detail(OrderID) not null,
  soluong int NOT NULL,
  thanhtien int NOT NULL
) 

drop  table Order_chitiet;

('OD001','A001','KH001',10,1000,'05/01/2022'),
		('OD002','A002','KH002',2,220,'09/01/2022'),
		('OD003','A003','KH003',3,350,'08/01/2022'),
		('OD004','A003','KH002',3,350,'07/01/2022'),
		('OD005','A003','KH001',3,350,'01/01/2022')

INSERT INTO Order_chitiet (id, pd_Num, Oid, soluong,thanhtien) VALUES

('och2', 'A002', 'OD002', 2,220),
('och1', 'A003', 'OD003', 3, 350),
('och4', 'A003', 'OD004', 3, 350),
('och5', 'A003', 'OD005', 3, 350);


/*
ALTER TABLE Order_chitiet
  ADD PRIMARY KEY (id),
  ADD UNIQUE KEY MaDH (OrderID),
  ADD KEY Product_Card_Number (Product_Card_Number),
  ADD KEY OrderID (OrderID);

  */


INSERT INTO Product_Detail(Product_Card_Number, Product_Name, Product_Level,Product_Attribute,Product_Type,Product_Attack_Points,
Product_Defense_Points,Product_Description,Product_Img,Product_Price,Product_Quantity)
VALUES 
('A001','Crystal Beast Rainbow Dragon',8,'LIGHT','GHOSTS FROM THE PAST: THE 2ND HAUNTING',3000,0,'If this face-up card is destroyed in a Monster Zone, you can place it face-up in your Spell & Trap Zone as a Continuous Spell, instead of sending it to the GY. You can only use each of the following effects of "Crystal Beast Rainbow Dragon" once per turn. When an attack is declared involving a "Crystal Beast" monster: You can Special Summon this card from your hand. You can banish this card treated as a Continuous Spell; Special Summon 1 Level 4 or lower "Crystal Beast" monster from your Deck, but negate its effects, and if you do, add 1 "Ultimate Crystal" monster from your Deck to your hand.',
'A001.png',100,4),
 
 ('A002','D/D/D Vice King Requiem',8,'DARK','GHOSTS FROM THE PAST: THE 2ND HAUNTING',2800,2000,'You cannot Special Summon monsters, except "D/D/D" monsters. A "D/D/D" monster that was Fusion, Synchro, Xyz, or Link Summoned using this card on the field as material gains this effect.
.Once per turn: You can target 1 card on the field; shuffle 1 "Dark Contract" card from your field or GY into the Deck, and if you do, destroy that target, then gain 1000 LP.You can only use this effect of "D/D/D Vice King Requiem" once per turn.','A002.png',110,3),

 ('A003','Elemental HERO Neos Kluger',9,'LIGHT','GHOSTS FROM THE PAST: THE 2ND HAUNTING',3000,2500,'Elemental HERO Neos + Yubel Must be Fusion Summoned. Before damage calculation, if this card battles an opponent is monster :You can inflict damage to your opponent equal to that opponent is monster is ATK. If this face-up card is destroyed by battle, or leaves the field because of an opponent is card effect while its owner controls it: You can Special Summon 1 "Neos Wiseman" from your hand or Deck, ignoring its Summoning conditions. You can only use this effect of "Elemental HERO Neos Kluger" once per turn.','A003.png',150,2),

 ('B001','Dark Magician',7,'DARK','BATTLE OF CHAOS',2500,2100,'The ultimate wizard in terms of attack and defense.','B001.png',200,2),


 ('B002','Libromancer Geek Boy',3,'WIND','BATTLE OF CHAOS',800,800,'You can reveal 1 Ritual Monster in your hand: Special Summon this card from your hand. If this card is Special Summoned: You can add 1 "Libromancer" Spell from your Deck to your hand. You can only use each effect of "Libromancer Geek Boy" once per turn.','B002.png',20,30),

 ('B003','Magikuriboh',1,'DARK','BATTLE OF CHAOS',300,200,'During the Main or Battle Phase, if you took damage by battle or an opponent is card effect this turn (Quick Effect): You can send this card from your hand to the GY; Special Summon 1 "Dark Magician" or 1 "Dark Magician Girl" from your Deck or GY. If a face-up Spellcaster monster(s) you control is destroyed by battle or an opponent is card effect: You can add this card from the GY to your hand. You can only use each effect of "Magikuriboh" once per turn.','B003.png',12,35),


 ('C001','Ukiyoe-P.U.N.K. Sharakusai',3,'EARTH','THE GRAND CREATORS',1200,600,'You can pay 600 LP; Fusion Summon 1 "P.U.N.K." Fusion Monster from your Extra Deck, using monsters from your hand or field as material. During your opponent is turn (Quick Effect): You can pay 600 LP; immediately after this effect resolves, Synchro Summon 1 "P.U.N.K." Synchro Monster using monsters you control as material. You can only use each effect of "Ukiyoe-P.U.N.K. Sharakusai" once per turn.','C001.png',21,25),

 ('C002','Gagaku-P.U.N.K. Wa Gon',3,'EARTH','THE GRAND CREATORS',900,600,'You can pay 600 LP; add 1 "P.U.N.K." Spell from your Deck to your hand. When your opponent activates a card or effect that targets a "P.U.N.K." monster(s) you control, or when your opponent is monster targets one for an attack (Quick Effect): You can draw 1 card. You can only use each effect of "Gagaku-P.U.N.K. Wa Gon" once per turn.','C002.png',22,20),


 ('C003','Joruri-P.U.N.K. Madame Spider',3,'EARTH','THE GRAND CREATORS',900,600,' You can pay 600 LP; add 1 "P.U.N.K." Trap from your Deck to your hand. When you activate a "P.U.N.K." card or effect that targets a card your opponent controls (except during the Damage Step) (Quick Effect): You can target 1 face-up monster your opponent controls; its ATK becomes halved until the end of this turn. You can only use each effect of "Joruri-P.U.N.K. Madame Spider" once per turn.','C003.png',23,19)







INSERT INTO  Customer(CustomerID,Customer_Name,Customer_Address,Cutomer_Phone,Customer_UserName,Customer_PassWord)
VALUES ('KH001','Trang Anh Khoa','Soc Trang','0123456','khoachibi123','123456'),
		('KH002','Gin Tuan Kiet','Ho Chi Minh','023456','GinTuanKiet123','123456789'),
		('KH003','Phat La','Kien Giang','0121111','PhatLa123','1234567890')


		
INSERT INTO  Administrators(Admin_UserName,Admin_PassWord)
VALUES
		('BacHuyenTienTon123','123456')



		/* 

INSERT INTO  Order_Detail(OrderID,Product_Card_Numberr,CustomerIDd,Order_Quantity,Order_Total_Prices)
VALUES
		('OD001',(SELECT id FROM author WHERE author_name = ‘Famous Anthony’));,4,120)//  chua biet lam
		
 */

 INSERT INTO  Order_Detail(OrderID,Product_Card_Numberr,CustomerIDd,Order_Quantity,Order_Total_Prices,date_dh)
VALUES 
		('OD001','A001','KH001',10,1000,'05/01/2022'),
		('OD002','A002','KH002',2,220,'09/01/2022'),
		('OD003','A003','KH003',3,350,'08/01/2022'),
		('OD004','A003','KH002',3,350,'07/01/2022'),
		('OD005','A003','KH001',3,350,'01/01/2022')
		
	
	 

	 select *from Order_Detail
--数据库
drop database if exists shopdb;
create database if not exists shopdb;
use shopdb;

--用户表
drop table if exists tab_user;
create table if not exists tab_user(
	uid int(11) primary key auto_increment,
 	username varchar(20) not null unique,
  	password varchar(32) not null unique,
  	name varchar(20) not null,
  	email varchar(30) not null,
  	telephone varchar(20) not null,
  	birthday varchar(30) not null,
  	sex varchar(10) not null
);

--类别表
drop table if exists tab_category;
create table if not exists tab_category(
	cid int(11) primary key auto_increment,
	cname varchar(20) not null unique
);
insert into tab_category(cname) values('手机数码');
insert into tab_category(cname) values('电脑平板');
insert into tab_category(cname) values('女士服装');
insert into tab_category(cname) values('男士服装');
insert into tab_category(cname) values('鞋帽箱包');

--产品表
drop table if exists tab_product;
create table if not exists tab_product(
	pid int(11) primary key auto_increment,
	pname varchar(50) not null, 
	market_price double not null,
	shop_price double not null,
	pimage varchar(200) not null, 
	pdate date not null,
	is_hot int(11) not null,
	pdesc varchar(255) not null,
	pflag int(11) not null,
	cid int(11) not null,
	constraint cid_fk foreign key(cid) references tab_category(cid)
);
insert into tab_product values(1,'小米 1c 标准版',105,100,'products/1/c_0001.jpg','2017-12-03',1,'小米 1c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(2,'小米 2c 标准版',105,100,'products/1/c_0002.jpg','2017-12-02',0,'小米 2c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(3,'小米 3c 标准版',105,100,'products/1/c_0003.jpg','2017-12-01',1,'小米 3c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(4,'小米 4c 标准版',105,100,'products/1/c_0004.jpg','2017-11-02',0,'小米 4c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(5,'小米 5c 标准版',105,100,'products/1/c_0005.jpg','2017-11-02',1,'小米 5c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(6,'小米 6c 标准版',105,100,'products/1/c_0006.jpg','2017-11-02',0,'小米 6c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(7,'小米 7c 标准版',105,100,'products/1/c_0007.jpg','2017-10-02',1,'小米 7c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(8,'小米 8c 标准版',105,100,'products/1/c_0008.jpg','2017-10-02',0,'小米 8c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(9,'小米 9c 标准版',105,100,'products/1/c_0009.jpg','2017-10-02',1,'小米 9c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(10,'小米 10c 标准版',105,100,'products/1/c_0010.jpg','2017-9-02',0,'小米 10c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(11,'小米 11c 标准版',105,100,'products/1/c_0011.jpg','2017-9-02',1,'小米 11c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(12,'小米 12c 标准版',105,100,'products/1/c_0012.jpg','2017-9-02',0,'小米 12c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(13,'小米 13c 标准版',105,100,'products/1/c_0013.jpg','2017-8-02',1,'小米 13c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(14,'小米 14c 标准版',105,100,'products/1/c_0014.jpg','2017-8-02',0,'小米 14c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(15,'小米 15c 标准版',105,100,'products/1/c_0015.jpg','2017-8-02',1,'小米 15c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(16,'小米 16c 标准版',105,100,'products/1/c_0016.jpg','2017-7-02',0,'小米 16c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(17,'小米 17c 标准版',105,100,'products/1/c_0017.jpg','2017-7-02',1,'小米 17c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(18,'小米 18c 标准版',105,100,'products/1/c_0018.jpg','2017-7-02',0,'小米 18c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(19,'小米 19c 标准版',105,100,'products/1/c_0019.jpg','2017-8-02',1,'小米 19c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(20,'小米 20c 标准版',105,100,'products/1/c_0020.jpg','2017-7-02',0,'小米 20c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(21,'小米 21c 标准版',105,100,'products/1/c_0021.jpg','2017-7-02',1,'小米 21c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(22,'小米 22c 标准版',105,100,'products/1/c_0022.jpg','2017-7-02',0,'小米 22c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(23,'小米 23c 标准版',105,100,'products/1/c_0023.jpg','2017-8-02',1,'小米 23c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(24,'小米 24c 标准版',105,100,'products/1/c_0024.jpg','2017-7-02',0,'小米 24c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(25,'小米 25c 标准版',105,100,'products/1/c_0025.jpg','2017-7-02',1,'小米 25c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(26,'小米 26c 标准版',105,100,'products/1/c_0026.jpg','2017-7-02',0,'小米 26c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(27,'小米 27c 标准版',105,100,'products/1/c_0027.jpg','2017-8-02',1,'小米 27c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(28,'小米 28c 标准版',105,100,'products/1/c_0028.jpg','2017-7-02',0,'小米 28c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(29,'小米 29c 标准版',105,100,'products/1/c_0029.jpg','2017-7-02',1,'小米 29c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');
insert into tab_product values(30,'小米 30c 标准版',105,100,'products/1/c_0030.jpg','2017-7-02',0,'小米 30c 标准版 全网通 白色 移动联通电信4G手机 双卡双待',1,'1');

insert into tab_product values(31,'华硕1A旗舰版',105,100,'products/1/c_0031.jpg','2017-7-02',1,'华硕1A旗舰版，超大屏，全固态',1,'2');
insert into tab_product values(32,'华硕2A旗舰版',105,100,'products/1/c_0032.jpg','2017-7-02',1,'华硕2A旗舰版，超大屏，全固态',1,'2');
insert into tab_product values(33,'华硕3A旗舰版',105,100,'products/1/c_0033.jpg','2017-7-02',1,'华硕3A旗舰版，超大屏，全固态',1,'2');
insert into tab_product values(34,'华硕4A旗舰版',105,100,'products/1/c_0034.jpg','2017-7-02',1,'华硕4A旗舰版，超大屏，全固态',1,'2');
insert into tab_product values(35,'华硕5A旗舰版',105,100,'products/1/c_0035.jpg','2017-7-02',1,'华硕5A旗舰版，超大屏，全固态',1,'2');
insert into tab_product values(36,'华硕6A旗舰版',105,100,'products/1/c_0036.jpg','2017-7-02',1,'华硕6A旗舰版，超大屏，全固态',1,'2');
insert into tab_product values(37,'华硕7A旗舰版',105,100,'products/1/c_0037.jpg','2017-7-02',1,'华硕7A旗舰版，超大屏，全固态',1,'2');
insert into tab_product values(38,'华硕8A旗舰版',105,100,'products/1/c_0038.jpg','2017-7-02',1,'华硕8A旗舰版，超大屏，全固态',1,'2');
insert into tab_product values(39,'华硕9A旗舰版',105,100,'products/1/c_0039.jpg','2017-7-02',1,'华硕9A旗舰版，超大屏，全固态',1,'2');
insert into tab_product values(40,'华硕10A旗舰版',105,100,'products/1/c_0040.jpg','2017-7-02',1,'华硕10A旗舰版，超大屏，全固态',1,'2');
insert into tab_product values(41,'华硕11A旗舰版',105,100,'products/1/c_0041.jpg','2017-7-02',1,'华硕11A旗舰版，超大屏，全固态',1,'2');
insert into tab_product values(42,'华硕12A旗舰版',105,100,'products/1/c_0042.jpg','2017-7-02',1,'华硕12A旗舰版，超大屏，全固态',1,'2');
insert into tab_product values(43,'华硕13A旗舰版',105,100,'products/1/c_0043.jpg','2017-7-02',1,'华硕13A旗舰版，超大屏，全固态',1,'2');
insert into tab_product values(44,'华硕14A旗舰版',105,100,'products/1/c_0044.jpg','2017-7-02',1,'华硕14A旗舰版，超大屏，全固态',1,'2');
insert into tab_product values(45,'华硕15A旗舰版',105,100,'products/1/c_0045.jpg','2017-7-02',1,'华硕15A旗舰版，超大屏，全固态',1,'2');
insert into tab_product values(46,'华硕16A旗舰版',105,100,'products/1/c_0046.jpg','2017-7-02',1,'华硕16A旗舰版，超大屏，全固态',1,'2');
insert into tab_product values(47,'华硕17A旗舰版',105,100,'products/1/c_0047.jpg','2017-7-02',1,'华硕17A旗舰版，超大屏，全固态',1,'2');
insert into tab_product values(48,'华硕18A旗舰版',105,100,'products/1/c_0048.jpg','2017-7-02',1,'华硕18A旗舰版，超大屏，全固态',1,'2');
insert into tab_product values(49,'华硕19A旗舰版',105,100,'products/1/c_0049.jpg','2017-7-02',1,'华硕19A旗舰版，超大屏，全固态',1,'2');
insert into tab_product values(50,'华硕20A旗舰版',105,100,'products/1/c_0050.jpg','2017-7-02',1,'华硕20A旗舰版，超大屏，全固态',1,'2');

insert into tab_product values(51,'皮草1F版',105,100,'products/1/cs10001.jpg','2017-7-02',1,'皮草1F版，精典款',1,'3');
insert into tab_product values(52,'皮草2F版',105,100,'products/1/cs10002.jpg','2017-7-02',1,'皮草2F版，精典款',1,'3');
insert into tab_product values(53,'皮草3F版',105,100,'products/1/cs10003.jpg','2017-7-02',1,'皮草3F版，精典款',1,'3');
insert into tab_product values(54,'皮草4F版',105,100,'products/1/cs10004.jpg','2017-7-02',1,'皮草4F版，精典款',1,'3');
insert into tab_product values(55,'皮草5F版',105,100,'products/1/cs10005.jpg','2017-7-02',1,'皮草5F版，精典款',1,'3');
insert into tab_product values(56,'皮草6F版',105,100,'products/1/cs10006.jpg','2017-7-02',1,'皮草6F版，精典款',1,'3');
insert into tab_product values(57,'皮草7F版',105,100,'products/1/cs10007.jpg','2017-7-02',1,'皮草7F版，精典款',1,'3');
insert into tab_product values(58,'皮草8F版',105,100,'products/1/cs10008.jpg','2017-7-02',1,'皮草8F版，精典款',1,'3');
insert into tab_product values(59,'皮草9F版',105,100,'products/1/cs10009.jpg','2017-7-02',1,'皮草9F版，精典款',1,'3');
insert into tab_product values(60,'皮草10F版',105,100,'products/1/cs10010.jpg','2017-7-02',1,'皮草10F版，精典款',1,'3');

insert into tab_product values(61,'海蓝之家1M版',105,100,'products/1/cs50001.png','2017-7-02',1,'海蓝之家1M版，休闲款',1,'4');
insert into tab_product values(62,'海蓝之家2M版',105,100,'products/1/cs50002.png','2017-7-02',1,'海蓝之家2M版，休闲款',1,'4');
insert into tab_product values(63,'海蓝之家3M版',105,100,'products/1/cs50003.png','2017-7-02',1,'海蓝之家3M版，休闲款',1,'4');
insert into tab_product values(64,'海蓝之家4M版',105,100,'products/1/cs50004.png','2017-7-02',1,'海蓝之家4M版，休闲款',1,'4');
insert into tab_product values(65,'海蓝之家5M版',105,100,'products/1/cs50005.png','2017-7-02',1,'海蓝之家5M版，休闲款',1,'4');
insert into tab_product values(66,'海蓝之家6M版',105,100,'products/1/cs50006.png','2017-7-02',1,'海蓝之家6M版，休闲款',1,'4');
insert into tab_product values(67,'海蓝之家7M版',105,100,'products/1/cs50007.png','2017-7-02',1,'海蓝之家7M版，休闲款',1,'4');
insert into tab_product values(68,'海蓝之家8M版',105,100,'products/1/cs50008.png','2017-7-02',1,'海蓝之家8M版，休闲款',1,'4');
insert into tab_product values(69,'海蓝之家9M版',105,100,'products/1/cs50009.png','2017-7-02',1,'海蓝之家9M版，休闲款',1,'4');
insert into tab_product values(70,'海蓝之家10M版',105,100,'products/1/cs50010.png','2017-7-02',1,'海蓝之家10M版，休闲款',1,'4');

insert into tab_product values(71,'李宁1S版',105,100,'products/1/duanxue1.png','2017-7-02',1,'李宁1S版版，舒适款',1,'5');
insert into tab_product values(72,'李宁2S版',105,100,'products/1/duanxue2.png','2017-7-02',1,'李宁2S版版，舒适款',1,'5');
insert into tab_product values(73,'李宁3S版',105,100,'products/1/duanxue3.png','2017-7-02',1,'李宁3S版版，舒适款',1,'5');
insert into tab_product values(74,'李宁4S版',105,100,'products/1/duanxue4.png','2017-7-02',1,'李宁4S版版，舒适款',1,'5');

--显示所有表的内容
select * from tab_user order by uid asc;
select * from tab_category order by cid asc;
select * from tab_product order by pid asc;









/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.6.24 : Database - p_pltu
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`p_pltu` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `p_pltu`;

/*Table structure for table `dt_petugas` */

DROP TABLE IF EXISTS `dt_petugas`;

CREATE TABLE `dt_petugas` (
  `NIK` varchar(20) NOT NULL,
  `NAMAPETUGAS` varchar(30) NOT NULL,
  `JAM` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `dt_petugas` */

insert  into `dt_petugas`(`NIK`,`NAMAPETUGAS`,`JAM`) values ('13312363','Achmad',''),('13312364','Aries',''),('13312365','Pirnando',''),('13312291','UJ2','');

/*Table structure for table `dt_tamu` */

DROP TABLE IF EXISTS `dt_tamu`;

CREATE TABLE `dt_tamu` (
  `NO` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NAMATAMU` varchar(30) NOT NULL,
  `TANGGAL` varchar(30) NOT NULL,
  `MASUK` varchar(30) NOT NULL,
  `KELUAR` varchar(30) NOT NULL,
  `DITUJU` varchar(30) NOT NULL,
  `NOID` varchar(30) NOT NULL,
  `WarnaID` varchar(30) NOT NULL,
  `IDDITUKAR` varchar(30) NOT NULL,
  `PT` varchar(30) NOT NULL,
  `PESAN` text NOT NULL,
  PRIMARY KEY (`NO`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

/*Data for the table `dt_tamu` */

insert  into `dt_tamu`(`NO`,`NAMATAMU`,`TANGGAL`,`MASUK`,`KELUAR`,`DITUJU`,`NOID`,`WarnaID`,`IDDITUKAR`,`PT`,`PESAN`) values (1,'Aini','13-08-2015','08 : 00','13 : 00','IT','13312115','MERAH','KTM','TEKNOKRAT',''),(2,'Rahmayati','13-08-2015','08 : 00','09 : 00','HRD','13312116','KUNING','KTM','TEKNOKRAT',''),(3,'Nina Siregar','13-08-2015','08 : 00','09 : 00','IT','110022011296','KUNING','KTP','PT Logitec',''),(4,'Zainudin','13-08-2015','13 : 00','14 : 00','SDM','110200230195','MERAH','KTP','Polda Lampung',''),(5,'Nurdin','13-08-2015','13 : 00','14 : 00','SDM','110010230195','KUNING','KTP','Lampung Post',''),(6,'Imam Ahmad','14-08-2015','08 : 00','09 : 00','HRD','110600230195','KUNING','KTP','Tribun Sumatra',''),(7,'Imelda Sinaga','14-08-2015','08 : 20','09 : 00','IT','110009230195','MERAH','KTP','Goole.imc',''),(8,'Roby Oktorio','14-08-2015','08 : 25','09 : 00','IT','113000231195','KUNING','KTP','ASA COM',''),(9,'Roy marten','14-08-2015','08 : 30','09 : 00','IT','1100402230195','KUNING','KTP','METRO COM',''),(10,'Arif Bahar','14-08-2015','08 : 35','09 : 00','MANAGER','110700230195','MERAH','KTP','',''),(11,'Baka suwon','14-08-2015','08 : 40','09 : 00','MANAGER','112000230195','MERAH','KTP','PLN PUSAT',''),(12,'Mahatir Mohamad','2015-34-13','08 : 00','08 : 00','IT','13312364','MERAH','KTM','TEKNOKRAT',''),(13,'Surya kurnia K','2015-15-14','08 : 00','08 : 00','HRD','13312398','KUNING','KTM','TEKNOKRAT','');

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `USERNAME` varchar(20) NOT NULL,
  `USER` varchar(20) NOT NULL,
  `PASWORD` varchar(20) NOT NULL,
  PRIMARY KEY (`USERNAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`USERNAME`,`USER`,`PASWORD`) values ('ADMIN','SECURITY','123'),('ADMIN2','SDM','123'),('ADMIN3','MANAGER','123'),('ADMIN4','IT','123');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

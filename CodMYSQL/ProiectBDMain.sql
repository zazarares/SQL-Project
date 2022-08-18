

create database if not exists LANT_POLICLINICI;
use LANT_POLICLINICI;

/* Tabele */

create table program
(ID int primary key,luni varchar(11),marti varchar(11),miecuri varchar(11),joi varchar(11),vineri varchar(11),sambata varchar(11),duminica varchar(11));

create table unitate_medicala
(ID int primary key,adresa varchar(50),denumire varchar(50),descriere_servicii varchar(100),
CONSTRAINT FK_ID_unitate_medicala FOREIGN KEY (ID) references program(ID));

create table cabinet_medical
(ID int primary key,descriere varchar(30),ID_medic int);

create table program_functionar
(ID int primary key,luni varchar(11),marti varchar(11),miecuri varchar(11),joi varchar(11),vineri varchar(11),sambata varchar(11),duminica varchar(11), locatie varchar(20), ID_Concediu int);

create table program_cabinet
(ID int primary key,luni varchar(11),marti varchar(11),miecuri varchar(11),joi varchar(11),vineri varchar(11),sambata varchar(11),duminica varchar(11));

create table diagnostic
(ID_parafa varchar(10) primary key,descriere_simptome varchar(50),diagnostic varchar(20),medicamentatie varchar(20),observatii varchar(30));

create table useri_clinica
(tip_departament varchar(20),CNP int primary key,nume varchar(20),prenume varchar(20),adresa varchar(20),nr_telefon varchar(10),email varchar(30),cont_IBAN int,nr_contract varchar(20),data_angajarii varchar(30),
functia varchar(20));

create table functie
(CNP int primary key,inspector_resurse_umane boolean, expert_financiar_contabil boolean, 
recepționer boolean, asistent_medical boolean, medic boolean, cod_specializare integer);

create table asistent
( nume_asistent varchar(20),tipul varchar(20), gradul varchar(20));

create table medic
(nume_medic varchar(20), prenume_medic varchar(20),specialitatea varchar(30),gradul varchar(20),codul_de_parafa varchar(10),titlul_stiintific varchar(20),postul_didactic varchar(20));

create table receptioner
(ID int primary key,numele varchar(20));

create table programare
(ID int primary key,nume_pacient varchar(30),prenume_pacient varchar (20),CNP BIGINT,varsta int,ID_cabinet int, data_programarii varchar(10),ora varchar(30));

create table analize
(ID_parafa varchar(30),ID_programare int, denumire_analize varchar(20),pret int,durata_controlului int,valoare_normala varchar(10),rezultate varchar(50), 
primary key(ID_parafa,ID_programare));

drop table concediu;
create table concediu 
(ID int primary key,data_inceput varchar(11),data_sfarsit varchar (11));
 
create table salariu
(salariu int,comision int,CNP int primary key);

create table raport_medical
(nume varchar(30),prenume varchar(30),medic varchar(30) primary key,medic_asistent varchar(30),dataconsultarii varchar(30),simptome varchar(50),investigatii varchar(50));

create table preturi_extra
(cod_specializare int, specializare varchar(30), pret_extra int);

/* Modificari ale tabelelor    - constraints pentru foreign keys        */

alter table useri_clinica add constraint foreign key(CNP) references functie(CNP);
alter table asistent add column cod_specializare integer primary key;
alter table functie add constraint foreign key(cod_specializare) references asistent(cod_specializare);
alter table medic add column cod_specializare integer primary key;
alter table functie add constraint foreign key(cod_specializare) references medic(cod_specializare);
alter table medic add column ID_cabinet integer;
alter table unitate_medicala add constraint foreign key (ID) references cabinet_medical(ID);
alter table functie add constraint foreign key (CNP) references cabinet_medical(ID);
alter table functie add constraint foreign key(CNP) references program_functionar(ID);
alter table medic add constraint foreign key (codul_de_parafa) references diagnostic(ID_parafa);
alter table cabinet_medical add constraint foreign key(ID) references program_cabinet(ID);
alter table unitate_medicala add constraint foreign key(ID) references receptioner(ID);
alter table unitate_medicala add constraint foreign key(ID) references programare(ID);
alter table analize add constraint foreign key (ID_programare) references programare(ID);
alter table diagnostic add constraint foreign key (ID_parafa) references analize(ID_parafa);
alter table program_functionar add constraint foreign key (ID_concediu) references concediu(ID); 
alter table salariu add constraint foreign key (CNP) references functie(CNP);
alter table raport_medical add constraint foreign key (medic) references medic(codul_de_parafa);
alter table diagnostic add column ora_final varchar(30);
alter table preturi_extra add constraint foreign key (specializare) references medic(codul_de_parafa);
alter table raport_medical drop foreign key raport_medical_ibfk_1;
alter table salariu add column luna varchar(20);
alter table program_functionar rename column miecuri to miercuri;
alter table program_cabinet rename column miecuri to miercuri;

/* Triggere   */
delimiter $$
create trigger update_unitate_medicala after UPDATE on unitate_medicala 
for each row begin
insert into unitate_medicala 
set ID=programare.ID,
adresa = OLD.adresa,
denumire=OLD.denumire,
descriere_servicii=OLD.descriere_servicii;
END $$
delimiter;


delimiter //
create trigger update_diagnostic after update on diagnostic 
for each row begin
insert into diagnostic 
set ID_parafa = medic.codul_de_parafa,
descriere_simptome = OLD.descriere_simptome,
diagnostic=OLD.descriere_simptome,
medicamentatie=OLD.medicamentatie,
observatii=OLD.observatii;
END //

delimiter;

delimiter ??
create trigger update_analize after update on analize
for each row begin
insert into analize
set ID_parafa=diagnostic.ID_parafa,ID_programare = programare.ID,
 denumire_analize=OLD.denumire_analize,
 pret=OLD.pret,
 durata_controlului=OLD.durata_controlului,
 valoare_normala=OLD.valoare_normala,
 rezultate=OLD.rezultate;
END??
delimiter ??
/* Partea de Securitate (Utilizatori, Acces)  incepe aici.  */


create user 'Administrator'@localhost;
grant alter on lant_policlinici.useri_clinica to 'Administrator'@localhost;
grant update on lant_policlinici.useri_clinica to 'Administrator'@localhost;
grant select on lant_policlinici.useri_clinica to 'Administrator'@localhost;
grant delete on lant_policlinici.useri_clinica to 'Administrator'@localhost;
grant insert on lant_policlinici.useri_clinica to 'Administrator'@localhost;



create user 'Super-Administrator'@localhost;
update mysql.user set Super_Priv='Y' where user='Super-Administrator' and host='localhost';
grant all privileges on *.* to 'Super-Administrator'@localhost;
show grants for 'Super-Administrator'@localhost;
grant super on *.* to 'Super-Administrator'@localhost;


create user 'Angajat'@localhost;


create user 'Asistent-Medical'@localhost;


create user 'Medic'@localhost;



/* Module pentru gestiunea policlinicii */


/*Resurse umane*/
drop view Modul_HR_Angajati;
create view Modul_HR_Angajati as
select nume, prenume, functia from useri_clinica us
left join  functie f on us.CNP=f.CNP;

select * from Modul_HR_Angajati;

 /*Orar*/
 
drop view Modul_HR_Orar;
create view Modul_HR_Orar as
select nume, prenume, functia, luni, marti, miercuri, joi, vineri, sambata, duminica from useri_clinica us
left join functie f on us.cnp=f.cnp
left join program_functionar pr on pr.id=f.cnp;

select * from Modul_HR_Orar;

/*Concedii*/
drop view Modul_HR_Concedii;
create view Modul_HR_Concedii 
as select nume, prenume,functia, data_inceput, data_sfarsit from useri_clinica us
left join functie f on us.CNP=f.CNP
left join program_functionar pr on pr.id=f.cnp
left join Concediu c on c.ID=pr.ID_Concediu;

select * from Modul_HR_Concedii;

/*Operatii financiar contabile*/


/*Salarii*/
drop view Modul_FinanciarContabil_Salarii;
create view Modul_FinanciarContabil_Salarii
as select luna, nume, prenume, functia, salariu, comision
from useri_clinica us 
left join functie f on us.cnp=f.cnp
left join salariu s on s.cnp=f.cnp;



/*Gestiunea activitatilor medicale*/

/*Programari*/
create view Modul_GestionareActivitati_Programari
as select id, nume_pacient, data_programarii, ora
from programare prog 
join  analize an on prog.id=an.id_programare;

select * from Modul_GestionareActivitati_Programari;

/*Istoric Medical*/
drop view Modul_GestionareActivitati_IstoricMedical;
create view Modul_GestionareActivitati_IstoricMedical
as select nume_pacient, prenume_pacient, descriere_simptome, diagnostic, denumire_analize, rezultate, medicamentatie, observatii
from programare prog
join analize an on prog.id=an.id_programare
join diagnostic di on an.id_parafa=di.id_parafa;

select * from Modul_GestionareActivitati_IstoricMedical;

/*Raport Medical*/
create view Modul_GestionareActivitati_RaportMedical
as select nume_pacient, prenume_pacient,nume_medic, prenume_medic, descriere_simptome, diagnostic, observatii, denumire_analize, rezultate
from programare prog 
join analize an on prog.id=an.id_programare
join diagnostic di on an.id_parafa=di.id_parafa
join medic m on di.id_parafa=m.codul_de_parafa;

/* Bon fiscal */

create view BonFiscal
as select  CNP , denumire_analize , pret , data_programarii
from programare p 
join analize an on p.id=an.id_programare;

select * from BonFiscal;
 


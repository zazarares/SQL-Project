/*Popularea tabelei*/
use lant_policlinici;
SET FOREIGN_KEY_CHECKS=0;
SET SQL_SAFE_UPDATES = 0;

insert into program_cabinet(ID,luni,marti,miercuri,joi,vineri,sambata,duminica)
values(57483991,"08:00-18:00","08:00-18:00","08:00-18:00","08:00-18:00","08:00-18:00","10:00-16:00","10:00-16:00");
insert into program_cabinet(ID,luni,marti,miercuri,joi,vineri,sambata,duminica)
values(67425191,"08:00-15:00","08:00-15:00","08:00-15:00","08:00-15:00","08:00-15:00","10:00-13:00","10:00-13:00");
insert into program_cabinet(ID,luni,marti,miercuri,joi,vineri,sambata,duminica)
values(57438661,"08:00-19:00","08:00-19:00","08:00-19:00","08:00-19:00","08:00-19:00","10:00-17:00","10:00-17:00");
insert into program_cabinet(ID,luni,marti,miercuri,joi,vineri,sambata,duminica)
values(56251582,"09:00-18:00","09:00-18:00","09:00-18:00","09:00-18:00","09:00-18:00","11:00-16:00","11:00-16:00");
insert into cabinet_medical(ID,descriere,ID_medic)
values(57483991,"vindeca oameni",1);
insert into cabinet_medical(ID,descriere,ID_medic)
values(67425191,"of talmologie",2);
insert into cabinet_medical(ID,descriere,ID_medic)
values(57438661,"chinurgie",3);
insert into cabinet_medical(ID,descriere,ID_medic)
values(56251582,"dentist",4);
insert into concediu(ID,data_inceput,data_sfarsit)values(1,"2001-12-2","2001-12-12");
insert into concediu(ID,data_inceput,data_sfarsit)values(2,"2012-04-15","2012-05-01");
insert into concediu(ID,data_inceput,data_sfarsit)values(3,"2020-12-12","2021-01-12");
insert into concediu(ID,data_inceput,data_sfarsit)values(4,"1990-06-06","1990-06-13");
insert into program_functionar(ID,luni,marti,miercuri,joi,vineri,sambata,duminica,locatie,ID_Concediu) 
values("57483991","08:00-12:00","12:00-20:00","08:00-12:00","12:00-16:00","12:00-13:00","9:00-10:00","0:00-0:00","sulina","1");
insert into program_functionar(ID,luni,marti,miercuri,joi,vineri,sambata,duminica,locatie,ID_Concediu) 
values("67425191","08:00-13:00","15:00-20:00","18:00-20:00","15:00-17:00","12:00-13:00","7:00-16:00","10:00-17:00","bucuresti","2");
insert into program_functionar(ID,luni,marti,miercuri,joi,vineri,sambata,duminica,locatie,ID_Concediu) 
values("57438661","08:00-19:00","10:00-23:00","08:30-19:00","11:00-19:00","11:12-13:09","0:00-8:00","16:00-20:00","cluj","3");
insert into program_functionar(ID,luni,marti,miercuri,joi,vineri,sambata,duminica,locatie,ID_Concediu) 
values("56251582","08:00-20:00","18:00-20:00","08:15-12:33","10:00-16:00","19:55-24:00","1:00-9:00","22:00-24:00","iasi","4");
insert into asistent(nume_asistent,tipul,gradul,cod_specializare)values("NULL","NULL","NULL",123);
insert into asistent(nume_asistent,tipul,gradul,cod_specializare)values("NULL","NULL","NULL",8762);
insert into asistent(nume_asistent,tipul,gradul,cod_specializare)values("NULL","NULL","NULL",12366);
insert into asistent(nume_asistent,tipul,gradul,cod_specializare)values("NULL","NULL","NULL",1986);
insert into programare(ID,nume_pacient,prenume_pacient,CNP,varsta,ID_cabinet,data_programarii,ora)values(1,"Hotupan","Rares",564728354,20,1,'2021-12-30',"08:00");

insert into programare(ID,nume_pacient,prenume_pacient,CNP,varsta,ID_cabinet,data_programarii,ora)values(0,"NULL","NULL",0,0,0,'2021-12-30',"NULL");
insert into programare(ID,nume_pacient,prenume_pacient,CNP,varsta,ID_cabinet,data_programarii,ora)values(2,"NULL","NULL",0,0,0,'2021-12-30',"NULL");
insert into programare(ID,nume_pacient,prenume_pacient,CNP,varsta,ID_cabinet,data_programarii,ora)values(3,"NULL","NULL",0,0,0,'2021-12-30',"NULL");
insert into analize(ID_parafa,ID_programare,denumire_analize,pret,durata_controlului,valoare_normala,rezultate)values("NULL1",0,"NULL",0,0,"NULL","NULL");
insert into analize(ID_parafa,ID_programare,denumire_analize,pret,durata_controlului,valoare_normala,rezultate)values("BTRAIAN",1,"inspectie orala",100,3,"0ml","voma excesiva");

insert into analize(ID_parafa,ID_programare,denumire_analize,pret,durata_controlului,valoare_normala,rezultate)values("NULL2",2,"NULL",0,0,"NULL","NULL");
insert into analize(ID_parafa,ID_programare,denumire_analize,pret,durata_controlului,valoare_normala,rezultate)values("NULL3",3,"NULL",0,0,"NULL","NULL");
insert into diagnostic(ID_parafa,descriere_simptome,diagnostic,medicamentatie,observatii,ora_final)value("NULL1","NULL","NULL","NULL","NULL","NULL");
insert into diagnostic(ID_parafa,descriere_simptome,diagnostic,medicamentatie,observatii,ora_final)value("BTRAIAN","voma excesiva","raceala","aspirina","nu sunt","12:00");
insert into diagnostic(ID_parafa,descriere_simptome,diagnostic,medicamentatie,observatii,ora_final)value("NULL2","NULL","NULL","NULL","NULL","NULL");
insert into diagnostic(ID_parafa,descriere_simptome,diagnostic,medicamentatie,observatii,ora_final)value("NULL3","NULL","NULL","NULL","NULL","NULL");
insert into medic(nume_medic,prenume_medic,specialitatea,gradul,codul_de_parafa,titlul_stiintific,postul_didactic,cod_specializare,ID_cabinet)values("NULL","NULL","NULL","NULL","NULL1","NULL","NULL",123,0);
insert into medic(nume_medic,prenume_medic,specialitatea,gradul,codul_de_parafa,titlul_stiintific,postul_didactic,cod_specializare,ID_cabinet)values("Basescu","Traian","Chirurg","Primar","BTRAIAN","Doctor","Profesor",8762,0);
insert into medic(nume_medic,prenume_medic,specialitatea,gradul,codul_de_parafa,titlul_stiintific,postul_didactic,cod_specializare,ID_cabinet)values("NULL","NULL","NULL","NULL","NULL2","NULL","NULL",12366,0);
insert into medic(nume_medic,prenume_medic,specialitatea,gradul,codul_de_parafa,titlul_stiintific,postul_didactic,cod_specializare,ID_cabinet)values("NULL","NULL","NULL","NULL","NULL3","NULL","NULL",1986,0);
insert into functie(CNP,inspector_resurse_umane,expert_financiar_contabil,recepționer,asistent_medical,medic,cod_specializare)
values(57483991,0,0,1,0,0,123);
insert into functie(CNP,inspector_resurse_umane,expert_financiar_contabil,recepționer,asistent_medical,medic,cod_specializare)
values(67425191,0,0,0,0,1,8762);
insert into functie(CNP,inspector_resurse_umane,expert_financiar_contabil,recepționer,asistent_medical,medic,cod_specializare)
values(57438661,1,0,0,0,0,12366);
insert into functie(CNP,inspector_resurse_umane,expert_financiar_contabil,recepționer,asistent_medical,medic,cod_specializare)
values(56251582,0,1,0,0,0,1986);
insert into useri_clinica(tip_departament,CNP,nume,prenume,adresa,nr_telefon,email,cont_IBAN,nr_contract,data_angajarii,functia)
values("financiar-contabil",57483991,"Margineanu","Mihai","Strada Aurel Vlaicu","0755678709","mihai.margineanu@hotmail.com","32112",1,'2006-10-14',"receptioner");
insert into useri_clinica(tip_departament,CNP,nume,prenume,adresa,nr_telefon,email,cont_IBAN,nr_contract,data_angajarii,functia)
values("medical",67425191,"Basescu","Traian","Bucuresti","0777777777","base.avandutflota@QQmail.com","12637",2,'1998-12-30',"medic-chirurg");
insert into useri_clinica(tip_departament,CNP,nume,prenume,adresa,nr_telefon,email,cont_IBAN,nr_contract,data_angajarii,functia)
values("resurse-umane",6537821,"Isus","Hrisos","Ierusalim","112","jesus@yahoo.com","71282",3,'2000-12-25',"manager R-U");
insert into useri_clinica(tip_departament,CNP,nume,prenume,adresa,nr_telefon,email,cont_IBAN,nr_contract,data_angajarii,functia)
values("financiar-contabil",8372613,"Vlaicu","Aurel","Strada Aurel Vlaicu","0752255700","aurica.zboara@gmail.com","1",4,'2016-2-12',"contabil");
insert into salariu(salariu,comision,CNP)values(2000,30,57483991);
insert into salariu(salariu,comision,CNP)values(6000,50,67425191);
insert into salariu(salariu,comision,CNP)values(10000,0,6537821);
insert into salariu(salariu,comision,CNP)values(2500,90,8372613);
insert into unitate_medicala(ID,adresa,denumire,descriere_servicii)values(57483991,"bucuresti","clinica mihai","medicina");
insert into unitate_medicala(ID,adresa,denumire,descriere_servicii)values(67425191,"zalau","clinica zalau","medicina");
insert into unitate_medicala(ID,adresa,denumire,descriere_servicii)values(6537821,"alba","clinica buzgure","medicina");
insert into unitate_medicala(ID,adresa,denumire,descriere_servicii)values(8372613,"calan","clinica okey","medicina");
insert into receptioner(ID,numele)values(57483991,"Margineanu");
insert into receptioner(ID,numele)values(67425191,"NULL");
insert into receptioner(ID,numele)values(6537821,"NULL");
insert into receptioner(ID,numele)values(8372613,"NULL");

insert into programare(ID,nume_pacient,prenume_pacient,CNP,varsta,ID_cabinet,data_programarii,ora)values(4,"Hotupan","Rares",564728354,20,3,'2021-12-5',"08:00");
insert into programare(ID,nume_pacient,prenume_pacient,CNP,varsta,ID_cabinet,data_programarii,ora)values(5,"Hotupan","Rares",564728354,20,3,'2021-12-16',"09:00");
insert into analize(ID_parafa,ID_programare,denumire_analize,pret,durata_controlului,valoare_normala,rezultate)values("BTRAIAN",4,"inspectie intestin",100,3,"0l","dureri de cap");
insert into analize(ID_parafa,ID_programare,denumire_analize,pret,durata_controlului,valoare_normala,rezultate)values("BTRAIAN",5,"control simplu",100,3,"0ml","imbunatatiri");
SET FOREIGN_KEY_CHECKS=1;
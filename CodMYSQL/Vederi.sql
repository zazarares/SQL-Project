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

/*Istoric Medical*/
create view Modul_GestionareActivitati_IstoricMedical
as select ID, nume_pacient, descriere_simptome, diagnostic, denumire_analize, rezultate, medicamentatie, observatii
from programare prog
join analize an on prog.id=an.id_programare
join diagnostic di on an.id_parafa=di.id_parafa;

/*Raport Medical*/
create view Modul_GestionareActivitati_RaportMedical
as select nume_pacient, prenume_pacient,nume_medic, prenume_medic, descriere_simptome, diagnostic, observatii, denumire_analize, rezultate
from programare prog 
join analize an on prog.id=an.id_programare
join diagnostic di on an.id_parafa=di.id_parafa
join medic m on di.id_parafa=m.codul_de_parafa;
 


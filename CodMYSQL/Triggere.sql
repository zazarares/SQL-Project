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
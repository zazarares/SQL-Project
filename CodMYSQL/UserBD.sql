/*Users BD*/
/* Partea de Securitate (Utilizatori, Acces)  incepe aici.  */

use lant_policlinici;
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
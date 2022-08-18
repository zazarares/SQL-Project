/*Proceduri*/
use lant_policlinici;
DROP PROCEDURE IF EXISTS CREARE_JOC;
DELIMITER //

CREATE PROCEDURE 
Init_Orar(IN Orar VARCHAR(40), IN CNP INT, IN zi INT)
    BEGIN
    IF(Functie.cnp=cnp)then
    Case zi%7
    When 1 Then Update program_functionar SET luni=orar;
    When 2 Then Update program_functionar SET marti=orar;
    When 3 Then Update program_functionar SET miercuri=orar;
    when 4 then Update program_functionar SET joi=orar;
    when 5 then Update program_functionar SET vineri=orar;
    when 6 then Update program_functionar SET sambata=orar;
    else Update program_functionar SET duminica=orar;
    END case;
    ENd if;
    end;//
    DELIMITER;


use LANT_POLICLINICI;
DROP PROCEDURE IF EXISTS SET_CONCEDIU;
DELIMITER //
Create procedure Set_concediu(In DataConcediuI varchar(40),IN DataConcediuO varchar(40),In CNP INT)
    BEGIn
    IF(Functie.CNP=cnp) then
        update concediu set data_inceput=DacaConcediuI;
        update concediu set data_sfarsit=DataConcediuU;
        End IF;
    END;
use LANT_POLICLINICI;
DROP PROCEDURE IF EXISTS SET_CONCEDIU;
DELIMITER //
Create procedure Profit_clinica()
    BEGIn
    Select DIfference(SUM(pret),SUM(functie.salariu)) from analize join salariu;
    END;
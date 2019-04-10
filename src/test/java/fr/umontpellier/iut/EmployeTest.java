package fr.umontpellier.iut;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EmployeTest {

    private Employe e1, e2, e3, e4;

    @BeforeEach
    void setUp() {
        e1 = new Employe.EmployeBuilder().setNom("ElYoussoufi").setPrenom("Yanis").setNumeroSecuriteSocial("12345").createEmploye();
        e2 = new Employe.EmployeBuilder().setNom("ElYoussoufi").setPrenom("Yanissou").setNumeroSecuriteSocial("34512").createEmploye();
        e3 = new Employe.EmployeBuilder().setNom("Bernard").setPrenom("Alexis").setNumeroSecuriteSocial("23456").createEmploye();
        e4 = new Employe.EmployeBuilder().setNom("Ladet").setPrenom("Tanguy").setNumeroSecuriteSocial("34567").createEmploye();
    }

    @Test
    void getMoisAnciennete() {
        e1.setDateEmbauche(LocalDate.of(2018, 04, 10));
        e2.setDateEmbauche(LocalDate.of(2018, 05, 10));
        e3.setDateEmbauche(LocalDate.of(2018, 06, 10));
        e4.setDateEmbauche(LocalDate.of(2018, 04, 8));

        assertEquals(e1.getMoisAnciennete(), e4.getMoisAnciennete());
    }
}
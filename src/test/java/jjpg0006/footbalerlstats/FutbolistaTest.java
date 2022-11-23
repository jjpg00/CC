/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jjpg0006.footbalerlstats;

import java.util.Date;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan José
 */
public class FutbolistaTest {

    public FutbolistaTest() {
    }

    @Test
    public void test() {

        Club club = new Club(
                "A00001",
                "PSG",
                "France",
                "League 1",
                95,
                10000000);
        Date date = new Date();

        Futbolista futbolista = new Futbolista(
                "A00001",
                "Lionel Andres Messi",
                "Argentina",
                91,
                date,
                club,
                10000000,
                "Delantero", "Izquierda", "1.71m", "68kg", 10,
                90, 95, 96, 97, 98, 90,
                96, 94, 93, 92, 94, 95,
                96, 94, 93, 92, 94, 95,
                96, 94, 93, 92, 94, 95,
                96, 94, 93, 92, 94, 95, 96, 94, 93, 92, 94,
                12, 12, 13, 10, 11, 12
        );

        Validator validador = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<Futbolista>> violations = validador.validate(futbolista);

        Assertions.assertThat(violations).isEmpty();
    }

}

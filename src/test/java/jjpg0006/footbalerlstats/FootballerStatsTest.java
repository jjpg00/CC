/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jjpg0006.footbalerlstats;

import java.util.ArrayList;
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
public class FootballerStatsTest {

    public FootballerStatsTest() {
    }

    @Test
    public void test() {

        Club club = new Club(
                "A00001",
                "PSG",
                "France",
                "League 1",
                95,
                15);
        Date date = new Date();

        Futbolista futbolista1 = new Futbolista(
                "A00001",
                "Lionel Andres Messi",
                "Argentina",
                91,
                date,
                club,
                50,
                "Delantero", "Izquierda", "1.71m", "68kg", 10,
                90, 95, 96, 97, 98, 90,
                96, 94, 93, 92, 94, 95,
                96, 94, 93, 92, 94, 95,
                96, 94, 93, 92, 94, 95,
                96, 94, 93, 92, 94, 95, 96,
                94, 93, 92, 94,
                12, 12, 13, 10, 11, 12
        );

        Futbolista futbolista2 = new Futbolista(
                "A00002",
                "Kylian Mbappe",
                "Francia",
                91,
                date,
                club,
                30,
                "Delantero", "Derecha", "1.78m", "68kg", 7,
                90, 95, 96, 97, 98, 90,
                96, 94, 93, 92, 94, 95,
                96, 94, 93, 92, 94, 95,
                96, 94, 93, 92, 94, 95,
                96, 94, 93, 92, 94, 95, 96,
                94, 93, 92, 94,
                12, 12, 13, 10, 11, 12
        );

        Futbolista futbolista3 = new Futbolista(
                "A00003",
                "Verrati",
                "Italia",
                91,
                date,
                club,
                15,
                "Mediocentro", "Derecha", "1.65m", "61kg", 5,
                90, 95, 96, 97, 98, 90,
                96, 94, 93, 92, 94, 95,
                96, 94, 93, 92, 94, 95,
                96, 94, 93, 92, 94, 95,
                96, 94, 93, 92, 94, 95, 96,
                94, 93, 92, 94,
                12, 12, 13, 10, 11, 12
        );

        Futbolista futbolista4 = new Futbolista(
                "A00004",
                "Donarruma",
                "Italia",
                89,
                date,
                club,
               20,
                "Portero", "Derecha", "1.90m", "90kg", 1,
                90, 95, 96, 97, 98, 90,
                96, 94, 93, 92, 94, 95,
                96, 94, 93, 92, 94, 95,
                96, 94, 93, 92, 94, 95,
                96, 94, 93, 92, 94, 95, 96,
                94, 93, 92, 94,
                12, 12, 13, 10, 11, 12
        );

        
        FootballerStats servicio = new FootballerStats();
        servicio.addFutbolista(futbolista1);
        servicio.addFutbolista(futbolista2);
        servicio.addFutbolista(futbolista3);
        servicio.addFutbolista(futbolista4);

        
        ArrayList<Futbolista> comprobacionPosicion = new ArrayList();
        ArrayList<Futbolista> comprobacionValoracion = new ArrayList();
        ArrayList<Futbolista> comprobacionPrecio = new ArrayList();
        
      
        String Posicion = "Delantero";
        int valoracion=91;
        double precio=17;
        
        comprobacionPosicion = servicio.busquedaPosicion(Posicion);
        comprobacionValoracion = servicio.busquedaValoracion(valoracion);
         comprobacionPrecio = servicio.busquedaPrecio(precio);
        
        for (Futbolista f : comprobacionPosicion) {
            Assertions.assertThat(f.getPosicion()).isEqualTo(Posicion);
        }
        Assertions.assertThat(comprobacionPosicion.size()).isEqualTo(2);
        
         
        for (Futbolista f : comprobacionValoracion) {
            Assertions.assertThat(f.getValoracion()).isEqualTo(valoracion);
        }
        Assertions.assertThat(comprobacionValoracion.size()).isEqualTo(3);
        

        for (Futbolista f : comprobacionPrecio) {
            Assertions.assertThat(f.getPrecio()).isLessThan(precio);
        }
        Assertions.assertThat(comprobacionPrecio.size()).isEqualTo(1);
        
    }

}

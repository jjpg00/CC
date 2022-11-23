/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jjpg0006.footbalerlstats;

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
public class UsuarioTest {

    public UsuarioTest() {
    }
  /**
     * Valida la creación de un usuario
     */
    @Test
    public void test() {
        Usuario usuario = new Usuario(
                "X000001",
                "Juan josé",
                "juanjo_pass"
        );
        Validator validador = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<Usuario>> violations = validador.validate(usuario);

        Assertions.assertThat(violations).isEmpty();
    }
    
     /**
     * Valida la comprobación de la clave en un usuario
     */
     @Test
    public void testComprobacionClave() {
        String clave = "jjpg0006";
        String clave2 = "asdsa";
        
        Usuario usuario = new Usuario(
             "X000001",
                "Juan josé",
                clave
        );
        
        Assertions.assertThat(usuario.passwordValida(clave)).isTrue();
        Assertions.assertThat(usuario.passwordValida(clave2)).isFalse();
    }
    
    
}



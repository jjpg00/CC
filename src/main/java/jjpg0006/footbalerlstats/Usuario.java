/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jjpg0006.footbalerlstats;

/**
 *
 * @author Juan José
 */
public class Usuario {
    String ID;
    String Nombre;
    String Contrasena;

    public Usuario(String ID, String Nombre, String Contrasena) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Contrasena = Contrasena;
    }
    
    
     public boolean passwordValida(String password) {
          return Contrasena.equals(password);
     }
}

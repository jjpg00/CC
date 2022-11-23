/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jjpg0006.footbalerlstats;

import java.util.ArrayList;

/**
 *
 * @author Juan José
 */
public class FootballerStats {

    ArrayList<Futbolista> futbolistas;
    ArrayList<Club> clubs;
    ArrayList<Usuario> usuarios;

    public FootballerStats() {
        futbolistas=new ArrayList();
        clubs=new ArrayList();
        usuarios=new ArrayList();
    }

    public void addFutbolista(Futbolista f) {
        futbolistas.add(f);
    }

    public void addClub(Club c) {
        clubs.add(c);
    }

    public void addUsuario(Usuario u) {
        usuarios.add(u);
    }

    public  ArrayList<Futbolista> busquedaPosicion(String Posicion) {
        ArrayList<Futbolista> futbolistasReturn = new ArrayList();
        
        for (Futbolista f : futbolistas) {
            if(f.posicion.equals(Posicion)){futbolistasReturn.add(f);}
        }
        
        return futbolistasReturn;
    }

    
        public  ArrayList<Futbolista> busquedaValoracion(int valoracion) {
        ArrayList<Futbolista> futbolistasReturn = new ArrayList();
        
        for (Futbolista f : futbolistas) {
            if(f.valoracion==valoracion){futbolistasReturn.add(f);}
        }
        
        return futbolistasReturn;
    }
    
     public  ArrayList<Futbolista> busquedaPrecio(double precio) {
        ArrayList<Futbolista> futbolistasReturn = new ArrayList();
        
        for (Futbolista f : futbolistas) {
            if(f.getPrecio()<=precio){futbolistasReturn.add(f);}
        }
        
        return futbolistasReturn;
    }
    
     
     
}

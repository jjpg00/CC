/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jjpg0006.footbalerlstats;

import java.util.Date;

/**
 *
 * @author Juan José
 */
public class Futbolista {
    String ID;
    String Nombre;
    String Nacionalidad;
    int valoracion;
    Date fechaNacimiento;
    Club club;
    double precio;
    String posicion;
    String piernaBuena;
    String altura;
    String peso;
    int numeroCamiseta;
    
double ATTACKING;
int Crossing;
int Finishing;
int Heading_Accuracy;
int Short_Passing;
int Volleys;

double SKILL;
int Dribbling;
int Curve;
int Accuracy;
int Long_Passing;
int Ball_Control;

double MOVEMENT;
int Acceleration;
int Sprint_Speed;
int Agility;
int Reactions;
int Balance;

double POWER;
int Shot_Power;
int Jumping;
int Stamina;
int Strength;
int Long_Shots;

double MENTALITY;
int Aggression;
int Interceptions;
int Positioning;
int Vision;
int Penalties;
int Composure;

double DEFENDING;
int Defensive_Awareness;
int Standing_Tackle;
int Sliding_Tackle;

double GOALKEEPING;
int GK_Diving;
int GK_Handling;
int GK_Kicking;
int GK_Positioning;
int GK_Reflexes;

    public Futbolista(String ID, String Nombre, String Nacionalidad, int valoracion, Date fechaNacimiento, Club club, double precio, String posicion, String piernaBuena, String altura, String peso, int numeroCamiseta, double ATTACKING, int Crossing, int Finishing, int Heading_Accuracy, int Short_Passing, int Volleys, double SKILL, int Dribbling, int Curve, int Accuracy, int Long_Passing, int Ball_Control, double MOVEMENT, int Acceleration, int Sprint_Speed, int Agility, int Reactions, int Balance, double POWER, int Shot_Power, int Jumping, int Stamina, int Strength, int Long_Shots, double MENTALITY, int Aggression, int Interceptions, int Positioning, int Vision, int Penalties, int Composure, double DEFENDING, int Defensive_Awareness, int Standing_Tackle, int Sliding_Tackle, double GOALKEEPING, int GK_Diving, int GK_Handling, int GK_Kicking, int GK_Positioning, int GK_Reflexes) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.valoracion = valoracion;
        this.fechaNacimiento = fechaNacimiento;
        this.club = club;
        this.precio = precio;
        this.posicion = posicion;
        this.piernaBuena = piernaBuena;
        this.altura = altura;
        this.peso = peso;
        this.numeroCamiseta = numeroCamiseta;
        this.ATTACKING = ATTACKING;
        this.Crossing = Crossing;
        this.Finishing = Finishing;
        this.Heading_Accuracy = Heading_Accuracy;
        this.Short_Passing = Short_Passing;
        this.Volleys = Volleys;
        this.SKILL = SKILL;
        this.Dribbling = Dribbling;
        this.Curve = Curve;
        this.Accuracy = Accuracy;
        this.Long_Passing = Long_Passing;
        this.Ball_Control = Ball_Control;
        this.MOVEMENT = MOVEMENT;
        this.Acceleration = Acceleration;
        this.Sprint_Speed = Sprint_Speed;
        this.Agility = Agility;
        this.Reactions = Reactions;
        this.Balance = Balance;
        this.POWER = POWER;
        this.Shot_Power = Shot_Power;
        this.Jumping = Jumping;
        this.Stamina = Stamina;
        this.Strength = Strength;
        this.Long_Shots = Long_Shots;
        this.MENTALITY = MENTALITY;
        this.Aggression = Aggression;
        this.Interceptions = Interceptions;
        this.Positioning = Positioning;
        this.Vision = Vision;
        this.Penalties = Penalties;
        this.Composure = Composure;
        this.DEFENDING = DEFENDING;
        this.Defensive_Awareness = Defensive_Awareness;
        this.Standing_Tackle = Standing_Tackle;
        this.Sliding_Tackle = Sliding_Tackle;
        this.GOALKEEPING = GOALKEEPING;
        this.GK_Diving = GK_Diving;
        this.GK_Handling = GK_Handling;
        this.GK_Kicking = GK_Kicking;
        this.GK_Positioning = GK_Positioning;
        this.GK_Reflexes = GK_Reflexes;
    }

    public int getValoracion() {
        return valoracion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getPosicion() {
        return posicion;
    }

    public String getPiernaBuena() {
        return piernaBuena;
    }

    public String getPeso() {
        return peso;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }
    
    
    
}

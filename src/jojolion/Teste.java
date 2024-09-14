package jojolion;

import jojolion.entidades.Jogador;
import jojolion.entidades.Time;

class Teste{
    public static void main(String[] args) {
        System.out.println("adriel");
        Jogador adriel = new Jogador("adriel", "10");
        Time vasco = new Time("vs", "Vasco", 1);
        System.out.println(adriel.toString()+ " " + vasco.toString());
    }
}
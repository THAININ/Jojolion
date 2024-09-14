package jojolion.entidades;
import java.time.LocalDate;

public class Partida {
    private String nome;
    private String local;
    private LocalDate data;
    private String placar;
    private int time_Id1;
    private int time_Id2;
    //construtor
    public Partida() {
    }

    public Partida(LocalDate data, String local, String nome) {
        this.data = data;
        this.local = local;
        this.nome = nome;
    }
    //metodos
    public void sortearTime(){
        // array de times???
    }
    public void criarPartidas(){

    }

    //gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getPlacar() {
        return placar;
    }

    public void setPlacar(String placar) {
        this.placar = placar;
    }

    public int getTime_Id1() {
        return time_Id1;
    }

    public void setTime_Id1(int time_Id1) {
        this.time_Id1 = time_Id1;
    }

    public int getTime_Id2() {
        return time_Id2;
    }

    public void setTime_Id2(int time_Id2) {
        this.time_Id2 = time_Id2;
    }

}

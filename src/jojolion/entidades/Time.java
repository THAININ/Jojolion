package jojolion.entidades;

public class Time {
    private String nome;
    private String abreviacao;
    private int partida_Id;
    //construtor
    public Time(){

    }
    public Time(String abreviacao, String nome, int partida_Id) {
        this.abreviacao = abreviacao;
        this.nome = nome;
        this.partida_Id = partida_Id;
    }
    //metodos
    //gets e sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }

    public int getPartida_Id() {
        return partida_Id;
    }

    public void setPartida_Id(int partida_Id) {
        this.partida_Id = partida_Id;
    }

    @Override
    public String toString() {
        return "Time{" + "nome=" + nome + ", abreviacao=" + abreviacao + ", partida_Id=" + partida_Id + '}';
    }
    
    
}

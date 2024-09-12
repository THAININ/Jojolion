public class Jogador {
    // atributos
    private String nome;
    private String time_Id;

    //construtor
    public Jogador(){

    }

    public Jogador(String nome, String time_Id) {
        this.nome = nome;
        this.time_Id = time_Id;
    }

    //metodos
    
    //gets e sets
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTime_Id() {
        return time_Id;
    }

    public void setTime_Id(String time_Id) {
        this.time_Id = time_Id;
    }
    
    @Override
    public String toString() {
        return "Jogador [nome=" + nome + ", time_Id=" + time_Id + "]";
    }
}
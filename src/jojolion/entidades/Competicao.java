package jojolion.entidades;

public class Competicao {
    private String nome;
    private String descricao;
    private String quant_de_Times;
    private String premiacao;
    private String formaCompeticao;
    // construtor

    public Competicao() {
    }

    public Competicao(String nome, String descricao, String quant_de_Times, String premiacao, String formaCompeticao) {
        this.nome = nome;
        this.descricao = descricao;
        this.quant_de_Times = quant_de_Times;
        this.premiacao = premiacao;
        this.formaCompeticao = formaCompeticao;
    }
    //metodos
    public void criarCompeticao(){
        
    }
    public void deletarCompeticao(){
        
    }
    //gets e sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getQuant_de_Times() {
        return quant_de_Times;
    }

    public void setQuant_de_Times(String quant_de_Times) {
        this.quant_de_Times = quant_de_Times;
    }

    public String getPremiacao() {
        return premiacao;
    }

    public void setPremiacao(String premiacao) {
        this.premiacao = premiacao;
    }

    public String getFormaCompeticao() {
        return formaCompeticao;
    }

    public void setFormaCompeticao(String formaCompeticao) {
        this.formaCompeticao = formaCompeticao;
    }

    @Override
    public String toString() {
        return "Competicao{" + "nome=" + nome + ", descricao=" + descricao + ", quant_de_Times=" + quant_de_Times + ", premiacao=" + premiacao + ", formaCompeticao=" + formaCompeticao + '}';
    }
    
}

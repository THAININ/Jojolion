package jojolion.entidades;

public class Estatiticas {
    private String gols;//int????
    private String cartaoAmarelo;
    private String penaltis;
    private int partida_id;
    //construtor

    public Estatiticas() {
    }

    public Estatiticas(String gols, String cartaoAmarelo, String penaltis, int partida_id) {
        this.gols = gols;
        this.cartaoAmarelo = cartaoAmarelo;
        this.penaltis = penaltis;
        this.partida_id = partida_id;
    }
    //metodos
    
    //gets e sets
    
    public String getGols() {
        return gols;
    }

    public void setGols(String gols) {
        this.gols = gols;
    }

    public String getCartaoAmarelo() {
        return cartaoAmarelo;
    }

    public void setCartaoAmarelo(String cartaoAmarelo) {
        this.cartaoAmarelo = cartaoAmarelo;
    }

    public String getPenaltis() {
        return penaltis;
    }

    public void setPenaltis(String penaltis) {
        this.penaltis = penaltis;
    }

    public int getPartida_id() {
        return partida_id;
    }

    public void setPartida_id(int partida_id) {
        this.partida_id = partida_id;
    }

    @Override
    public String toString() {
        return "Estatiticas{" + "gols=" + gols + ", cartaoAmarelo=" + cartaoAmarelo + ", penaltis=" + penaltis + ", partida_id=" + partida_id + '}';
    }
    
}

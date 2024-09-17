package jojolion.entidades;

public class singleton{
    public class Usuario {
        private static Usuario instanciaUnica;
        private String nomeCompleto;
        private String email;
        private String username;
        private String senha;
        private String avatar;

        private Usuario() {} // Construtor privado

        public static Usuario getInstancia() {
            if (instanciaUnica == null) {
                instanciaUnica = new Usuario();
            }
            return instanciaUnica;
        }

        // Métodos relacionados aos cenários de uso
        public void cadastrar(String nome, String email, String username, String senha, String avatar) {
            this.nomeCompleto = nome;
            this.email = email;
            this.username = username;
            this.senha = senha;
            this.avatar = avatar;
        }

        public void editarPerfil(String email, String username, String senha, String avatar) {
            this.email = email;
            this.username = username;
            this.senha = senha;
            this.avatar = avatar;
        }

        public void deletarConta() {
            instanciaUnica = null;  // O usuário é "removido"
        }

        // Getters e Setters
    }
    public class Competicao {
        private static Competicao instanciaUnica;
        private String nome;
        private String descricao;
        private int quantTimes;
        private String premiacao;
        private String formaCompeticao;

        private Competicao() {}  // Construtor privado

        public static Competicao getInstancia() {
            if (instanciaUnica == null) {
                instanciaUnica = new Competicao();
            }
            return instanciaUnica;
        }

        // Métodos para os casos de uso
        public void criarCompeticao(String nome, String descricao, int quantTimes, String premiacao, String forma) {
            this.nome = nome;
            this.descricao = descricao;
            this.quantTimes = quantTimes;
            this.premiacao = premiacao;
            this.formaCompeticao = forma;
        }

        public void deletarCompeticao() {
            instanciaUnica = null;  // Competição removida
        }

        // Getters e Setters
    }
    
    import java.util.List;
import java.util.Random;

public class Time {
    private static Time instanciaUnica;
    private String nome;
    private String imagem;
    private String abreviacao;
    private List<String> jogadores;

    private Time() {}  // Construtor privado

    public static Time getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Time();
        }
        return instanciaUnica;
    }

    public void cadastrarTime(String nome, String imagem, String abreviacao) {
        this.nome = nome;
        this.imagem = imagem;
        this.abreviacao = abreviacao;
    }

    public String sortearTime(List<String> timesDisponiveis) {
        Random random = new Random();
        return timesDisponiveis.get(random.nextInt(timesDisponiveis.size()));
    }

    public void deletarTime() {
        instanciaUnica = null;  // Time removido
    }

    // Getters e Setters
}
    
    public class Partida {
    private String nome;
    private String data;
    private String local;
    private String horario;
    private String placar;
    private String timeId;

    public void criarPartida(String nome, String data, String local, String horario, String timeId) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.horario = horario;
        this.timeId = timeId;
    }

    public void registrarResultado(String placar) {
        this.placar = placar;
    }

    // Getters e Setters
}

public class Estatisticas {
    private static Estatisticas instanciaUnica;
    private String gols;
    private String cartaoAmarelo;
    private String penaltis;
    private String faltas;
    private String partidaId;

    private Estatisticas() {}  // Construtor privado

    public static Estatisticas getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Estatisticas();
        }
        return instanciaUnica;
    }

    public void registrarEstatisticas(String gols, String cartaoAmarelo, String penaltis, String faltas, String partidaId) {
        this.gols = gols;
        this.cartaoAmarelo = cartaoAmarelo;
        this.penaltis = penaltis;
        this.faltas = faltas;
        this.partidaId = partidaId;
    }

    // Getters e Setters
}

}
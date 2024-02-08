public class Aluno {
    // Atributos
    private String nome;
    private Number matricula;

    // Construtor
    public Aluno(String nome, Number matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    
    // Métodos
    private void inserirNome(String name) {
        nome = name;
    }

    public String obterNome() {
        return nome;
    }

    public void inserirMatricula(Number mat) {
        matricula = mat;
    }

    public Number obterMatricula() {
        return matricula;
    }

    public static void main(String[] args) {
        // Instaciação
        Aluno aluno = new Aluno("Bruna", 123456);

        // Acesso aos métodos

        System.err.println(aluno.obterNome() + " " + aluno.obterMatricula());

        
    }
}

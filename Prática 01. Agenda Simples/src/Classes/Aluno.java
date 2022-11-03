package Classes;

public class Aluno extends Pessoa {

    private String matricula; 

    public Aluno(String nome, String email, String data_nascimento, String matricula) {
        super(nome, email, data_nascimento);
        this.matricula = matricula;
    }

    public void print_pessoa(){
        super.print_pessoa();
        System.out.println("\nMatricula: " + matricula);
    }
    
}

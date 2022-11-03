package Classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

//nome, contato de e-mail, contato de telefone, data de nascimento e idade

public class Pessoa {
    private String nome;
    private String email;
    private LocalDate data_nascimento;
    private int idade;

    public Pessoa(String nome, String email, String data_nascimento){
        this.nome = nome;
        this.email = email;
        this.data_nascimento = LocalDate.parse(data_nascimento, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        idade = Period.between(this.data_nascimento, LocalDate.now()).getYears();
    }

    public String nome_get(){
        return this.nome;
    }

    public void print_pessoa(){
        System.out.println
        ("Nome: " + nome + 
        "\nE-Mail: " + email +
        "\nData de Nascimento: " + data_nascimento +
        "\nIdade: " + idade
        );
    }
}

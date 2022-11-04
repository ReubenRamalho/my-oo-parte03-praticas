import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Classes.*;

public class App {
    public static void main(String[] args) throws Exception { 
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        List<Pessoa> responsaveis = new ArrayList<Pessoa>();
        List<Aluno> alunos = new ArrayList<Aluno>();
        
        String nome, email, data_nascimento, matricula;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Insira a quantidade de pessoas a ser cadastrada: ");
        int ctrl = sc.nextInt();

        for(int i = 0; i < ctrl; i++){
            
            System.out.println("\n\n---Cadastro da pessoa " + (i+1) + "---");
            System.out.printf("A pessoa a ser cadastrada é aluno ? (Y/N): ");
            char resp = sc.next().charAt(0);
            sc.nextLine();

            switch(resp){

                case 'y':
                case 'Y':
                    System.out.printf("Insira o nome: ");
                    nome = sc.nextLine();
                    
                    System.out.printf("Insira o email: ");
                    email = sc.nextLine();

                    System.out.printf("Insira a data de nascimento no formato (dd-MM-yyyy): ");
                    data_nascimento = sc.nextLine();

                    System.out.printf("Insira a matricula: ");
                    matricula = sc.nextLine();

                    Aluno aluno = new Aluno(nome, email, data_nascimento, matricula);
                    alunos.add(aluno);
                    

                case 'n':
                case 'N':
                    System.out.printf("Insira o nome: ");
                    nome = sc.nextLine();
                    
                    System.out.printf("Insira o email: ");
                    email = sc.nextLine();

                    System.out.printf("Insira a data de nascimento no formato (dd-MM-yyyy): ");
                    data_nascimento = sc.nextLine();

                    Pessoa responsavel = new Pessoa(nome, email, data_nascimento);
                    responsaveis.add(responsavel);
            }
        }
    sc.close();

    for(Pessoa resp : responsaveis){
        resp.print_pessoa();
    }

    }
}

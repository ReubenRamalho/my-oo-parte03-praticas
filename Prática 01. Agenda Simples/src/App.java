import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import Classes.*;

public class App {
    public static void main(String[] args) throws Exception { 
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        List<Pessoa> responsaveis = new ArrayList<Pessoa>();
        List<Aluno> alunos = new ArrayList<Aluno>();
        
        String nome, email, data_str, matricula;

        LocalDate data_nascimento;

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
                    while(true){
                        System.out.printf("Insira o nome: ");
                        nome = sc.nextLine();
                        
                        System.out.printf("Insira o email: ");
                        email = sc.nextLine();

                        System.out.printf("Insira a data de nascimento no formato (dd-MM-yyyy): ");
                        try{
                            data_str = sc.nextLine();
                            data_nascimento = LocalDate.parse(data_str, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                        }
                        catch(Exception e){
                            System.out.println("\nERRO 001: Data inválida.\nTente novamente.\n");
                            continue;
                        }

                        System.out.printf("Insira a matricula: ");
                        try{
                            matricula = sc.next(".{5}");
                        }
                        catch (Exception e){
                            System.out.println("\nERRO 002: O númedo de Matrícula deve conter apenas 5 digitos.\nTente novamente.\n");
                            sc.nextLine();
                            continue;
                        }

                        if (!(matricula.matches("[0-9]+"))){
                            System.out.println("\nERRO 003: O número da Matrícula deve conter apenas números.\nTente novamente.\n");
                            sc.nextLine();
                            continue;
                        }                         
                        else break;             
                    }
                    Aluno aluno = new Aluno(nome, email, data_nascimento, matricula);
                    alunos.add(aluno);
                    pessoas.add(aluno); 
                    break;
                    
                case 'n':
                case 'N':
                    while(true){
                        System.out.printf("Insira o nome: ");
                        nome = sc.nextLine();
                        
                        System.out.printf("Insira o email: ");
                        email = sc.nextLine();

                        System.out.printf("Insira a data de nascimento no formato (dd-MM-yyyy): ");
                        try{
                            data_str = sc.nextLine();
                            data_nascimento = LocalDate.parse(data_str, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                        }
                        catch(Exception e){
                            System.out.println("\nERRO 001: Data inválida.\nTente novamente.\n");
                            continue;
                        }
                        break;
                    }
                    Pessoa responsavel = new Pessoa(nome, email, data_nascimento);
                    responsaveis.add(responsavel);
                    pessoas.add(responsavel);
                    break;
            }
        }
    
        for(Pessoa person : pessoas){
            if(person instanceof Aluno){
                Aluno al = (Aluno) person;
                al.print_pessoa();
            }
            
            else person.print_pessoa();
        }
    }
}

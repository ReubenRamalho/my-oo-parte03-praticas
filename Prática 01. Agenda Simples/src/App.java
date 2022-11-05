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
            
            System.out.println("\n\n---Cadastro da pessoa " + (i+1) + "---\n");
            
            while(true){
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

                    default:
                        System.out.println("Digite uma resposta válida!\n");
                        continue;    
                }break;
            }sc.close();
        }
    
        for(Pessoa person : pessoas){
            if(person instanceof Aluno){
                Aluno al = (Aluno) person;
                al.print_pessoa();
            }
            
            else person.print_pessoa();
        }
        while(true){
            System.out.println(
            "\n----------Menu----------\n" +
            "1: Lista de Resposáveis\n" +
            "2: Lista de Alunos\n" +
            "3: Espeficicar contato\n" +
            "0: Encerrar\n");
            System.out.printf("Opção:");
            int resp = sc.nextInt();

            switch(resp){
                
                case 1:
                    for(Pessoa person : responsaveis)
                        person.print_pessoa();
                    break;
                
                case 2:
                    for(Aluno al : alunos)
                        al.print_pessoa();
                    break;

                case 3:
                    print_espc(pessoas);
                    break;

                case 0:
                    System.exit(0);

                default:
                    System.out.println("Digite uma resposta válida!\n");
                    continue; 
            }
        }    
    }

    static void print_espc(List<Pessoa> pessoas){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println(
                "\n----------Menu----------\n" +
                "1: Especificar por índice\n" +
                "2: Especificar por Nome\n");   
            
            System.out.printf("Opção:");
            int resp = sc.nextInt();

            switch(resp){

                case 1:
                    System.out.printf("\nInsira o índice do contato (obs: O index começa em 1): ");
                    while(true){
                        int ctrl = sc.nextInt();

                        try {
                            pessoas.get(ctrl - 1).print_pessoa();
                        } catch (Exception e) {
                            System.out.println("Insira um index válido:");
                            continue;
                        }break;
                    }break;

                case 2:
                    int i = 1;
                    while(i == 1){
                        System.out.printf("\nInsira um nome de contato cadastrado: ");
                        String nome_contato = sc.next();

                        for(Pessoa person : pessoas){
                                if(person instanceof Aluno && nome_contato.equals(person.get_nome())){
                                    Aluno al = (Aluno) person;
                                    al.print_pessoa();
                                    i = 0;
                                    break;
                                }
                                else if(nome_contato.equals(person.get_nome())){
                                    person.print_pessoa();
                                    i = 0;
                                    break;     
                                }                             
                        }
                    }break;

                default:
                    System.out.println("Digite uma resposta válida!\n");
                    continue;
            }break;
        }sc.close();
    }
}

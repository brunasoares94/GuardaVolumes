
package guardavolumes;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author soubrunasoares
 */
public class GuardaVolumes {

    
    public static void verArmario(Armario armario[]){
        ArrayList<Compartimento> compartimentosList = new ArrayList<Compartimento>();
        for (int i = 0; i < armario.length; i++){
            System.out.println("Nome do Armario: " + armario[i].Nome);
            System.out.println("Ponto X do Armario: " + armario[i].PontoX );
            System.out.println("Ponto Y do Armario:" + armario[i].PontoY);
            compartimentosList = armario[i].getCompartimento();
        }
        
        for(int c = 0; c < compartimentosList.size(); c++){
            System.out.println("Informações do compartimento: " + c);
            int numero = armario[i].compartimento.get(c).Numero;
            String tam = armario[i].compartimento.get(c).Tamanho;
            System.out.println("Numero do Compartimento: " + numero);
            System.out.println("Tamanho do Compartimento: " + tam + "/n" );
            }   
     }
}
 
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int b = 0;
        
        System.out.println("Digite a quantidade de armários disponiveis:  ");
        int quantDeArmarios = leia.nextInt();        
        Armario armario[] = new Armario[quantDeArmarios];
        String nomeArmario;
        int pontoX,pontoY,qCompartimentos;

        System.out.println("Cadastro Armarios");
        for (int i = 0; i < armario.length; i++){
            ArrayList<Compartimento> compartimentosList = new ArrayList<Compartimento>();

            System.out.println("Digite o nome: " + i);
            nomeArmario= ler.next();

            System.out.println("Digite o ponto x:  ");
            pontoX = ler.nextInt();

            System.out.println(" Digite o ponto y:  ");
            pontoY = ler.nextInt();

            System.out.println(" Quantos Compartimentos tem esse armario?  ");
            qtdeCompartimentos = ler.nextInt();
        
            armario[i] = new Armario(nomeArmario,pontoX,pontoY,compartimentosList);

            Compartimento[] compart;
            compart = new Compartimento[qCompartimentos];

            for(int c = 0; c < qCompartimentos; c++) {
              if(armario[i]!= null){
                 System.out.println("Digite o numero: " + c );
                 int numeroCompartimento = ler.nextInt();

                 System.out.println("\nDigite o tamanho: " );
                 String tamanhoCompartimento= ler.next();
                 comp[c]= new Compartimento(numeroCompartimento,tamanhoCompartimento);
                 armario[i].setCompartimento(comp[c]);
               }
            }
        
            if(i == armario.length - 1){
                System.out.println("Armarios indisponiveis!");
            } else {
                System.out.println("Cadastrar novo armario");
                armario[i] = new Armario(nomeArmario, pontoX, pontoY);
          }
                    
    System.out.println("Seja bem vindo(a)\n");
        
        while (b!= 6){
         System.out.println("Local Compartimento ou Devolver? - Digite 1 ou 2 para continuar: ");
         int opcao = leia.nextInt();
         switch(opcao){
             case 1:
                System.out.println("Digite seu nome completo: ");
                    String nomeUsuario = leia.next();
                System.out.println("\n Digite o cpf: ");
                    int cpfUsuario = leia.nextInt();
                System.out.println(" \n Digite seu email: ");
                    String email= ler.next();
                Usuario usuario = new Usuario(nomeUsuario,cpfUsuario,email);
                System.out.println("Armarios e compartimentos disponiveis: ");
                    printArmario(armario);
                System.out.println("\n Digite o nome do armario: ");
                    String escolhaOArmario = leia.next();
                System.out.println("\n Digite o numero do compartimento: ");
                    int escolherCompartimento = leia.nextInt();
                System.out.println("\n Obrigada por nos escolher: ");
                System.out.println("Armario: "+escolhaOArmario+" Compartimento: "+escolherCompartimento+"");
                    for(int i = 0; i <armario.length; i++){
                        if(armario[i].Nome.equals(escolhaOArmario)){
                        int tam = armario[i].compartimento.size();
                    for(int p = 0; p < armario[i].compartimento.size(); p++){
                        if(armario[i].compartimento.get(p).Numero == escolherCompartimento){
                        armario[i].compartimento.remove(p);
                }     
                }
                }
                }

                System.out.println("\n Armarios disponiveis: ");
                        printArmario(armario);
                        if(armario.length == 0){
                            System.out.println("Ha compartimentos disponiveis!!");
                }
                
                System.out.println("\n Digite 1 para voltar ao menu ou 0 para sair.");
                        int opcoes = ler.nextInt();
                        b = opcoes;            
                        break;
                
            case 2:

                System.out.println("Para devolver compartimento digite suas informaçoes: ");
                    String lerArmario = leia.next();
                    int lerNumeroCompartimento = leia.nextInt();
                        String tamanhoCompartimento= leia.next();
                    Compartimento newCompartimento = new  Compartimento(lerNumeroCompartimento,tamanhoCompartimento);
                        for(int i = 0; i <armario.length; i++){
                            if(armario[i].Nome.equals(lerArmario)){
                             armario[i].compartimento.add(newCompartimento);
            }
            }
                      printArmario(armario);

            }
            }
            } 
                break;
 }
           
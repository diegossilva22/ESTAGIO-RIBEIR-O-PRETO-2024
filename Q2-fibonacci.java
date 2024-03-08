package domain;
import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sequência de Fibonacci");
        System.out.println("Insira o número: ");
        int num = scanner.nextInt();
        System.out.println("");
        System.out.println("1");
        int ant1 = 0;
        int ant2 = 1;
        for(int prox = 0;;){
            prox = ant1 + ant2;
            System.out.println(prox);
            ant1 = ant2;
            ant2 = prox;
            if(prox == num){
                System.out.println("O número: "+ num + " Pertence a sequência");
                break;
            }else if(prox>=num){
                System.out.println("O número: "+ num + " Não pertence a sequência");
                break;
            }
            }
        }
    }


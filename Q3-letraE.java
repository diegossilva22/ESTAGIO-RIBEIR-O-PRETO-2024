package domain;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Letra E");
        System.out.println("");
        System.out.println("1");
        int ant1 = 0;
        int ant2 = 1;
        for(int prox = 0;;){
            prox = ant1 + ant2;
            System.out.println(prox);
            ant1 = ant2;
            ant2 = prox;
            if(prox == 13){
            break;
            }
            }
        }
    }

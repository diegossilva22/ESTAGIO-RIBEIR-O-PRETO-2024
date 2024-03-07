package domain;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("VALOR DA VARIÁVEL SOMA");
        int indice = 13;
        int soma = 0;
        int k = 0;
        while(k<indice){
            k = k + 1;
            soma = soma + k;
        }System.out.println("Soma: " + soma);
    }
}


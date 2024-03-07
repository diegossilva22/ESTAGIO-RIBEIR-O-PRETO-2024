package domain;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Letra D");
        int cont = 1;
        int quadrado = 4;
        for(int num = 4;;cont++){
            System.out.println(quadrado);
            quadrado= num * num;
            num = num + 2;
            if(num>=15){
            break;
            }
    }
}
}

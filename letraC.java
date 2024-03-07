package domain;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Letra C");
        int cont = 0;
        int ant = 1;
        for(int num = 1;;cont++){
            System.out.println(ant);
            num = num + 2;
            ant+=num;
            if(num>=15){
            break;
            }
    }
}
}

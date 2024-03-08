package domain;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Letra A");
        int cont = 1;
        for(int num = 2;;cont++){
            System.out.println(num);
            num = num * 2;
            if(num>=256){
            break;
            }
    }
}
}

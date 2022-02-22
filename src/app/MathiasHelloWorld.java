package app;

public class MathiasHelloWorld {
    public static void main(String[] args) {
        isEven(2);
        isEven(4);
        System.out.println("Mathias siger hej til verden!");
    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }


}

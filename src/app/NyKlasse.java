package app;

public class NyKlasse {
   int number2;

    public NyKlasse(int number) {
        this.number2 = number;
    }

    public String isEven() {
        System.out.println("se david han");
        return number2 % 2 == 0 ? "ja" : "Nej";
    }


}

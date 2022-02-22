package app;

public class NyKlasse {
    int number;

    public NyKlasse(int number) {
        this.number = number;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }
}

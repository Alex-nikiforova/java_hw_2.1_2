public class Main {
    public static void main(String[] args) {
        float amount = 1000;
        int coefficient = 100;
        float bonus = amount / coefficient;
        if (amount <= 1000) {
           bonus = 0;
        }
       System.out.println(bonus);
    }
}

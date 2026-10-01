public class Main {
    public static void main(String[] args) {
        int CCBalance = 5000;
        double CCBalance2 = 5850;
        double InterestRate = 0.17;
        double DueMonth1;
        double DueMonth2;

        DueMonth1 = CCBalance * InterestRate;
        CCBalance2 = CCBalance + DueMonth1;
        DueMonth2 = CCBalance2 * InterestRate;

        System.out.println("The interest for month 1 is " + DueMonth1);
        System.out.println("The interest for month 2 is " + DueMonth2);
    }
}
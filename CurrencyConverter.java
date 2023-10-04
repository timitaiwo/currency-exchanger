public class CurrencyConverter {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("If I give you £1, how much US Dollars will you give me? ");
        double euroOverPoundRatio = scan.nextDouble();
        System.out.print("If I give you 1€, how much Sterling pounds will you give me? ");
        double poundOverEuroRatio = scan.nextDouble();
        System.out.println("OK, now I know enough.");
        boolean finished = false;
        while (!finished) {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("   1 - Exchange pounds into euro");
            System.out.println("   2 - Exchange euro into pounds");
            System.out.println("   0 - Exit the program");
            System.out.println();
            System.out.print(  "> ");
            int choice = scan.nextInt();
            switch (choice) {
            case 1:
                System.out.print("How many pounds would you like to convert? ");
                double pounds = scan.nextDouble();
                double euro   = pounds * euroOverPoundRatio;
                System.out.println("£" + pounds + " will give you " + euro + "€");
                break;
            case 2:
                System.out.print("How many euro would you like to convert? ");
                euro   = scan.nextDouble();
                pounds = euro * poundOverEuroRatio;
                System.out.println(euro + "€ will give you £" + pounds);
                break;
            case 0:
                finished = true;
                break;
            default:
                System.out.println("Sorry, that is not a valid option");
            }
        }
        System.out.println("Exiting the program");
    }
}

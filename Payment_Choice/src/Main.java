import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pay through:\n1. Esewa\n2. Khalti");
        System.out.println("Enter a payment type:");
        Scanner scanner = new Scanner(System.in);
        int paymentType = scanner.nextInt();
        switch (paymentType) {
            case 1:
                PaymentMethod paymentMethod = PaymentFactory.getPaymentMethod("Esewa");
                paymentMethod.show();
                break;
            case 2:
                paymentMethod = PaymentFactory.getPaymentMethod("Khalti");
                paymentMethod.show();
                break;
            default:
                System.out.println("Invalid payment type");
        }
    }
}
public class PaymentFactory {
    public static PaymentMethod getPaymentMethod(String paymentMethod) {
        if (paymentMethod.equals("Khalti")) {
            return new Khalti();
        }else if (paymentMethod.equals("Esewa")) {
            return new Esewa();
        }else{
            return null;
        }
    }
}

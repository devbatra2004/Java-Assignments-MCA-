
public class CreditCardValidator {

    public static void main(String[] args) {
        String card = "5123456789012345";
        String visaRegex = "^4\\d{15}$";

        String masterRegex = "^5\\d{15}$";

        if (card.matches(visaRegex)) {
            System.out.println("Valid Visa Card");
        } else if (card.matches(masterRegex)) {
            System.out.println("Valid MasterCard");
        } else {
            System.out.println("Invalid Card Number");
        }
    }
}

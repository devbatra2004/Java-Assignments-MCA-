
public class ValidateIp {

    public static void main(String[] args) {
        String ip = "192.168.1.10";
        String regex = "^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.|$)){4}$";
        if (ip.matches(regex)) {
            System.out.println("Valid IP Address");
        } else {
            System.out.println("Invalid IP Address");
        }
    }
}

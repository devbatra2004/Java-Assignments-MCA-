
public class OTPGenerator {

    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;

    }

    public static boolean areUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        System.out.println("Generated OTPs:");
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        if (areUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println(" Some OTPs are repeated.");
        }
    }
}

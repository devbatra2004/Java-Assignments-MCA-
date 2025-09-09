
public class VolOfEarth {

    public static void main(String[] args) {
        double radius_km = 6378;
        double pi = Math.PI;

        double volume_km3 = (4.0 / 3.0) * pi * Math.pow(radius_km, 3);

        double radius_miles = radius_km * 0.621371;
        double volume_mi3 = (4.0 / 3.0) * pi * Math.pow(radius_miles, 3);

        System.out.println("The volume of Earth in cubic kilometers is: " + volume_km3);
        System.out.println("The volume of Earth in cubic miles is: " + volume_mi3);
    }
}

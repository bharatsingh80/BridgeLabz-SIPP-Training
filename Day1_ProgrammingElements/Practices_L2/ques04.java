import java.util.*;
public class ques04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        System.out.println("Distance in yards: " + distanceInYards);
        System.out.println("Distance in miles: " + distanceInMiles);
    }
}

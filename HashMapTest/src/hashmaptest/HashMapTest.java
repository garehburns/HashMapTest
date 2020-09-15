package hashmaptest;
import java.util.HashMap;
import java.util.Scanner;
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>(); // Create empty HashMap
        Scanner in = new Scanner(System.in); // Create Scanner
        double r, c, d, a;
        System.out.print("Enter the radius of a circle: ");
        
        r = in.nextDouble(); // Get radius
        c = 2 * Math.PI * r; // Compute circumference
        d = 2 * r; // Compute diameter
        a = Math.PI * ( Math.pow(r, 2) ); // Compute area
        
        map.put("radius", r); // Store radius
        map.put("circumference", c); // Store circumference
        map.put("diameter", d); // Store diameter
        map.put("area", a); // Store area
        
        for (HashMap.Entry<String, Double> e : map.entrySet()) {
            System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue());
        }

        // System.out.println("\nRadius: " + map.get("radius"));
        // System.out.println("Circumference: " + map.get("circumference"));
        // System.out.println("Diameter: " + map.get("diameter"));
        // System.out.println("Area: " + map.get("area"));

    }
}
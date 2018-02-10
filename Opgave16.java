import java.util.HashMap;
import java.util.Map;

public class Opgave16 {
    public static void main(String[] args) {
        Map<String, String> mappe = new HashMap<>();

        mappe.put("Kasper", "289512");
        mappe.put("Andreas", "2895121");
        mappe.put("Troels", "9000");
        mappe.put("Anders", "2895122");

        is1to1(mappe);
    }

    public static boolean is1to1(Map<String, String> map) {
        Map<String, String> a = new HashMap<>();
        for (String b : map.values()) {
            {
                if (a.containsValue(b)) { // hvis a indeholder værdien b

                    System.out.println("false");
                    return false;
                } else {
                    a.put(map.get(b), b); // tilføj værdien b til vores nye map

                }

            }

        }
        System.out.println("True"); // hvis alle har forskellige numre
        return true;
    }
}

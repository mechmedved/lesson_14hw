import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Map<String,Family> table = new HashMap<>();

        table.put("Москва", new Family("Собянины"));
        table.put("Киев", new Family("Абрамовичи"));
        table.put("Ереван", new Family("Саакяны"));

        Scanner sc = new Scanner(System.in);
        String city = sc.nextLine();
        if(!table.containsKey(city)){
            System.out.println("Unknown city");
        }
        else{
            System.out.println(table.get(city).getName());
        }
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        Map<String,Integer> months = new HashMap<>();

        months.put("Jan", 1);
        months.put("Feb", 2);
        months.put("Mar", 3);
        months.put("Apr", 4);
        months.put("May", 5);
        months.put("Jun", 6);
        months.put("Jul", 7);
        months.put("Aug", 8);
        months.put("Sep", 9);
        months.put("Oct", 10);
        months.put("Nov", 11);
        months.put("Dec", 12);

        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();

        System.out.println(
                months.containsKey(month) ?
                        month + " is the " + months.get(month) + " month" :
                        "Unknown input"
        );
    }
}
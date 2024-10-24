import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        Map<String,String> meal = new HashMap<>();
        meal.put("арбуз","ягода");
        meal.put("банан","трава");
        meal.put("вишня","ягода");
        meal.put("груша","фрукт");
        meal.put("дыня","овощ");
        meal.put("ежевика","куст");
        meal.put("жень-шень","корень");
        meal.put("земляника","ягода");
        meal.put("ирис","цветок");
        meal.put("картофель","клубень");

        for (String key : meal.keySet()) {
            System.out.print(key + " - " + meal.get(key) + "\n");
        }
    }
}
import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        Map<String,Inventory> garage = new HashMap<>();
        garage.put("Ящик",new Inventory("Металлический",2,"Красный"));
        garage.put("Ключ",new Inventory("Разводной",1,"Черный"));
        garage.put("Стеллаж", new Inventory("Складной",5,"Белый"));
        garage.put("Домкрат", new Inventory("Гидравлический",2,"Зеленый"));
        garage.put("Табурет", new Inventory("Деревянный",3,"Желтый"));

        for (String key : garage.keySet()) {
            System.out.print(key);
            Inventory inventory = garage.get(key);
            System.out.print(" - " + "тип " + inventory.getType());
            System.out.print(" - " + "размер " + inventory.getSize());
            System.out.print(" - " + "цвет " + inventory.getColor() + "\n");
        }
    }
}

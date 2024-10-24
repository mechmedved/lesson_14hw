import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {

        Map<String,String> band = new HashMap<>();
        band.put("Rose","Axl");
        band.put("McKagan","Duff");
        band.put("Hadson","Saul");
        band.put("Reed","Dizzy");
        band.put("Fortus","Richard");
        band.put("Ferrer","Frank");
        band.put("Reese","Melissa");

        band.put("McKagan","Duff");
        band.put("Hadson","Slash");
        band.put("Reed","Duff");

        System.out.println(band.size());

        for (String key : band.keySet()) {
            System.out.println(key + " : " + band.get(key));
        }
    }
}
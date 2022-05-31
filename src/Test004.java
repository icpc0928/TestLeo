import java.util.ArrayList;
import java.util.HashMap;

public class Test004 {


    public static void main(String[] args){

        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("1", "1");
        hashMap.put("3", "1");
        hashMap.put("2", "1");
        hashMap.put("4", "1");
        hashMap.put("5", "1");
        hashMap.put("6", "1");

        System.out.println(hashMap.toString());

        ArrayList<String> arrayList = new ArrayList<>();

        for(String key: hashMap.keySet()){
            if(hashMap.get(key) == "1"){
                arrayList.add(key);
            }
        }
        Object[] objects = arrayList.toArray();
        String[] strings = arrayList.toArray(new String[0]);

        for(int i = 0; i < objects.length; i++){
            System.out.print(objects[i] + " ; " + strings[i]);
            System.out.println();
        }





    }
}

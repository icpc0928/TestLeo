import java.util.HashMap;

public class Test {

    public static void main(String[] args){
        HashMap<Integer, Integer> maps = new HashMap<>();

        for(int i = 0; i < 10; i++){
            doSome(maps, i);
        }

        System.out.println(maps.toString());
    }

    static void doSome(HashMap<Integer, Integer> maps, int i){
        maps.put(i, i);
    }


}

package MonitorInfo;

import java.util.*;

public class Test005 {

    public static void main(String[] args){

        String last = "01061022233034";
        Set<String> stringSet = new HashSet<>();
        boolean isSame = false;
        int plus = 0;

        do {
            if (isSame) {
                plus = 1;
            }
            List<Integer> numsList = new ArrayList<>();
            int[] result = new int[7];
            String result_String = "";
            //排堆
            for (int i = 1; i <= 38; i++) {
                numsList.add(i);
            }
            //第一區
            for (int i = 0; i < 6; i++) {
                int rand = (int) (Math.random() * numsList.size());
                result[i] = numsList.get(rand);
                numsList.remove(rand);
            }
            Arrays.sort(result);
//            System.out.println(Arrays.toString(result));
            //第二區
            int rand = (int) (Math.random() * 8) + 1;
            result[0] = rand;
            for (int i = 0; i < result.length; i++) {
                String temp = result[i] < 10 ? "0" + result[i] : String.valueOf(result[i]);
                result_String += temp;
            }
            System.out.println(result_String);
            if (last.equals(result_String)) {
                isSame = true;
            }
        } while (plus != 1);



    }
}

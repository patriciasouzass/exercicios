package streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

//        Map<Integer, String> map =  new HashMap<>();
//        map.put(1, "1\n");
//        map.put(2, "10\n");
//        map.put(3, "11\n");
//        map.put(4, "100\n");
//        map.put(5, "101\n");
//        map.put(6, "110\n");
//        map.put(7, "111\n");
//        map.put(8, "1000\n");
//        map.put(9, "1001\n");

//        System.out.println(map);
        UnaryOperator<String> inverter =
                s -> new StringBuilder(s).reverse().toString();
        Function<String, Integer> binarioParaInt =
                s -> Integer.parseInt(s, 2);

        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(binarioParaInt)
                .forEach(System.out::println);

    }

//    public void SubstituirBinario(){
//        map.put(1, "1");
//        map.put(2, "10");
//        map.put(3, "11");
//        map.put(4, "100");
//        map.put(5, "101");
//        map.put(6, "110");
//        map.put(7, "111");
//        map.put(8, "1000");
//        map.put(9, "1001");
//    }
}

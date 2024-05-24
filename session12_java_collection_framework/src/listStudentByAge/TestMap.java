package listStudentByAge;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("hoang", 18);
        hashMap.put("huy", 20);
        hashMap.put("dao", 17);
        hashMap.put("z", 19);

        System.out.println(hashMap);

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);
    }
}
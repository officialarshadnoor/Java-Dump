// import java.util.HashSet;
// import java.util.Map;
// import java.util.TreeSet;
// import java.util.Set;

// public class SetDemo1 {
//     public static void main(String[] args) {
//         Set<Integer> values = new TreeSet<>();
//         System.out.println(values.add(15));
//         System.out.println(values.add(61));
//         System.out.println(values.add(9));
//         System.out.println(values.add(6));
//         System.out.println(values.add(6));
//         for (int i : values) {
//             System.out.println(i);
//         }
//     }
// }

// public class SetDemo {
//     public static void main(String[] args) {
//         Set<String> values = new HashSet<>();
//         System.out.println(values.add("Abhishek"));
//         System.out.println(values.add("Beta"));
//         System.out.println(values.add("Kaise"));
//         System.out.println(values.add("Ho"));

//         for (String i : values) {
//             System.out.println(i);
//         }
//     }
// }

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Map<String, Boolean> map = new HashMap<>();
        System.out.println(map.put("MyName", "Arshad"));
        System.out.println(map.put("Actor", "John"));
        System.out.println(map.put("Ceo", "Victor"));
        System.out.println(map.put("Ceo", "Vincy"));

        Set<String> keys = map.keySet();
        for (Boolean key : keys) {
            System.out.println(key + " " + map.get(key));
        }
    }
}

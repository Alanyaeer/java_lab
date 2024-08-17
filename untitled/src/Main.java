import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class Main {
    public static void test(Map<Integer, Integer> integerIntegerConcurrentSkipListMap) throws InterruptedException {
        long start = System.currentTimeMillis();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100000000; i++) {

                integerIntegerConcurrentSkipListMap.put(3, i);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100000000; i++) {

                integerIntegerConcurrentSkipListMap.put(3, i);
            }
        });
        thread1.start();
        thread2.start();

        thread2.join();
        thread1.join();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    public static void main(String[] args) throws InterruptedException {
        // 2 3 4 5 6
        // 8
        test(new ConcurrentHashMap<>());
        Thread.sleep(10000);
        test(new ConcurrentSkipListMap<>());

//        HashSet<Integer> integers = new HashSet<>();
//
//        ArrayList<Integer> s = new ArrayList<>();
//        s.add(2);
//        s.add(3);
//        s.add(4);
//        s.add(5);
//        s.add(6);
//        s.add(8);
//        int n = s.size();
//        int shipCnt = 0;
//        // 代表船只最大称重
//        int L = 8;
//        // vis 维护学生的是否被访问到 ， 然后倒叙遍历
//        Collections.sort(s);
//        HashMap<Integer, Integer> vis = new HashMap<>();
//        for(int i = n - 1; i >= 0; --i){
//            if(vis.containsKey(i)) continue;
//            vis.put(i, 1);
//            int weight = s.get(i);
//            int index = -1;
//            for(int j = 0;j < n; ++j){
//                if(vis.containsKey(j)) continue;
//                if(s.get(j) + weight <= L) index = j;
//            }
//            if(index != -1){
//                vis.put(index, 1);
//            }
//            shipCnt += 1;
//        }
//        System.out.println(shipCnt);
//        // 一艘船最多两人 ，最大称重L，最少要的船只数
    }
}
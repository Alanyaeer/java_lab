import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // 创建引用队列
        ReferenceQueue<WeakReferenceExample.MyObject> queue = new ReferenceQueue<>();

        // 创建MyObject实例并建立弱引用
        WeakReferenceExample.MyObject obj = new WeakReferenceExample.MyObject("Important data");
        WeakReference<WeakReferenceExample.MyObject> weakRef = new WeakReference<>(obj, queue);

        WeakReferenceExample.MyObject strongRefer = new WeakReferenceExample.MyObject("strongRefer Important data");

        // 清除强引用，使对象只被弱引用持有
        obj = null;

        // 强制进行垃圾回收  你可以使用jconsole来执行 一次gc操作
//        System.gc();

        // 等待一段时间，让垃圾回收器有机会运行
        Thread.sleep(10000000);
//
//        // 检查引用队列
//        Reference<? extends WeakReferenceExample.MyObject> ref = queue.poll();
//        if (ref != null) {
//            System.out.println("WeakReference was enqueued: " + ref);
//        } else {
//            System.out.println("WeakReference was not enqueued yet.");
//        }
    }
}
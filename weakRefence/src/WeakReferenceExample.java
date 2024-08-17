import java.lang.ref.WeakReference;

public class WeakReferenceExample {

    static class MyObject {
        String data;

        public MyObject(String data) {
            this.data = data;
        }

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("MyObject is being finalized: " + data);
        }
    }
}

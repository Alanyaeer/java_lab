public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("A");
            throw new RuntimeException("faf");
        }
        catch(Exception e){
            System.out.println("B");

        }
        finally {
            System.out.println("C");

        }
        System.out.println("Hello world!");
    }
}
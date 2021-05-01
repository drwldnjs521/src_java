public class CompareMethodExample {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(1, "apple");
        boolean result1 = Util.<Integer, String>compare(p1, p2);
        if(result1) {
            System.out.println("same");

        }else{
            System.out.println("not same");

        }

        Pair<String, String> p3 = new Pair<>("user1", "Klein");
        Pair<String, String> p4 = new Pair<>("user2", "Klein");
        boolean result2 = Util.compare(p3, p4);
        if(result2) {
            System.out.println("same");

        }else{
            System.out.println("not same");
        }
    }
}

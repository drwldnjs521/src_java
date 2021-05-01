import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class SetExam {
    public static void main(String[] args) {
        Set<Integer> ints = new HashSet<>();
        ints.addAll(List.of(1,2,3,4,5,10));
        System.out.println(ints);
        ints.add(11);
        System.out.println(ints);

        Set<Integer> integers = new TreeSet<Integer>();
        integers.addAll(List.of(6, 5, 7, 9, 1, 4));
        System.out.println(integers);

    }
}

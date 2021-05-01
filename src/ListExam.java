import java.util.ArrayList;
import java.util.List;

public class ListExam {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        System.out.println(names);

        names.add("Müller");
        names.add("Merkel");
        names.add("Söder");

        names.add(1, "Schimpf");

        names.set(0, "Meyer");

        System.out.println(names);

        ArrayList<String> javaleute = new ArrayList<>();

        javaleute.addAll(names);

        names.clear();

        System.out.println(javaleute);
        System.out.println(names);

    }
}

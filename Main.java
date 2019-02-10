import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Doug");
        names.add("Mike");

        for (String name : names) {
            System.out.println(name);
        }

        ArrayList values = new ArrayList();
        values.add(5);
        values.add(3.14159);
        values.add('a');
        values.add("Hello!");

        for (Object item : values) {
            System.out.println(item);
        }

        int[] nums = new int[] {1,2,3,4,5,6};

        for (int a : nums) {
            a *= a;
            System.out.println(a);
        }
    }
}

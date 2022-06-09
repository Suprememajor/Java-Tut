package advance.stringhandling;

import java.util.Arrays;

public class StringHandlingDemo {
    public static void main(String[] args) {
        String str1 = "John is studying";
        String str2 = " in college";
        System.out.println(str1.length());

        String result = str1.concat(str2);
        System.out.println(result);

        String text = String.format("The name of the student is " + "%s, and the age is " + "%d", "John", 24);
        System.out.println(text);
        System.out.println(str1.charAt(5));

        if (str1.equals(str2)) {
            System.out.println("both strings are same");
        } else {
            System.out.println("both strings are different");
        }
        System.out.println(str1.indexOf('u'));
        System.out.println(str1.replace('s', 'r'));
        String[] arr = str1.split(" ");
        System.out.println(Arrays.toString(arr));
        Arrays.asList(arr).forEach(System.out::println);

        String newStr = str1.substring(1, 5);
        System.out.println(newStr);
    }
}

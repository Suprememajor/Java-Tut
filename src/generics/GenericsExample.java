package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        Printer<Integer> intPrinter = new Printer<>(23);
        intPrinter.print();

        Printer<String> stringPrinter = new Printer<>("Nobert");
        stringPrinter.print();

        AnimalPrinter<Cat> catPrinter = new AnimalPrinter<>(new Cat());
        catPrinter.print();

        AnimalPrinter<Animal> dogPrinter = new AnimalPrinter<>(new Dog());
        dogPrinter.print();

        shout(new Cat());
        shout("Nobert");
        shout2(25, "Major");

        List<Integer> intList = new ArrayList<>();
        intList.add(34);
        printList(intList);
        //printList2(intList); //Doesn't work, bounded

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        printList(catList);
        printList2(catList);
    }

    private static <T> void shout(T thingToShout) {
        System.out.println(thingToShout + "!!!!!!");
    }

    private static <T, V> void shout2(T firstThing, V secondThing) {
        System.out.print(firstThing + "!!!!!!  ");
        System.out.println(secondThing + "!!!!!!");
    }

    private static <T, V, Z> Z shout3(T firstThing, V secondThing, Z thirdThing) {
        return thirdThing;
    }

    //wildcard
    private static void printList(List<?> myList) {

    }

    //bounded wildcard
    private static void printList2(List<? extends Animal> myList) {

    }
}

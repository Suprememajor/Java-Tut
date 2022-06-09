package advance.generics;

public record DualGenericHolder<T, U>(T obj1, U obj2) {
    public void display() {
        System.out.println(obj1);
        System.out.println(obj2);
    }

    public static void main(String[] args) {
        DualGenericHolder<String, Integer> obj = new DualGenericHolder<>("SimpliCode", 10);
        obj.display();
    }
}

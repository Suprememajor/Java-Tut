package advance.generics;

public record SingleGenericHolder<T>(T obj) {

    public static void main(String[] args) {
        SingleGenericHolder<Integer> iObj = new SingleGenericHolder<>(10);
        System.out.println(iObj.obj());

        SingleGenericHolder<String> sObj = new SingleGenericHolder<>("SimpliCode");
        System.out.println(sObj.obj());
    }
}

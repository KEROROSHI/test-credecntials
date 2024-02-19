public interface Vehicle {
    public default void drive() {

        System.out.println("The car is been driven");
    }

    public default void stop() {

        System.out.println("The cas has been stopped");
    }
}

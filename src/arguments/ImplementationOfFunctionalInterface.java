package arguments;

public class ImplementationOfFunctionalInterface {

    private static FunctionalInterface functionalInterface;

    public static void save(FunctionalInterface functionalInterface) {
        ImplementationOfFunctionalInterface.functionalInterface = functionalInterface;
    }

    public static void run(String name) {
        functionalInterface.doSomething(name);
    }

}

package noarguments;

public class ImplementationOfFunctionalInterface {

    private static FunctionalInterface functionalInterface;

    public static void save(FunctionalInterface functionalInterface) {
        ImplementationOfFunctionalInterface.functionalInterface = functionalInterface;
    }

    public static void run() {
        functionalInterface.doSomething();
    }

}

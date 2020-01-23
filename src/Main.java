import noarguments.ImplementationOfFunctionalInterface;

import java.util.concurrent.Executors;

public class Main {


    public static void main(String[] args) {
        /*
            Podajesz do save kod który nadpisze metodę doSometing() w interfejsie.
            Następnie klasa z implementacją tego interfejsu zapisuje jego obiekt i daje
             to możliwość kilkukrotnego wykonania go poprzez wywołanie doSomething() na tym zapisanym obiekcie.

         */

        ImplementationOfFunctionalInterface.save(() -> {
            System.out.println("I'm a code of the doSomething() method of the functional interface!");
        });

        ImplementationOfFunctionalInterface.run();


        // Teraz z argumentami
        /*
            Teraz nadpisujesz kod metody doSomething(String name).
            Czyli zakładasz że masz podaną nazwę i wpisujesz nazwę tej zmiennej która ma być podana
             w moim przypadku to "nameThatWasPassedAsArgument"
         */

        arguments.ImplementationOfFunctionalInterface.save((nameThatWasPassedAsArgument) -> {
            System.out.println("My name is " + nameThatWasPassedAsArgument);
        });

        /*
            Za każdym razem kiedy ktoś będzie chciał wywołać metodę z tego interfejsu funkcyjnego będzie musiał podać ten argument.
         */
        arguments.ImplementationOfFunctionalInterface.run("Octavia");
        arguments.ImplementationOfFunctionalInterface.run("Luna");


        /*
            Teraz przykład z życia.
            Ten kod wykona się na innym rdzeniu.
            I podaje kod jako lambdę.
            Warto zauważyć że nie dałem klamerek "{"
            Jeżeli jest tylko jedna instrukcja to ich można nie dawać
         */

        Executors.newSingleThreadExecutor().execute(() -> System.out.println("Some thing is working on another thread."));
    }

}

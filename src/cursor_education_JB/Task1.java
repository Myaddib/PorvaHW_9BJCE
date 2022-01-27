package cursor_education_JB;

public class Task1 {

    public void startTask() {

        //Реализуйте собственный функциональный интерфейс,
        // используя лямбда-выражения.
        Printer lamdaPrinter = x -> System.out.println(x);
        lamdaPrinter.printer("Hi <CURSOR EDUCATION> ");
    }

    interface Printer {
        void printer(String msg);
    }
}

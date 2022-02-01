public class App1 {
    public static void main(String[] args) {

        var name = "Krzysztof";
        var age = 34;

        /*
            Przed wprowadzeniem text blocks musiałeś
            tworzyć napisy, w których chciałeś
            osadzać Twoje dane w taki sposób:
        */

        var n1 = "Name: " + name + "\nAge: " + age;
        System.out.println(n1);

        /*
            Oczywiście mogłeś stosować różne klasy
            pomocnicze wbudowane w Java lub z
            bibliotek zewnętrznych.
            W Java 17 (a nawet jeszcze wcześniej, bo
            już od Java 15) możesz stosować text
            blocks oraz metodę formatted.
        */

        var n2 = """
        Name: %s
        Age: %d
        """;
        System.out.println(n2.formatted(name, age));

    }
}

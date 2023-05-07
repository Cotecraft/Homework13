public class Main {
    public static void main(String[] args) {
        Author amitDuvdevani = new Author("Amit", "Duvdevani");
        String a = amitDuvdevani.toString();
        System.out.println(a);

        System.out.println("");

        Author erezEisen = new Author("Erez", "Eisen");
        String au = erezEisen.toString();
        System.out.println(au);

        System.out.println("");

            Book blackVelvet = new Book("Black Velvet", amitDuvdevani, 2022);
        String s = blackVelvet.toString();
        System.out.println(s);

        System.out.println("");

        Book whileImInTheMood = new Book("While I'm in the Mood", erezEisen, 2022);
        String st = whileImInTheMood.toString();
        System.out.println(st);

        System.out.println("Оригинальные ли авторы? " + erezEisen.equals(amitDuvdevani));
        System.out.println("Оригинальные ли работы? " + blackVelvet.equals(whileImInTheMood));
        }


    }
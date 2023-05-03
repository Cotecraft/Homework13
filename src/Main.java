public class Main {
    public static void main(String[] args) {
        Author amitDuvdevani = new Author("Amit", "Duvdevani");
        System.out.println("Имя " + amitDuvdevani.getFirstName());
        System.out.println("Фамилия " + amitDuvdevani.getSecondName());

        System.out.println("");

        Author erezEisen = new Author("Erez", "Eisen");
        System.out.println("Имя " + erezEisen.getFirstName());
        System.out.println("Фамилия " + erezEisen.getSecondName());

        System.out.println("");

            Book blackVelvet = new Book("Black Velvet", amitDuvdevani, 2022);
            System.out.println("Название " + blackVelvet.getName());
            System.out.println("Год выпуска " + blackVelvet.getYear());
        System.out.println("Автор " + blackVelvet.getAuthor());
        blackVelvet.setYear(2023);
        System.out.println("Перевыпуск " + blackVelvet.getYear());

        System.out.println("");

        Book whileImInTheMood = new Book("While I'm in the Mood", erezEisen, 2022);
        System.out.println("Название " + whileImInTheMood.getName());
        System.out.println("Год выпуска " + whileImInTheMood.getYear());
        System.out.println("Автор " + whileImInTheMood.getAuthor());
        whileImInTheMood.setYear(2023);
        System.out.println("Перевыпуск " + whileImInTheMood.getYear());

    }

}
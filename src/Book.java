public class Book {
   private String name;
   private String Author;
   private int year;
   public Book(String name, String Author, int year) {
      this.name = name;
      this.Author = Author;
      this.year = year;
   }

   public String getName() {
      return this.name;
   }
   public String getAuthor() {
      return  this.Author;
   }
   public int getYear () {
      return  this.year;
   }
   public void setYear(int year) {
      this.year = year;
   }
}

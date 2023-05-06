public class Book {
   private String name;
   private Author author;
   private int year;

   public Book(String name, Author author, int year) {
      this.name = name;
      this.author = author;
      this.year = year;
   }

   public String getName() {
      return this.name;
   }

   public Author getAuthor() {
      return this.author;
   }

   public int getYear() {
      return this.year;
   }

   public void setYear(int year) {
      this.year = year;
   }

   public String toString() {
      return "Название " + this.name + " Автор " + this.author + " Год выпуска " + this.year;
   }

   public boolean equals(Object other) {
      if (this.getClass() != other.getClass()) {
         return false;
      } else {
         return true;
      }
   }

   public int hashCode() {
      return java.util.Objects.hash(this.getClass());
   }
}

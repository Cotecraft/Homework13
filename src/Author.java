public class Author {
    private String firstName;
    private String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public  String getSecondName() {
        return this.secondName;
    }

    public String toString() {
        return "Имя " + this.firstName + " Фамилия " + this.secondName;
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
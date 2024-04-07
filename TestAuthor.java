class TestAuthor {
    public static void main(String[] args) {
        var name = "Pavel Pavlov";
        var email = "pavlov@example.com";
        var gender = 'M';

        var author = new Author(name, email, gender);
        System.out.println("Author string:");
        System.out.println(author);

        System.out.printf("Name is set: %s\n", author.getName().equals(name) ? "OK" : "ERROR");
        System.out.printf("Email is set: %s\n", author.getEmail().equals(email) ? "OK" : "ERROR");
        System.out.printf("Gender is set: %s\n", author.getGender() == gender ? "OK" : "ERROR");

        var newEmail = "pavlov@example.ru";
        author.setEmail(newEmail);
        System.out.printf(
            "Changing email to '%s': %s\n",
            newEmail, author.getEmail().equals(newEmail) ? "OK" : "ERROR"
        );
        System.out.println("New author data:");
        System.out.println(author);
    }
}

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("Name: %s; Email: %s; Gender: %c", name, email, gender);
    }
}

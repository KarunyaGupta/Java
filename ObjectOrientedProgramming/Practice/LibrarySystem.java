class Books {
    String name;
    int pages;
    int selfNumber;

    // Constructor to create a book with details
    Books(String name, int pages, int selfNumber) {
        this.name = name;
        this.pages = pages;
        this.selfNumber = selfNumber;
    }

    // Default constructor
    Books() {
        this.name = "";
        this.pages = 0;
        this.selfNumber = 0;
    }

    // Copy constructor
    Books(Books s1) {
        this.name = s1.name;
        this.pages = s1.pages;
        this.selfNumber = s1.selfNumber;
    }
}

class LibrarySystem {
    public static void main(String[] args) {
        Books b1 = new Books("Bharat Ki Khoj", 100, 3);
        System.out.println("Book 1: " + b1.name + ", Pages: " + b1.pages + ", Shelf Number: " + b1.selfNumber);
        Books b2 = new Books();
        b2.name = "The Alchemist";
        b2.pages = 208;
        b2.selfNumber = 5;
        System.out.println("Book 2: " + b2.name + ", Pages: " + b2.pages + ", Shelf Number: " + b2.selfNumber);

        // Creating a book by copying from another book
        Books b3 = new Books(b1);
        System.out.println("Book 3 (copy of Book 1): " + b3.name + ", Pages: " + b3.pages + ", Shelf Number: " + b3.selfNumber);
    }
}
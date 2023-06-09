package review;

public class Book {
	//
    private String title;
    private String author;
    private int publicationYear;
    private int bookNumber;

    public Book(String title, String author, int publicationYear, int bookNumber) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.bookNumber = bookNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", bookNumber=" + bookNumber +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
		return false;

 	
		//코드작성
	}

    @Override
    public int hashCode() {
        return bookNumber;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java", "홍길동", 2021, 1);
        Book book2 = new Book("Python", "춘향이", 2020, 2);
        Book book3 = new Book("Java", "홍길동", 2023, 3);

        System.out.println("book1.equals(book2): " + book1.equals(book2));
        System.out.println("book1.equals(book3): " + book1.equals(book3));

        System.out.println("book1.hashCode(): " + book1.hashCode());
        System.out.println("book2.hashCode(): " + book2.hashCode());
        System.out.println("book3.hashCode(): " + book3.hashCode());

        System.out.println("book1: " + book1);
        System.out.println("book2: " + book2);
        System.out.println("book3: " + book3);
        
    }
}

package oop.basics.practice1;

public class Application {

    public static void main(String[] args) {
        Reader student1 = new Reader("Орлов Роман Сергеевич");
        student1.takeBook();
        student1.returnBook();

        student1.takeBook(1);
        student1.takeBook(2);
        student1.takeBook(4);
        student1.takeBook(5);
        student1.takeBook(9);
        student1.takeBook(10);
        student1.takeBook(19);
        student1.takeBook(20);
        student1.takeBook(21);
        student1.takeBook(22);
        student1.takeBook(25);

        student1.takeBook(new String[] {"Словарь", "Энциклопедия", "Приключения"});
        student1.returnBook(new String[] {"Словарь", "Энциклопедия", "Приключения"});

        Book book1 = new Book("Приключения", "Аверин");
        Book book2 = new Book("Словарь", "Ожегов");

        student1.takeBook(new Book[] {book1, book2});
        student1.returnBook(new Book[] {book1, book2});
    }
}

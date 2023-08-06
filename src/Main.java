import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();

        bookList.add(new Book("Sapiens", 412,"Yuval Noah Harrari",2015));
        bookList.add(new Book("Homo Deus", 456,"Yuval Noah Harrari",2016));
        bookList.add(new Book("Leyleklerin Uçuşu", 362,"Jean-Christophe Grange",2002));
        bookList.add(new Book("Siyah Kan", 509,"Jean-Christophe Grange",2005));
        bookList.add(new Book("Kızıl Nehirler", 345,"Jean-Christophe Grange",2002));
        bookList.add(new Book("Ölü Ruhlar Ormanı", 501,"Jean-Christophe Grange",2010));
        bookList.add(new Book("Harry Potter ve Felsefe Taşı", 276,"J.K. Rowling",2016));

        Map<String,String> bookMap = new HashMap<>();

        bookList.forEach(book -> bookMap.put(book.getBookName(), book.getAuthorName()));
        bookMap.forEach((name, author) -> System.out.println("Book: "+ name + ", Author: "+ author));

        List<Book> upFrom100 = bookList.stream().filter(book -> book.getPageNumber() > 100).toList();
        upFrom100.forEach(book -> System.out.println(book.getBookName()));
    }
}
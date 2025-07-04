package lambda;

import java.util.Collections;
import java.util.List;

public class BookService
{

    public List<Book> getBooksInSort()
    {
        List<Book> books = BookDao.getBooks();
        // 1. Using Comparator implementation class
        // Collections.sort(books, new MyComparator());
        // 2. Using Comparator Anonymous class and its implemented method
        /* Collections.sort(books, new Comparator<Book>()
                {
                    @Override
                    public int compare(Book o1, Book o2)
                    {
                        return o2.getName().compareTo(o1.getName());
                    }
        });*/
        // 3. Using Lambda Expression
        //Collections.sort(books, (o1,o2) -> o1.getName().compareTo(o2.getName())); // ASC
        Collections.sort(books, (o1,o2) -> o2.getName().compareTo(o1.getName())); // DESC
        return books;
    }

    public static void main(String[] args)
    {
        System.out.println(new BookService().getBooksInSort());
    }

}

//class MyComparator implements Comparator<Book>{
//
//    @Override
//    public int compare(Book o1, Book o2)
//    {
//        //return o1.getName().compareTo(o2.getName()); // ASC
//        return o2.getName().compareTo(o1.getName()); //DESC
//    }
//}
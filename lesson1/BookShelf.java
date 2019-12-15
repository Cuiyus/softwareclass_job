package lesson1;

import java.util.ArrayList;

public class BookShelf implements Aggregate
{
    private ArrayList<Book> bookList = new ArrayList<Book>();

    public Book getBookAt(int index)
    {
        return bookList.get(index);
    }

    public void appendBook(Book book)
    {
        this.bookList.add(book);
    }

   public int getLength()
   {
       return bookList.size();
   }

   public Iterator iterator()
   {
       return new BookShelfIterator(this);
   }
}

package lesson1;

public class test
{
    public static void main(String[] args)
    {
        BookShelf bookShelf = new BookShelf();

        bookShelf.appendBook((new Book("Around the World in 80 Days")));
        bookShelf.appendBook((new Book("Bible")));
        bookShelf.appendBook((new Book("Cinderella")));
        bookShelf.appendBook((new Book("Daddy-Long-Legs")));

        Iterator iter = bookShelf.iterator();

        while (iter.hasNext())
        {
            Book book = (Book)iter.next();

            System.out.println(book.getName());
        }
    }
}

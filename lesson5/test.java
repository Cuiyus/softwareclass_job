package lesson5;

public class test
{
    public static void main(String[] args)
    {
        TicketMaker ticketMaker = TicketMaker.getInstance();
        TicketMaker t           = TicketMaker.getInstance();

        System.out.println(ticketMaker.getNextTicketNumber());
        System.out.println(t.getNextTicketNumber());

        Triple t1 = Triple.getInstance();
        Triple t2 = Triple.getInstance();
        Triple t3 = Triple.getInstance();
        Triple t4 = Triple.getInstance();

        System.out.println("t1" + t1);
        System.out.println("t2" + t2);
        System.out.println("t3" + t3);
        System.out.println("t4" + t4);
    }
}

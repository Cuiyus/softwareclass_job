package lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Triple
{
    private static List<Triple> list = new ArrayList<Triple>();
    private static Triple triple;

    private Triple()
    {

    }

    public synchronized static Triple getInstance()
    {
        if(list.size() < 3)
        {
            triple = new Triple();

            list.add(triple);

            return triple;
        }
        else
        {
            Random random = new Random();

            int num = random.nextInt(3);

            return list.get(num);
        }
    }

}

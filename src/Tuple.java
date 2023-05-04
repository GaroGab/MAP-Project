public class Tuple
{
    private Item[] tuple;

    Tuple(int size)
    {
        this.tuple= new Item[size];
    }

    int getLength()
    {
        return this.tuple.length;
    }

    Item get(int i)
    {
        return this.tuple[i];
    }

    void add(Item c,int i)
    {
        this.tuple[i]=c;
    }

    double getDistance(Tuple obj)
    {
        double totDistance=0;
        for(int i=0; i<this.getLength(); i++)
        {
            totDistance=totDistance+tuple[i].distance(obj.tuple[i]);
        }
        return totDistance;
    }
}

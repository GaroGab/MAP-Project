package data;

public class OutOfRangeSampleSize extends Exception
{
    public OutOfRangeSampleSize(String message) {
        super(message);
    }

    public String getMessage()
    {
        return "il numero k di cluster inserito da tastiera è maggiore rispetto al numero di centroidi generabili dall'insieme di transazioni";
    }

    public String getMessage2()
    {
        return "il numero k di cluster è minore o uguale a 0";
    }
}

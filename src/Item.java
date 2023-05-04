abstract class Item
{
    private Attribute attribute;
    private Object value;

    Item(Attribute attribute, Object value)
    {
        this.attribute=attribute;
        this.value=value;
    }

    Attribute getAttribute()
    {
        return this.attribute;
    }

    Object getValue()
    {
        return this.value;
    }

    public String toString()
    {
        return "Value: " + this.value;
    }

    abstract double distance(Object a);

    //void update(Data data, ArraySet clusteredData) TO DO
}

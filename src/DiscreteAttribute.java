class DiscreteAttribute extends Attribute
{
    private String values[];

    DiscreteAttribute(String name, int index, String[] values)
    {
        super(name,index);
        this.values = values;
    }

    public int getNumberOfDistinctValues() {
        return values.length;
    }

    public String getValue(int i) {
        return values[i];
    }

    /*
    int frequency(Data data, ArraySet idList, String v)
    {

    }
    */

}
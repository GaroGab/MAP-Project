class DiscreteAttribute extends Attribute{
    private String values[];

    DiscreteAttribute(String name, int index, String values[]){
        super(name, index);
        this.values=values;
    }

    int getNumberOfDistinctValues(){
        return  values.length;
    }

    String getValue(int i){
        return values[i];
    }

    int frequency(Data data, ArraySet idList, String v) {
        int freq = 0;
        int[] rowId = idList.toArray();
        for (int i = 0; i < data.getNumberOfAttributes(); i++) {
            for (int j: rowId) {
                if (data.getAttributeValue(j, i).equals(v)) freq++;
            }
        }
        return freq;
    }
}







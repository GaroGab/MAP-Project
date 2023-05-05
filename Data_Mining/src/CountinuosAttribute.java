class CountinuosAttribute extends Attribute{
    private double max;
    private double min;
    CountinuosAttribute(String name, int index, double min, double max) {
        super(name, index);
        this.min=min;
        this.max=max;
    }

    double getScaledValue(double v){
        double v1;
        v1=(v-min)/(max-min);
        return v1;
    }
}

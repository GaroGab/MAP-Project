class DiscreteItem extends Item{

    DiscreteItem(DiscreteAttribute attribute, String value){
        super(attribute,value);
    }

    double distance(Object a){
        if(getValue().equals(((DiscreteItem)a).getValue())){
            return 0;
        }else{
            return 1;
        }
    }
}

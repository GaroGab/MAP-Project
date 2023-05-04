import java.util.Arrays;

public class Data
{
    private Object data[][];
    private int numberOfExamples;
    private Attribute attributeSet[];

    Data(){

        //data

        data = new Object [14][5];

        data[0][0]="sunny";
        data[1][0]="sunny";
        data[2][0]="Overcast";
        data[3][0]="rain";
        data[4][0]="rain";
        data[5][0]="rain";
        data[6][0]="Overcast";
        data[7][0]="sunny";
        data[8][0]="sunny";
        data[9][0]="rain";
        data[10][0]= "sunny";
        data[11][0]= "overcast";
        data[12][0]= "overcast";
        data[13][0]= "Rain";

        data[0][1]="hot";
        data[1][1]="hot";
        data[2][1]="hot";
        data[3][1]="mild";
        data[4][1]="Cool";
        data[5][1]="Cool";
        data[6][1]="Cool";
        data[7][1]="mild";
        data[8][1]="Cool";
        data[9][1]="mild";
        data[10][1]="mild";
        data[11][1]="mild";
        data[12][1]="hot";
        data[13][1]="Mild";

        data[0][2]="high";
        data[1][2]="high";
        data[2][2]="high";
        data[3][2]="high";
        data[4][2]="normal";
        data[5][2]="normal";
        data[6][2]="normal";
        data[7][2]="normal";
        data[8][2]="normal";
        data[9][2]="normal";
        data[10][2]="high";
        data[11][2]="high";
        data[12][2]="high";
        data[13][2]="high";


        data[0][3]="weak";
        data[1][3]="weak";
        data[2][3]="weak";
        data[3][3]="strong";
        data[4][3]="strong";
        data[5][3]="strong";
        data[6][3]="strong";
        data[7][3]="strong";
        data[8][3]="strong";
        data[9][3]="strong";
        data[10][3]="strong";
        data[11][3]="strong";
        data[12][3]="strong";
        data[13][3]="strong";


        data[0][4]="no";
        data[1][4]="no";
        data[2][4]="no";
        data[3][4]="yes";
        data[4][4]="yes";
        data[5][4]="yes";
        data[6][4]="yes";
        data[7][4]="yes";
        data[8][4]="yes";
        data[9][4]="yes";
        data[10][4]="yes";
        data[11][4]="yes";
        data[12][4]="yes";
        data[13][4]="yes";


        // numberOfExamples

        numberOfExamples=14;


        //explanatory Set

        attributeSet = new Attribute[5];

        // TO DO : avvalorare ciascune elemento di attributeSet con un oggetto della classe DiscreteAttribute che modella il corrispondente attributo (e.g. outlook, temperature,etc)
        // nel seguito si fornisce l'esempio per outlook

        //Attributo 'OutLook'
        String[] outLookValues =new String[3];
        outLookValues[0]="overcast";
        outLookValues[1]="rain";
        outLookValues[2]="sunny";
        attributeSet[0] = new DiscreteAttribute("Outlook",0, outLookValues);

        //Attributo 'Temperature'
        String[] TemperatureValues= new String[3];
        TemperatureValues[0]="hot";
        TemperatureValues[1]="mild";
        TemperatureValues[2]="cool";
        attributeSet[1] = new DiscreteAttribute("Temperature",1,TemperatureValues);

        //Attributo 'Humidity'
        String[] HumidityValues=new String[2];
        HumidityValues[0]= "normal";
        HumidityValues[1]= "high";
        attributeSet[2] = new DiscreteAttribute("Humidity",2,HumidityValues);

        //Attributo 'Wind'
        String[] WindValues= new String[2];
        WindValues[0] = "weak";
        WindValues[1] = "strong";
        attributeSet[3] = new DiscreteAttribute("Wind",3,WindValues);

        //Attributo 'PlayTennis'
        String[] PlayTennisValues = new String[2];
        PlayTennisValues[0] = "yes";
        PlayTennisValues[1]= "no";
        attributeSet[4] = new DiscreteAttribute("Playtennis",4,PlayTennisValues);

    }

    int getNumberOfExamples(){
        return this.numberOfExamples;
    }

    int getNumberOfAttributes(){
        return this.attributeSet.length;
    }



    Object getAttributeValue(int exampleIndex, int attributeIndex){
        return this.data[exampleIndex][attributeIndex];
    }

    Attribute getAttribute(int index){
        return this.attributeSet[index];
    }

    Attribute[] getAttributeSchema()
    {
        return this.attributeSet;
    }

    @Override
    public String toString() {
        /*
        String attributes= "";
        for(int i=0;i<attributeSet.length;i++)
        {
            attributes=attributes.concat(attributeSet[i].getName());
            attributes=attributes.concat(",");
        }

        String[] transactions = new String[numberOfExamples];
        for(int i=0; i<numberOfExamples; i++)
        {
            for(int j=0; j<attributeSet.length; j++)
            {

            }
        }
        */
        String s;
        int i,j;
        s = ""+"\n";
        i = 0;
        while(i < attributeSet.length-1)
        {
            s = s + attributeSet[i]+",";
            i++;
        }
        s=s+attributeSet[i]+"\n";

        i = 0;
        while(i < numberOfExamples)
        {
            j = 0;
            s=s+(i+1)+":";
            while(j < attributeSet.length)
            {
                s=s+data[i][j]+",";
                j++;
            }
            s = s + '\n';
            i++;
        }
        return s;
    }


    public static void main(String args[]){
        Data trainingSet=new Data();
        System.out.println(trainingSet);


    }
}

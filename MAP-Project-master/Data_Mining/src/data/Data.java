package data;

import utility.ArraySet;
import java.util.Random;

public class Data{
// Le visibilità di classi , attributi e metodi devono essere decise dagli studenti	
Object[][] data;
	private  int numberOfExamples;
	private  Attribute[] attributeSet;
	private  int distinctTuple;

	public Data(){

		//data

		data = new Object [14][5];

        /*data[0][0]=new String ("sunny");
		data[1][0]=new String ("sunny");
		data[2][0]=new String ("sunny");
		data[3][0]=new String ("rain");
		data[4][0]=new String ("rain");
		data[5][0]=new String ("rain");
		data[6][0]=new String ("rain");
		data[7][0]=new String ("rain");
		data[8][0]=new String ("rain");
		data[9][0]=new String ("rain");
		data[10][0]=new String ("overcast");
		data[11][0]=new String ("overcast");
		data[12][0]=new String ("overcast");
		data[13][0]=new String ("overcast");
		
		data[0][1]=new String ("hot");
		data[1][1]=new String ("hot");
		data[2][1]=new String ("hot");
		data[3][1]=new String ("mild");
		data[4][1]=new String ("mild");
		data[5][1]=new String ("mild");
		data[6][1]=new String ("mild");
		data[7][1]=new String ("mild");
		data[8][1]=new String ("mild");
		data[9][1]=new String ("mild");
		data[10][1]=new String ("cold");
		data[11][1]=new String ("cold");
		data[12][1]=new String ("cold");
		data[13][1]=new String ("cold");
		
		data[0][2]=new String ("high");
		data[1][2]=new String ("high");
		data[2][2]=new String ("high");
		data[3][2]=new String ("normal");
		data[4][2]=new String ("normal");
		data[5][2]=new String ("normal");
		data[6][2]=new String ("normal");
		data[7][2]=new String ("normal");
		data[8][2]=new String ("normal");
		data[9][2]=new String ("normal");
		data[10][2]=new String ("high");
		data[11][2]=new String ("high");
		data[12][2]=new String ("high");
		data[13][2]=new String ("high");
		
		
		data[0][3]=new String ("weak");
		data[1][3]=new String ("weak");
		data[2][3]=new String ("weak");
		data[3][3]=new String ("strong");
		data[4][3]=new String ("strong");
		data[5][3]=new String ("strong");
		data[6][3]=new String ("strong");
		data[7][3]=new String ("strong");
		data[8][3]=new String ("strong");
		data[9][3]=new String ("strong");
		data[10][3]=new String ("strong");
		data[11][3]=new String ("strong");
		data[12][3]=new String ("strong");
		data[13][3]=new String ("strong");
		

		data[0][4]=new String ("no");
		data[1][4]=new String ("no");
		data[2][4]=new String ("no");
		data[3][4]=new String ("yes");
		data[4][4]=new String ("yes");
		data[5][4]=new String ("yes");
		data[6][4]=new String ("yes");
		data[7][4]=new String ("yes");
		data[8][4]=new String ("yes");
		data[9][4]=new String ("yes");
		data[10][4]=new String ("yes");
		data[11][4]=new String ("yes");
		data[12][4]=new String ("yes");
		data[13][4]=new String ("yes");*/

		data[0][0]= "sunny";
		data[1][0]= "sunny";
		data[2][0]= "overcast";
		data[3][0]= "rain";
		data[4][0]= "rain";
		data[5][0]= "rain";
		data[6][0]= "overcast";
		data[7][0]= "sunny";
		data[8][0]= "sunny";
		data[9][0]= "rain";
		data[10][0]= "sunny";
		data[11][0]= "overcast";
		data[12][0]= "overcast";
		data[13][0]= "rain";

		data[0][1]= "hot";
		data[1][1]= "hot";
		data[2][1]= "hot";
		data[3][1]= "mild";
		data[4][1]= "cool";
		data[5][1]= "cool";
		data[6][1]= "cool";
		data[7][1]= "mild";
		data[8][1]= "cool";
		data[9][1]= "mild";
		data[10][1]= "mild";
		data[11][1]= "mild";
		data[12][1]= "hot";
		data[13][1]= "mild";

		data[0][2]= "high";
		data[1][2]= "high";
		data[2][2]= "high";
		data[3][2]= "high";
		data[4][2]= "normal";
		data[5][2]= "normal";
		data[6][2]= "normal";
		data[7][2]= "high";
		data[8][2]= "normal";
		data[9][2]= "normal";
		data[10][2]= "normal";
		data[11][2]= "high";
		data[12][2]= "normal";
		data[13][2]= "high";


		data[0][3]= "weak";
		data[1][3]= "strong";
		data[2][3]= "weak";
		data[3][3]= "weak";
		data[4][3]= "weak";
		data[5][3]= "strong";
		data[6][3]= "strong";
		data[7][3]= "weak";
		data[8][3]= "weak";
		data[9][3]= "weak";
		data[10][3]= "strong";
		data[11][3]= "strong";
		data[12][3]= "weak";
		data[13][3]= "strong";


		data[0][4]= "no";
		data[1][4]= "no";
		data[2][4]= "yes";
		data[3][4]= "yes";
		data[4][4]= "yes";
		data[5][4]= "no";
		data[6][4]= "yes";
		data[7][4]= "no";
		data[8][4]= "yes";
		data[9][4]= "yes";
		data[10][4]= "yes";
		data[11][4]= "yes";
		data[12][4]= "yes";
		data[13][4]= "no";

		// numberOfExamples

		numberOfExamples=14;


		//explanatory Set

		attributeSet = new Attribute[5];

		// TO DO : avvalorare ciascune elemento di attributeSet con un oggetto della classe data.DiscreteAttribute che modella il corrispondente attributo (e.g. outlook, temperature,etc)
		// nel seguito si fornisce l'esempio per outlook

		String[] outLookValues =new String[3];
		outLookValues[0]="overcast";
		outLookValues[1]="rain";
		outLookValues[2]="sunny";
		attributeSet[0] = new DiscreteAttribute("Outlook",0, outLookValues);

		String[] TemperatureValues = new String[3];
		TemperatureValues[0]="hot";
		TemperatureValues[1]="mild";
		TemperatureValues[2]="cool";
		attributeSet[1] = new DiscreteAttribute("Temperature",1, TemperatureValues);

		String[] HumidityValues = new String[2];
		HumidityValues[0]="high";
		HumidityValues[1]="normal";
		attributeSet[2] = new DiscreteAttribute("Humidity",2, HumidityValues);

		String[] WindValues = new String[2];
		WindValues[0]="weak";
		WindValues[1]="strong";
		attributeSet[3] = new DiscreteAttribute("Wind",3, WindValues);

		String[] PlayTennis = new String[2];
		PlayTennis[0]="yes";
		PlayTennis[1]="no";
		attributeSet[4] = new DiscreteAttribute("PlayTennis",4, PlayTennis);

		// similmente per gli altri attributi

		distinctTuple=countDistinctTuples();


	}


	public int getNumberOfExamples(){
		return this.numberOfExamples;
	}

	public int getNumberOfAttributes(){
		return attributeSet.length;
	}

	Attribute[] getAttributeSchema(){
		return attributeSet;
	}

	public Object getAttributeValue(int exampleIndex, int attributeIndex){
		return data[exampleIndex][attributeIndex];
	}

	Attribute getAttribute(int index){
		return attributeSet[index];
	}

	public String toString() {
		String schema = "";
		for(int i=0;i<getNumberOfAttributes();i++){
			schema = schema + getAttribute(i).toString() +", ";
		}
		schema += "\n";
		for(int j=0;j<getNumberOfExamples();j++)
		{
			schema = schema + (j+1) + ": ";
			for(int k=0;k<getNumberOfAttributes();k++){
				schema = schema + getAttributeValue(j,k) +", ";
			}
			schema= schema +"\n";
		}
		return schema;
	}

	private int countDistinctTuples(){
		int DistinctTuples=getNumberOfExamples();
		boolean trovato;
		for(int i=0;i<getNumberOfExamples()-1;i++){
			trovato = false;
			int j=i+1;
			while(j<getNumberOfExamples() && !trovato){
				if(compare(i,j)){
					DistinctTuples--;
					trovato=true;
				}
				j++;
			}
		}
		return  DistinctTuples;
	}

	public Tuple getItemSet(int index){
		Tuple tuple=new Tuple(attributeSet.length);
		for(int i=0;i<attributeSet.length;i++)
			tuple.add(new DiscreteItem((DiscreteAttribute) attributeSet[i],(String)data[index][i]),i);
		return tuple;
	}

	public int[] sampling(int k) throws OutOfRangeSampleSize{
		if (k<=0 || k>distinctTuple)
		{
			throw new OutOfRangeSampleSize("Valore invalido: ");
		}
		else
		{
			int centroidIndexes[] = new int[k];
			//choose k random different centroids in data.
			Random rand = new Random();
			rand.setSeed(System.currentTimeMillis());
			for (int i = 0; i < k; i++) {
				boolean found = false;
				int c;
				do {
					found = false;
					c = rand.nextInt(getNumberOfExamples());
					// verify that centroid[c] is not equal to a centroid already stored in CentroidIndexes
					for (int j = 0; j < i; j++) {
						if (compare(centroidIndexes[j], c)) {
							found = true;
							break;
						}
					}
				}
				while (found);
				centroidIndexes[i] = c;
			}
			return centroidIndexes;
		}
	}

		private boolean compare(int i, int j)
		{
			boolean comp=true;
			for (int k=0;k<getNumberOfAttributes();k++){
				if(!getAttributeValue(i,k).equals(getAttributeValue(j,k))){
					comp=false;
				}
			}
			return comp;
		}

		Object computePrototype(ArraySet idList, Attribute attribute){
			return computePrototype(idList,(DiscreteAttribute) attribute);
		}

		String computePrototype(ArraySet idList, DiscreteAttribute attribute){
			int freq;
			int maxFreq=-1;
			String maxValFreq="";
			for(int i = 0; i<attribute.getNumberOfDistinctValues(); i++){
				freq= attribute.frequency(this,idList,attribute.getValue(i));
				if(maxFreq<freq){
					maxFreq=freq;
					maxValFreq= attribute.getValue(i);
				}
			}
			return maxValFreq;
		}

		public static void main(String[] args){
			Data trainingSet=new Data();
			System.out.println(trainingSet.distinctTuple);
			System.out.println(trainingSet);

		}

}

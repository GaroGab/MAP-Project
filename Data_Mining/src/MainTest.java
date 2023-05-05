import data.*;
import mining.*;


public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws OutOfRangeSampleSize {
		
		
		Data data =new Data();
		System.out.println(data);
		int k=3;
		KMeansMiner kmeans=new KMeansMiner(k);
		int numIter=kmeans.kmeans(data);
		System.out.println("Numero di Iterazione:"+numIter);
		System.out.println(kmeans.getC().toString(data));
		
		
	}

}

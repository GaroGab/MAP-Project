import data.*;
import mining.*;
import keyboardinput.*;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Data data =new Data();
		System.out.println(data);
		int k=0;
		int numIter;
		KMeansMiner kmeans;
		boolean except_check=false;
		boolean loop_program=true;
		char c;							//carattere letto da tastiera per ripetere l'esecuzione del programma
		while (loop_program)
		{
			while (!except_check)
			{
				System.out.println("Inserire il numero di Cluster: ");
				k = Keyboard.readInt();
				try
				{
					kmeans = new KMeansMiner(k);
					numIter = kmeans.kmeans(data);
					except_check = true;
					System.out.println("Numero di Iterazione:" + numIter);
					System.out.println(kmeans.getC().toString(data));
				}
				catch (OutOfRangeSampleSize e)
				{
					System.out.println(e.getMessage());
				}
			}
			do
			{
				System.out.println("Vuoi ripetere l'esecuzione? y/n");
				c = Keyboard.readChar();
				if (c == 'n')
				{
					loop_program = false;
				}
				else if (c == 'y')
				{
					except_check = false;
				}
			}while(!(c=='n' || c=='y'));
		}

	}

}

package impl.warmup;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    // Write your code here
    	ArrayList<Integer> arrayList = new ArrayList<Integer>();
    	int allice=0;
    	int brian = 0;
    	for (int i = 0; i < 3; i++) {
    		int val = a.get(i).intValue()-b.get(i).intValue();
    		if (val <0 )
    		{
    			brian++;
    		}
    		else
    		{
    			if (val>1)
    			{
    				allice++;
    			}
    		}
		}
    	arrayList.add(0, Integer.valueOf(allice));
    	arrayList.add(1,Integer.valueOf(brian));
    	return arrayList;
    }

}

public class CompareTriplet {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
     //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        String[] aTemp = new String[] {"500","125","3"};
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        //String[] bTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        String[] bTemp = new String[] {"500","125","3"};
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bTemp[i]);
            b.add(bItem);
        }

        List<Integer> result = Result.compareTriplets(a, b);
        
        for (Integer integer : result) {
			System.out.println("CompareTriplet.main() [" + integer.intValue() +"]");
		}

        /*for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}

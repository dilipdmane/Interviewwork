package com.hackerrank.work.problemsolving;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class ResultDynamicArray {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
    // Write your code here
    	List<Integer> retList = new ArrayList<Integer>();
    	int idx = 0;
    	int lastAnswer = 0;
    	
    	ListIterator<List<Integer>> listIterator = queries.listIterator();
    	//TODO: Define 2-D Array with n number of elements
    	  ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>(0);
          for (int i = 0; i <(n/2); i++) {
                      arr.add(new ArrayList<Integer>(0));
                      arr.add(  new ArrayList<Integer>(0));
                  }  
          if(n%2>0)           arr.add(new ArrayList<Integer>(0));
                
                    while (listIterator.hasNext()) {
                        List<java.lang.Integer> queryList = (List<java.lang.Integer>) listIterator.next();
                        idx = 0;
                        Integer queryType = queryList.get(0);
                        Integer x = queryList.get(1);
                        Integer y = queryList.get(2);
                        idx=(x^lastAnswer)%n;
                        
                        
                        
                        ArrayList<Integer> arrayList = arr.get(idx);
                        switch (queryType    ) {
                        case 1:
                            {
                                arrayList.add(y);
                                break;
                            }
                        case 2:
                            {
                                lastAnswer=arrayList.get(y% (arrayList.size()));
                                retList.add(lastAnswer);
                                break;
                            }
                        }//end of switch
                    }			
    	return retList;
    }

}

public class DynamicArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> queriesRowItems = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
                queriesRowItems.add(queriesItem);
            }

            queries.add(queriesRowItems);
        }

        List<Integer> result = ResultDynamicArray.dynamicArray(n, queries);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

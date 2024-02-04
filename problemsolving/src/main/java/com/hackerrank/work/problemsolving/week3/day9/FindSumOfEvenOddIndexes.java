package com.hackerrank.work.problemsolving.week3.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FindSumOfEvenOddIndexes{

    public static void main(String[] args) throws IOException{
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inp[] = reader.readLine().replaceAll("\\s+$", "").split(" ");
        ArrayList<Integer> inpList = new ArrayList<Integer>();
        for (String value : inp) {
            inpList.add(Integer.valueOf(value).intValue());
        }
        String inp2[] = reader.readLine().replaceAll("\\s+$", "").split(" ");
        ArrayList<Integer> queryList = new ArrayList<Integer>();
        for (String value : inp2) {
            queryList.add(Integer.valueOf(value).intValue());
        }

        
        int result = new FindSumOfEvenOddIndexes().getSumOfEvenAndOdd(inpList, queryList);        
            System.out.println(" Value "+ result);
        
        
    }

    public int getSumOfEvenAndOdd(ArrayList<Integer> inpList, ArrayList<Integer> queryList)
    {
        int retArr=0;
        int[] pfSumEven = new int[inpList.size()];
        int[] pfSumOdd = new int[inpList.size()];

        //TODO PreFix Sum of all even elements
        pfSumEven[0] = inpList.get(0).intValue();
        for(int i=1;i<inpList.size();i++)
        {
            if( i%2==0)//Even
            {
                pfSumEven[i]=pfSumEven[i-1]+inpList.get(i).intValue();
            }
            else{//odd
                pfSumEven[i]=pfSumEven[i-1]+0;
            }
        }

        

        //TODO PreFix Sum of all even elements
        pfSumOdd[0] = 0;
        for(int i=1;i<inpList.size();i++)
        {
            if( i%2==0)//Even
            {
                pfSumOdd[i]=pfSumOdd[i-1]+0;
            }
            else{//odd
                pfSumOdd[i]=pfSumOdd[i-1]+inpList.get(i).intValue();
            }
        }

        
            int evenOdd = queryList.get(0).intValue(); // 0 for even 1 for odd
            int left = queryList.get(1).intValue();
            int right = queryList.get(2).intValue();
            if( left == right)
            {
                 retArr =inpList.get(left).intValue();
            }
            else
            {
                if ( left <= 0 )
                {
                    if (evenOdd==1)
                        {
                            retArr= pfSumOdd[right];
                        }
                        else
                        {
                            retArr= pfSumEven[right];
                        }
                }
                else
                {
                    if (evenOdd==1)
                        {
                            
                            retArr= pfSumOdd[right]-pfSumOdd[left-1];
                        }
                        else
                        {
                            retArr= pfSumEven[right]-pfSumEven[left-1];
                        }
                }
            }

            
        
        return retArr;
    }
}
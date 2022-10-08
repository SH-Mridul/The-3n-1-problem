package Problem;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Process();
	}

    public static void Process() {
    	  	
//    	1 10	 ------------>1 10 20
//    	100 200	 ------------>100 200 125
//    	201 210  ------------>201 210 89
//    	900 1000 ------------>900 1000 174
    	
    	Scanner input = new Scanner(System.in);
    	int i,j,maxLength = Integer.MIN_VALUE;
    	System.out.println("Enter i value:");
    	i = input.nextInt();
    	System.out.print("\nEnter j value:");
    	j = input.nextInt();
    	
    	
    	//For any two numbers i and j you are to determine the maximum cycle length over all numbers between and including both i and j.
    	//if we think our i =1 and j = 10, here we have to print i, j and last we have to print i and j max Collatz Conjecture cycle.
    	
    	for(int a = i; a<j; a++)
    	{
    		
    		//22 ->  11 34 17 52 26 13 40 20 10 5 16 8 4 2 1(if n is 22 output is after  arrow)

    		int cycleLength = 1;
    		int currentN = a;
    		
    		while(currentN !=1)
    		{
    			if(currentN%2==0)
    			{
    				currentN = currentN/2;
    			}else {
    				currentN = (currentN*3)+1;
    			}
    			cycleLength += 1;
    			
    		}
    		
    		maxLength = Integer.max(maxLength, cycleLength);
    	}
    	
    	System.out.print(i+" "+j+" "+maxLength);
    }
}

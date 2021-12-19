package basics;

import java.util.Scanner;

public class testjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        printPattern(n);
	}
	 public static void printPattern(int n)
	    {
	        int nsu=n-1;
	        int upper=n-1;
	         int npu=1;
	        while(upper>0)
	        {
	           
	            for(int i=0;i<nsu;i++)
	            {
	                System.out.print("*");
	            }
	            for(int i=1;i<=npu;i++)
	            {
	                System.out.print(".");
	            }
	            for(int i=0;i<nsu;i++)
	            {
	                System.out.print("*");
	            }
	             System.out.println();
	            nsu--;
	            npu+=2;
	            upper--;
	        }
	        for(int i=0;i<=npu-1;i++)
	        {
	            System.out.print(".");
	        }
	        System.out.println();
	        int lower=n-1;
	        int nsl=1;
	        int npl=n+2;;
	         while(lower>0)
	        {
	            for(int i=0;i<nsl;i++)
	            {
	                System.out.print("*");
	            }
	            for(int i=1;i<=npl;i++)
	            {
	                System.out.print(".");
	            }
	            for(int i=0;i<nsl;i++)
	            {
	                System.out.print("*");
	            }
	             System.out.println();
	            nsl++;
	            npl-=2;
	            lower--;
	        }
	    }
	}



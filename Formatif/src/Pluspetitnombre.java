/*
* Author : Liam
*Date : 11 Dec, 2020
*/
public class Pluspetitnombre
	{		
			public static void main(String[] args)
					{
						int []maliste= {12,3,14,7,123,9};

						maliste=shiftDroite(maliste);
						//System.out.println(maliste[3]);

						  for (int i : maliste) { System.out.println(i); 
						  }

				}
				
			static int []shiftDroite(int [] a)
			{
				int temp=a[0];
				for (int i = 1; i < a.length; i++)
				{
					a[i-1]=a[i];
				}
				a[a.length-1]=temp;
				return a;
				
			}

	}

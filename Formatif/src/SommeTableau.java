/*
* Author : Liam
*Date : 11 Dec, 2020
*/
public class SommeTableau
	{

		public static void main(String[] args)
			{
				int[] array = {13,2,3,4,5,6,7,8,9,10};
			
				int somme = 0;
				
				for(int numero : array)
				
				somme = somme+numero;
				
				System.out.println("Le somme des entiers égle:");
				
				System.out.println(somme);
			}

	}

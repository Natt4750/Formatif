import java.util.Scanner;

/*
* Author : nasser
*Date : Dec. 10, 2020
*Description: Code qui permet de manipuler certain choses avec un tableau de valeurs. 
*/
public class Formatif_Nasser
	{

		public static void main(String[] args)
			{
				int [] myTab= {14,12,24,12,2,9,8,3,1000,4,10};
				
				
				//System.out.println(Somme(myTab));
				//System.out.println(PresentouNon(myTab));
				
				for(int element : myTab)
				{
					System.out.println(element);
					//System.out.println(MoinsPlusGrandEntier(myTab));
				}
				
				
				

			}
		static int Somme(int []a)

			{
					int somme=0;
					for (int i=0; i<a.length; i++)
					{
						somme+=a[i];
					}
					return somme;
			}

		static int PresentouNon(int []a)
		{
				Scanner sc=new Scanner(System.in);
				
				int NPresent= sc.nextInt();
				
				for(int i=0;i<a.length;i++)
				{
					if(NPresent==a[i])
						System.out.println("Cette nombre est presente");
						else
						System.out.println("Cette nombre n'est pas presente");
						System.exit(1);
				}
				return NPresent;
				
		}

		static int MoinsPlusGrandEntier(int []a)
		{
				int max=0;
				int pos=0;
				int temp=0;
				
				for(int i=0;i<a.length;i++)
				{
					if(a[i]>max)
					{
						max=a[i];
						max=temp;
						temp=a[1];
						
					}
					
						
				}
				return temp;
		}
	}

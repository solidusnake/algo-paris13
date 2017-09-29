
public class Recursivite {
	public static void main(String[]args)
	{
		//recursFirst(20);
		
		//recursSecond(30);
		
		//System.out.println(somme(5));
		
		System.out.println(factorielle(5));
	}
	
	static void recursFirst(int n)
	{
		if(n > 0)
		{
			System.out.println(n);
			recursFirst(n-1);
		}
	}
	
	static void recursSecond(int n)
	{
		if(n > 0)
		{
			recursSecond(n-1);
			System.out.println(n);
		}
	}
	
	static int somme(int n)
	{
		int result;
		
		if(n > 0)
		{
			result = n+somme(n-1);
		}else {
			result = 0;
		}
		
		return result;
	}
	
	static int factorielle(int n)
	{
		int result;
		
		if(n > 1)
		{
			result = n*factorielle(n-1);
		}else {
			result = 1;
		}
		
		return result;
	}
	
	static int rechercheRecurs(int t[], int n, int indInf, int indSup)
	{
		int indice = -1;
		
		if(indInf <= indSup)
		{
			int indMed = (indInf + indSup)/2;
			if(t[indMed] == n)
			{
				indice = indMed;
			}else {
				if(n <t[indMed])
				{
					indice = rechercheRecurs(t, n, indInf, indMed-1);
				}else {
					indice = rechercheRecurs(t, n, indMed+1, indSup);
				}
			}
			
		}
	
		return indice;
	}
}

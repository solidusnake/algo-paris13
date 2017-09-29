import java.util.Scanner;

public class Cribleerathos {
	public static void main(String[] args) {
		int n;

		Scanner sc = new Scanner(System.in);
				
		boolean[] premiers = new boolean[10000];
		boolean[] crible = new boolean[1000000];
		initialisation(crible);
		eratosthene(crible);
		affichage(crible);
		long start = System.currentTimeMillis();
		
		for(int i = 2; i < premiers.length; i++)
		{
				premiers[i] = estPremier(i);
	
		}
		long fin = System.currentTimeMillis();
		
		System.out.println("temps écoulé = "+ (fin - start) +"ms");
	
	}
	
	static boolean estPremier(int n)
	{
		int cpt = 0;
		
		for(int i = 2; i < n; i++)
		{
			if(n%i == 0)
			{
				cpt++;
			}
		}
		
		return cpt == 0;
		
	}
	
	static void initialisation(boolean [] t)
	{
		t[0] = false;
		t[1] = false;
		
		for(int i = 2; i < t.length; i++)
		{
			t[i] = true;
		}
	}
	
	static void eratosthene(boolean[] t)
	{
		int p = 2;
		int taille = (int)(Math.sqrt(t.length)+1);
		int i;
		
		while(p < taille)
		{
			if(t[p])
			{
				i = p;
				while(i*p <t.length)
				{
					t[i*p] = false;
					i++;
				}
			}
			p++;
		}
		
	}
	
	static void affichage(boolean [] premiers)
	{
		int cpt = 0;
		for(int j = 0; j < premiers.length; j++)
		{
			
			if(premiers[j] == true)
			{
				if(cpt == 9)
				{		cpt = 0;			
					System.out.println(j + " ");
				}else {
					System.out.print(j + " ");
					cpt++;
				}
			}
		}
	}
}

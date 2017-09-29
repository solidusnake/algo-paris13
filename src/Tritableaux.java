import java.util.Random;

public class Tritableaux {
	//Tris
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] tab = new int[10];
			initAlea(tab);
			//System.out.println("tableau");
			//affichage(tab);
			//System.out.println("Indice min");
			//System.out.println(indMin(tab, 0));
			System.out.println("Tab trier");
			//triSelect(tab);
			triInsert(tab);
			affichage(tab);
			System.out.println("Recherche valeur "+ recherche(tab, 9));
			
			 //
			//triBulle(tab);
			// tab2 = copieTab(tab);
			// System.out.println("Tableau après tri");
			// affichage(tab);
			// swap(tab, 2, 5);
			// affichage(tab);
		}
		
		static void initAlea(int [] t)
		{
			Random randomGenerator = new Random();
			
			for(int i = 0; i < t.length; i++)
			{
				t[i] = randomGenerator.nextInt(100);
			}
		}
		
		static void affichage(int [] tab)
		{
			int cpt = 0;
			for(int j = 0; j < tab.length; j++)
			{
				
				if(cpt == 9)
				{		cpt = 0;			
					System.out.println(tab[j]);
				}else {
					System.out.print(tab[j] + " ");
					cpt++;
				}
			}
		}
		
		static int[] copieTab(int[] tab)
		{
			int[] t = new int [tab.length];
			
			for(int i = 0; i < tab.length; i++)
			{
				t[i] = tab[i];
			}
			
			return t;
		}
		
		static void swap(int []tab, int n1, int n2)
		{
			int temp = tab[n1];
			tab[n1] = tab[n2];
			tab[n2] = temp;
		}
		 
		/*
		 * Ecrire une fonction insertion
		 * decale le contenu entre deux limite d'une case vers la droie
		 * remplace la limite 1 par la valeur de la limite 2
		 * decale la limite1 d'une case vers la droite
		 */
		
		static void insertion(int[] t, int limit1, int limit2)
		{
			int temp = t[limit2];
			
			for(int i = limit2; i > limit1; i--)
			{
				t[i] = t[i-1];
			}
			
			t[limit1] = temp;
		}
		
		static void tri(int tab[])
		{
			int i = 0;
			while(i < tab.length -1)
			{
				if(tab[i] > tab[i+1])
				{
					swap(tab, i, i+1);
					i = 0;
				}else {
					i++;
				}
			}
		}
		
		static void triBulle(int t[])
		{
			for(int i = 1; i < t.length; i++) 
			{
				for(int j = 0; j < t.length - i; j++)
				{
					if(t[j] > t[j+1])
					{
						swap(t, j, j+1);
					}
				}
			}
		}
		
		static void triSelect(int t[])
		{
			int p;
			
			for(int i = 0; i < t.length; i++)
			{
				p = indMin(t, i);
				swap(t, i, p);
			}
		}
		
		static void triInsert(int t[])
		{	
			int j;
			boolean stop;
			
			for(int i = 1; i < t.length; i++)
			{
				j = 0;
				stop = false;
				while(j < i && !stop)
				{
					if(t[i] < t[j])
					{
						insertion(t, j, i);
						stop = true;
					}else {
						j++;
					}
				}
			}
		}
		
		static int indMin(int[] t, int i)
		{
			int imin = i;
			for(int p = i; p < t.length; p++)
			{
				if(t[p] < t[imin])
				{
					imin = p;
				}
			}
			
			return imin;
		}
		
		static int recherche(int t[], int n)
		{
			int indice = -1;
			int indInf = 0;
			int indSup = t.length -1;
			int intMed;
			
			while((indice == -1) && (indInf <= indSup))
			{
				intMed = (indInf+indSup)/2;
				
				if(t[intMed]==n)
				{
					indice = intMed;
				}else {
					if(t[intMed] <n)
					{
						indInf = intMed +1;
					}else {
						indSup = intMed - 1;
					}
				}
			}
			
			return indice;
		}
		
		static void triBullePartiel(int[] t, int deb, int fin)
		{
			for(int p =deb; p<=fin; p++)
			{
				for(int i=deb; i<fin-p+deb; i++)
				{
					if(t[i] > t[i+1])
					{
						swap(t, i, i+1);
					}
				}
			}
		}
}

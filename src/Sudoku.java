
public class Sudoku {

	static int [][] sudoku;
	
	public static void main(String[] args) {
		initSudoku();
		sudoku[0][0] = 7;
		//int[][] copie = copieSudoku(sudoku);
		affichage(sudoku);
		//affichage(copie);
		System.out.println(respectDesLignes(sudoku));
	}
	
	/**
	 * Créer une méthode affichage qui fait apparaitre le sudoko 
	 */
	
	static void initSudoku() {
		sudoku = new int [9][9];
		for(int i = 0; i < 9; i++) {
			for(int j=0; j<9; j++)
			{
				sudoku[i][j] = 0;
			}
		}
		
		sudoku[0][2] = 8;
		sudoku[0][5] = 7;
		sudoku[1][3] = 6;
		sudoku[1][4] = 8;
		sudoku[1][5] = 1;
		sudoku[1][6] = 5;
		sudoku[1][8] = 3;
		sudoku[2][0] = 1;
		sudoku[2][2] = 3;
		sudoku[2][4] = 4;
		sudoku[2][7] = 6;
		sudoku[3][0] = 5;
		sudoku[3][4] = 2;
		sudoku[3][5] = 9;
		sudoku[3][6] = 6;
		sudoku[3][8] = 4;
		sudoku[4][0] = 3;
		sudoku[4][2] = 6;
		sudoku[4][6] = 9;
		sudoku[4][8] = 8;
		sudoku[5][0] = 9;
		sudoku[5][2] = 2;
		sudoku[5][3] = 8;
		sudoku[5][4] = 3;
		sudoku[5][8] = 1;
		sudoku[6][1] = 3;
		sudoku[6][4] = 5;
		sudoku[6][6] = 2;
		sudoku[6][8] = 6;
		sudoku[7][0] = 7;
		sudoku[7][2] = 9;
		sudoku[7][3] = 4;
		sudoku[7][4] = 6;
		sudoku[7][5] = 3;
		sudoku[8][3] = 7;
		sudoku[8][6] = 3;
	}
	
	static void affichage(int[][] s){
		for(int i=0;i<s.length;i++){
			if(i%3==0)
			{
				System.out.println(" |-----------------------|");
			}
			for(int j=0;j<s[i].length;j++){
				if(j%3==0)
					{
						System.out.print(" |");
					}
				if(s[i][j]!=0)
					{
						System.out.print(" "+s[i][j]);
					}
				else
					{
						System.out.print("  ");
					}
			}
			System.out.println(" |");
		}
		System.out.println(" |-----------------------|");
	}
	
	static int[][] copieSudoku(int[][] s)
	{
		int tab [][] = new int [s.length][s.length];
			
		for(int i = 0; i < s.length; i++)
		{
			for(int j = 0; j < s[i].length; j++)
			{
				tab[i][j] = s[i][j];
			}
		}
		
		return tab;
	}
	
	static boolean respectDesLignes(int [][] s)
	{
		boolean respect = true;
		int ligne = -1;
		int valeur, cpt;
		
		while(respect&&(ligne < 8))
		{
			ligne++;
			valeur = 0;
			while(respect&&(valeur < 9))
			{
				valeur++;
				cpt = 0;
				for(int col = 0; col < 9; col++)
				{
					if(s[ligne][col] == valeur)
					{
						cpt++;
					}
				}
				respect = cpt <2;
				
			}
		}
		
		return respect;
	}

}

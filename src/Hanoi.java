
public class Hanoi {
	public static void main(String[] args) {
		deplace(4, 'A', 'B', 'C');
	}

	static void deplace(int n, char p1, char p2, char p3)
	{
		if(n == 1)
		{
			System.out.println(p1 +" vers "+ p3);
		}else {
			deplace(n-1, p1, p3, p2);
			deplace(1, p1, p3, p2);
			deplace(n-1, p2, p1, p3);
		}
	}
}

package statementlogic;

public class Primenumber {

	public static void main(String[] args) {
		for (int u = 2; u <= 100; u++) 
		{
			for (int g = 2; g <= 11; g++) 
			{
				if ( (u % g == 0) && (g!=u) && (g<11) ) {
					break;
				}
				else if( u==g || g==11)
				{
					System.out.print(u+" ");
					break;
				}
			}			
		}
	}
}

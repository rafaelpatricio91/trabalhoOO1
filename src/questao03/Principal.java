package questao03;

import java.util.Scanner;

public class Principal
{
	public static void main(String[] args)
	{
		float x;
		float y;
		float z;
		float f;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("INFORME O VALOR DE X: ");
		x = scan.nextFloat(); scan.nextLine();
		
		System.out.println("INFORME O VALOR DE Y: ");
		y = scan.nextFloat(); scan.nextLine();
		
		System.out.println("INFORME O VALOR DE Z: ");
		z = scan.nextFloat(); scan.nextLine();
		
		System.out.println("INFORME O VALOR DE F: ");
		f = scan.nextFloat(); scan.nextLine();
		
		System.out.println("*-*-*-*-*-*RESULTADO EQUAÇAO: " + (Math.pow(x, 2) + (2*y) + z - (4*f) )/2 );
						  
		
		
		
		
//		(x²+2*y+z-4*f)/2
		
		
	}
		
	
}

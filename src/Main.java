import java.util.Scanner;


public class Main {

	public static void main (String args []){
		
		double valorFin;
		double juros;
		int meses;
		
		Scanner sc = new Scanner (System.in);
		Colector ct = new Colector ();
		
		System.out.println ("Valor do financiamento: ");
		valorFin = sc.nextDouble();
		ct.setvalorFin(valorFin);
	
		System.out.println ("Quantidade de meses para o financiamento: ");
		meses = sc.nextInt();
		ct.setMeses(meses);
		
		System.out.println ("Porcentagem de juros?: ");
		juros = sc.nextDouble();
		ct.setJuros(juros);
		
		CalcSac.calc(ct.getvalorFin(), ct.getJuros(), ct.getMeses());
	}
}
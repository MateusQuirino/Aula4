
public class CalcSac {

	public static void calc (double valorFin, double juros, int meses){
		
		double amortizacao = valorFin / meses;
		double parcela;
		double jurosPorcent = juros / 100;
		double total = 0;
		
		for (int i = 0; i < meses; i++){
			parcela = Math.round(amortizacao + jurosPorcent * (valorFin - i * amortizacao));
			System.out.println((i+1)+"ª parcela: R$ " + parcela);
			
			total = total + parcela;
		}
		System.out.println("------------------- Valor total: R$ " + total + " -------------------");
	}
}

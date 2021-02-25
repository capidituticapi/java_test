import java.util.Scanner;

class AmortizationProgram {

	public static void main(String[] args) {
		double prestamo;
		final double interesaAnual = 20;
		int anios;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el monto del prestamo:");
		prestamo = sc.nextFloat();
		System.out.print("Ingrese el numero de anios a pagar:");
		anios = sc.nextInt();
		calculaAmort(prestamo, interesaAnual, anios);

	}

	// double p, double iy, int ny
	public static void calculaAmort(double prestamo, double interesPorAnio,
			int anios) {
		double newbal;
		double interesMes = (interesPorAnio / 12) / 100;
		int nm = anios * 12;
		double mp, ip, pp;
		int i;	

		mp = prestamo * interesMes * Math.pow(1 + interesMes, (double) nm)
				/ (Math.pow(1 + interesMes, (double) nm) - 1);
		printHeader();
		// print tabla de amortizacion excepto el ultimo mes
		for (i = 1; i < nm; i++) {
			ip = prestamo * interesMes;// interes a apagar
			pp = mp - ip; // pago principal
			newbal = prestamo - pp; // nuevo balance
			printTable(i, prestamo, mp, ip, pp, newbal);
			prestamo = newbal; // balance actualizado
		}
		// ultimo mes
		pp = prestamo;
		ip = prestamo * interesMes;
		mp = pp + ip;
		newbal = 0.0;
		printTable(i, prestamo, mp, ip, pp, newbal);

	}

	public static void printTable(int i, double p, double mp, double ip,
			double pp, double newbal) {

		System.out.format("%-12d%-16.2f%-16.2f%-16.2f%-16.2f\n", i, mp, ip, pp,
				newbal);

	}

	public static void printHeader() {
		int i;
		System.out.println("\nAmortizaci\u00F3n");
		for (i = 0; i < 72; i++) {
			System.out.print("-");
		}
		System.out.format("\n%-12s%-16s%-16s%-16s%-16s", "N\u00FAmero de",
				"Cuotas fijas a", "Interés del", "Amortizaci\u00F3n",
				"Saldo total");
		System.out.format("\n%-12s%-16s%-16s%-16s%-16s\n\n", "pagos", "pagar",
				"préstamo", "", "restante");
	}
}
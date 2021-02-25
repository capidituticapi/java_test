package com.test.cinco;

public class Amortizacion {

	/*
	 * número de pagos, otra para el saldo pendiente, la tercera será de
	 * intereses, otra de comisiones y la última con el capital
	 */
	private Integer noPagos;
	private Integer saldoPendiente;
	private float intereses;
	private float comisiones;
	private float capital;

	public static void printSch(int i, double p, double mp, double ip,
			double pp, double newbal) {

		System.out.format("%-8d%-10.3f%-10.3f%-10.3f%-12.3f\n", i, mp, ip, pp,
				newbal);

	}

	public static void printHeader() {
		int i;
		System.out.println("\nAmortization Schedule for  Borrower");
		for (i = 0; i < 62; i++)
			System.out.print("-");
		System.out.format("\n%-8s%-10s%-10s%-10s%-12s", " ", "Monthly",
				"Interest", "Principle", "New");
		System.out.format("\n%-8s%-10s%-10s%-10s%-12s\n\n", "Month", "Payment",
				"Paid", "Paid", "Balance");
	}
}

package  com.test.uno;

public class Uno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factura factura = new Factura("Test Factura", 432.00);
		
		factura.imprimeFactura();

	}
}


class Factura {

	String nombre;
	Double cantidad;
	
	public Factura(String nombre, Double cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	void imprimeEncabezado() {
		System.out.println("////////****Encabezado****\\\\\\\\");
	}

	void imprimeFactura() {
		imprimeEncabezado();
		// imprime los detalles
		System.out.println("Nombre:        " + getNombre());
		System.out.println("Cantidad       " + getCantidad());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
}

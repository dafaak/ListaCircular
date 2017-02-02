package est.com;

public class Producto {
	private String nombre;
	private int cantidad;
		private Producto siguiente;
		
		public Producto(String s,int c, Producto n){
		nombre =s;
		this.cantidad=c;
		siguiente= n;
		
		}
		public Producto (String s,int c){//Primer nodo
			this.nombre=s;
			this.cantidad=c;
			this.siguiente=null;
		}
		
		 public Producto(String s){
			 this.nombre=s;
			 this.cantidad=0;
			 this.siguiente=null;
		 }
		 
		 
		 
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getCantidad() {
			return cantidad;
		}
		public void setCantidad(int c) {
			this.cantidad = c;
		}
		public Producto getSiguiente() {
			return siguiente;
		}
		public void setSiguiente(Producto siguiente) {
			this.siguiente = siguiente;
		}
		

}

package est.com;



public class Estudiante {

	private String nombre;
	private Long ci;
		private Estudiante siguiente;
		
		public Estudiante(String s,long ci, Estudiante n){
		nombre =s;
		this.ci=ci;
		siguiente= n;
		
		}
		public Estudiante (String s,long ci){//Primer nodo
			this.nombre=s;
			this.ci=ci;
			this.siguiente=null;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public Long getCi() {
			return ci;
		}
		public void setCi(Long ci) {
			this.ci = ci;
		}
		public Estudiante getSiguiente() {
			return siguiente;
		}
		public void setSiguiente(Estudiante siguiente) {
			this.siguiente = siguiente;
		}
		
		public String toString(){
			return "Nombre: "+this.nombre+" CI:"+this.ci;
		}
		
		
		
		}
		
		


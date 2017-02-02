package est.com;



public class Listaestudiantes {
	protected Estudiante inicio;
	protected long longitud;

	public Listaestudiantes(){
		inicio=null;
		this.longitud=0;
	}
	public boolean estaVacia(){
		return (inicio==null);
	}

	public void insertarInicio(String nombre, long ci){
		if(estaVacia())
		{inicio=new Estudiante(nombre,ci);this.longitud+=1;}
		
		else {if (existeElemento(ci)==false ){inicio= new Estudiante(nombre,ci,inicio);this.longitud+=1;}
		
		}
		
		
		}

	

	public boolean existeElemento(long ci){
		Estudiante p=inicio;
		if (estaVacia()==true){return false;}
		else {
		while(p!=null){
			if(p.getCi()==ci){return true;};
			p=p.getSiguiente();
		}
		}
		return false;
	}

	public String toString(){
		if (estaVacia()==true){return "Lista vacia!!!";}
		else{
	String salida="";
	Estudiante p =inicio;
	{salida+=" Lista de nodos:\n";
	salida+=p.toString()+"\n";
	p=p.getSiguiente();
	while(p!=null){
		salida+=p.toString()+"\n";
		p=p.getSiguiente();}
		
		
	}
	salida+="\nlongitud: "+this.longitud;
		return salida;
	}
		
	}


}

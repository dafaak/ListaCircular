package est.com;

public class Listaproductos {
	private Producto inicio;
	private long longitud;

	public Listaproductos(){
		inicio=null;
		this.longitud=0;
	}
	public boolean estaVacia(){
		return (inicio==null);
	}

	public void insertarInicio(String nombre, int c){
		if(estaVacia())
		{inicio=new Producto(nombre,c);this.longitud+=1;}
		
		else {if (existeElemento(c)==false ){inicio= new Producto(nombre,c,inicio);this.longitud+=1;}
		
		}
		
		
		}

	

	public boolean existeElemento(long c){
		Producto p=inicio;
		if (estaVacia()==true){return false;}
		else {
		while(p!=null){
			if(p.getCantidad()==c){return true;};
			p=p.getSiguiente();
		}
		}
		return false;
	}

	public String toString(){
		if (estaVacia()==true){return "Lista vacia!!!";}
		else{
	String salida="";
	Producto p =inicio;
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

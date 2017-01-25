package com.est;

public class CLinkedList {
	private Nodo cabeza;
	private Nodo cola;


	public CLinkedList() {
		
		this.cabeza=null;
		this.cola=null;
	
	}
	
	public boolean estaVacia(){
		return (cabeza==null);
	}
	
	
	
	


	public void insertarInicio(String dato){
		
		if (estaVacia()){cabeza=new Nodo(dato);
		cola=cabeza;}
		else{
			Nodo p=cabeza;
		Nodo aux=new Nodo(cola,cabeza,dato);
		cabeza=aux;  
		cola.setSiguiente(cabeza);
		p.setAnterior(cabeza);
		
	
		   }
	}
	
	
	public void insertarFinal(String dato){
		Nodo p=cola;
		if (estaVacia()){
			cabeza=new Nodo(dato);
			cola=cabeza;
			
	       	}
		else{
		Nodo aux=new Nodo(cola,cabeza,dato);
		cabeza.setAnterior(aux);
		cola.setSiguiente(aux);
		cola=aux;

			
             		
		}
		
		}
	
	
	public Nodo buscarDato(String dato){
		Nodo p=cabeza;
		if (estaVacia()==true){return null;}
		else {if (p.getDato().equalsIgnoreCase(dato)){return p;}
		else{while(p!=cabeza){
			if( p.getDato().equalsIgnoreCase(dato)){return p;};
			p=p.getSiguiente();}
		
		}}
		return null;			
	}
	
	public Nodo buscarDato(int dato){
		Nodo p=cabeza;
		int contador=0;
		int tamano =1;
		Nodo q=cabeza.getSiguiente();
		while(q!=cabeza){
			tamano++;
			q=q.getSiguiente();
		}
		if (estaVacia()==true){return null;}
		else {
		while(contador<=tamano){
			contador++;
			if (contador==dato){return p;}
			else {p=p.getSiguiente();}
		}
		return null;			
	}
	
	
	}
	
public void buscarindiceyEliminar(CLinkedList lista,int dato){
	if (lista.buscarDato(dato)!=null){
		Nodo eliminar= lista.buscarDato(dato);
		Nodo p=eliminar.getAnterior();
		Nodo q=eliminar.getSiguiente();
		if (p==cola){
	    q.setAnterior(cola);
	    cola.setSiguiente(q);
		cabeza=q;
		}
		else{
			if(q==cabeza){  
				p.setSiguiente(cabeza);
			cabeza.setAnterior(p);
				cola=p;
			}
			else {p.setSiguiente(q);
			q.setAnterior(p);}
			
		}
		
		
	}
	
	
}
public String listarFin(){
	if (estaVacia()==true){return "Lista vacia!!!";}
	else{
String salida="";
Nodo p =cola;
{salida+=" Lista de nodos:\n";
salida+=p.getDato()+"\n";
p=p.getAnterior();
while(p!=cola){
	salida+=p.getDato()+"\n";
	p=p.getAnterior();}
	
	
}

	return salida;}
}

	
public String listarIni(){
	String salida="";
	if (estaVacia()==true){return "Lista vacia!!!";}
	else{if (cabeza.getSiguiente()==null){return "Lisa de nodos: \n"+cabeza.getDato();}
	else{
	
		
Nodo p =cabeza;

salida+="Lista de nodos:\n";
salida+=p.getDato()+"\n";
p=p.getSiguiente();
while(p!=cabeza){
	salida+=p.getDato()+"\n";
	p=p.getSiguiente();}
	
	

	}
	return salida;
}
}
	}





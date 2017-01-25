package com.est;


	public class Nodo {
		private Nodo anterior,siguiente;
		private String dato;
		
		public Nodo(Nodo anterior, Nodo siguiente, String dato) {
			super();
			this.anterior = anterior;
			this.siguiente = siguiente;
			this.dato = dato;
		}
		
		public Nodo(String dato){//primernodo
			anterior=null;
			siguiente=null;
			this.dato=dato;
			
		}
		public Nodo(){
			anterior=null;
			siguiente=null;
			this.dato="";
			
		}
		
		

		public Nodo getAnterior() {
			return anterior;
		}

		public void setAnterior(Nodo anterior) {
			this.anterior = anterior;
		}

		public Nodo getSiguiente() {
			return siguiente;
		}

		public void setSiguiente(Nodo siguiente) {
			this.siguiente = siguiente;
		}

		public String getDato() {
			return dato;
		}

		public void setDato(String dato) {
			this.dato = dato;
		}
		
		public String toString(){
			return this.dato;
			
		}
		
		



}

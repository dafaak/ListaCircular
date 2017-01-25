package com.est;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CLinkedList l= new CLinkedList();
		l.insertarInicio("segundo");
		System.out.println("\n"+l.listarIni());
		l.insertarInicio("primero");
        System.out.println("\n"+l.listarIni());
        l.insertarFinal("tercero");
        System.out.println("\n"+l.listarIni());
        System.out.println(l.buscarDato("asdf"));
        
        l.buscarindiceyEliminar(l, 3);
        System.out.println("\n"+l.listarIni());
        
        System.out.println("\n"+l.listarFin());
	}

}

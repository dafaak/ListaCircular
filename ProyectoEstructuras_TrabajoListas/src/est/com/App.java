package est.com;

public class App {

	public static void main(String[] args) {
		
		
		
		
		Listaestudiantes l=new Listaestudiantes();
		l.insertarInicio("Israel", 1234567);
		l.insertarInicio("asd", 1234567);
		l.insertarInicio("dafak", 123125);
        System.out.println(l.toString());
        long ci=123456;
        if (l.existeElemento(ci)==true){System.out.println("El alumno "+ci+ " se encuentra registrado");}
        else{System.out.println("El alumno "+ci+" no se encuentra registrado");}
	
	
	
	
        Listaproductos lp= new Listaproductos();
        	}

}

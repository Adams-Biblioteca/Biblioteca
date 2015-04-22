package miBiblioteca;

import java.util.Scanner;

public class Util {
	private	static Scanner teclado;
	
	public static void limpiar_pantalla(){
		for (int contador=1;contador<15;contador++){
			System.out.println("\n");
		}
	}

	public static void hasta_luego(){
		System.out.println("¡Hasta luego!");
	}

	public static void pausa(){
		System.out.println("Pulsar RETORNO para continuar");
		getTeclado().nextLine();
	}
	
	public static void mensaje(String a){
		System.out.println(a);
		pausa();
	}
	
	public static String intrDatStr(String a){
		System.out.print(a);
		return getTeclado().nextLine();
	}
	
	public static Character intrDatChar(){
		String tmpStr;
		tmpStr=intrDatStr("").toUpperCase();
		if(tmpStr.isEmpty()){
			return(' ');
		}else{
			return(tmpStr.charAt(0));
		}
	}
	
	public static char intrSN(String a){
		char res;
		a=a.concat(" (S//N): ");
		do{
			System.out.print(a);
			res=getTeclado().nextLine().toUpperCase().charAt(0);
			if (!(res=='S'||res=='N')){
				mensaje("Solo se puede utiliza 'S' o 'N'");
			}
		}while (!(res=='S'||res=='N'));
		return res;
	}
		
	public static Double intrDatDouble(String a){
		String tmp;
		do{
			try{
				System.out.print(a);
				tmp=getTeclado().nextLine();
				if (tmp.isEmpty()){
					return (null);
				}
				return Double.parseDouble(tmp);
			}catch(Exception e){
				mensaje("Dato ERRONEO, \n"+e);
			}
		}while(true);
	}
	
	public static Integer intrDatInteger(String a){
		String tmp;
		do{
			try{
				System.out.print(a);
				tmp=getTeclado().nextLine();
				if (tmp.isEmpty()){
					return (null);
				}
				return Integer.parseInt(tmp);
			}catch(Exception e){
				mensaje("Dato ERRONEO, \n"+e);
			}
		}while (true);
	}

	public static Scanner getTeclado(){
		return teclado;
	}
	public static void ActTeclado(){
		teclado=new Scanner(System.in);
	}

	public static String padRight(String s,int n){
		if(s.length()>n){
			s=s.substring(0,n);
		}
		return String.format("%1$-"+n+"s",s);  
	}

	public static String padLeft(String s,int n){
		if(s.length()>n){
			s=s.substring(0,n);
		}
		return String.format("%1$"+n+"s",s);
	}
}
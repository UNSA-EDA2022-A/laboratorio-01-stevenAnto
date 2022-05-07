package com.example.project;

import java.util.*;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));			
		}
	}

	public String convertirBaseGabriel(int a) {
         if(verificar(a)){
           int suma=0;
           ArrayList<Integer> digitos= digitos(a);
           for (int i=digitos.size()-1; i>0;i--){
	   double d=digitos.get(i)*(Math.pow(2,i+1)-1);
	   suma=(int)(suma+d);
           }
           // TO DO
           return ""+suma;
         }
        else return "El numero proporcionado no esta en base Gabriel.";
	}//
	
	  public static  boolean   verificar(int a){
           int num=a;
           boolean estado=true; //ultimo
           int ultimo=0;
           while(num>0){
            int dig = num%10;
            if(dig!=0&&estado){
	    ultimo=dig;
	    estado=false;
	    dig=1;
           }
           if(!(ultimo==1||ultimo==2||ultimo==0))return false;
           //System.out.println("el ultimo es"+ultimo);
           num=num/10;
           if(!(dig==1||dig==0))return false;
         }
         return true;
        }
	
  public static ArrayList<Integer> digitos(int a){
    ArrayList<Integer> digitos= new ArrayList<Integer>();
    int num=a;
    while(num>0){
      int dig = num%10;
      num = num/10;
      digitos.add(dig);
    }
    return digitos;
  }
	
	
}

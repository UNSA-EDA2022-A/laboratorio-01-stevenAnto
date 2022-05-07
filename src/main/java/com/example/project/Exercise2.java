package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

            int a [] = new int [7];
            for(int i = 0; i < 7; i++){
                int n = sc.nextInt();
                a[i] = n;
            }
			
			System.out.println(obj.getMenorNumeroSaltos(a));			
		}
	}

	public int getMenorNumeroSaltos(int a []) {
        if(verificar(a)){
         int li;
         int ubicado=50;
         int i=0;
         int contador=0;
         while(i<=6){
	  while(ubicado>=a[i]){
	    i++;
	    if(i>6)break;
	  }
	 contador++;
	//System.out.println("contador"+contador);
	//System.out.println("indice"+i);
	 if(i>6)break;
	 if(ubicado==a[i]){
	   li=a[i];

	 }
	 else {
	  li=a[i-1];
	}
	//System.out.println("limite inferior"+li);
	ubicado=li+50;
	//System.out.println("proxima busqueda"+ubicado);
	//System.out.println("****************");
      }
       return contador;
     }
       else return -1;
}
	
	public boolean verificar(int a[]){
         int k=0;
         for (int i =1; i<a.length;i++){
          if(a[0]>50)return false;
          if((a[i]-a[i-1])>50){
	   return false;
          }
         }
        return true;
       }
}

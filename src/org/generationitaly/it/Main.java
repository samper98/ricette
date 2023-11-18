package org.generationitaly.it;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    HashMap<String,Float> elencoIngredienti = new HashMap<>()
    {
    {
    //  espresso tutto sotto forma di kilocalorie
    	put("uova",65f);	   //1 uovo    
        put("guanciale",650f); //100 g di guanciale 
        put("pecorino",393f); //100 gr di pecorino
        put("pepe",0f); //privo di calorie
        put("sale",0f); //privo di calorie
        put("olio",822f); //100 ml di olio extra vergine
        put ("polpa di pomodoro",26f);//100gr di sugo
        put ("parmiggiano",392f); //100gr di parmiggiano  
    }};
    Set<String> chiavi = elencoIngredienti.keySet();
    String NomeRicetta,ingrediente,risposta="";
    ArrayList<String> Ricetta = new ArrayList<>();
    int i=0;
    float quantità, contatore=0f;
    System.out.println("Salve e benvenuto al nostro mercationo, \noggi abbiamo a disposizione i seguenti ingredienti :");
   for (String chiave: chiavi)  	
   System.out.println(" " + (i+=1) + " " + (chiave));
   System.out.println("Inserisci la ricetta che ti interessa cucinare");
   NomeRicetta=sc.nextLine();
   do
   {
     System.out.println("Quale ingrediente ti serve ?");
     ingrediente=sc.nextLine();
     if (elencoIngredienti.containsKey(ingrediente))
     {
    	 Ricetta.add(ingrediente);
    	 System.out.println("Quanta quantita vuoi?");
    	 quantità=Float.parseFloat(sc.nextLine());
    	 contatore+=quantità*elencoIngredienti.get(ingrediente);
    	System.out.println("Vuoi comprare altro?(si/no)");
        risposta=sc.nextLine();
     }
     else 
     {
         System.out.println("Non abbiamo questo ingrediente,vuoi comprare qualcos'altro ?(si/no)");
          risposta=sc.nextLine();
     }
	}while(risposta.equals("si"));
   System.out.println("Gli ingredienti comprati sono:");
   for (int j=0;j<Ricetta.size();j++)
   {
       System.out.println(Ricetta.get(j));
   }
        System.out.println( NomeRicetta + " ha un totale di " + contatore + " chilocalorie , e di conseguenza\n" + contatore*1000 +" calorie ");
    		 System.out.println("Grazie è stato un piacere, ci vediamo la prossima volta");
 sc.close();
}
	
}

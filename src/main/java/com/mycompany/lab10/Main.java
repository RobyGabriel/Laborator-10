package com.mycompany.lab10;

public class Main {

    public static void main(String[] args) 
    {
        // Instante ale clasei ClasaCopil
        ClasaCopil copil1 = new ClasaCopil();
        ClasaCopil copil2 = new ClasaCopil("Parinte1", 2.5f, 'A', (byte) 1, 10, "Copil1");
        ClasaCopil copil3 = new ClasaCopil("Parinte2", 3.0f, 'B', (byte) 2, 20, "Copil2");
        ClasaCopil copil4 = new ClasaCopil(copil2);
        ClasaCopil copil5 = new ClasaCopil("Parinte3", 4.0f, 'C', (byte) 3, 30, "Copil3");
 
        // Afisare
        System.out.println(copil1);
        System.out.println(copil2);
        System.out.println(copil3);
        System.out.println(copil4);
        System.out.println(copil5);
        
    ClasaParinte.setParinteP3('b'); 
        System.out.println("Valoarea lui p3: " + parinte.getP3());
    }
}

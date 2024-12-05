package com.mycompany.lab10;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) 
    {
        ClasaParinte parinte1 = new ClasaParinte("Parintel",10.5f,'A');
        ClasaParinte parinte2 = new ClasaParinte("Parinte2",22.5f,'B');
        ClasaParinte parinte3 = new ClasaParinte("Parinte3",50.05f,'C');
        ClasaParinte parinte4 = new ClasaParinte("Parinte4",2.0f,'D');
        ClasaParinte parinte5 = new ClasaParinte("Parinte5",44.25f,'E');
        
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
        
        //Vector cu instante de parinte
        ClasaParinte vectorParinte[] = new ClasaParinte[5];
        vectorParinte[0] = parinte1;
        vectorParinte[1] = parinte2;
        vectorParinte[2] = parinte3;
        vectorParinte[3] = parinte4;
        vectorParinte[4] = parinte5;
        
        ArrayList <ClasaCopil> vectorCopil=new ArrayList();
        vectorCopil.add(copil1);
        vectorCopil.add(copil2);
        vectorCopil.add(copil3);
        vectorCopil.add(copil4);
        vectorCopil.add(copil5);
        
    parinte1.filterParinteP3();
   
    
}

package com.mycompany.lab10;

public class ClasaParinte 
{
    String p1;
    float p2;
    char p3;
    
    public ClasaParinte(){
       this.p1 = "";
       this.p2 = 0.0f;
       this.p3 = '\0';
   }
   public String getP1(){
       return p1;
   }
   public float getP2(){
       return p2;
   }
   public char getP3(){
       return p3;
   }
}
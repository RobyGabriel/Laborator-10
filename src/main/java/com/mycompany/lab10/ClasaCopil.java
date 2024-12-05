package com.mycompany.lab10;

public class ClasaCopil 
{
    byte c1;
    int c2;
    String c3;
    
    public ClasaCopil(ClasaCopil copiere) {
        this.c1 = copiere.c1;
        this.c2 = copiere.c2;
        this.c3 = copiere.c3;
    }
 
   
    @Override
    public String toString() {
        return "ClasaCopil [c1=" + c1 + ", c2=" + c2 + ", c3=" + c3 + "]";
    }
}

package com.mycompany.lab10;

public class ClasaCopil extends ClasaParinte {

    private byte c1;
    private int c2;
    private String c3;

    public ClasaCopil() {
        super();
        this.c1 = 0;
        this.c2 = 0;
        this.c3 = "";
    }

    public ClasaCopil(String p1, float p2, char p3, byte c1, int c2, String c3) {
        super(p1, p2, p3);
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    public ClasaCopil(ClasaCopil copiere) {
        super(copiere);
        this.c1 = copiere.c1;
        this.c2 = copiere.c2;
        this.c3 = copiere.c3;
    }

    public void setC1(byte c1) {
        this.c1 = c1;
    }

    public byte getC1() {
        return c1;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }

    public int getC2() {
        return c2;
    }

    public void setC3(String c3) {
        this.c3 = c3;
    }

    public String getC3() {
        return c3;
    }

    @Override
    public String toString() {
        return super.toString() + "ClasaCopil [c1=" + c1 + ", c2=" + c2 + ", c3=" + c3 + "]";
    }
}

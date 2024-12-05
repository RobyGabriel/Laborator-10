package com.mycompany.lab10;

public class ClasaParinte {

    private String p1;
    private float p2;
    private char p3;

    public ClasaParinte() {
        this.p1 = "";
        this.p2 = 0.0f;
        this.p3 = '\0';
    }

    public ClasaParinte(String p1, float p2, char p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    ClasaParinte(ClasaParinte c) {
        this.p1 = c.p1;
        this.p2 = c.p2;
        this.p3 = c.p3;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP1() {
        return p1;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }

    public float getP2() {
        return p2;
    }

    public void setP3(char p3) {
        this.p3 = p3;
    }

    public char getP3() {
        return p3;
    }

    @Override
    public String toString() {
        return "p1 = " + p1 + " | p2 = " + p2 + " | p3 = " + p3;
    }

    public void setParinteP3() {
        if (p3 == 'a' || p3 == 'b' || p3 == 'c') {
            System.out.println(p3);
        }
    }
}

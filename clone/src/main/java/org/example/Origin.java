package org.example;

public class Origin implements Cloneable{
    private String a;
    private int b;
    private Inner c;

    public Origin(String a, int b, Inner c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Inner getC() {
        return c;
    }

    public void setC(Inner c) {
        this.c = c;
    }
    @Override
    public Origin clone(){
        Inner inner = new Inner();
        inner.setG(this.c.getG());
        return new Origin(this.a, this.b, inner);
    }
}

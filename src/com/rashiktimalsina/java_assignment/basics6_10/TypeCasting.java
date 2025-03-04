package com.rashiktimalsina.java_assignment.basics6_10;
public class TypeCasting {
    public static void main(String[] args) {
        int num = 10;
        float fnum = num;           //Implicit Typecasting
        System.out.println("Implicit TypeCasting: " + fnum);

        double dnum=999.99;
        int inum=(int)dnum;     //Explicit Typecasting
        System.out.println("Explicit TypeCasting: " +dnum);
;
    }


}

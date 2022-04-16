package com.example.recyclerviewsannan;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] x={4,5,6,7,0,2,1,3};
        System.out.println( restoreString("codeleet",x));
    }
    public static String restoreString(String s, int[] in) {
        char[] c = new char[in.length];
        for(int i = 0; i < in.length; i++)
            c[in[i]] = s.charAt(i);
        return new String(c);
    }

}



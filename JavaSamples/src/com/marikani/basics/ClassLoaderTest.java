package com.marikani.basics;

public class ClassLoaderTest {
    public static void main (String[] args) {
            // Bootstrap class loader will load this class in JVM memory.
            System.out.println("Java HashMap class loader: " + java.util.HashMap.class.getClassLoader());

            // System class loader will load this class into JVM memory, because system class loader find this class in current class path itself.
            System.out.println("Class loader from same package for HelloWorld class : " + com.marikani.basics.HelloWorld.class.getClassLoader());
    }
}

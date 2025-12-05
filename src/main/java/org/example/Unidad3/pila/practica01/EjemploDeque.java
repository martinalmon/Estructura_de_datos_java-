package org.example.Unidad3.pila.practica01;

import  java.util.Deque;
import java.util.ArrayDeque;
public class EjemploDeque {
    public static  void  main(String[] args){

        Deque<String>deque=new ArrayDeque<>();
        deque.addFirst("1");
        deque.addLast("2");
        deque.addFirst("3");
        System.out.println("contenido del deque"+deque);
        String primera = deque.removeFirst();
        System.out.println();
    }
}

package com.company;



import java.util.LinkedList;
import java.util.Queue;

public class CollectionQueue {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(6);
        q.add(1);
        q.add(8);
        q.add(4);
        q.add(7);
        System.out.println("La coleccion es: " + q);
        int num1 = q.remove();
        System.out.println("El elemento borrado es " + num1);
        System.out.println("La coleccion despues del borrado es " + q);
        int head = q.peek();
        System.out.println("El primer elemento es " + head);
        int size = q.size();
        System.out.println("El tamaño de la coleccion " + size);
    }
}



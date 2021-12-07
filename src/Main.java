package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // buscar("tortilla");
        // fr_each();
        buscador_de_calificaciones(4);
    }
    static void buscador_de_calificaciones(int busqueda){
        ArrayList<Integer> calificaciones = new ArrayList<Integer>();
        calificaciones.add(10);
        calificaciones.add(10);
        calificaciones.add(1);
        calificaciones.add(5);
        calificaciones.add(7);
        calificaciones.add(10);
        int index = 0;
        if (calificaciones.contains(busqueda)){
            for (int calificacion: calificaciones) {
                if (calificacion==busqueda) {
                    System.out.println("Se encontro '"+busqueda+"' en el indice :"+index );
                }
                index ++;
            }
        } else{
            Scanner in = new Scanner(System.in);
            System.out.println("No se encontro la busqueda '"+busqueda+"'");
            System.out.println("Quieres intentar con alguna otra busqueda? Y/N");
            String response = in.nextLine();
            if (response.equalsIgnoreCase("y")){
                System.out.println("Ingresa una nueva busqueda porfavor");
                int busqueda_n = in.nextInt();
                buscador_de_calificaciones(busqueda_n);
            }
        }
    }
    static void fr_each(){
        ArrayList<String> brands = new ArrayList<String>();
        brands.add("Adidas");
        brands.add("Nike");
        brands.add("Polo");
        brands.add("Abercrombie");
        for (String brand: brands) {
            System.out.println();
            System.out.println(brands.indexOf(brand)+1+": "+brand);
        }

    }
    static void s (String busqueda) {
        ArrayList<String> comida = new ArrayList<String>();
        ArrayList<Integer> resultados = new ArrayList<Integer>();
        comida.add("Queso");
        comida.add("Tortilla");
        System.out.println(comida.toString());
        for (int i = 0; i < comida.size(); i++) {
            System.out.println(comida.get(i));
            if (comida.get(i).equalsIgnoreCase(busqueda)) {
                resultados.add(i);
            }
        }
    }
    static void buscar (String busqueda) {
        ArrayList<String> comida = new ArrayList<String>();
        ArrayList<Integer>  resultados = new ArrayList<Integer>();
        comida.add("Queso");
        comida.add("Tortilla");
        comida.add("Guacamole");
        comida.add("Queso");
        comida.add("Tortilla");
        comida.add("Guacamole");
        System.out.println(comida.toString());
        for (int i = 0; i < comida.size(); i++) {
            System.out.println(comida.get(i));
            if (comida.get(i).equalsIgnoreCase(busqueda)) {
                resultados.add(i);
            }
        }
        System.out.println("'"+busqueda+"' se encuentraa en los indices: "+resultados.toString());
    }

    static void graphic () {
        Scanner scanner = new Scanner(System.in);
        String symbol;
        int rows, columns;
        System.out.println("Ingresa las filas");
        rows = scanner.nextInt();
        System.out.println("Ingresa las columnas");
        columns = scanner.nextInt();
        System.out.println("Ingresa el signo");
        symbol = scanner.next();
        for (int x = 1; x <= rows; x++) {
            System.out.println();
            for (int y = 1; y <= columns; y++) {
                System.out.print(symbol + " ");
            }
        }
    }
}

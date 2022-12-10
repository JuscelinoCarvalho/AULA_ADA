package com.ada.aulas;

import java.util.ArrayList;
import java.util.List;

public class Numero {
    private Numero numero;

    public Numero addNumero(Numero numero) {
        this.numero = numero;
        return this.numero;
    }


    public static void main(String[] args) {
        List<String> lista = List.of("Marcus","Pedro","João","Maria","Ana");
        System.out.println(Ordena(lista));
        
        
    }

    private static List<String> Ordena(List<String> list){
        List<String> listb = new ArrayList<>();
        String x = "";
        for (String str : list) {   
            if(str.compareTo(x) >= 0){
                listb.add(str);
                x = str;
            }
        }
        return listb;
    }
}

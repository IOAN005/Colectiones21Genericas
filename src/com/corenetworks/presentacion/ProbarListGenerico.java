package com.corenetworks.presentacion;

import com.corenetworks.modelo.Empleado;

import java.util.ArrayList;
import java.util.List;

public class ProbarListGenerico {
    public static void main(String[] args) {
        List<Empleado> empleado =new ArrayList<>();
        empleado.add(new Empleado(8));
        empleado.add(new Empleado(9));
        empleado.add(new Empleado(15));
        Empleado e1=new Empleado(7);
        empleado.add(e1);
        System.out.println("Cuantos empleados tinee la lista -> " + empleado);
        System.out.println("Array lis es " + empleado);
        System.out.println("Existe el empleado e1 en la lista " + empleado.contains(e1));
        System.out.println("empleado de la posicion 3 -> " + empleado.get(3));
        System.out.println("En que posicion esta el e1 " + empleado.indexOf(e1));
        System.out.println("Eliminar a e1 -> " + empleado.remove(e1));
        System.out.println("Lista " + empleado);

    }
}

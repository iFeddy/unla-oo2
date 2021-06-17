package test;

import java.time.LocalDate;

import negocio.LugarABM;
import negocio.PermisoABM;

public class TestParcial {
    public static void main(String[] args) {
        PermisoABM permisoABM = new PermisoABM();
        LugarABM lugarABM = new LugarABM();
        LocalDate fechaTest = LocalDate.now();
        
        System.out.println("1) Traer permiso id=1");
        System.out.println("------------------------------");
        System.out.println(permisoABM.traerPermiso(1));
        
        System.out.println("2) Traer objeto Localidad con todos sus atributos id = 1");
        System.out.println("------------------------------");
        System.out.println(lugarABM.traerLocalidad(1));

        System.out.println("3) ¿El lugar id=1 el día 2021-04-12 tiene el ingreso habilitado para el permiso id=2?");
		System.out.println("------------------------------");
        fechaTest = LocalDate.of(2021, 4, 12);        
		System.out.println(lugarABM.ingresoHabilitado(1, 2, fechaTest));
        
        System.out.println("4) ¿El lugar id=1 el día 2021-04-20 tiene el ingreso habilitado para el permiso id=2?");
		System.out.println("------------------------------");
        fechaTest = LocalDate.of(2021, 4, 20);        
		System.out.println(lugarABM.ingresoHabilitado(1, 2, fechaTest));

        System.out.println("5) ¿El lugar id=1 el día 2021-04-25 tiene el ingreso habilitado para el permiso id=2?");
		System.out.println("------------------------------");
        fechaTest = LocalDate.of(2021, 4, 25);        
		System.out.println(lugarABM.ingresoHabilitado(1, 2, fechaTest));
       
        System.out.println("6) Traer objeto Ubicacion con todos sus atributos id=2");
        System.out.println("------------------------------");
        System.out.println(lugarABM.traerUbicacion(2));
        
        System.out.println("7) ¿El lugar id=2 el día 2021-03-30 tiene el ingreso habilitado para el permiso id=1?");
        System.out.println("------------------------------");
        fechaTest = LocalDate.of(2021, 3, 30);        
		System.out.println(lugarABM.ingresoHabilitado(2, 1, fechaTest));

        System.out.println("8) ¿El lugar id=2 el día 2021-03-31 tiene el ingreso habilitado para el permiso id=1?");
        System.out.println("------------------------------");
        fechaTest = LocalDate.of(2021, 3, 31);        
		System.out.println(lugarABM.ingresoHabilitado(2, 1, fechaTest));

        System.exit(0);
    }
}

package test;

import java.time.LocalTime;

import datos.Vacuna;
import negocio.DosisABM;
import negocio.PersonaABM;
import negocio.VacunaABM;

public class TestParcial {
    public static void main(String[] args) {

        LocalTime tiempoTest = LocalTime.now();
        LocalTime tiempoTest2 = LocalTime.now();

        Long longTest;
        //ABM
        VacunaABM vacunaABM = new VacunaABM();
        PersonaABM personaABM = new PersonaABM();
        DosisABM dosisABM = new DosisABM();
        
        System.out.println("Tiempo: " + tiempoTest);
        System.out.println("1) Traer los datos de la vacuna con código = 800011");
        System.out.println("------------------------------");
        longTest = (long) 800011;
        System.out.println(vacunaABM.traerVacuna(longTest));

        System.out.println("2) Traer los datos de la personas entre 30 y 40 años");
        System.out.println("------------------------------");
        System.out.println(personaABM.traerPersona(30, 40));

        System.out.println("3) Traer dosis que se hayan aplicado de la vacuna con código = 800011");
        System.out.println("------------------------------");
        Vacuna vacuna = vacunaABM.traerVacuna(longTest);
        System.out.println(dosisABM.traerDosis(vacuna));

        System.out.println("4) Traer dosis que se hayan aplicado entre las 11:15:00 y las 11:45:00");
        System.out.println("------------------------------");
        tiempoTest = LocalTime.of(11, 15, 00);
        tiempoTest2 = LocalTime.of(11, 45, 00);
        System.out.println(dosisABM.traerDosis(tiempoTest, tiempoTest2));

        System.out.println("5) Traer dosis que se hayan aplicado entre las 11:15:00 y las 11:45:00 a personas sin comorbilidad");
        System.out.println("------------------------------");       
        tiempoTest = LocalTime.of(11, 15, 00);
        tiempoTest2 = LocalTime.of(11, 45, 00);
        System.out.println(dosisABM.traerDosis(tiempoTest, tiempoTest2, false));
        System.exit(0);
    }
}

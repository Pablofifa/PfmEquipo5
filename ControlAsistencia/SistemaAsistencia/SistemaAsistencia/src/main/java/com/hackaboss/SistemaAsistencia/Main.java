package com.hackaboss.SistemaAsistencia;

import com.hackaboss.SistemaAsistencia.Entity.*;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static java.time.Instant.now;

public class Main {

    public static void main(String[] args) {


        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");


        List<Profesor> profesores = new ArrayList<>();
        Profesor profesor1 = new Profesor();
        profesor1.setNombre("Juan");
        profesor1.setPrimerApellido("Pérez");
        profesor1.setSegundoApellido("López");
        profesor1.setCorreo("juan.perez@gmail.com");
        profesor1.setTelefono("634555444");
        profesor1.setDni("32823216R");
        profesor1.setUsuario("juanp21");
        profesor1.setContrasenia("jpl1986");
        profesor1.setTipoVinculacion("Profesor de informática");

        Profesor profesor2 = new Profesor();
        profesor2.setNombre("María");
        profesor2.setPrimerApellido("Pardo");
        profesor2.setSegundoApellido("Leniz");
        profesor2.setCorreo("maria.pardo@yahoo.es");
        profesor2.setTelefono("666555444");
        profesor2.setUsuario("mapale79");
        profesor2.setContrasenia("Mari_79");
        profesor2.setTipoVinculacion("Profesor de inglés");

        profesores.add(profesor1);
        profesores.add(profesor2);

        List<Estudiante> estudiantes = new ArrayList<>();
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Ana");
        estudiante1.setPrimerApellido("Gómez");
        estudiante1.setSegundoApellido("García");
        estudiante1.setCorreo("ana.gomez@gmail.com");
        estudiante1.setTelefono("876543210");
        estudiante1.setDni("46760288P");
        estudiante1.setUsuario("anitaaa99");
        estudiante1.setContrasenia("anniiina");

        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Andrés");
        estudiante2.setPrimerApellido("Pereiro");
        estudiante2.setSegundoApellido("Solar");
        estudiante2.setCorreo("andres.pereiro@yahoo.es");
        estudiante2.setTelefono("663142342");
        estudiante2.setUsuario("andy99");
        estudiante2.setContrasenia("pereirito");
        estudiante2.setDni("56235230I");

        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);

        List<Materia> materiasInformatica = new ArrayList<>();
        Materia materia1 = new Materia();
        materia1.setCodigo("112B");
        materia1.setNombreMateria("Programación Java");
        materia1.setDescripcion("Introducción a la programación en Java.");

        Materia materia2 = new Materia();
        materia1.setCodigo("223A");
        materia2.setNombreMateria("Programación Spring");
        materia2.setDescripcion("Introducción a la programación en Spring.");

        materiasInformatica.add(materia1);
        materiasInformatica.add(materia2);

        List<Aula> aulas = new ArrayList<>();
        Aula aula1 = new Aula();
        aula1.setNombreAula("Steve Jobs");
        aula1.setUbicacion("Primer piso- Pasillo izquierdo");

        Aula aula2 = new Aula();
        aula2.setNombreAula("Ada Lovelace");
        aula2.setUbicacion("Segundo piso - Pasillo derecho");

        aulas.add(aula1);
        aulas.add(aula2);

        List<HorarioMateria> horarioMaterias = new ArrayList<>();
        HorarioMateria horarioMateria1 = new HorarioMateria();
        horarioMateria1.setHoraEntrada(LocalTime.of(9,30));
        horarioMateria1.setHoraSalida(LocalTime.of(13,30));

        HorarioMateria horarioMateria2 = new HorarioMateria();
        horarioMateria1.setHoraEntrada(LocalTime.of(16,30));
        horarioMateria1.setHoraSalida(LocalTime.of(20,30));

        horarioMaterias.add(horarioMateria1);
        horarioMaterias.add(horarioMateria2);

        List<Asistencia> asistencias = new ArrayList<>();

        Asistencia asistencia1 = new Asistencia();
        asistencia1.setFecha(LocalDateTime.now());

        Asistencia asistencia2 = new Asistencia();
        asistencia2.setFecha(LocalDateTime.now());

        asistencias.add(asistencia1);
        asistencias.add(asistencia2);





    }

}

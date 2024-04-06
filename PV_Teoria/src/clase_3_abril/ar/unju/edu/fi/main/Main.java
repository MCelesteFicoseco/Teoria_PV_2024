package clase_3_abril.ar.unju.edu.fi.main;

import java.util.Scanner;

import clase_3_abril.ar.unju.edu.fi.model.Alumno;
import clase_3_abril.ar.unju.edu.fi.model.Materia;
import clase_3_abril.ar.unju.edu.fi.model.RegistroNota;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno alumno = generarAlumno();
		
		
		registrarNotas(alumno,2);
		
		
	}
	
	public static Alumno generarAlumno() {
		Alumno alumno = new Alumno();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el legajo:");
		Integer legajo = scanner.nextInt();
		System.out.println("Ingrese el apellido:");
		String apellido = scanner.next();
		System.out.println("Ingrese el nombre:");
		String nombre = scanner.next();
		
		System.out.println(legajo);
		System.out.println(apellido);
		System.out.println(nombre);
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		//scanner.close();
		return alumno;
		
	}
	
	public static void registrarNotas(Alumno alumno, int numMaterias) {
		Scanner scanner = new Scanner(System.in);
		//int numMaterias = 1;
		
		while (numMaterias <= 2) {
			System.out.println("Ingrese el codigo de la materia");
			String codigoMateria = scanner.next();
			System.out.println("Ingrese el nombre de la materia");
			String nombreMateria = scanner.next();
			
			Materia materia = new Materia(codigoMateria, nombreMateria);
			
			System.out.println("Ingrese el codigo del registro de nota");
			String codigoNota = scanner.next();
			System.out.println("Ingrese la nota final");
			Float nota = scanner.nextFloat();
			
			RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, nota);
			
			System.out.println(registroNota.toString());
			numMaterias++;
		}
		
		scanner.close();
	}
}

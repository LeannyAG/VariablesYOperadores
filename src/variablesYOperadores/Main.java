package variablesYOperadores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
                    //DECLARACION Y USO DE VARIABLES 
		//variables 
		
       
       
//uso de variables 
        System.out.print("Ingrese su nombre: ");
         String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese su altura: ");
        double altura = scanner.nextDouble();

        System.out.print("es usuario activo (true/false): ");
        boolean esEstudiante = scanner.nextBoolean();
        
//mostrar lo ingresado 
        System.out.println("\nDatos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Es estudiante: " + esEstudiante);

     

        
        //OPERACIONES MATEMATICAS 
        
        System.out.println("\n-----OPRECIONES MATEMATICAS-------");
        
//DOUBLE 
        System.out.println("DOUBLE");
        double num1;
        double num2;

System.out.print("ingrese el primer numero: ");
       num1 = scanner.nextDouble();

System.out.print("ingrese el segundo numero: ");
    num2 = scanner.nextDouble();

System.out.println("suma: "+ (num1 + num2));
System.out.println("resta: "+ (num1 - num2));
System.out.println("multiplicación: "+ (num1 * num2));
System.out.println("division: "+ (num1 / num2));

//FLOAT

    System.out.println("\n--FLOAT---");
        float a;
        float b;

System.out.print("ingrese el primer numero: ");
a = scanner.nextFloat();

System.out.print("ingrese el segundo numero: ");
b = scanner.nextFloat();

System.out.println("suma: "+ (a + b));
System.out.println("resta: "+ (a - b));
System.out.println("multiplicación: "+ (a * b));
System.out.println("division: "+ (a / b));

//SHORT
        System.out.println("\n----SHORT---");
        
        short c;
        short d;

System.out.print("ingrese el primer numero: ");
c = scanner.nextShort();

System.out.print("ingrese el segundo numero: ");
d = scanner.nextShort();

System.out.println("suma: "+ (c + d));
System.out.println("resta: "+ (c - d));
System.out.println("multiplicación: "+ (c * d));
System.out.println("division: "+ (c / d));

//BYTE
      System.out.println("\n---BYTE---");
      
      byte e;
      byte f;

System.out.print("ingrese el primer numero: ");
e = scanner.nextByte();

System.out.print("ingrese el segundo numero: ");
f = scanner.nextByte();

System.out.println("suma: "+ (e + f));
System.out.println("resta: "+ (e - f));
System.out.println("multiplicación: "+ (e * f));
System.out.println("division: "+ (e / f));

//OPERACIONES LOGICAS 
System.out.println("\n--- OPERACIONES LOGICAS ---");

int no1;
int no2;

System.out.print("Ingrese el primer número: ");
no1 = scanner.nextInt();

System.out.print("Ingrese el segundo número: ");
no2 = scanner.nextInt();

// Comparaciones explicativas
System.out.println("¿El número " + no1 + " es mayor que " + no2 + "? Resultado: " + (no1 > no2));

System.out.println("¿El número " + no1 + " es menor que " + no2 + "? Resultado: " + (no1 < no2));

System.out.println("¿Ambos números son iguales? Resultado: " + (no1 == no2));

// Operadores lógicos
System.out.println("¿Ambos números son positivos? Resultado: " + (no1 > 0 && no2 > 0));

System.out.println("¿Al menos uno de los números es negativo? Resultado: " + (no1 < 0 || no2 < 0));

    
    
    System.out.println("----CLASIFICACION DE EDAD----");
    
    System.out.print("ingrese su edad");
    
    int ed = scanner.nextInt();
    
   if(ed < 12) {
	   System.out.println("eres niño ");
   } else if (ed <= 17){
	   System.out.println("eres adolescente");
   } else if (ed <= 59){
	   System.out.println("usted es adulto ");
   } else {
	   System.out.println("usted es adulto mayor");
	   
   }
    
   //DIA DE LA SEMANA
   
   System.out.println("\n---DIA DE LA SEMANA---");
   
   System.out.print("ingrese un numero del 1 al 7: ");
   
     int dia = scanner.nextInt();
     
    switch (dia) {
    case 1: System.out.println("lunes");break;
    case 2: System.out.println("martes");break;
    case 3: System.out.println("miercoles");break;
    case 4: System.out.println("jueves");break;
    case 5: System.out.println("viernes");break;
    case 6: System.out.println("sabado");break;
    case 7: System.out.println("domingo");break;
    default: System.out.println("numero invalido ");
    }
    
    //VERIFICACION DE ACCESO
    
    
    System.out.println("\n--LLAVE DE ACCESO----");
   
    scanner.nextLine();                 // limpiar buffer
    System.out.print("\nIngrese usuario: ");
    String user = scanner.nextLine();
    System.out.print("Ingrese contraseña: ");
    String contra = scanner.nextLine();
    
    String usuarioCorrecto = "admin";
    String contraseñaCorrecta = "4567";
    
    if(user.equals(usuarioCorrecto)) {
    if(contra.equals(contraseñaCorrecta)) {
     System.out.print("ingreso exitoso");
    }else {
        System.out.println("CONSTRASEÑA INCORRECTA");
    }		
    }else {
    	System.out.println("usuario no registrado");
    }
        scanner.close();
	}


}

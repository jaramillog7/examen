import java.util.Scanner;

public class examen {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOne, numberTwo;
        System.out.println("Ingrese el primer numero: ");
        numberOne=sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numberTwo=sc.nextInt();



        if (numberOne%numberTwo==0) {
        System.out.println(numberTwo + " Es multipo del numero " + numberOne);
        }
        else if (numberTwo%numberOne==0) {
        System.out.println(numberOne + " Es multiplo del numero " + numberTwo);
        }
        else {
        System.out.println("No hay una relacion de multiplo");
        }
    }
}
       
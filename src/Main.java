import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese ejercicio que desea ejecutar del 1 al 7: ");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                Ejercicio1 ejercicio1 = new Ejercicio1();
                ejercicio1.ejercicio1();
                break;
            case 2:
                ejercicio2 ejercicio2 = new ejercicio2();
                ejercicio2.ejercicio2();
                break;
            case 3:
                Ejercicio3 ejercicio3 = new Ejercicio3();
                ejercicio3.ejercicio3();
                break;
            case 4:
                Ejercicio4 ejercicio4 = new Ejercicio4();
                ejercicio4.ejercicio4();
                break;
            case 5:
                Ejercicio5 ejercicio5 = new Ejercicio5();
                ejercicio5.ejercicio5();
                break;
            case 6:
                Ejercicio6 ejercicio6 = new Ejercicio6();
                ejercicio6.ejercicio6();
                break;
            case 7:
                Ejercicio7 ejercicio7 = new Ejercicio7();
                ejercicio7.ejercicio7();
                break;
            case 8:
                Ejercicio8 ejercicio8 = new Ejercicio8();
                ejercicio8.ejercicio8();
                break;
            case 9:
                Ejercicio9 ejercicio9 = new Ejercicio9();
                ejercicio9.ejercicio9();
                break;
        }
    }
}
    
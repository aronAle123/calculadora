
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado = 0;

        do {
            System.out.println("===== CALCULADORA BÁSICA =====");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = sc.nextDouble();

                switch (opcion) {
                    case 1 -> resultado = num1 + num2;
                    case 2 -> resultado = num1 - num2;
                    case 3 -> resultado = num1 * num2;
                    case 4 -> {
                        if (num2 != 0) {
                            resultado = num1 / num2;
                        } else {
                            System.out.println("❌ Error: No se puede dividir entre cero.");
                            continue;
                        }
                    }
                }

                System.out.println("✅ Resultado: " + resultado + "\n");
            } else if (opcion == 5) {
                System.out.println("👋 Saliendo de la calculadora...");
            } else {
                System.out.println("⚠️ Opción no válida. Intente nuevamente.\n");
            }
        } while (opcion != 5);

        sc.close();
    }
}

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            try {
                System.out.print("Ingrese el primer número: ");
                int numero1 = Integer.parseInt(scanner.nextLine());

                System.out.print("Ingrese el segundo número: ");
                int numero2 = Integer.parseInt(scanner.nextLine());

                System.out.print("Ingrese la operación (+, -, *, /) o 'q' para salir: ");
                String operacion = scanner.nextLine();

                if (operacion.equals("q")) {
                    salir = true;
                } else {
                    int resultado = 0;

                    switch (operacion) {
                        case "+":
                            resultado = numero1 + numero2;
                            break;
                        case "-":
                            resultado = numero1 - numero2;
                            break;
                        case "*":
                            resultado = numero1 * numero2;
                            break;
                        case "/":
                            resultado = numero1 / numero2;
                            break;
                        default:
                            throw new IllegalArgumentException("Operación inválida");
                    }

                    System.out.println("El resultado es: " + resultado);
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese números válidos");
            } catch (ArithmeticException e) {
                System.out.println("Error: No se puede dividir entre cero");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
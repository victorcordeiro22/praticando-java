import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        exercicio1(scanner, false);
        exercicio2(scanner, false);
        exercicio3(scanner, false);
        exercicio4(scanner, false);
        exercicio5(scanner, true);

        scanner.close();
    }

    public static void exercicio1(Scanner scanner, Boolean run) {        
        if (run == true) {
            System.out.print("Quantidade de horas trabalhadas: ");
            Double worked_hours = scanner.nextDouble();

            System.out.print("Valor da hora de trabalho: ");
            Double hour_price = scanner.nextDouble();

            System.out.print("\n\nCalculando...\n\n");

            Double base_salary = worked_hours * hour_price;
            System.out.print("BASE: " + base_salary);

            Double bonus = base_salary * 0.05;
            System.out.print("GRATIFICAÇÃO: " + bonus);

            Double taxes = base_salary * 0.15;
            System.out.print("IMPOSTOS: " + taxes);

            Double final_salary = base_salary + bonus - taxes;
            System.out.print("FINAL: " + final_salary);
        }
    }

    public static void exercicio2(Scanner scanner, Boolean run) {
        if (run == true) {
            System.out.print("Qual o seu peso? (kg): ");
            Double peso = scanner.nextDouble();

            System.out.print("Qual a sua altura? (cm): ");
            Double altura = scanner.nextDouble();

            // Calculando o IMC 
            Double imc = peso / (altura * altura);

            // Classificando o IMC
            String classificacao;
            if (imc < 18.5) {
                classificacao = "Abaixo do peso";
            } else if (imc < 25) {
                classificacao = "Peso normal";
            } else if (imc < 30) {
                classificacao = "Sobrepeso";
            } else if (imc < 35) {
                classificacao = "Obesidade grau I";
            } else if (imc < 40) {
                classificacao = "Obesidade grau II (severa)";
            } else {
                classificacao = "Obesidade grau III (mórbida)";
            }

            // Exibindo o resultado
            System.out.print("O IMC é: " + imc);
            System.out.print("Classificação: " + classificacao);

        }
    }

    public static void exercicio3(Scanner scanner, Boolean run) {
        if (run == true) {
            System.out.print("Digite um número inteiro positivo: ");
            Integer n = scanner.nextInt();

            Double s = 0.0;

            for (int i = 1; i <= n; i++) {
                s += 1.0/i;
            }

            System.out.print("Resultado: " + s);
        }
    }

    public static void exercicio4(Scanner scanner, Boolean run) {
        if (run == true) {
            System.out.print("Digite um número inteiro positivo: ");
            Integer xf = scanner.nextInt();

            for (int i = 0; i < xf; i++) {
                System.out.print(i * 3 + " ");
            }
        }
    }

    public static void exercicio5(Scanner scanner, Boolean run) {
        if (run == true) {
            System.out.print("Qual sua idade? ");
            Integer age = scanner.nextInt();

            System.out.print("Qual seu tempo de colaboraçao (anos)? ");
            Integer time = scanner.nextInt();

            if (age >= 60 && time >= 15) {
                System.out.print("Aposentadoria concedida!");
            } else {
                System.out.print("Aposentadoria negada!");
            }
        }
    }
}
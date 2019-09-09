package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);
        int numero , numero1, Escolha, Resultado;

        Escrever("Escolha a operação: ");
        Escrever(" 1 para Somar! ");
        Escrever(" 2 para Diminuir! ");
        Escrever(" 3 para Dividir! ");

        Escolha = ler.nextInt();

        Calculadora Calcular = new Calculadora();

        if(Escolha == 1)
        {
            Escrever("Entre com um numero: ");
            numero = ler.nextInt();

            Escrever("Entre com outro numero: ");
            numero1 = ler.nextInt();

            Resultado = Calcular.Somar(numero, numero1);
            Escrever(" O Resultado é: " + Resultado);
        }

        if(Escolha == 2)
        {
            Escrever("Entre com um numero: ");
            numero = ler.nextInt();

            Escrever("Entre com outro numero: ");
            numero1 = ler.nextInt();

            Resultado = Calcular.Diminiur(numero, numero1);
            Escrever(" O Resultado é: " + Resultado);
        }

        if(Escolha == 3)
        {
            OperacaoDividir(ler, Calcular);
        }
    }

    public static void Escrever(String string) 
    {
        System.out.println(string);
        
    }

    public static void OperacaoDividir(Scanner ler, Calculadora Calcular)
    {
        Escrever("Entre com um numero: ");
        int numero = ler.nextInt();

        Escrever("Entre com outro numero: ");
        int numero1 = ler.nextInt();

        try {
            int Resultado = Calcular.Dividir(numero, numero1);
            Escrever(" O Resultado é: " + Resultado);
        } catch (NaoPodeDividirPorZero erro) {
            Escrever(" Não é possivel DIVIDIR por ZERO! Entre com outro numero!");
            OperacaoDividir(ler, Calcular);
        }
    }
}
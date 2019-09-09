package app;

public class Calculadora 
{
    public int Somar(int A, int B)
    {
        int somarAB;
        somarAB = A + B;
        return somarAB;
    }

    public int Diminiur(int A, int B)
    {
        int diminuirAB;
        diminuirAB = A - B;
        return diminuirAB;
    }

    public int Dividir(int A, int B) throws NaoPodeDividirPorZero
    {

        if(B == 0)
        {
            throw new NaoPodeDividirPorZero();
            
        }
        int DividirAB;
        DividirAB = A / B;
        return DividirAB;
    }
}

/*Escreva um programa que, com base em uma temperatura em graus celsius,
a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F),
seguindo as fórmulas:
F = C * 1.8 + 32;
K = C + 273.15;
Re = C * 0.8;
Ra = C * 1.8 + 32 + 459.67
*/

public class conversao {

    private double temperatura;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double kelvin(double temp){

        double kelvin = temp + 273.15;
        return kelvin;
    }

    public double fahrenheit(double temp){

        double fahr = temp * 1.8 + 32;
        return fahr;
    }

    public double reaumur(double temp){

        double ream = temp * 0.8;
        return ream;
    }

    public double rankine(double temp){

        double rank = temp * 1.8 + 32 + 459.67;
        return rank;
    }
}

package vetores.service;

public class VetorService {

    public int maiorNumeroPar(int[] numeros) {

        int maiorPar = Integer.MIN_VALUE;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0 && numeros[i] > maiorPar) {

                maiorPar = numeros[i];
            }
        }

        return maiorPar;
    }

    public int menorNumeroImpar(int[] numeros) {

        int menorImpar = Integer.MAX_VALUE;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 != 0) {

                if (numeros[i] < menorImpar) {

                    menorImpar = numeros[i];
                }
            }
        }

        return menorImpar;
    }


    public int somaTotal(int[] numeros) {

        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {

            soma += numeros[i];
        }

        return soma;
    }

    public double mediaTotal(int soma, int quantidade) {

        return (double) soma / quantidade;
    }
}

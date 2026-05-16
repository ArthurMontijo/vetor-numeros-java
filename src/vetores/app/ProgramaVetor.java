package vetores.app;

import javax.swing.JOptionPane;

import vetores.service.VetorService;

public class ProgramaVetor {

    public static void main(String[] args) {

        int[] numeros = new int[5];

        // Ler os números
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Digite o " + (i + 1) + "º número:"
                    )
            );
        }

        VetorService service = new VetorService();

        int maiorPar = service.maiorNumeroPar(numeros);
        int menorImpar = service.menorNumeroImpar(numeros);

        int soma = service.somaTotal(numeros);

        double media = service.mediaTotal(soma, numeros.length);

        String mensagem = "Resultado:\n\n";

        if (maiorPar != -1) {
            mensagem += "Maior número par: " + maiorPar + "\n";
        } else {
            mensagem += "Não existe número par.\n";
        }

        if (menorImpar != -1) {
            mensagem += "Menor número ímpar: " + menorImpar + "\n";
        } else {
            mensagem += "Não existe número ímpar.\n";
        }

        mensagem += "Soma total: " + soma + "\n";
        mensagem += "Média: " + media;

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
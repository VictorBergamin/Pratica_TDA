import javax.swing.JOptionPane;

public class ValidacaoEmprestimos {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Digite o valor do seu salário atual: ");
        double salario = Double.parseDouble(input);

        String input1 = JOptionPane.showInputDialog("Quantas pendências possui em seu banco contratado? ");
        double pendencias = Double.parseDouble(input1);

        if (salario > 2500 && pendencias < 2){
            JOptionPane.showMessageDialog(null, "Empréstimo aprovado com sucesso!");

            String input2 = JOptionPane.showInputDialog("Digite o valor do empréstimo: ");
            double valorEmprestimo = Double.parseDouble(input2);

            String input3 = JOptionPane.showInputDialog("Agora, digite a quantidade de parcelas: ");
            double numeroParcelas = Double.parseDouble(input3);

            double juros = valorEmprestimo * 0.9 * numeroParcelas / 100;
            double valorTotal = valorEmprestimo + juros;
            double valorParcelas = valorTotal / numeroParcelas;

            JOptionPane.showMessageDialog(null, "Valor total (com juros): " + valorTotal);
            JOptionPane.showMessageDialog(null, "\nValor das parcelas (com juros) " +
                    valorParcelas);
        }else{
            JOptionPane.showMessageDialog(null, "Empréstimo reprovado pelo banco!");
        }
    }
}
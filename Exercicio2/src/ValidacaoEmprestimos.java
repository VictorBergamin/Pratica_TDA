import javax.swing.JOptionPane;

public class ValidacaoEmprestimos {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Digite o valor do seu salário atual: ");
        double salario = Double.parseDouble(input);

        String input1 = JOptionPane.showInputDialog("Quantas pendências possui em seu banco contratado? ");
        double pendencias = Double.parseDouble(input1);

        if (salario > 2500 && pendencias < 2){
            JOptionPane.showMessageDialog(null, "Empréstimo aprovado com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Empréstimo reprovado pelo banco!");
        }
    }
}
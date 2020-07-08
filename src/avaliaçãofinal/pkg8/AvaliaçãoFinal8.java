package avaliaçãofinal.pkg8;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author troll
 */
public class AvaliaçãoFinal8 {
    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("0.00");
        int codigo;
        double preco;
        
        preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto:"));
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Código:\n1-Á vista em dinheiro ou cheque.\n2-Á vista no cartão de crédito.\n3-Em duas vezes.\n4-Em quatro ou mais vezes.\nForma de pagamento:"));
        
        if (codigo == 1) {
            preco -= (preco/100)*15;
        }else if (codigo == 2) {
            preco -= (preco/100)*10;
        }else if (codigo == 3) {
        }else if (codigo == 4) {
            preco += (preco/100)*10;
        }else {
            JOptionPane.showMessageDialog(null, "Esse codigo é invalido.");
        }
        
        JOptionPane.showMessageDialog(null, "O preço final do produto é: R$"+f.format(preco));
    }
}

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Principal {

    public static void main(String[] args) {
        double peso, altura, imc;

        peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso (kg):"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura (metro e cm):"));
        imc = peso/(altura*altura);

        DecimalFormat df = new DecimalFormat("##.##");
        if (imc<=18.5){
            JOptionPane.showMessageDialog(null, "Índice de massa corporal: "+df.format(imc)+"\nCuidado, você está classificado(a) como abaixo do peso!");
        }
        else{
            if (imc<=24.9){
                JOptionPane.showMessageDialog(null, "Índice de massa corporal: "+df.format(imc)+"\nParabéns, você está classificado(a) como peso ideal!");
            }
            else{
                if  (imc<29.9){
                    JOptionPane.showMessageDialog(null, "Índice de massa corporal: "+df.format(imc)+"\nAtenção, você está classificado(a) como sobrepeso!");
                }
                else {
                    if (imc<34.9){
                        JOptionPane.showMessageDialog(null, "Índice de massa corporal: "+df.format(imc)+"\nCuidado, você está classificado(a) como obesidade grau I!");
                    }
                    else{
                        if (imc<39.9){
                            JOptionPane.showMessageDialog(null, "Índice de massa corporal: "+df.format(imc)+"\nCuidado, você está classificado(a) como obesidade grau II (severa)!");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Índice de massa corporal: "+df.format(imc)+"\nCuidado, você está classificado(a) como obesidade grau III (mórbida)!");
                        }                        
                    }
                }                              
            }
        }                
    }    
}
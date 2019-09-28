/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraicm;

import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class CalculadoraIcm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      float peso, altura;
      float imc;
      String classifica;
 
      peso = Float.parseFloat(JOptionPane.showInputDialog("Peso da Pessoa (kg):"));
      altura = Float.parseFloat(JOptionPane.showInputDialog("Altura da Pessoa (m):") );
 
      imc = (float) (peso/Math.pow(altura, 2));
      
      if (imc <16)
          classifica = "Magreza Gave";
        else
      if (imc ==16 ||  imc < 17)
          classifica = "Magreza Moderada";
        else
 
      if (imc == 17 || imc < 18.5)
         classifica = "Magreza leve";
        else
      if (imc ==18.5 || imc <= 25)
           classifica = "Saudável";
        else
      if (imc == 25 || imc <= 30)
           classifica = "Sobrepeso";
        else
      if (imc == 30 ||imc <= 35)
            classifica = "Obesidade Grau I";
         else
      if (imc == 35 ||imc <= 40)
            classifica = "Obesidade Grau II (severa)";
         else
            classifica = "Obesidade Garu III (mórbida)";
 
      JOptionPane.showMessageDialog(null, "IMC da Pessoa = "+imc+" - "+classifica);
 
   }
}

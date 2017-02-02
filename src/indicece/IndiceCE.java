/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indicece;

/**
 *
 * @author Jairo
 */

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.*;
public class IndiceCE { 

    protected  IndiceCE(){
       
      JFrame marco=new JFrame("IndiceCintura/estatura");
      JLabel titulo= new JLabel("ICE y Riesgo de infarto");
      JLabel tCintura= new JLabel("Cintura(cms)");
      JLabel tEstatura=new JLabel("estatura(cms)");
      JLabel tResultado=new JLabel("Resultado");
      JTextField cintura= new JTextField(4);
      JTextField estatura= new JTextField(4);
      JButton calcular=new JButton("Calcular");
      
      /*
      Metodo setBounds(horizontal,vertical,largo,ancho)
      */
      titulo.setBounds(100, -150, 200, 400);
      tCintura.setBounds(40, -20, 210, 210);
      tEstatura.setBounds(40, 5, 210, 210);
      tResultado.setBounds(40, 80, 210, 210);
      cintura.setBounds(135, 100, 50, 20);
      estatura.setBounds(135, 75, 50, 20);
      calcular.setBounds(100, 130, 100, 25);
      
      marco.setLayout(null);
      marco.setBounds(20,20,320,270);
      marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      marco.add(titulo);
      marco.add(tCintura);
      marco.add(tEstatura);
      marco.add(tResultado);
      marco.add(cintura);
      marco.add(estatura);
      marco.add(calcular);
     
      marco.setVisible(true);
    }
    
   
    public static void main(String[] args) {
       IndiceCE ice= new IndiceCE(); 
              
    }

}

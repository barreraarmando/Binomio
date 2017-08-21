package binomio;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JLabel;



public class Bin extends JFrame {

    //declaracion de variables de java swing
    private JButton calcular;
    int resultado=0;
    private JTextField num1, num2; 
    
    public Bin(){
        //Se muestran los componentes y se configura la venta
        Calcular cdep= new Calcular ();
        configuraVentana();
        iniciarComponentes();
    }

    
    private void configuraVentana() {
        
       setTitle("CALCULADORA" );
       setSize(500, 300);
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        //se colocan los componentes en la ventana
        calcular =new JButton ("Calcular");
        num1 = new JTextField ("Teclee el primer número");
        num2 = new JTextField ("Teclee el segundo número");
        //num.setSize(100, 50);
        
        calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               accionCalcular();   
               }
        });
        
        
        
        setLayout (new FlowLayout ());
        add(calcular);
        add(num1);
        add(num2);
        
        setLocation (300,100);
        setVisible(true);
        
    }
private void accionCalcular(){
    //se activa al oprimir el boton de calcular
    Calcular cdep = new Calcular ();
    String numero1=num1.getText();
    cdep.setNum1(Integer.parseInt(numero1));
    
    String numero2=num2.getText();
    cdep.setNum2(Integer.parseInt(numero2));
    String Res=cdep.binomio();
    JOptionPane.showMessageDialog(this, "El resultado es: " + Res);
    
}

}


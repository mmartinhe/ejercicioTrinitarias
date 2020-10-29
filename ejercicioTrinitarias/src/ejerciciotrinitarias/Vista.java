
package ejerciciotrinitarias;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author mmartinh
 */
public class Vista extends JFrame{
    private JLabel lblTitulo;
    private Panel panelTitulo, panelPrincipal, panelAux, panelAux2, panelAzul, panelVerde, panelRojo, panelNaranja, panelAmarillo;
    private Controlador controlador;
    public Vista(Controlador controlador){
        this.controlador = controlador;
        configuracionVentana();
        crearInterfaz();
        anadirEscuchadores();
    }
    private void configuracionVentana() {
        this.setSize(500, 500);
        this.setVisible(true);
        this.setLayout(new GridLayout(3, 0));
    }
    

    private void crearInterfaz() {
       crearTitulo();
       crearPanelPrincipal();
       crearPanelesColores();
    }

    private void crearTitulo() {
       lblTitulo = new JLabel("TRINITARIAS");
       lblTitulo.setFont(new Font(Font.MONOSPACED, Font.BOLD, 60));
       panelTitulo = new Panel();
       panelTitulo.add(lblTitulo);
       this.add(panelTitulo);
    }

    private void crearPanelPrincipal() {
        panelPrincipal = new Panel();
        panelAux = new Panel();
        panelAux2 = new Panel();
        panelPrincipal.setBackground(Color.WHITE);
        panelPrincipal.setName("panelPrincipal"); //nombre para luego indentificar en  le controlador
        panelAux.setLayout(new GridLayout(0, 3));
        panelAux.add(panelAux2);
        panelAux.add(panelPrincipal);
        this.add(panelAux);
    }

    private void crearPanelesColores() {
        Panel panelInferior = new Panel();
        panelInferior.setLayout(new GridLayout(0, 5));
        
        panelAzul = new Panel();
        panelAzul.setBackground(Color.BLUE);
        panelAzul.setName("panelAzul");
        
        panelVerde = new Panel();
        panelVerde.setBackground(Color.GREEN);
        panelVerde.setName("panelVerde");
        
        panelRojo = new Panel(); 
        panelRojo.setBackground(Color.RED);
        panelRojo.setName("panelRojo");
        
        panelNaranja = new Panel();
        panelNaranja.setBackground(Color.ORANGE);
        panelNaranja.setName("panelNaranaja");
        
        panelAmarillo = new Panel();
        panelAmarillo.setBackground(Color.YELLOW);
        panelAmarillo.setName("panelNaranja");
        
    }

    private void anadirEscuchadores() {
        panelPrincipal.addMouseListener(controlador);
        panelAzul.addMouseListener(controlador);
        panelVerde.addMouseListener(controlador);
        panelRojo.addMouseListener(controlador);
        panelNaranja.addMouseListener(controlador);
        panelAmarillo.addMouseListener(controlador);
    }
    
}

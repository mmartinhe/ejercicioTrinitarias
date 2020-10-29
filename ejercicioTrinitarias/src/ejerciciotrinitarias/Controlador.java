
package ejerciciotrinitarias;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
 * @author mmartinh
 */
public class Controlador implements MouseListener{
    private Vista vista;
    private Color color;
    public Controlador(){
       vista = new Vista(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Panel panel = (Panel)e.getSource();
        if(panel.getName().equals("panelAzul")
                ||panel.getName().equals("panelVerde")
                ||panel.getName().equals("panelRojo")
                ||panel.getName().equals("panelNaranja")
                ||panel.getName().equals("panelAmarillo")){ 
                
                color = panel.getBackground();
                vista.setColorTitulo(color);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        /*
        Aquí es donde se haría lo de camibar de color al panel principal pero no sé cómo hacerlo
        */
    }

    @Override
    public void mouseExited(MouseEvent e) {
        /*
        Aquí se haría lo de volver a poner el panel Principal al color blanco por defecto al sacar el ratón del panel
        */
        
    }
}

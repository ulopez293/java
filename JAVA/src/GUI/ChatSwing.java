package GUI;
import com.sun.java.swing.plaf.motif.MotifLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class ChatSwing extends JFrame{
    private JTextField tfNick;
    private JTextField tfMensaje;
    private JButton bLogin;
    private JButton bLogout;
    private JButton bEnviar;
    private JList lstLog;
    private Border border;

    public ChatSwing() {
        super("Chat");
        //pedimos el "panel de contencion" al JFrame
        Container content = getContentPane();
        //seteamos el layout
        content.setLayout(new BorderLayout());
        //este espera el tipo de borde que utilizamos en todos los paneles
        border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        //panel norte
        JPanel pNorth = _crearPNorte();
        content.add(pNorth, BorderLayout.NORTH);
        //Panel Central
        JPanel pCenter = _crearPCenter();
        content.add(pCenter, BorderLayout.CENTER);
        //Panel Sur
        JPanel pSouth = _crearPSur();
        content.add(pSouth, BorderLayout.SOUTH);
        
        setSize(400,300);
        setVisible(true);
        addWindowListener(new EscuchaVentana());
    }
    
    private JPanel _crearPNorte() {
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        //instancio un titled border con el titulo y el objeto border
        TitledBorder titleBoder = BorderFactory.createTitledBorder(border,"Nick");
        //asigno el titled border al panel
        p.setBorder(titleBoder);
        
        bLogin = new JButton("Login");
        p.add(bLogin);
        bLogout = new JButton("Logout");
        p.add(bLogout);
        return p;
    }

    private JPanel _crearPCenter() {
        JPanel p = new JPanel(new BorderLayout());        
        TitledBorder titleBoder = BorderFactory.createTitledBorder(border,"Conversación");
        p.setBorder(titleBoder);
        //centro
        lstLog = new JList();
        JScrollPane scroll = new JScrollPane(lstLog);
        p.add(scroll,BorderLayout.CENTER);
        return p;
    }

    private JPanel _crearPSur() {
        JPanel p = new JPanel(new BorderLayout());
        TitledBorder titleBoder = BorderFactory.createTitledBorder(border,"Conversación");
        p.setBorder(titleBoder);
        //centro
        tfMensaje = new JTextField();
        p.add(tfMensaje,BorderLayout.CENTER);
        //este
        bEnviar = new JButton("Enviar");
        p.add(bEnviar,BorderLayout.EAST);
        return p;
    }
    
    class EscuchaVentana implements WindowListener {
        @Override
        public void windowOpened(WindowEvent e) {}
        @Override
        public void windowClosing(WindowEvent e) {
            setVisible(false);
            dispose();
            System.exit(0);
        }
        @Override
        public void windowClosed(WindowEvent e) {}
        @Override
        public void windowIconified(WindowEvent e) {}
        @Override
        public void windowDeiconified(WindowEvent e) {}
        @Override
        public void windowActivated(WindowEvent e) {}
        @Override
        public void windowDeactivated(WindowEvent e) {}
    }
    
    public static void main(String args[]) throws Exception {
        UIManager.setLookAndFeel(new MetalLookAndFeel());
        ChatSwing c = new ChatSwing();
    }
    
}

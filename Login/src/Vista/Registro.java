package Vista;

import Controlador.VistaControlador;
import Controlador.RegistroControlador;
import Modelo.LoginModelo;
import Modelo.RegistroModelo;
import java.awt.*;
import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;






public class Registro extends JFrame {

    public final JLabel RegUsE;
    public final JLabel RegPassE;
    public final JLabel RegPass2E;
    public final JLabel RegNombreE;
    public final JTextField RegUs;
    public final JPasswordField RegPass;
    public final JPasswordField RegPass2;
    public final JTextField Nombre;
    public final JPanel Panel;
    public final JLabel ImagenReg;
    public final JSeparator Linea1;
    public final JSeparator Linea2;
    public final JSeparator Linea3;
    public final JSeparator Linea4;
    public final JButton Guardar;
    public final JButton Limpiar;
    public final JButton Regresar;

    public Registro() {
        Panel = new JPanel();
        RegUsE = new JLabel("USUARIO:");
        RegPassE = new JLabel("INGRESE CONTRASEÑA:");
        RegPass2E = new JLabel("REPITA CONTRASEÑA:");
        RegNombreE = new JLabel("NOMBRE:");
        RegUs = new JTextField();
        RegPass = new JPasswordField();
        RegPass2 = new JPasswordField();
        Nombre = new JTextField();
        ImagenReg = new JLabel();
        Linea1 = new JSeparator();
        Linea2 = new JSeparator();
        Linea3 = new JSeparator();
        Linea4 = new JSeparator();
        Guardar = new JButton();
        Limpiar = new JButton();
        Regresar = new JButton();

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new AbsoluteLayout());

        Panel.setBackground(new Color(255, 255, 255));
        Panel.setBorder(BorderFactory.createLineBorder(new Color(153, 153, 153)));
        Panel.setForeground(new Color(255, 255, 255));
        Panel.setLayout(new AbsoluteLayout());

        ImagenReg.setIcon(new ImageIcon("src/image/Registro.png"));
        Panel.add(ImagenReg, new AbsoluteConstraints(80, 30, -1, -1));

        Regresar.setIcon(new ImageIcon("src/image/Back.png"));
        Regresar.setBorder(null);
        Regresar.setBorderPainted(false);
        Regresar.setContentAreaFilled(false);
        Regresar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Regresar.setRolloverIcon(new ImageIcon("src/image/Back.png"));
        Regresar.setRolloverSelectedIcon(new ImageIcon("src/image/Back.png"));
        Regresar.setSelectedIcon(new ImageIcon("src/image/Back.png"));
        Panel.add(Regresar, new AbsoluteConstraints(10, 10, -1, -1));

        RegNombreE.setBackground(new Color(238, 112, 82));
        RegNombreE.setFont(new Font("Century Gothic", 1, 14));
        RegNombreE.setForeground(new Color(238, 112, 82));
        Panel.add(RegNombreE, new AbsoluteConstraints(40, 140, -1, -1));

        Nombre.setBackground(new Color(255, 255, 255));
        Nombre.setFont(new Font("Dialog", 0, 14));
        Nombre.setForeground(new Color(153, 153, 153));
        Nombre.setBorder(null);
        Panel.add(Nombre, new AbsoluteConstraints(40, 160, 190, 30));
        Panel.add(Linea1, new AbsoluteConstraints(40, 190, 200, 10));

        RegUsE.setBackground(new Color(238, 112, 82));
        RegUsE.setFont(new Font("Century Gothic", 1, 14));
        RegUsE.setForeground(new Color(238, 112, 82));
        Panel.add(RegUsE, new AbsoluteConstraints(40, 210, -1, -1));

        RegUs.setBackground(new Color(255, 255, 255));
        RegUs.setFont(new Font("Dialog", 0, 14));
        RegUs.setForeground(new Color(153, 153, 153));
        RegUs.setBorder(null);
        Panel.add(RegUs, new AbsoluteConstraints(40, 230, 190, 30));
        Panel.add(Linea3, new AbsoluteConstraints(40, 260, 200, 10));

        RegPassE.setBackground(new Color(238, 112, 82));
        RegPassE.setFont(new Font("Century Gothic", 1, 14));
        RegPassE.setForeground(new Color(238, 112, 82));
        Panel.add(RegPassE, new AbsoluteConstraints(40, 280, -1, -1));
        Panel.add(Linea4, new AbsoluteConstraints(40, 330, 200, 10));

        RegPass.setBackground(new Color(255, 255, 255));
        RegPass.setBorder(null);
        Panel.add(RegPass, new AbsoluteConstraints(40, 300, 190, 30));

        RegPass2E.setBackground(new Color(238, 112, 82));
        RegPass2E.setFont(new Font("Century Gothic", 1, 14));
        RegPass2E.setForeground(new Color(238, 112, 82));
        Panel.add(RegPass2E, new AbsoluteConstraints(40, 360, -1, -1));
        Panel.add(Linea2, new AbsoluteConstraints(40, 410, 200, 10));

        RegPass2.setBackground(new Color(255, 255, 255));
        RegPass2.setBorder(null);
        Panel.add(RegPass2, new AbsoluteConstraints(40, 380, 190, 30));

        Limpiar.setIcon(new ImageIcon("src/image/Limpiar.png"));
        Limpiar.setBorder(null);
        Limpiar.setBorderPainted(false);
        Limpiar.setContentAreaFilled(false);
        Limpiar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Limpiar.setRolloverIcon(new ImageIcon("src/image/Limpiar.png"));
        Limpiar.setRolloverSelectedIcon(new ImageIcon("src/image/Limpiar.png"));
        Limpiar.setSelectedIcon(new ImageIcon("src/image/Limpiar.png"));
        Panel.add(Limpiar, new AbsoluteConstraints(10, 440, -1, -1));

        Guardar.setIcon(new ImageIcon("src/image/Save.png"));
        Guardar.setBorder(null);
        Guardar.setBorderPainted(false);
        Guardar.setContentAreaFilled(false);
        Guardar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Guardar.setRolloverIcon(new ImageIcon("src/image/Save.png"));
        Guardar.setRolloverSelectedIcon(new ImageIcon("src/image/Save.png"));
        Guardar.setSelectedIcon(new ImageIcon("src/image/Save.png"));
        Guardar.setSelected(true);
        Panel.add(Guardar, new AbsoluteConstraints(150, 440, -1, -1));

        getContentPane().add(Panel, new AbsoluteConstraints(0, 0, 290, 580));

        this.pack();

        Limpiar.addActionListener((e) -> {
            this.dispose();
            RegistroModelo mod = new RegistroModelo();
            Registro view = new Registro();
            RegistroControlador crt = new RegistroControlador(view, mod);
            crt.iniciar();
        });

        Regresar.addActionListener((e) -> {
            this.dispose();
            LoginModelo mod = new LoginModelo();
            Login view = new Login();

            VistaControlador crt = new VistaControlador(view, mod);
            crt.iniciar();
        });
    }

}

package Modelo;

import Controlador.VistaControlador;
import Vista.Login;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class RegistroModelo {

    private String RegNombre;
    private String RegUsuario;
    private String RegPassword1;
    private String RegPassword2;

    public String getRegNombre() {
        return RegNombre;
    }

    public void setRegNombre(String RegNombre) {
        this.RegNombre = RegNombre;
    }

    public String getRegUsuario() {
        return RegUsuario;
    }

    public void setRegUsuario(String RegUsuario) {
        this.RegUsuario = RegUsuario;
    }

    public String getRegPassword1() {
        return RegPassword1;
    }

    public void setRegPassword1(String RegPassword1) {
        this.RegPassword1 = RegPassword1;
    }

    public String getRegPassword2() {
        return RegPassword2;
    }

    public void setRegPassword2(String RegPassword2) {
        this.RegPassword2 = RegPassword2;
    }

    public Boolean Escritor() {
        boolean escrito = false;
        if (this.RegNombre.toString().equals("") || this.RegUsuario.toString().equals("") || this.RegPassword1.toString().equals("")
                || this.RegPassword2.toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Uno o mas Campos estan vacios.", "Campos Faltantes", 2);
            escrito = false;
        } else if (!this.RegPassword1.toString().equals(this.RegPassword2.toString())) {
            JOptionPane.showMessageDialog(null, "Las Contraseñas no Coinciden", "Contraseñas no Coinciden", 2);
            escrito = false;
        } else {
            File libreta = new File("src/Registro/Usuarios.txt");
            try {
                FileWriter pluma = new FileWriter(libreta, true);
                pluma.write("\n");
                pluma.write(this.RegNombre.toString());
                pluma.write(", ");
                pluma.write(this.RegUsuario.toString());
                pluma.write(", ");
                pluma.write(VistaControlador.Encriptado.encrypt(this.RegPassword1.toString()));
                pluma.close();
            } catch (IOException Err) {
            } catch (Exception ex) {
            }
            System.out.println("Guardado");
            JOptionPane.showMessageDialog(null, "Usuario Registrado Exitosamente", "", 1);
            LoginModelo mod = new LoginModelo();
            Login view = new Login();

            VistaControlador crt = new VistaControlador(view, mod);
            crt.iniciar();
            escrito = true;
        }
        return escrito;
    }
}

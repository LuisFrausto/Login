package Modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoginModelo {

    private String Usuario;
    private String Contrase�a;

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrase�a() {
        return Contrase�a;
    }

    public void setContrase�a(String Contrase�a) {
        this.Contrase�a = Contrase�a;
    }

    public boolean BuscarUsuario() {
        String record = null;
        FileReader in = null;
        boolean existe = false;
        try {
            in = new FileReader("src/Registro/Usuarios.txt");
            BufferedReader br = new BufferedReader(in);
            while ((record = br.readLine()) != null) {
                String[] word = record.split(", ");
                if (word[1].equals(this.Usuario.toString()) && Controlador.Encriptado.decrypt(word[2]).toString().equals(this.Contrase�a.toString())) {
                    System.out.println("Bienvenido");
                    existe = true;
                }
            }
            if (!existe) {
                System.out.println("Usuario o contrase�a incorrecto.");
            }
        } catch (IOException err) {
        } catch (Exception ex) {
        }

        return existe;
    }

}

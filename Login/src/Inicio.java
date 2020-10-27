
import Controlador.VistaControlador;
import Modelo.LoginModelo;
import Vista.Login;

    
public class Inicio {

    public static void main(String[] args) {
        
        LoginModelo mod = new LoginModelo();
        Login view = new Login();
        
        VistaControlador crt = new VistaControlador(view,mod );
        crt.iniciar();
    }
    
}
    
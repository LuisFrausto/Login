package Controlador;

import Modelo.LoginModelo;
import Vista.Login;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaControlador implements ActionListener{
    private Login view;
    private LoginModelo model;
    
    public VistaControlador(Login view, LoginModelo model){
        this.view=view;
        this.model= model;
        
        this.view.Entrar.addActionListener(this);
        
    }
    
    public void iniciar(){
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dimen =view.getSize();
        view.setLocation(
                (pantalla.width - dimen.width) / 2,
                (pantalla.height - dimen.height) / 2);
        view.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        model.setUsuario(view.User.getText());
        model.setContraseña(view.Password.getText());
        model.BuscarUsuario();        
    }
    
}

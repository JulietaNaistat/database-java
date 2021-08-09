package clase33plus;

import javax.swing.*;
import java.sql.SQLException;

public class Administrador extends Usuario implements Admin {

    private usuariosDatabase manejoDB;

    public Administrador(int id, String name, String phone, String city, String email, String personalNumber/*, usuariosDatabase manejoDB*/){
       super(id, name, phone, city, email, personalNumber);
       //this.manejoDB = manejoDB;
        manejoDB = new usuariosDatabase();
        Usuario user = null;
    }



    public void bannearUsuario(int id, Infracciones tiempo) {
        Usuario user = null;
        try {
            user = manejoDB.buscarId(id);
        } catch (SQLException error) {
            error.printStackTrace();
        }

        /*
        if (user != null) {
            System.out.println("El usuario " + user.getName() + " fue banneado por " + tiempo.getTiempo());
        } else {
            System.out.println("No se encontró el usuario");
        }
        */

        String adminPass = JOptionPane.showInputDialog("Ingrese contraseña de administrador");
        if (adminPass.equals(claveAdmin)) {
            if (user != null) {
                System.out.println("El usuario " + user.getName() + " fue banneado por " + tiempo.getTiempo());
            } else {
                System.out.println("No se encontró el usuario");
            }
        } else {
            System.out.println("No tenes permiso de administrador");
        }

    }
}

//@Override
//public void bannearUsuario(int id, Infracciones tiempo) {}

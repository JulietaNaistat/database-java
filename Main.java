package clase33plus;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
       usuariosDatabase manejoDB = new usuariosDatabase();
       Usuario katy = null;

       try {
           katy = manejoDB.buscarEmail("parturient@nibhsitamet.ca");
       } catch (SQLException error){
           error.printStackTrace();
       }

        System.out.println(katy.getEmail());

       Administrador root = new Administrador(1, "Julieta", "12345678", "Catan", "julieta.naistat@gmail.com", "12345" );

       root.bannearUsuario(3, Infracciones.PERMABAN);




        /*String url = "jdbc:mysql://localhost:3306/JavaTest"; //driver:gestorDB://servidor:puerto/NombreDB
        String user = "root";
        String password = "12345";
        String consultaSelect = "SELECT * FROM JavaTest"; // aca ponemos la consulta
        //String consultaSelect2 = "SELECT * FROM JavaTest where id = 1";
        String queryUpdate = "UPDATE JavaTest set Name = 'Jane' where id = 1";
        String queryPreparedStatement = "SELECT * FROM JavaTest WHERE id = ? AND NAME = ?;";


        // campos
        String campoId = "id";
        String campoName = "Name";
        String campoPhone = "Phone";
        String campoCity = "City";
        String campoCompany = "Company";
        String campoEmail = "Email";
        String campoPersonalNumber = "PersonalNumber";

        try {
            // conexion
            Connection mysql = DriverManager.getConnection(url, user, password);

            //statement
            Statement hojaVirtual = mysql.createStatement();
            ResultSet resultado = hojaVirtual.executeQuery(consultaSelect);

            // mostrar datos
            while(resultado.next()) { //pasamos a la sig fila y preg si hay info valida
                System.out.print(resultado.getInt(campoId) + ": ");
                System.out.print(resultado.getString(campoName) + " | ");
                System.out.print(resultado.getString(campoPhone) + " | ");
                System.out.print(resultado.getString(campoCity) + " | ");
                System.out.print(resultado.getString(campoCompany) + " | ");
                System.out.print(resultado.getString(campoEmail) + " | ");
                System.out.println(resultado.getString(campoPersonalNumber) + " " + "\n");
            }

            hojaVirtual.executeUpdate(queryUpdate);
            resultado = hojaVirtual.executeQuery(consultaSelect);

            System.out.println("-------UPDATE--------");
            while(resultado.next()) {
                System.out.print(resultado.getInt(campoId) + ": ");
                System.out.println(resultado.getString(campoName) + " | ");
            }

            // Prepared Statement
            PreparedStatement queryPrepared = mysql.prepareStatement(queryPreparedStatement);
            queryPrepared.setInt(1, 4);
            queryPrepared.setString(2, "Carter Glenn");
            resultado = queryPrepared.executeQuery();

            System.out.println("-------prepared statement--------");
            while(resultado.next()) {

                System.out.print(resultado.getInt(campoId) + ": ");
                System.out.print(resultado.getString(campoName) + " | ");
                System.out.print(resultado.getString(campoPhone) + " | ");
                System.out.print(resultado.getString(campoCity) + " | ");
                System.out.print(resultado.getString(campoCompany) + " | ");
                System.out.print(resultado.getString(campoEmail) + " | ");
                System.out.println(resultado.getString(campoPersonalNumber) + " " + "\n");
            }

        } catch (SQLException error) {
            System.out.println("Error");
            error.printStackTrace();
        }
*/
    }

}



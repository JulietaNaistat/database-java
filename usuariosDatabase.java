package clase33plus;

import java.sql.*;


public class usuariosDatabase {

    // Conexión
    public Connection mysql;
    // Campos
    private final String campoId = "id";
    private final String campoName = "Name";
    private final String campoPhone = "Phone";
    private final String campoCity = "City";
    private final String campoEmail = "Email";
    private final String campoPersonalNumber = "PersonalNumber";
    //password??

    //Consultas
    private final String buscarEmail = "SELECT * FROM " + Database.JavaTest + " WHERE " + campoEmail + " = ?";
    private final String buscarId = "SELECT * FROM " + Database.JavaTest + " WHERE " + campoId + " = ?";

    public usuariosDatabase() {
        try{
            mysql = new Mysql(Database.JavaTest).getConnection();
        } catch (SQLException error) {
            error.printStackTrace();
        }
    }

    public Usuario buscarEmail (String email) throws SQLException {
        PreparedStatement hojavirtual = mysql.prepareStatement(buscarEmail);
        hojavirtual.setString(1,email);
        ResultSet data = hojavirtual.executeQuery();
        Usuario user = null;

        while(data.next()) {
            user = new Usuario(data.getInt(campoId),
                            data.getString(campoName),
                            data.getString(campoPhone),
                            data.getString(campoCity),
                            data.getString(campoEmail),
                            data.getString(campoPersonalNumber));
        }
        return user;
    }

    public Usuario buscarId (int id) throws SQLException {
        PreparedStatement hojavirtual = mysql.prepareStatement(buscarId);
        hojavirtual.setInt(1, id);
        ResultSet data = hojavirtual.executeQuery();
        Usuario user = null;

        while(data.next()) {
            user = new Usuario(data.getInt(campoId),
                    data.getString(campoName),
                    data.getString(campoPhone),
                    data.getString(campoCity),
                    data.getString(campoEmail),
                    data.getString(campoPersonalNumber));
        }
        return user;
    }




}

package idat.edu.pe.sigedu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCUtil {

    private final String usuarioBD = "root";
    private final String passwordBD = "12345678"; //"adminsqladmin"
    private final String urlConeccion = "jdbc:mysql://localhost:3306/sigedu_db?zeroDateTimeBehavior=convertToNull";
    private final String driverClass = "com.mysql.jdbc.Driver";
    private Connection coneccion;

    private PreparedStatement sentencia;
    private ResultSet resultados;

    public JDBCUtil() {
        try {
            //1.- Cargo de Class Driver
            Class.forName(driverClass);
            //2.-Obtener connecion
            coneccion = DriverManager.getConnection(urlConeccion, usuarioBD, passwordBD);
            if (coneccion != null) {
                System.out.println("Coneccion exitosa");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getConeccion() {
        return coneccion;
    }

}

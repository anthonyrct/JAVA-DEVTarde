package JDBCTesteMaven.src.main.java.com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            Statement s;
            String usuario = "postgres";
            String senha = "postgres";
            String url = "jdbc:postgresql://localhost:5432/postgres";

            Connection c = DriverManager.getConnection(url, usuario, senha);
            s = c.createStatement();
            s.execute("INSERT INTO CONTATO VALUES('1', 'DIOGO', 'digogo@gmail.com')");

            c.close();
        } catch (Exception E) {
            System.out.println("\n" + E);
        }
    }
}
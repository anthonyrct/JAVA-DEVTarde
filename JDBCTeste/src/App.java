import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class App {
    public static void main(String[] args) throws Exception {
        try{
            Statement s;
            String usuario ="postgres";
            String senha ="postgres";
            String url ="jdbc:postgresql://localhost:5432/postgres";

            Connection c = DriverManager.getConnection(url, usuario, senha);
            s = c.createStatement();
            s.execute("INSERT INTO CONTATO VALUES('1', 'DIOGO', 'digogo@gmail.com')");

            c.close();
        } catch(Exception E){
            System.out.println("\n" +E);
        }
    }
}

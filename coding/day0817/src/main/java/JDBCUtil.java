import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.io.InputStream;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {

    private static JDBCUtil singleton = null;
    private static String DRIVERNAME = null;

    public JDBCUtil() {
        System.out.print("构造器..............");
    }

    private static String URL = null;
    private static String USER = null;
    private static String PASSWORD = null;


//    private  Connection conn = null;

    static {
        try {

            Properties props = new Properties();
            //Reader in = new FileReader("db.properties");
            InputStream in = JDBCUtil.class.getClassLoader().getResourceAsStream("db.properties");
            props.load(in);

            DRIVERNAME = props.getProperty("drivername");
            URL = props.getProperty("url");
            USER = props.getProperty("user");
            PASSWORD = props.getProperty("password");

        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException(e);

        }
    }

    //单例设计
    public static JDBCUtil getInstance() {

        if (singleton == null) {

            singleton = new JDBCUtil();

        }

        return singleton;

    }
    public  Connection getConnection() throws Exception {
//        if (conn != null) {
//            return conn;
//        }

        Class.forName(DRIVERNAME);
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

        return conn;
    }

    public  void closeResource(Connection conn, Statement st) throws SQLException {
        st.close();
        conn.close();
    }

    public  void closeResource(Connection conn,  Statement st,ResultSet rs) throws SQLException {
        st.close();
        rs.close();
        conn.close();
    }
}
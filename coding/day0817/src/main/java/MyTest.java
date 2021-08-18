import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyTest {
    public static void main(String[] args)  {
        view();
    }

    public static void view()  {
        JDBCUtil jdbcUtil = JDBCUtil.getInstance();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = jdbcUtil.getConnection();
            String sql = "SELECT * FROM tbl_dvd LIMIT 1000;";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String name = rs.getString("name");
                System.out.println(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                jdbcUtil.closeResource(conn,ps,rs);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}

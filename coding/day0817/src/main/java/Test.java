import java.sql.*;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        //add();
        //update();
        //del();
        //view();
        view1();
    }

    public static void view(){
        Connection conn=null;
        Statement stat=null;
        ResultSet rs=null;
        try {
            //1、使用反射方式加载驱动器
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2、创建连接数据库对象
            String url = "jdbc:mysql://121.37.170.216:3306/hsbc?characterEncoding=utf-8";
            String userName = "root";
            String passWord = "fy123456";
            conn = DriverManager.getConnection(url,userName,passWord);

            //3、创建操作数据库对象
            stat = conn.createStatement();

            //4、创建Sql语句
            String sql = "select * from tbl_dvd_fy";
//            String sql = "insert into 表名 列名 = 值 where 【约束条件】";
//            String sql = "delete from 表名 where 【约束条件】";
//            String sql = "update 表名 set 列名 = 值 where 【约束条件】"

            //5、执行Sql语句，并创建结果集
            rs = stat.executeQuery(sql);

            Set<DVDBean> set = new TreeSet<DVDBean>();
            //6、操作结果集
            while(rs.next()){
                String name = rs.getString("name");
                Integer state = rs.getInt("state");
                Integer date = rs.getInt("date");
                Integer count = rs.getInt("count");

                DVDBean dvdBean = new DVDBean(name,state,date,count);
                set.add(dvdBean);
            }
            System.out.println(set);


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            //7、释放资源
            // 先创建的后释放
            try{
                if(rs != null) rs.close();          //释放结果集对象
                if(stat != null) stat.close();      //释放操作数据库对象
                if(conn != null) conn.close();      //释放连接数据库对象
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }

    }
    public static void add(){
        Connection conn=null;
        Statement stat=null;
        try {
            //1、使用反射方式加载驱动器
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2、创建连接数据库对象
            String url = "jdbc:mysql://121.37.170.216:3306/hsbc?characterEncoding=utf-8";
            String userName = "root";
            String passWord = "fy123456";
            conn = DriverManager.getConnection(url,userName,passWord);

            //3、创建操作数据库对象
            stat = conn.createStatement();

            //4、创建Sql语句
            String sql = "INSERT INTO tbl_dvd_fy (name, state,date,count) VALUES ('2', 1,0,400);";
//            String sql = "delete from 表名 where 【约束条件】";
//            String sql = "update 表名 set 列名 = 值 where 【约束条件】"

            //5、执行Sql语句，并创建结果集
            boolean isSuccess = stat.execute(sql);
            if(!isSuccess){
                System.out.println("插入成功！！！");
            }else {
                System.out.println("插入失败！！！");
            }
            //6、操作结果集

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            //7、释放资源
            // 先创建的后释放
            try{
                if(stat != null) stat.close();      //释放操作数据库对象
                if(conn != null) conn.close();      //释放连接数据库对象
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }

    }
    public static void update(){
        Connection conn = null;
        Statement stat = null;
        try {
            //1、使用反射方式加载驱动器
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2、创建连接数据库对象
            String url = "jdbc:mysql://121.37.170.216:3306/hsbc?characterEncoding=utf-8";
            String userName = "root";
            String passWord = "fy123456";
            conn = DriverManager.getConnection(url, userName, passWord);

            //3、创建操作数据库对象
            stat = conn.createStatement();

            //4、创建Sql语句
//            String sql = "delete from 表名 where 【约束条件】";
            String sql = "update tbl_dvd_fy set count = 1000 where name=\"方勇\"";

            //5、执行Sql语句，并创建结果集
            boolean isSuccess = stat.execute(sql);
            if (!isSuccess) {
                System.out.println("修改成功！！！");
            } else {
                System.out.println("修改失败！！！");
            }
            //6、操作结果集

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            //7、释放资源
            // 先创建的后释放
            try {
                if (stat != null) stat.close();      //释放操作数据库对象
                if (conn != null) conn.close();      //释放连接数据库对象
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }

    }
    public static void del(){
        Connection conn = null;
        Statement stat = null;
        try {
            //1、使用反射方式加载驱动器
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2、创建连接数据库对象
            String url = "jdbc:mysql://121.37.170.216:3306/hsbc?characterEncoding=utf-8";
            String userName = "root";
            String passWord = "fy123456";
            conn = DriverManager.getConnection(url, userName, passWord);

            //3、创建操作数据库对象
            stat = conn.createStatement();

            //4、创建Sql语句
            String sql = "delete from tbl_dvd_fy where name=\"Simone\" or name='1' or name='2'";

            //5、执行Sql语句，并创建结果集
            boolean isSuccess = stat.execute(sql);
            if (!isSuccess) {
                System.out.println("修改成功！！！");
            } else {
                System.out.println("修改失败！！！");
            }
            //6、操作结果集

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            //7、释放资源
            // 先创建的后释放
            try {
                if (stat != null) stat.close();      //释放操作数据库对象
                if (conn != null) conn.close();      //释放连接数据库对象
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }

    }

    public static void view1(){
        Connection conn=null;
        Statement stat=null;
        ResultSet rs=null;
        try {
            //1、使用反射方式加载驱动器
//            Class.forName("com.mysql.cj.jdbc.Driver");

            //2、创建连接数据库对象
//            String url = "jdbc:mysql://121.37.170.216:3306/hsbc?characterEncoding=utf-8";
//            String userName = "root";
//            String passWord = "fy123456";
//            conn = DriverManager.getConnection(url,userName,passWord);
              conn = JDBCUtil.getInstance().getConnection();

            //3、创建操作数据库对象
            stat = conn.createStatement();

            //4、创建Sql语句
            String sql = "select * from tbl_dvd_fy";
//            String sql = "insert into 表名 列名 = 值 where 【约束条件】";
//            String sql = "delete from 表名 where 【约束条件】";
//            String sql = "update 表名 set 列名 = 值 where 【约束条件】"

            //5、执行Sql语句，并创建结果集
            rs = stat.executeQuery(sql);

            Set<DVDBean> set = new TreeSet<DVDBean>();
            //6、操作结果集
            while(rs.next()){
                String name = rs.getString("name");
                Integer state = rs.getInt("state");
                Integer date = rs.getInt("date");
                Integer count = rs.getInt("count");

                DVDBean dvdBean = new DVDBean(name,state,date,count);
                set.add(dvdBean);
            }
            System.out.println(set);


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //7、释放资源
            // 先创建的后释放
//            try{
//                if(rs != null) rs.close();          //释放结果集对象
//                if(stat != null) stat.close();      //释放操作数据库对象
//                if(conn != null) conn.close();      //释放连接数据库对象
//            } catch (SQLException throwables) {
//                throwables.printStackTrace();
//            }
            try {
                JDBCUtil.getInstance().closeResource(conn,stat,rs);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }

    }
}

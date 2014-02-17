import java.sql.*;  
//继续试喔


//写在update

//in updateTest

public class JavaH2 {  
    public void query(String SQL) {  
        try {  
            String sourceURL = "jdbc:h2:E:/h2db/test";  
            String user = "sa";  
            String key = "";  
  
            try {  
                Class.forName("org.h2.Driver");  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
            Connection conn = DriverManager.getConnection(sourceURL, user, key);  
            Statement stmt = conn.createStatement();  
            ResultSet rset = stmt.executeQuery(SQL);  
            while (rset.next()) {  
                System.out.println(rset.getString("name")+ "  "+rset.getString("sex"));  
            }  
            rset.close();  
            stmt.close();  
            conn.close();  
        } catch (SQLException sqle) {  
            System.err.println(sqle);  
        }  
    }  
  
    public static void main(String args[]) {  
    	JavaH2 tt = new JavaH2();  
        tt.query("select * from mytable");  
    }  
}  
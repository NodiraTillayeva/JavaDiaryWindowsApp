package application;

import java.sql.*;

public class DailyQueries {
    private static final String URL = "jdbc:mysql://localhost:3306/Diary?autoReconnect=true&useSSL=false";
    private Connection connection;
    private PreparedStatement insertChecked;

    public DailyQueries()
    {
        try
        {
            connection = DriverManager.getConnection(URL,"root","3141592");
            insertChecked = connection.prepareStatement("INSERT INTO daily(Id,Dates,ChBox1,ChBox2,ChBox3,ChBox4) " +
                    "VALUES(?,?,?,?,?,?)");
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }

    public void addChecked(int id,String date,int flag1,int flag2,int flag3,int flag4)
    {
        try
        {
            insertChecked.setInt(1,id);
            insertChecked.setString(2,date);
            insertChecked.setInt(3,flag1);
            insertChecked.setInt(4,flag2);
            insertChecked.setInt(5,flag3);
            insertChecked.setInt(6,flag4);
            insertChecked.executeUpdate();
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }

    }
    public int getChecked(int id,String date,String ChName)
    {
        int chname = 0;
        try
        {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM daily WHERE Id = " + id + " AND " +
                    "Dates = " + "\"" + date + "\"");
            resultSet.next();
            chname = resultSet.getInt(ChName);
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return chname;
    }

}

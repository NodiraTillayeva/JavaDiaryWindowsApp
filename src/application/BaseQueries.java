package application;

import java.sql.*;

public class BaseQueries {
    private static final String URL = "jdbc:mysql://localhost:3306/Diary?autoReconnect=true&useSSL=false";

    private Connection connection;
    private PreparedStatement insertUser;

    public void addUser(String username, String name,String password)
    {
        try
        {
            connection = DriverManager.getConnection(URL, "root", "3141592");

            insertUser = connection.prepareStatement(
                    "INSERT INTO users" +
                            "(UserName,Name,Password) " +
                            "VALUES(?,?,?)");
            insertUser.setString(1,username);
            insertUser.setString(2,name);
            insertUser.setString(3,password);

            insertUser.executeUpdate();
            connection.close();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public Boolean isInBase(String uname,String upass)
    {
        boolean Flag = false;
        try
        {
            connection = DriverManager.getConnection(URL, "root", "3141592");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT UserName,Password FROM users");
            while(resultSet.next())
            {
                if(uname.equals(resultSet.getString("UserName")) &&
                        upass.equals(resultSet.getString("Password")))
                {
                    Flag = true;
                }
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return Flag;
    }
    public int getUserId(String username)
    {
       int id = 0;
        try
       {
           Connection connection = DriverManager.getConnection(URL,"root","3141592");
           Statement statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery("SELECT * FROM users WHERE UserName = \""  + username + "\"");
           resultSet.next();
           id = resultSet.getInt("Id");
       }
       catch (SQLException ex)
       {
           ex.printStackTrace();
       }
        return id;
    }



}

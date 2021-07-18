package application;

import java.sql.*;

public class PlansQueries {
    private static final String URL = "jdbc:mysql://localhost:3306/Diary?autoReconnect=true&useSSL=false";
    private Connection connection;
    private PreparedStatement insertPlan;

    public PlansQueries()
    {
        try
        {
            connection = DriverManager.getConnection(URL,"root","3141592");
            insertPlan = connection.prepareStatement("INSERT INTO " +
                    "plans(Id,Dates,Plan1,Plan2,Plan3,Plan4,Plan5,Plan6,Plan7,Plan8) " +
                    "VALUES(?,?,?,?,?,?,?,?,?,?)");
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }
    public void addPlan(int id,String name,String plan1,String plan2,String plan3,
                        String plan4,String plan5,String plan6,String plan7,String plan8)
    {
        try
        {
            insertPlan.setInt(1,id);
            insertPlan.setString(2,name);
            insertPlan.setString(3,plan1);
            insertPlan.setString(4,plan2);
            insertPlan.setString(5,plan3);
            insertPlan.setString(6,plan4);
            insertPlan.setString(7,plan5);
            insertPlan.setString(8,plan6);
            insertPlan.setString(9,plan7);
            insertPlan.setString(10,plan8);
            insertPlan.executeUpdate();


        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }
    public String getPlan(int id,String date,String Plan)
    {
        String plan = "";
        try
        {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM plans WHERE Id = " + id + " AND " +
                    "Dates = " + "\"" + date + "\"");
            if(resultSet.next())
            {
                plan = resultSet.getString(Plan);
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return plan;
    }
}

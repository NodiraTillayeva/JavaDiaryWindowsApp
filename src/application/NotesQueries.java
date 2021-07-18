package application;

import java.sql.*;


public class NotesQueries {

    private static final String URL = "jdbc:mysql://localhost:3306/Diary?autoReconnect=true&useSSL=false";
    private Connection connection;
    private PreparedStatement insertNotes;

    public NotesQueries()
    {
        try
        {
            connection = DriverManager.getConnection(URL, "root", "3141592");

            insertNotes = connection.prepareStatement(
                    "INSERT INTO notes(Id,Dates,Notes) VALUES(?,?,?)");

        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }
    public void addNote(int id,String date, String note)
    {
        try
        {
            insertNotes.setInt(1,id);
            insertNotes.setString(2,date);
            insertNotes.setString(3,note);
            insertNotes.executeUpdate();
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }
    public String getNote(int id,String date)
    {
        String note = "";
        try
        {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "SELECT * FROM notes WHERE Id = " + id + " AND " +
                            "Dates = " + "\"" + date + "\"");
            if (resultSet.next())
            {
                note = resultSet.getString("Notes");
            }
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        return note;
    }
}

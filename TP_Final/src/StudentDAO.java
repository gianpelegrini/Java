//Giancarlo Pelegrini CB3007634

import java.sql.*;
import java.sql.PreparedStatement;

public class StudentDAO { 
    private Connection connection;
    String name;
    Integer age;
    Double weight;
    Double height;
    String goal;

    public StudentDAO(){ 
        this.connection = new JavaConnect().getConnection();
    } 
    public void insert(Student s){ 
        String sqlInsert = "INSERT INTO students(name,age,weight,height, goal) VALUES(?,?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sqlInsert);
            stmt.setString(1, s.getName());
            stmt.setInt(2, s.getAge());
            stmt.setDouble(3, s.getWeight());
            stmt.setDouble(4, s.getHeight());
            stmt.setString(5, s.getGoal());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    
}
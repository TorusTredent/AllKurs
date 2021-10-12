package Lessons.Lesson16;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/user?useUnicode=true&serverTimezone=UTC";
        String username = "root";
        String password = "12344321";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection connection = DriverManager.getConnection(url, username, password)) {
//                String query = "CREATE TABLE USERS (Id INT PRIMARY KEY AUTO_INCREMENT, first_name varchar(25), lastname varchar(25))";
//                String query = "INSERT INTO users (first_name, lastname) values ('vasya', 'petrov)')";
//                String query = "INSERT INTO users (first_name, lastname) values ('denis', 'denisovich')";
                String query = "SELECT * FROM users WHERE ID = 1";
//                String query = "UPDATE USERS SET first_name = 'misha' WHERE first_name = 'denis'";
                Statement statement = connection.createStatement();
//                String query = "DELETE FROM USERS WHERE Id = 1";
//                statement.execute(query);
                ResultSet resultSet = statement.executeQuery(query);
                while (resultSet.next()){
                    System.out.print(resultSet.getInt(1) + ") ");
                    System.out.print(resultSet.getString(2) + ": ");
                    System.out.print(resultSet.getString(3) + "- ");
                    System.out.println(resultSet.getString(4));
                    System.out.println();
                }

//                String query = "INSERT INTO USERS (first_name, lastname) values (?, ?)";
//                PreparedStatement statement = connection.prepareStatement(query);
//                statement.setString(1, "teach me");
//                statement.setString(2, "skills");
//                statement.execute();


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.slykid.jpa.hellospring.dao;

import com.slykid.jpa.hellospring.model.User;

import java.sql.*;

public class UserDao {

    public void add(User user) throws ClassNotFoundException, SQLException
    {
        Connection conn = getConnection();

        PreparedStatement statement = conn.prepareStatement(
                "insert into public.users(id, name, password) values(?,?,?)"
        );
        statement.setString(1, user.getId());
        statement.setString(2, user.getName());
        statement.setString(3, user.getPassword());

        statement.executeUpdate();

        statement.close();
        conn.close();
    }

    public User get(String id) throws ClassNotFoundException, SQLException
    {
        Connection conn = getConnection();

        PreparedStatement statement = conn.prepareStatement(
                "select * from public.users where id = ?"
        );

        statement.setString(1, id);

        ResultSet resultSet = statement.executeQuery();
        resultSet.next();

        User user = new User();
        user.setId(resultSet.getString("id"));
        user.setName(resultSet.getString("name"));
        user.setPassword(resultSet.getString("password"));

        resultSet.close();
        statement.close();
        conn.close();

        return user;
    }

    // DB Connection 생성 부분의 중복 현상 방지를 위해 분리함
    private Connection getConnection() throws ClassNotFoundException, SQLException
    {
        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost/postgres", "ghkim", "Gallerhead106)"
        );

        return conn;
    }


}

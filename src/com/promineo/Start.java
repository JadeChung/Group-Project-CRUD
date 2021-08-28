package com.promineo;

import com.promineo.navigation.Menu;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Start {

    public static void main(String[] args) throws SQLException {
        Menu menu = new Menu();
        menu.start();
    }

}

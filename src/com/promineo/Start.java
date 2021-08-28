package com.promineo;

import java.sql.SQLException;

import com.promineo.navigation.Menu;

public class Start {

    public static void main(String[] args) throws SQLException{
    	Menu menu = new Menu();
    	menu.start();
    }

}

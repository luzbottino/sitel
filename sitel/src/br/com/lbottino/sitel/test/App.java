/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.lbottino.sitel.test;

import br.com.lbottino.sitel.dao.UserDAO;
import br.com.lbottino.sitel.model.User;

/**
 *
 * @author pig
 */
public class App {
    public static void main(String[] args) {
        //insertUser();
    }

    private static void insertUser() {
        User u1 = new User();
        
        u1.setName("Luis Bottino");
        u1.setLogin("luis.bottino");
        u1.setCodigo("a001234");
        u1.setEmail("luis.bottino@teste.com.br");
        u1.setPassword("123");
        
        new UserDAO().save(u1);
        
        System.out.println(u1.toString());
    }
    
}

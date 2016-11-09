/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.lbottino.sitel.dao;

import br.com.lbottino.sitel.model.User;

/**
 *
 * @author pig
 */
public class UserDAO extends GenericDAO<User> {

    public UserDAO() {
        super(User.class);
    }
    
    public User findByLoginAndPassword(String login, String password){
        String jpql = "from User u where u.login = ? and u.password = ?";
        
        return findOne(jpql, login, password);
    }
    
}

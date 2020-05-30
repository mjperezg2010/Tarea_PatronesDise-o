/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author martinperez
 */
public class EagerSingleton {
    
    private static volatile EagerSingleton instance = new EagerSingleton();
    
    private EagerSingleton(){
        
    }
    
    public static EagerSingleton getInstance(){
        return instance;
    }
    
    
}

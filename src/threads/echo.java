/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Ahemd M. Abd El-Ghany
 */
public class echo extends Thread{
    
    public echo() {
}
    public void echoHello(){
        System.out.println("I'm form hello Class");
    }    
    
    @Override
    public void run(){
        echoHello();
    }
}


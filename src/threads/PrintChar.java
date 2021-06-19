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
public class PrintChar implements Runnable{
    private char Char;
    private int times;
    
    
    public PrintChar(char Char, int times){
        this.Char = Char;
        this.times = times;
    }
    
    @Override
    public void run(){
        for(int i =0 ; i < times; i++){
            System.out.println(Char);
        }
    }
    
    
    
}

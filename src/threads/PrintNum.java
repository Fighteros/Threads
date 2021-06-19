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
public class PrintNum implements Runnable {
    private int num;
    
    public PrintNum(int num){
        this.num = num;
    }
    
    @Override
    public void run(){
        for (int i = 0 ; i < num; i++){
            System.out.println(num);
        }
    }
    
}

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



class SumArray{
    int sum;
    
      int sumArray(int nums[]){
         sum= 0;
        for(int i = 0; i < nums.length ; i++){
            sum += nums[i];
            System.out.println("Running total for" + Thread.currentThread().getName()+ "is "+ sum);
            
            try{
                Thread.sleep(10);
            }catch(InterruptedException exc){
                System.out.println("Interrupted!");
            }
        }
        return sum;
        }
}

class Client extends Thread {
   
    SumArray sa = new SumArray();
    
    int a[];
    
    int answer;
    
    Client(String name, int nums[]){
        super(name);
        a = nums;
        start();
    }
    
    @Override
    public void run() {
        int sum;
        System.out.println(getName() + "starting ");
        answer = sa.sumArray(a);
        System.out.println("sum for" +  getName()+ "is " + answer);    
        System.out.println("terminating " + getName());
        
        setPriority(Thread.NORM_PRIORITY);
    }
}

class Sync {
    public static void main(String[] args) {
        int f[] = {1,2,3,4,5};
        int d[] = {10,20,30,40,50};
        Client c1 = new Client("Child #1 ", f);
        Client c2 = new Client("Child #2 ", d);

    }
}

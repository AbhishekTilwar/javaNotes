class MyThread extends Thread {
    
    @Override
    public void run(){
        
        
        System.out.println("Running");

        try{
            Thread.sleep(2000);
            System.out.println("Re-Running");

        }
        catch(InterruptedException e){
            System.out.print(e);
        }
        
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread(); //New
        System.out.println(t1.getState());

        t1.start(); //Runnable 
        System.out.println(t1.getState());

        Thread.sleep(900);
        System.out.println(t1.getState()); // Timed-waiting

    }
}

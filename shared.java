public class GitExample {
    
    public void saySomething(String something) {
       System.out.println(something);
    }

    public static void printSomething() {
        System.out.println("Something!");
    }
    
    
    public static void main(String args[]) {
        
        GitExample gitExample = new GitExample();
        gitExample.saySomething("Git is cool");
        printSomething();
        
    }
    
}


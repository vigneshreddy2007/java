class Counter { 
    static int count = 0; 
    Counter() { count++; } 
} 
public class statint { 
     public static void main(String[] args) { 
         new Counter(); 
         new Counter();     
         System.out.println(Counter.count);

    } 
}


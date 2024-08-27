
class Swap {
    private int a;
    private int b;

    public Swap(int valueA, int valueB) {
        a = valueA;
        b = valueB;
    }

    
    public void display() {
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }

  
    public void swapValues() {
        int temp = a;
        a = b;
        b = temp;
    }
}


public class Swapclient {
    public static void main(String[] args) {
       
        Swap swapObj = new Swap(10, 20);

       
        System.out.println("Before Swapping:");
        swapObj.display();

      
        swapObj.swapValues();

        
        System.out.println("After Swapping:");
        swapObj.display();
    }
}

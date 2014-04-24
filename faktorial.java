import java.util.Scanner;

/**
 *
 * @author Asisten
 */
public class Faktorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Input bilangan : ");
        int n=s.nextInt();
        int b=1;
        if(n>0){
            for(int i=1;i<n;i++)
            b=b*(n-i);
            b=b*n;
        }
        else{
            b=1;
        }
        System.out.println("\t"+b);
    }
    
}

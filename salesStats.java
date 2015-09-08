import java.util.*;

public class salesStats{
  public static void main(String[] args){
    final int QUARTER = 4;
    final int DIV=6;
    
    Scanner input= new Scanner(System.in);
    double dollar;
    double[][] sales= new double[QUARTER][DIV];
    // q for quarter
        for(int q=0;q<QUARTER;q++){
        // d for division 
        for(int d=0;d<DIV;d++){
          System.out.printf("Quarter %d, Division %d", (q+1),(d+1)+
                           "Earnings: $");
          sales[q][d]= input.nextDouble();
        }
      
    }
  }
}
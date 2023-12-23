/*Given the following:



        int[][] items =

        { {0, 1, 3, 4},

        {4, 3, 99, 0, 7 },

        {3, 2} } ;

        Which of the following statements replaces the 99 with 77?*/




import java.util.*;
public class Assignnment2d{
    public static void main(String[] args) {
        int[][] items =

                {       {0, 1, 3, 4},

                        {4, 3, 99, 0, 7 },

                        {3, 2}               } ;


        for ( int row=0; row < items.length; row++ ) {
            for (int col = 0; col < items[row].length; col++) {

                System.out.print(items[row][col] + " ");
            }
            System.out.println();
        }
        
    }
}



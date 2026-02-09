import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter rows :");
        int row=sc.nextInt();
        System.out.println("Enter column :");
        int col=sc.nextInt();

        int matrix[][]=new int[row][col];

        System.out.println("Enter Elements :");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.println("Enter element at index "+i+j);
                matrix[i][j]=sc.nextInt();
                        
            }
        }
        System.out.println("MAtrix : ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(matrix[i][j]);
                        
            }
            System.out.println();
        }

        System.out.println("Sum of diagonal Element :");
        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println("Sum is :"+sum);



        
    }
}
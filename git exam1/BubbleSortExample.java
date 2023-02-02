import java.util.*;

public class BubbleSortExample {
    Scanner num = new Scanner();
    int obj =num.nextInt();
  
    
        public static void main(String [] args) {
            
            
                switch(obj){
                    case 1:
                    int arr1[] = {3,50,45,75,99};

        
                    for(int k=0; k<arr1.length;k++){
                        System.out.print(arr1[k]);
                    int n = arr1.length;
                    int temp=0;
                    
                    for (int i =0;i<n;i++)
                    {
                        for (int j =1;j<(n-1);j++)
                        {
                                if (arr1[j-1]>arr1[j])
                                {
                                    
                                    temp = arr1[j-1];
                                    arr1[j-1] = arr1[j];
                                    arr1[j]=temp;
                                }
            
                        }
            
                    }
                    break;
                    case 2:
                    int arr2[] = {3,50,45,75,99};

        
                    for(int k=0; k<arr1.length;k++){
                        System.out.print(arr1[k]);
                    int n = arr1.length;
                    int temp=0;
                    
                    for (int i =0;i<n;i++)
                    {
                        for (int j =1;j<(n-1);j++)
                        {
                                if (arr1[j-1]>arr1[j])
                                {
                                    
                                    temp = arr1[j-1];
                                    arr1[j-1] = arr1[j];
                                    arr1[j]=temp;
                                }
            
                        }
            
                    }
                    break;
                    case 3:
                    int arr3[] = {3,50,45,75,99};

        
                    for(int k=0; k<arr1.length;k++){
                        System.out.print(arr1[k]);
                    int n = arr1.length;
                    int temp=0;
                    
                    for (int i =0;i<n;i++)
                    {
                        for (int j =1;j<(n-1);j++)
                        {
                                if (arr1[j-1]>arr1[j])
                                {
                                    
                                    temp = arr1[j-1];
                                    arr1[j-1] = arr1[j];
                                    arr1[j]=temp;
                                }
            
                        }
            
                    }
                    break;

                }
            
            } 
        }

            
        
    


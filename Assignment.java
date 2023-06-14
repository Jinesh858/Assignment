public class Assignment
{  
    // a method the looks for the majority element  
    // in the array arr  
    public int findMajorEle(int inputArr[])  
    {  
        int s = inputArr.length;  
          
        int count = 0;  
       
        for(int i = 0 ; i < s; i++)  
        {  
           
            for(int j = 0; j < s; j++)  
            {  
                if(inputArr[i] == inputArr[j])  
                {  
                    count = count + 1;  
                }  
            }  
              
     
            if(count > s / 2)  
            {  
                return inputArr[i];  
            }  
             
            count = 0;  
        }  
        return -1;  
    }  
  
    // main method  
    public static void main(String[] argvs)   
    {  
        Assignment obj = new Assignment();  
  
        // input array  
        int arr[] = {2,4,5,5,5,5,5};  
          
        int s = arr.length;   
        int ans = obj.findMajorEle(arr);  
        if(ans != -1)  
        {  
           System.out.println("The majority element is: " + ans);   
        }  
        else  
        {  
            System.out.println("The majority element is not found.");   
        }  
          
          
       
          
    }  
  
}  

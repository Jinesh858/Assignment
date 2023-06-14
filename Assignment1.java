public class DuplicateElement {  
    public static void main(String[] args) {      
          
        //Initialize array   
        int [] arr = new int [] {4,3,2,7,8,2,3,1};   
          
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  

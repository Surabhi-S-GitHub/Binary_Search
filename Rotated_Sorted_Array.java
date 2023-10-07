class Solution {
  public static void main(String[] args)
  {
    int arr[]={4,5,6,7,0,1,2,3};
    int target=0;
    System.out.println(search(arr,target));
  }
    public static search(int[] arr, int target) {
       int pivot=findpivot(arr);
       if(findpivot==-1)
      {
        return bs(arr,target,0,arr.length-1);
      }
      if(arr[pivot]==target)
      {
        return pivot;
      }
      if(target>=arr[0])
      {
        return bs(arr,target,0,pivot-1);
      }
      return bs(arr,target,pivot+1,arr.length-1);
     
    }
    static int bs(int[]arr,int target,int start,int end)
    {
      
        while(start<=end)
       {
          int mid=start+(end-start)/2;
         if(arr[mid]>target)
         {
           end=mid-1;
         }
         else if(arr[mid]==target)
         {
           return mid;
         }
         else
         {
           start=mid+1;
         }
        
        }
        return -1;
    }
  static int findpivot(int[]arr)
  {
    int start=0;
    int end=arr.length-1;
    while(start<=end)
    {
       int mid=start+(end-start)/2;
       //4 cases
       if(mid<end && arr[mid]>arr[mid+1])
       {
         return mid;
       }
       if(mid>start && arr[mid]<arr[mid-1])
       {
         return mid-1;
       }
      if(arr[mid]<=arr[start])
      {
        end=mid-1;
      }
      if(arr[mid]>arr[start])
      {
        start=mid+1;
      }
    }
    return -1;
  }
}

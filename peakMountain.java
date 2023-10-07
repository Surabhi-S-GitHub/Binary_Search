class Main {
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,3,1};
    //System.out.println(peakIndex(arr));
    System.out.println(search(arr,3));
  }

//***************Find in Mountain Array******************
  public static int search(int[]arr,int target)
  {
    int peak=peakIndex(arr);
    int firstTry=orderAgnostic(arr,target,0,peak);
    if(firstTry!=-1)
    {
      return firstTry;
    }
    return orderAgnostic(arr,target,peak+1,arr.length-1);
  }

  public static int peakIndex(int[]arr)
  {
    int start=0;
    int end=arr.length;
    for(int i=0;i<arr.length;i++)
    {
      int mid=start+(end-start)/2;
      if(arr[mid]>arr[mid+1])
      {
        end=mid;
      }
      else
      {
        start=mid+1;
      }
        
    }
    return start;
  }
  
  public static int orderAgnostic(int[]arr,int target,int start,int end)
  {
    boolean isAsc=arr[start]<arr[end];

    while(start<=end)
    {
       int mid=start+(end-start)/2;
       if(arr[mid]==target)
       {
         return mid;
       }
       //if ascending order
       if(isAsc)
       {
         if(target<arr[mid])
         {
           end=mid-1;
         }
         else{
           start=mid+1;
         }
       }
      else{
         if(target>arr[mid])
         {
           end=mid-1;
         }
        else{
          start=mid+1;
        }
      }
    }
    return -1;
  }
}

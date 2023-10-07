class Main {
  public static void main(String[] args) {
    int arr[]={4,5,6,7,0,1,2};
    System.out.println(RotationCount(arr));
  }
  static int findpivotwithDuplicate(int[]arr)
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
      //start, mid and end are equal then skip start,end
      if(arr[start]==arr[mid] && arr[mid]==arr[end])
      {
        //return start if start is pivot
        if(arr[start]>arr[start+1])
        {
          return start;
        }
        start++;
        //return end if end is pivot
        if(arr[end]<arr[end-1])
        {
          return end-1;
        }
        end--;
      }
      else if(arr[start]<arr[mid] || 
              arr[start]==arr[mid] && arr[mid]>arr[end])
      {
        start=mid+1;
      }
      else{
        end=mid-1;
      }
    }
    return -1;
  }

  static int RotationCount(int[]arr)
  {
    int pivot=findpivotwithDuplicate(arr);

    return pivot+1;
  }

  public static int LargestSplitArray(int[]arr,int m)
  {
    int start=0;
    int end=0;
    for(int i=0i<arr.length;i++)
    {
      start=Math.max(start,arr[i]);
      end+=arr[i];

      while(start<end)
      {
        int mid=start+(end-start)/2;

        int sum=0;
        int pieces=1;
        for(int num: arr)
        {
          if(sum+num>mid)
          {
            sum=num;
            pieces++;
          }
          else{
            sum+=num;
          }  
        }
        if(pieces>m)
        {
          start=mid+1;
        }
        else{
          end=mid-1;
        }
      }
      return end;
    }
  }
}

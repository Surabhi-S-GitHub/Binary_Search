import java.util.*;
class Main {
  public static void main(String[] args) {
    int arr[]={11,12,13,14,18};
    int target=16;
  1.  int ans=ceil(arr,target);
  2.  int ans=floor(arr,target);
  3.  char chr[]={'c','b','d','e','f'};
    char target='a';
    System.out.println(nextGreatestLetter(chr,target));

  4.  Next Greatest element
    int [] nums={1,2,7,7,8,8,7,9};
    int target=7;
    System.out.println(searchRange(nums,target));
    
  5.
  }


  
********************Ceil of a number*****************
  public static int ceil(int[]arr,int target){
    int start=0;
    int end=arr.length;
    for(int i=0;i<arr.length;i++)
    {
      int mid=start+(end-start)/2;
      if(arr[mid]==target)
      {
        return mid;
      }
      else if(arr[mid]<target)
      {
        start=mid+1;
      }
      else
      {
        end=mid-1;
      }
    }
    return start;
  }


****************Floor of a number*******************
  public static int floor(int[]arr,int target){
    int start=0;
    int end=arr.length;
    for(int i=0;i<arr.length;i++)
    {
      int mid=start+(end-start)/2;
      if(arr[mid]==target)
      {
        return mid;
      }
      else if(arr[mid]<target)
      {
        start=mid+1;
      }
      else
      {
        end=mid-1;
      }
    }
    return end;
  }



  
******************Next Greatest letter(char)***********
 public static char nextGreatestLetter(char[] a, char target) 
    {
        int l=0;
        int h=a.length-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(target<a[mid])
            {
                
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return a[l%a.length];
    }





**********First and Last position of an element*********
  public int[] searchRange(int[]nums, int target) 
  {
      int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
  }
  int search(int[] nums, int target, boolean findStartIndex) 
  {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) 
        {
          
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
 
}

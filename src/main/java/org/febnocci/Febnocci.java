

package org.febnocci;

import java.util.ArrayList;

public class Febnocci {

   public int[] fibnocci (int n){
      int[] arr = new int[n];
      arr[0] = 0;
      arr[1] = 1;
      for(int i=2;i<n;i++){
         arr[i]=arr[i-1] +arr[i-2];
      }
      return  arr;
   }

}


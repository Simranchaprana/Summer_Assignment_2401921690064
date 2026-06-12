package week1.Day2;

import java.util.HashSet;
import java.util.Set;

public class Leet2 {
    public boolean containsDuplicate(int[] nums) {
    Set<Integer> intSet = new HashSet<>();
    for (int num : nums) {
      if (intSet.contains(num))
        return true;
      intSet.add(num);
    }

    return false;
  
    }
    
}

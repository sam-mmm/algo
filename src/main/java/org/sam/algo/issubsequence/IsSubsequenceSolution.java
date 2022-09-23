package org.sam.algo.issubsequence;

import java.util.List;

public class IsSubsequenceSolution {
 public boolean isSubsequence(String s, String t) {
     
        return false;
    }   
 
 public boolean isSubsequenceIntArray(List<Integer> array, List<Integer> sequence) {
     int arrI = 0;
     int seqI = 0;
     while(arrI<array.size() && seqI <sequence.size()){
        if(array.get(arrI) == sequence.get(seqI)){
            seqI++;
        }
        arrI++;
    }   
     return seqI == sequence.size();
 }
 
 public boolean isSubsequenceIntArray2(List<Integer> array, List<Integer> sequence) {
     int seqI = 0;
     for (Integer i : array) {
         if(seqI == sequence.size()) return true;
         if(sequence.get(seqI)== i){
             seqI++;
         }
     }
   
     return seqI == sequence.size();
 }
}

package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * # 77 
 * Given two integers n and k, return all possible combinations of k
 * numbers out of 1 ... n.
 * 
 * Example: Input: n = 4, k = 2 Output: [ [2,4], [3,4], [2,3], [1,2], [1,3],
 * [1,4] ]
 */
public class Combinations {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (1 == k) {
            List<Integer> singletonList;
            for (int i = 1; i <= n; i++) {
                singletonList = new ArrayList<>();
                singletonList.add(i);
                result.add(singletonList);
            }
            return result;
        }

        if (n == k) {
            List<Integer> Cnn = new ArrayList<>();
            for (int i = 1; i <= k; i++) {
                Cnn.add(i);
            } 
            result.add(Cnn);
            return result;
        }   


        List<List<Integer>> n1k1List = new ArrayList<>();
        List<List<Integer>> n1kList = new ArrayList<>();

        n1k1List = combine(n - 1, k - 1);
        n1kList = combine(n - 1, k);
        for (List<Integer> n1k1 : n1k1List) {
            ((ArrayList<Integer>) n1k1).add(n);
        }
        result.addAll(n1k1List);
        result.addAll(n1kList);        
        return result;
    }
}
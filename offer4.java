/**
*在二维数组中查找
*/


public class Solution {
    public boolean Find(int target, int [][] array) {
        int i=array.length-1;
        int j=0;
        while(i>=0&&i<array.length&&j>=0&&j<array[0].length)
        {
            if(target>array[i][j])
                j++;
            else if(target<array[i][j])
                i--;
            else
                return true;
        }
        return false;
    }
}
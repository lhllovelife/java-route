
/*
leetcode 11 装水的容器
//暴力O(n^2)
时间复杂度过高，需要优化
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] height) {
        int sum = -1;
        for(int i = 0; i < height.length; i++)
        {
            for(int j = i + 1; j < height.length; j++)
            {
                sum = Math.max(sum, (j-i) * Math.min(height[i], height[j]));
            }
        }
        return sum;
    }
}

package likou;

public class Test42 {


    //���� ��42 ����������  ����ˮ
    public static void main(String[] args) {




    }



    //����1 ˫ָ�뷨
    public static int trap(int[] height) {

        int left = 0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int result = 0;
        while (left<right){
            leftMax = Math.max(leftMax,height[left]);
            rightMax = Math.max(rightMax,height[right]);
            if (height[left]<height[right]){
                result = result + leftMax - height[left];
                left++;
            }else {
                result = result + rightMax - height[right];
                right++;
            }
        }
        return result;
    }
}

import org.junit.Test;

import java.util.HashMap;
import java.util.Stack;

public class Lidos {








    /**
     *
     * 测试hashmap
     *
     * */
    @Test
    public void test_hash(){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        hashMap.put(1,11);
        hashMap.put(2,22);
        //put(key,value)函数表示插入键为key值为value的元素，
        // 若原本没有这个键，则返回null，如果原本这个键已经被占用了，
        // 则插入失败，返回该键元宝呢对应的值，并用新的值覆盖掉原本的值
        System.out.println(hashMap);
        System.out.println(hashMap.get(5));
        System.out.println(hashMap.put(2,99));
        System.out.println(hashMap);
    }









    /**14题最长公共前缀**********
     * ************方法1，暴力法*************************************/
    @Test
    public void test_14(){
        String[] strs = {"flo1ower","flo1o","flo1o"};
        System.out.println(longestCommonPrefix(strs));
    }
    public  String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        //获取字符串数组的第一个字符串
        String temp_str = strs[0];
        for (int i = 0;i<strs.length;i++){
            int j = 0;
            //判断字符串中的各个字符是否匹配，遇到不匹配的就停止
            while(
                    j<temp_str.length() &&
                            j<strs[i].length() &&
                            temp_str.charAt(j) == strs[i].charAt(j)
            ){ j++;}
            temp_str = temp_str.substring(0,j);
        }
        return temp_str;
    }
    /*************************************************************/


    /**20题有效的括号**********
     * ************方法1，暴力法*************************************/
    @Test
    public void test_20(){
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
    //
    public boolean isValid(String s) {
        //方法1，通过方向一致的括号，对比到最内层，判断最内层括号是否对应
        if(s.length() == 0)return false;
        Stack<Character> stack = new Stack<>();//创建一个栈
        for(char temp:s.toCharArray()){ //将字符串转换成字符数组
            if(temp == '(' || temp == '[' || temp == '{'){
                stack.push(temp);
            }
            else if(stack.isEmpty()){
                return false;
            }
            else{
                char temp2 = stack.pop();
                if(temp2 == '(' && temp != ')'){ return false; }
                else if(temp2 == '[' && temp != ']'){ return false; }
                else if(temp2 == '{' && temp != '}'){ return false; }
            }
        }
        return stack.isEmpty();
    }
    /*************************************************************/







    /**
     *
     * 26删除有序数组中的重复项
     *
     * */

    @Test
    public void test_26(){
        int[] nums = {0,1,1,1,2,2,3,4};
        removeDuplicates(nums);
    }
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 1;
        for (int i = 0;i<nums.length-1;i++){
            if (nums[i] != nums[i+1]){
                //判断有几个不重复的元素
                j++;
            }
            //等于则赋值新数组
            nums[j-1] = nums[i+1];
        }
        //System.out.println(j);
        for (int m = 0;m < nums.length;m++){
            System.out.println(nums[m]);
        }
        return j;

    }

    /*public int removeDuplicates(int[] nums) {
    //使用集合
        ArrayList<Integer> temp_nums = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
            while(nums[i] == nums[i+1]){
                i++;
            }
            temp_nums.add(nums[i]);
        }
        return temp_nums.size();

    }*/






    /**
     *
     * (假27)移除元素，去除重复元素，不是val的元素不动
     *
     * */
    @Test
    public void test_277(){
        int[] nums = {0,1,2,2,3,0,4,2};
        removeElement1(nums,2);
    }
    public int removeElement1(int[] nums, int val) {
        if(nums == null){
            return 0;
        }
        //暴力法
        //记录元素中新的长度
        int j = 0;
        for(int i = 0;i<nums.length-1;i++){
            if(val == nums[i]){
                //记录检查到的元素个数
                //最后一个元素无法判断，单独判断
                j++;
                //记录内层遍历判断不等元素是第几个
                int k = 0;
                for (int l = i+1;l<nums.length;l++){
                    if (val != nums[l]){
                        k++;
                        if (k == j){
                            nums[i] = nums[l];
                            break;
                        }
                    }
                }
            }
        }
        if (nums[nums.length-1] == val){
            //单独判断最后一个元素
            j++;
        }
        for (int x:nums){
            System.out.print(x);
        }
        return nums.length-j;
    }

    /**
     *这是文档注释 （是多行注释）
     *
     * */


    /*
    *
    * 这是普通多行注释
    * */

    /**
     *
     * (真27)移除元素，去除重复元素
     *
     * */
    @Test
    public void test_27(){
        int[] nums = {0,1,2,2,3,0,4,2};
        removeElement(nums,2);
    }
    public int removeElement(int[] nums, int val) {
        if (nums == null) {
            return 0;
        }
        //暴力法 (左右双指针)
        int j =0;
        for (int i = 0;i<nums.length;i++){
            if (nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        for (int x :nums){
            System.out.print(x);
        };
        return j;
    }



    /*
    *
    * 双指针优化（首尾指针，类似快排的思想）
    * */
    @Test
    public void test_2777(){
        int[] nums = {0,1,2,2,3,0,4,2};
        removeElement2(nums,2);
    }
    public int removeElement2(int[] nums, int val) {
        //双指针优化（类似快排首位指针）
        //尾指针j
        int left = 0;
        int right = nums.length;

        //双指针，此处不可用for int i 来设定左指针，否则无法返回该值
        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[right - 1];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }


    /**
     * 27题简单题，找出字符串中第一个匹配项的下标
     */
    @Test
    public void test_28(){
        String a = "mississipnextval";
        String b = "issinextval";
        System.out.println(strStr(a,b));
    }
    public int strStr(String haystack, String needle) {
        //KMP模式匹配算法
        //1.找出模式串needle的nextval数组
        //2.进行模式匹配
        /*int[] next = new int[needle.length()];
        next[0] = 0;
        next[1] = 1;*/
        //先暴力解法，再改进为KMP算法
        //先处理异常情况
        if (needle.length()>haystack.length()){
            return -1;
        }
        for (int i = 0;i<haystack.length();i++){
            int m = i,n = 0;
            //
            while( n<needle.length() && 
                    m<haystack.length() &&
                    haystack.charAt(m) == needle.charAt(n)){
                m++;
                n++;
            }
            if (n == needle.length()){
                return i;
            }
        }
        return -1;
    }
    /**
     *
     * 暴力解法改进KMP算法
     * */
    @Test
    public void test_2888(){
        String a = "agooaagooglebbggabc";
        String b = "google";
        getNext(b);
    }
    /*
    * KMP算法
    * */
    //求next数组函数







    int[] getNext(String needle) {
        //获取匹配串与模式长度
        int m = needle.length();
        int[] next = new int[m];
        //判断空串情况
        //处理异常情况
        if (m == 0) {
            return next;
        }else if (m == 1){
            next[0] = 0;
            return next;
        }else if (m>=2){
            next[0] = 0;
            next[1] = 1;
        }
        //开始求next数组
        int i = 1;
        int j = 0;
        




        return next;









}





















































}
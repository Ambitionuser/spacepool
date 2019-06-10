package javaarray;

/**
 * 数组练习
 * 1.数组必须指定长度（或者是定长）
 * 2.注意数组角标越界
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //int数组
        int[] ints = new int[4];
        ints[0]=0;
        ints[1]=1;
        ints[2]=2;
        ints[3]=3;

        System.out.println(ints.length);
        for(int i=0;i<ints.length;i++){
            int value=ints[i];
            System.out.println(value);
        }

        //String 数组
        String[] strings ={"chenyanning","weiyi","shenzhen"};
        for (String str:strings
             ) {
            System.out.println(str);
        }



    }
}

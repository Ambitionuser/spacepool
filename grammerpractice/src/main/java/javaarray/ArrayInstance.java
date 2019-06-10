package javaarray;


/**
 * 1.定义一个函数，获取某个数组中的最小值
 * 2.定义一个数组,数组成员10个,找出数组中最大数连同下标一起输出
 * 3.给定一个整型数组，数组成员10个,求该数组中第二大的数的下标
 * 4.B哥去参加青年歌手大奖赛,有10个评委打分,(去掉一个最高一个最低)求平均分?
 *
 */
public class ArrayInstance {
    public static void main(String[] args) {
        ArrayFun1();
        ArrayFun3();
    }

    //1.定义一个函数，获取某个数组中的最小值
    private static void ArrayFun1() {
        int[] ints ={3,5,1,2,9};
        int tmp=ints[0];
        for (int i=0;i<ints.length;i++){
            if(tmp>ints[i]){
                tmp=ints[i];
            }
        }
        System.out.println(tmp);
    }

    //3.给定一个整型数组，数组成员10个,求该数组中第二大的数的下标
    private static void ArrayFun3() {
        int[] ints={3,5,1,2,9};
        int tmp2;
        int tmp1;
        int tmp1index;
        int tmp2index;
        for (int j=0;j<ints.length;j++){

        }
    }





}

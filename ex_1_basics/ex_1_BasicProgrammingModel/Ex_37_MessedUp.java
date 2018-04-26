package ex_1_basics.ex_1_BasicProgrammingModel;

import StdLib.StdRandom;

public class Ex_37_MessedUp {



    public static void main(String[] args) {

        Ex_11_TwoDimensionBooleanArray.printArray(shuffleTest(10, 500));

    }


    //随机将double数组中的元素排序
    public static void shuffle (double[] a) {
        int N = a.length;
        for (int i = 0; i<N; i++){
            //将a[i]和a[0..N-1] 中任意一个元素交换
            int r =StdRandom.uniform(N );
            double temp = a[i];
            a[i] = a [r];
            a[r] = temp;
        }
    }


    public static int[][] shuffleTest(int m, int n) {
        double[] a = new double[m];
        int[][] b = new int[m][m];
        //打乱
        for (int i = 0; i<n; i++){
            //数值初始化
            for (int j = 0; j< m; j++){
                a[j] = j;
            }
            shuffle(a);

            for (int j=0; j< m; j++) {
                b[(int)(a[j])][j]++;
            }
        }
        return b;
    }






}

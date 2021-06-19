package joker;

import java.util.ArrayList;
import java.util.Arrays;
public class main {
    static int k=1;
    static ArrayList<String> append=new ArrayList<String>();
    public static void create(int[] M,int[] S,String att,String att2){
        ArrayList arrayList=new ArrayList(Arrays.asList(att.split(",")));
        ArrayList arrayList2=new ArrayList(Arrays.asList(att2.split(",")));
        int le;
        le=arrayList.size();
        int i=0;
        int number=0;
        System.out.printf("%d\n",Integer.parseInt(arrayList.get(0).toString()));
        while(number<le)//将文本框中的数据录入到螺钉螺母的数组之中
        {

            M[i]=Integer.parseInt(arrayList.get(0).toString());
            arrayList.remove(0);
            S[i]=Integer.parseInt(arrayList2.get(0).toString());
            arrayList2.remove(0);
            number++;
            i++;
        }
    }
    public static void quickSort(int[] M,int[] S,int left,int right){//快速排序对螺钉螺母数组进行处理
        if(left>=right)
            return;
        int number=1;
        number=k;
       System.out.println("第"+(k++)+"次排序");
        append.add("第" +number+"次排序\n");
        int flag=partition(S,left,right,M[left]);//找到分割数组的参考点
        partition(M,left,right,S[flag]);
        System.out.println("螺母此时的顺序为"+Arrays.toString(M));
        append.add("螺母此时的顺序为"+Arrays.toString(M)+"\n");
        System.out.println("螺钉此时的顺序为"+Arrays.toString(S));
        append.add("螺钉此时的顺序为"+Arrays.toString(S)+"\n");
        quickSort(M,S,left,flag-1);
        quickSort(M,S,flag+1,right);
    }
    public static int partition(int[] num,int left,int right,int flag){
        if (left>=right)//两个指针交叉或相等
            return left;
        int i=left,j=left;
        while (j<right)
        {
            if(num[j]<flag)
            {
                swap(num,i,j);
                i++;
            }
            else if(num[j]==flag)
            {
                swap(num,j,right);
                continue;
            }
            j++;
        }
        swap(num,i,j);
        return i;
    }
    public static void swap(int[] num, int i, int j){//交换数据函数
        int temp=num[i];
        num[i]=num[j];
        num[j]=temp;
    }
    public static void dothis(String att,String att2){//函数调用接口
        ArrayList arrayList=new ArrayList(Arrays.asList(att.split(",")));
        int le=arrayList.size();
        int M[]= new int[le];
        int S[]=new int[le];
        create(M,S,att,att2);
        quickSort(M,S,0,S.length-1);
    }
}

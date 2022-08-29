import java.util.*;
class MiniMax{
    static void minimax(int a[]){
        int i,j;
        int b[]=new int[5];
        int min=0,max=0;
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length;j++){
                if(i==j){
                    continue;
                }
                // if(j==a.length){
                //     break;
                // }
                // b[i]=a[j]+a[j+1];
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
        // for(i=0;i<b.length;i++){
        //     if(b[i]<b[i+1]){
        //         min=b[i];
        //     }
        //     else{
        //         max=b[i];
        //     }

        // }
        System.out.println(min+" "+max);
    }
    public static void main(String args[]){
        int a[]=new int[5];
        Scanner scan=new Scanner(System.in);
        System.out.println(a.length);
        for(int i=0;i<a.length;i++){
            a[i]=scan.nextInt();
        }
        minimax(a);
    }
}
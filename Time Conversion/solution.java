
import java.util.*;
class Solution{
    // void timeConverter(String str[]){
    //     // int i;
        
    // }
    public static void main(String args[]){
        
        // Solution sol=new Solution();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the time:");
        String str[]=new String[100];
        for(int i=0;i<10;i++){
            System.out.print(i+":");
            str[i]=scan.next();
        }
        int n=str.length;
        if(str[8]=="A" && str[9]=="M"){
            System.out.println("Traversing AM code...");
            if(str[0]=="1" && str[1]=="2"){
                str[0]="0";
                str[1]="0";
                for(int i=0;i<8;i++){
                    System.out.print(str[i]);
                }
            }
        }
        if(str[n-2]=="P" && str[n-1]=="M"){
            if(str[0]=="0" && str[1]=="1"){
                str[0]="1";
                str[1]="3";
            }
            else if(str[0]=="0" && str[1]=="2"){
                str[0]="1";
                str[1]="4";
            }
            else if(str[0]=="0" && str[1]=="3"){
                str[0]="1";
                str[1]="5";
            }
            else if(str[0]=="0" && str[1]=="4"){
                str[0]="1";
                str[1]="6";
            }
            else if(str[0]=="0" && str[1]=="5"){
                str[0]="1";
                str[1]="7";
            }
            else if(str[0]=="0" && str[1]=="6"){
                str[0]="1";
                str[1]="8";
            }
            else if(str[0]=="0" && str[1]=="7"){
                str[0]="1";
                str[1]="9";
            }
            else if(str[0]=="0" && str[1]=="8"){
                str[0]="2";
                str[1]="0";
            }
            else if(str[0]=="0" && str[1]=="9"){
                str[0]="2";
                str[1]="1";
            }
            else if(str[0]=="1" && str[1]=="0"){
                str[0]="2";
                str[1]="2";
            }
            else if(str[0]=="1" && str[1]=="1"){
                str[0]="2";
                str[1]="3";
            }
            // else{

            // }
        }
        
        System.out.println();
    }
}
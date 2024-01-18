import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Array length= ?");
        int art = scan.nextInt();

        int Argo[] = new int[art];


        for(int a =0 ; a<Argo.length; a++){
            System.out.println((a+1)+". Number: ?");
            Argo[a] = scan.nextInt();
        }

        int temp = 0;

        for(int i = 0; i <Argo.length;i++){
            for(int k = i+1; k<Argo.length; k++){
                if(Argo[k]<Argo[i]){
                    temp = Argo[i];
                    Argo[i] =Argo[k];
                    Argo[k] =temp;
                }
            }
        }

        for(int ae =0 ; ae<Argo.length;ae++){
            System.out.println(Argo[ae]+ " ");
        }

    }
}
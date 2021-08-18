
public class Hello {

    public static void main(String[] args) {
        //dome();
    }

    public  void dome(){
        int i=0;
        int sum = 0;
        do{
            i++;//i = i+1
            if(i % 2 ==0){
                continue;
            }
            if(i==7){
                break;
            }
            sum = sum +i;

        }while(i<=10);
        System.out.print(sum);
    }
}

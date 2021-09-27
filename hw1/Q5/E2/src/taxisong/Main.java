package taxisong;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "A2bb2d4";
        int[]judge = new int[str.length()];
        for(int i = 0 ; i < str.length() ; i++){
            if(!Character.isDigit(str.charAt(i))){
                judge[i] = 0;
            }else{
                judge[i] = 1;
            }
        }

        int count = 0;
        for(int j = 0 ; j < str.length() - 1 ; j++){
            if(judge[j] == judge[j + 1]){
                count = count + 1;
            }
        }

        if(count == 0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}

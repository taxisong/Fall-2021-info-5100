package taxisong;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[]arr1 = {"practice","makes","prefect","coding","makes"};
        String word11 = "coding";
        String word21 = "practice";//Example 1

        String[]arr2 = {"practice","makes","prefect","coding","makes"};
        String word12 = "makes";
        String word22 = "coding";//Example 2

        System.out.println(Distance(arr1,word11,word21));
        System.out.println(Distance(arr2,word12,word22));
    }

    public  static int Distance(String[]WordsDict , String word1 , String word2){
        int distance = WordsDict.length;
        int a = 0;
        int b = 0;
        for(int i = 0 ; i < WordsDict.length ; i++){
            for(int j = 0 ; j < WordsDict.length ; j++){
                if(word1 == WordsDict[i]){
                    a = i;
                }
                if(word2 == WordsDict[j]){
                    b = j;
            }
                int different = Math.abs(a - b);
                if(different < distance && different != 0){
                    distance = different;
                }
            }
        }

        return distance;
    }
}

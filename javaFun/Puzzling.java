import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava{
    static Random rnd = new Random();

    public static int[] sumNums(){
        int sum   = 0;
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> arrList = new ArrayList<>();
        int[] newArr;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > 10){
                arrList.add(arr[i]);
            }
            sum += arr[i];
        }
        System.out.println("Sum: "+sum);
        newArr = new int[arrList.size()];

        for(int i=0;i<arrList.size();i++){newArr[i] = arrList.get(i);}

        return newArr;
    }

    public static String[] shuffleArr(){
        String[] names = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        int rndNum = rnd.nextInt();
        String tmp;
        ArrayList<String> arrList = new ArrayList<>();
        String[] newArr;

        for(int i=0;i<names.length;i++){
            if(names[i].length() > 5){
                arrList.add(names[i]);
            }

            rndNum = rnd.nextInt(names.length);
            tmp = names[i];
            names[i] = names[rndNum];
            names[rndNum] = tmp;
            System.out.println(names[i]);
        }
        newArr = new String[arrList.size()];

        for(int i=0;i<arrList.size();i++){newArr[i] = arrList.get(i);}

        return newArr;
    }

    public static void doAlphabet(){
        int rndNum;
        char tmp;
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] vowel = {'a','e','i','o','u'};

        for(int i=0;i<alphabet.length;i++){
            rndNum = rnd.nextInt(alphabet.length);
            tmp = alphabet[i];
            alphabet[i] = alphabet[rndNum];
            alphabet[rndNum] = tmp;
        }
        System.out.println("Last Char: "+alphabet[alphabet.length-1]);

        for(int i=0;i<vowel.length;i++){
            if(alphabet[0] == vowel[i]){
                System.out.println("Its a vowel!");
                break;
            }
        }
        System.out.println("First Char: "+alphabet[0]);
    }

    public static int[] randArr(){
        int[] arr = new int[10];

        for(int i=0;i<10;i++){
            arr[i] = rnd.nextInt(45)+55;
        }

        return arr;
    }

    public static int[] sortRandArr(){
        int[] arr = new int[10];

        for(int i=0;i<10;i++){
            arr[i] = rnd.nextInt(45)+55;
        }

        int tmp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                try{
                    if(arr[j] > arr[j+1]){
                        tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;
                        j--;// Step back an index for further comparison.
                    }
                }catch(ArrayIndexOutOfBoundsException e){
                    arr[i] = arr[i];
                }
            }
        }

        return arr;
    }

    public static String randStr(){
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String randStr = "";

        for(int i=0;i<5;i++){
            randStr += alphabet[rnd.nextInt(alphabet.length)];
        }
        return randStr;
    }

    public static String[] randStrArr(){
        String[] arr = new String[10];

        for(int i=0;i<arr.length;i++){
            arr[i] = randStr();
        }
        return arr;
    }

    public static void main(String[] args){
        // int[] arr = sumNums();
    
        // String[] arr = shuffleArr();
    
        //doAlphabet();
    
        //int[] arr = randArr();
        
        //int[] arr = sortRandArr();

        //String str = randStr();

        //String[] strArr = randStrArr();
    }
}
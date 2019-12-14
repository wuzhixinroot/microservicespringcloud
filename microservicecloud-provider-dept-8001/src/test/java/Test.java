import java.util.*;

/**
 * @author wuzhixin
 * @date 2019/12/5 13:15
 * @desc
 */
public class Test {
    public static void main(String[] args) {

        //Stack <Integer> numbers = new Stack<>();
        //Stack <String> strs= new Stack<>();
        Queue <Integer> numbers = new ArrayDeque<>();
        Map <Integer,String>map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = new char[str.length()];

        for(int i= 0;i<str.length();i++){
            ch[i]=str.charAt(i);
            if(ch[i]-'0'>1&&ch[i]-'0'<9){
            //    numbers.push(ch[i]-'0');
            }

        }






    }

    public static void  print(char ch[],Map map){


        for(int i=0;i<ch.length;i++){
            if(ch[i]-'0'>1&&ch[i]-'0'<=9){
                map.put(ch[i]-'0',null);
                continue;
            }
            if((ch[i]+"").equals("[")){
                continue;

            }




        }


    }

}

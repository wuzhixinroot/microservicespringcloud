/**
 * @author wuzhixin
 * @date 2019/12/12 16:29
 * @desc
 */
public class Test {
    public static void main(String[] args) {
        String str = "awgewgewgw";
        int arr [] = new int[26];
        char ch[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i]=str.charAt(i);
        }

       // System.out.println('b'-'0');
        System.out.println(get(ch,arr));
    }

    public static re get(char ch[],int arr[]){
        for(int i=0;i<ch.length;i++){
            arr[ch[i]-'0'-49]++;
        }
        int index=0;
        int max = 0;
        for(int i=0;i<arr.length;i++){

            if(max<arr[i]){
                max=arr[i];
                index=i;
            }
        }
        return new re((char)(index+'0'+49),max);
    }
}

class re{
    private char ch;
    private int num;

    re(char ch,int num){
       this.ch=ch;
       this.num=num;
    }

    @Override
    public String toString() {
        return "re{" +
                "ch=" + ch +
                ", num=" + num +
                '}';
    }
}

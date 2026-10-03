public class reversestring{
    public static void main(String[] args) {
        String str="Helloworld";
      char[]chArr=  str.toCharArray();
      for(int i=chArr.length-1;i>=0;i--){
        System.out.print(chArr[i]);
      }
    }
}
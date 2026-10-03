public class constsVowels {
    public static void main(String[] args) {
        String str="JavaProgramming";
        int constant=0;
        int vowels=0;
        for(int i=0;i<str.length();i++){
        char ch=  Character.toLowerCase(str.charAt(i));

        if(ch>='a' && ch<='z'){
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u')
                vowels++;
            else
                constant++;
             
            }
        }
            System.out.println("Vowels:"+vowels);
             System.out.println("constant:"+constant);
        }
        }



import java.util.*;
public class Anagramstring {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            HashMap<Character, Integer> m1=new HashMap<>();
            HashMap<Character, Integer> m2=new HashMap<>();
            if(s1.length()!=s2.length()){
                System.out.println("Not anagram");
            }else{
                for(char ch : s1.toCharArray()){
                    m1.put(ch, m1.getOrDefault(ch, 0) + 1);
                }
                for(char ch : s2.toCharArray()){
                    m2.put(ch, m2.getOrDefault(ch, 0) + 1);
                }
                if(m1.equals(m2)){
                    System.out.println("Anagram");
                }else{
                    System.out.println("Not Anagram");
                }
            }
        }
    }

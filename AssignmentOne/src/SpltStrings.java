import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SplitStrings {
    public static void main(String[] args) throws IOException {

        BufferedReader myBr = new BufferedReader(new FileReader("le.txt"));
        String str = myBr.readLine();
        String specialCharacters=" !#$%&'()*+,-./:;<=>?@[]^_`{|}";
        while(str != null) {
            String[] split = str.split(" ");
            for(int i = 0 ; i < split.length ; i++) {
                String lex = split[i];
                int count = 0;
                while(count < lex.length()) {
                    if(specialCharacters.contains(Character.toString(lex.charAt(count)))) {
                        if(!specialCharacters.contains(Character.toString(lex.charAt(count-1)))){
                            System.out.println();
                        }

                        System.out.println(lex.charAt(count));
                    }
                    else{
                        System.out.print(lex.charAt(count));
                    }
                    count++;
                }
                System.out.println();
            }
            str = myBr.readLine();
        }
    }
}
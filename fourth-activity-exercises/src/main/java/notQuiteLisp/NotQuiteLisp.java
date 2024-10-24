package notQuiteLisp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NotQuiteLisp {
    // Santa is trying to deliver presents in a large apartment building, but he
    // can't find the right floor - the directions he got are a little confusing.
    // He starts on the ground floor (floor 0) and then follows the instructions one
    // character at a time.
    //
    // An opening parenthesis, '(', means he should go up one floor, and a closing
    // parenthesis, ')', means he should go down one floor.
    //
    // The apartment building is very tall, and the basement is very deep; Santa
    // will never find the top or bottom floors.
    //
    // Examples:
    // - "(())" and "()()" both result in floor 0.
    // - "(((" and "(()(()(" both result in floor 3.
    // - "))(((((" also results in floor 3.
    // - "())" and "))(" both result in floor -1 (the first basement level).
    // - ")))" and ")())())" both result in floor -3.
    //
    // Write a method to determine the floor to which the instructions take Santa.
    public static int getResultPartA(String fileName){
        
        BufferedReader reader;

        String x = fileName;

        int y = 0;

        String line = "";
        
        String z = "";
        

        try{

            reader = new BufferedReader(new FileReader(x));

            
            while(line != null){


            
                line = reader.readLine();
                
                if(line == null){

                    break;

                }

                for(int i = 0; i < line.length(); i++ ){


                    z = String.valueOf(line.charAt(i));

                    if(z.equals("(")){

                        y++;
    
                    }
    
                    if(z.equals(")")){
    
                        y--;
    
                    }
                

                    

            }

            
            

        }
    
        } catch (IOException e) {

            e.printStackTrace();


        }

        return y;

    }

    // Now, given the same instructions, find the position of the first character that causes Santa to enter the basement (floor -1).
    // The first character in the instructions has position 1, the second character has position 2, and so on.
    //
    // Examples:
    // - ')' causes him to enter the basement at character position 1.
    // - '()())' causes him to enter the basement at character position 5.
    //
    // Write a method to determine the position of the character that causes Santa to first enter the basement.
    public static int getResultPartB(String fileName){
       

        BufferedReader reader;

        String x = fileName;

        int y = 0;

        String line = "";
        
        String z = "";
        

        try{

            reader = new BufferedReader(new FileReader(x));

            
            while(line != null){


            
                line = reader.readLine();
                
                if(line == null){

                    break;

                }

                for(int i = 0; i < line.length(); i++ ){


                    z = String.valueOf(line.charAt(i));

                    if(z.equals("(")){

                        y++;
    
                    }
    
                    if(z.equals(")")){
    
                        y--;
    
                    }

                    if(y == -1){

                        y = i+1;

                        break;

                    }
                

                    

            }

            
            

        }
    
        } catch (IOException e) {

            e.printStackTrace();


        }

        return y;

    }
}

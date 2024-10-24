package iWasToldThereWouldBeNoMath;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IWasToldThereWouldBeNoMath {
    // --- I Was Told There Would Be No Math ---
    //
    // The elves are running low on wrapping paper, and they need to submit an order
    // for more.
    // They have a list of the dimensions (length l, width w, and height h) of each
    // present, and only want to order exactly as much as they need.
    //
    // Fortunately, every present is a box (a perfect right rectangular prism),
    // which makes calculating the required wrapping paper for each gift a little
    // easier.
    // To find the required wrapping paper for each present, calculate the surface
    // area of the box using the formula:
    // 2*l*w + 2*w*h + 2*h*l.
    //
    // The elves also need a little extra paper for each present: the area of the
    // smallest side.
    //
    // Example:
    // - A present with dimensions 2x3x4 requires 2*6 + 2*12 + 2*8 = 52 square feet
    // of wrapping paper, plus 6 square feet of slack, for a total of 58 square
    // feet.
    // - A present with dimensions 1x1x10 requires 2*1 + 2*10 + 2*10 = 42 square
    // feet of wrapping paper, plus 1 square foot of slack, for a total of 43 square
    // feet.
    //
    // All numbers in the elves' list are in feet.
    //
    // Write a method to calculate how many total square feet of wrapping paper the
    // elves should order.

    public static int getResultPartA(String fileName){
       

        BufferedReader reader;

        String x = fileName;

        int y = 0;

        String line = "";
        
        String z = "";
        
        int l = 0;

        int w = 0;

        int h = 0;

        int a = 0;

        int r = 0;

        int contador = 0;

        int areaPequeña = 0;

        int areaTotal;

        int acumulador = 0;

        int m;

        try{

            reader = new BufferedReader(new FileReader(x));

            
            while(line != null){


            
                line = reader.readLine();
                
                if(line == null){

                    break;

                }

                contador = 0;

                m = line.length()-1;

                for(int i = 0; i < line.length(); i++ ){


                    z = String.valueOf(line.charAt(i));

                    if(z.equals("x")){

                        contador++;

                        if(contador == 1){ 


                            l = y + r;

                        }

                        if(contador == 2){ 


                            w = y + r;

                        }


                        a = 0;
                        y = 0;
                        r = 0;

                        continue;
                    }

                       
                        a = Integer.parseInt(z);

                        y = y * 10;
                        
                        r = y;

                        y = a;

                        if((i) == m){ 


                            h = y + r;

                            a = 0;
                            y = 0;
                            r = 0;

                        }
    
                    }            

           areaTotal =  2*l*w + 2*w*h + 2*h*l;

           if(l*w <= w*h && l*w <= h*l){

            areaPequeña = l*w;
            
           }

           if(w*h <= l*h && h*w <= w*l){

            areaPequeña = h*w;
            
           }

           if(l*h <= w*h && l*h <= l*w){

            areaPequeña = l*h;
            
           }

           areaTotal = areaTotal + areaPequeña;

           acumulador = acumulador + areaTotal;
        }
    
        } catch (IOException e) {

            e.printStackTrace();


        }

        return acumulador;


    }

    // The elves are also running low on ribbon. Ribbon is all the same width, so
    // they only need to worry about the length they need to order,
    // and they would like this length to be exact.
    //
    // The ribbon required to wrap a present is the shortest distance around its
    // sides, or the smallest perimeter of any one face.
    // Each present also requires a bow made out of ribbon; the feet of ribbon
    // required for the perfect bow is equal to the cubic feet of volume of the
    // present.
    //
    // Example:
    // - A present with dimensions 2x3x4 requires 2+2+3+3 = 10 feet of ribbon to
    // wrap the present, plus 2*3*4 = 24 feet of ribbon for the bow,
    // for a total of 34 feet.
    // - A present with dimensions 1x1x10 requires 1+1+1+1 = 4 feet of ribbon to
    // wrap the present, plus 1*1*10 = 10 feet of ribbon for the bow,
    // for a total of 14 feet.
    //
    // Write a method to calculate how many total feet of ribbon the elves should
    // order.
    public static int getResultPartB(String fileName) {
       
        BufferedReader reader;

        String x = fileName;

        int y = 0;

        String line = "";
        
        String z = "";
        
        int l = 0;

        int w = 0;

        int h = 0;

        int a = 0;

        int r = 0;

        int contador = 0;

        int areaPequeña = 0;

        int areaTotal;

        int acumulador = 0;

        int m;

        int perimetro = 0;

        int ribbonArea = 0;

        try{

            reader = new BufferedReader(new FileReader(x));

            
            while(line != null){


            
                line = reader.readLine();
                
                if(line == null){

                    break;

                }

                contador = 0;

                m = line.length()-1;

                for(int i = 0; i < line.length(); i++ ){


                    z = String.valueOf(line.charAt(i));

                    if(z.equals("x")){

                        contador++;

                        if(contador == 1){ 


                            l = y + r;

                        }

                        if(contador == 2){ 


                            w = y + r;

                        }


                        a = 0;
                        y = 0;
                        r = 0;

                        continue;
                    }

                       
                        a = Integer.parseInt(z);

                        y = y * 10;
                        
                        r = y;

                        y = a;

                        if((i) == m){ 


                            h = y + r;

                            a = 0;
                            y = 0;
                            r = 0;

                        }
    
                    }            

           areaTotal =  2*l*w + 2*w*h + 2*h*l;

           if(l*w <= w*h && l*w <= h*l){

            areaPequeña = l*w;

            perimetro = 2 * l + 2 * w;
            
           }

           if(w*h <= l*h && h*w <= w*l){

            areaPequeña = h*w;

            perimetro = 2 * w + 2 * h;
            

           }

           if(l*h <= w*h && l*h <= l*w){

            areaPequeña = l*h;

            perimetro = 2 * h + 2 * l;
            
           }

           ribbonArea = perimetro + (w*h*l);

           areaTotal = areaTotal + areaPequeña;

           acumulador = acumulador + ribbonArea;

        }
    
        } catch (IOException e) {

            e.printStackTrace();


        }

        return acumulador;



    }
}

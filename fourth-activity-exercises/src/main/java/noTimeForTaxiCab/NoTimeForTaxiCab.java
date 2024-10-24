package noTimeForTaxiCab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class NoTimeForTaxiCab {
    // You're airdropped near Easter Bunny Headquarters in a city somewhere. "Near",
    // unfortunately, is as close as you can get.
    // The instructions on the Easter Bunny Recruiting Document the Elves
    // intercepted start here, and nobody had time to work them out further.
    //
    // The Document indicates that you should start at the given coordinates (where
    // you just landed) and face North.
    // Then, follow the provided sequence: either turn left (L) or right (R) 90
    // degrees, then walk forward the given number of blocks,
    // ending at a new intersection.
    //
    // There's no time to follow such instructions on foot, so you take a moment and
    // work out the destination.
    // Given that you can only walk on the street grid of the city, how far is the
    // shortest path to the destination?
    //
    // For more info of the street grid of the city: https://en.wikipedia.org/wiki/Taxicab_geometry
    //
    // Example:
    // - Following R2, L3 leaves you 2 blocks East and 3 blocks North, or 5 blocks
    // away.
    // - R2, R2, R2 leaves you 2 blocks due South of your starting position, which
    // is 2 blocks away.
    // - R5, L5, R5, R3 leaves you 12 blocks away.
    //
    // Write a method to calculate how many blocks away Easter Bunny HQ is.
    public static int getResultPartA(String fileName){

      
        BufferedReader reader;

        String x = fileName;

        String line = "";

        boolean isXDistance = true;

        boolean isEast = false;

        boolean isNorth = true;

        int XDistance = 0;

        int YDistance = 0;

        String Direction = "";

        String HowFar = "";
        
        try{

            reader = new BufferedReader(new FileReader(x));

            
            while(line != null){

                line = reader.readLine();
                
                if(line == null){

                    break;

                }

                line.trim();
                String [] str = line.split(",");
                

                for(int i = 0; i < str.length; i++ ){

                    Direction = str[i].trim().substring(0, 1);
                    HowFar = str[i].trim().substring(1);

                    //Mirando hacia arriba + elige ir a la derecha

                    if(isXDistance == true && isNorth == true && Direction.equals("R")){


                        XDistance+= Integer.parseInt(HowFar);

                        isXDistance = false;

                        isNorth = false;

                        isEast = true;

                        continue;


                    }

                    
                    //Mirando hacia arriba + elige ir a la izquierda
                    
                    if(isXDistance == true && isNorth == true && Direction.equals("L")){


                        XDistance-= Integer.parseInt(HowFar);

                        isXDistance = false;

                        isNorth = false;

                        isEast = false;

                        
                        continue;


                    }

                    
                    //Mirando hacia abajo + elige ir a la derecha

                    if(isXDistance == true && isNorth == false && Direction.equals("R")){


                        XDistance-= Integer.parseInt(HowFar);


                        isXDistance = false;

                        isNorth = false;

                        isEast = false;

                        
                        continue;


                    }

                    
                    //Mirando hacia abajo + elige ir a la izquierda
                    
                    if(isXDistance == true && isNorth == false && Direction.equals("L")){


                        XDistance+= Integer.parseInt(HowFar);


                        isXDistance = false;

                        isNorth = false;

                        isEast = true;

                        
                        continue;


                    }
                    
                    //Mirando hacia el oeste + elige ir a la derecha

                    if(isXDistance == false && isEast == false && Direction.equals("R")){


                        YDistance+= Integer.parseInt(HowFar);


                        isXDistance = true;

                        isNorth = true;

                        isEast = false;
                        
                        continue;


                    }

                    
                    //Mirando hacia el oeste + elige ir a la izquierda

                    if(isXDistance == false && isEast == false && Direction.equals("L")){


                        YDistance-= Integer.parseInt(HowFar);


                        isXDistance = true;

                        isNorth = false;

                        isEast = false;
                        
                        continue;


                    }

                    
                    //Mirando hacia el este + elige ir a la derecha

                    if(isXDistance == false && isEast == true && Direction.equals("R")){


                        YDistance-= Integer.parseInt(HowFar);


                        isXDistance = true;

                        isNorth = false;

                        isEast = false;
                        
                        continue;


                    }

                    
                    //Mirando hacia el oeste + elige ir a la izquierda

                    if(isXDistance == false && isEast == true && Direction.equals("L")){


                        YDistance+= Integer.parseInt(HowFar);


                        isXDistance = true;

                        isNorth = true;

                        isEast = false;
                        
                        continue;


                    }
                 

                    
                }
    
                }


            }

            

            catch (IOException e) {

                e.printStackTrace();
    
    
            }
            

            return Math.abs(YDistance + XDistance);

        
        
        
    }

    // --- Part Two ---
    //
    // Then, you notice the instructions continue on the back of the Recruiting
    // Document.
    // Easter Bunny HQ is actually at the first location you visit twice.
    //
    // Example:
    // - If your instructions are R8, R4, R4, R8, the first location you visit twice
    // is 4 blocks away, due East.
    //
    // Write a method to calculate how many blocks away the first location you visit
    // twice is.

    public static int HashMapFunction(String CombinedPositions){


        return 0;

    }


    public static int getResultPartB(String fileName){

        BufferedReader reader;

        String x = fileName;

        String line = "";

        boolean isXDistance = true;

        boolean isEast = false;

        boolean isNorth = true;

        int XDistance = 0;

        int YDistance = 0;

        String Direction = "";

        String HowFar = "";

        int HashMapCounter = 0;

        String value = "";

        int counter = 0;

        HashMap<Integer,String> yipeee = new HashMap<>();

        yipeee.put(HashMapCounter, "00");
        
        try{

            reader = new BufferedReader(new FileReader(x));

            
            while(line != null){

                line = reader.readLine();
                
                if(line == null){

                    break;

                }

                line.trim();
                String [] str = line.split(",");
                

                for(int i = 0; i < str.length; i++ ){

                    Direction = str[i].trim().substring(0, 1);
                    HowFar = str[i].trim().substring(1);

                    //Mirando hacia arriba + elige ir a la derecha

                    if(isXDistance == true && isNorth == true && Direction.equals("R")){


                        for(int l = 1; l<Integer.parseInt(HowFar); l++){


                            XDistance++;

                            HashMapCounter++;

                            yipeee.put(HashMapCounter, (String.valueOf(XDistance) + String.valueOf(YDistance)));

                            for(int m = 0; m <= HashMapCounter; m++){

                               if((String.valueOf(XDistance) + String.valueOf(YDistance)).equals(value)){

                                return Math.abs(XDistance + YDistance);

                               }

                               value = yipeee.get(m);

                            }


                        }

                        isXDistance = false;

                        isNorth = false;

                        isEast = true;

                        continue;


                    }

                    
                    //Mirando hacia arriba + elige ir a la izquierda
                    
                    if(isXDistance == true && isNorth == true && Direction.equals("L")){


                        for(int l = 1; l<Integer.parseInt(HowFar); l++){


                            XDistance--;

                            HashMapCounter++;

                            yipeee.put(HashMapCounter, (String.valueOf(XDistance) + String.valueOf(YDistance)));

                            for(int m = 0; m <= HashMapCounter; m++){

                               if((String.valueOf(XDistance) + String.valueOf(YDistance)).equals(value)){

                                return Math.abs(XDistance + YDistance);

                               }

                               value = yipeee.get(m);

                            }


                        }

                        isXDistance = false;

                        isNorth = false;

                        isEast = false;

                        
                        continue;


                    }

                    
                    //Mirando hacia abajo + elige ir a la derecha

                    if(isXDistance == true && isNorth == false && Direction.equals("R")){


                        for(int l = 1; l<Integer.parseInt(HowFar); l++){


                            XDistance--;

                            HashMapCounter++;

                            yipeee.put(HashMapCounter, (String.valueOf(XDistance) + String.valueOf(YDistance)));

                            for(int m = 0; m <= HashMapCounter; m++){

                               if((String.valueOf(XDistance) + String.valueOf(YDistance)).equals(value)){

                                return Math.abs(XDistance + YDistance);

                               }

                               value = yipeee.get(m);

                            }


                        }


                        isXDistance = false;

                        isNorth = false;

                        isEast = false;

                        
                        continue;


                    }

                    
                    //Mirando hacia abajo + elige ir a la izquierda
                    
                    if(isXDistance == true && isNorth == false && Direction.equals("L")){


                        for(int l = 1; l<Integer.parseInt(HowFar); l++){


                            XDistance++;

                            HashMapCounter++;

                            yipeee.put(HashMapCounter, (String.valueOf(XDistance) + String.valueOf(YDistance)));

                            for(int m = 0; m <= HashMapCounter; m++){

                            
                               

                               if((String.valueOf(XDistance) + String.valueOf(YDistance)).equals(value)){

                                return Math.abs(XDistance + YDistance);

                               }

                               value = yipeee.get(m);

                            }


                        }


                        isXDistance = false;

                        isNorth = false;

                        isEast = true;

                        
                        continue;


                    }
                    
                    //Mirando hacia el oeste + elige ir a la derecha

                    if(isXDistance == false && isEast == false && Direction.equals("R")){


                        for(int l = 1; l<Integer.parseInt(HowFar); l++){


                            YDistance++;

                            HashMapCounter++;

                            yipeee.put(HashMapCounter, (String.valueOf(XDistance) + String.valueOf(YDistance)));

                            for(int m = 0; m <= HashMapCounter; m++){

                            
                               

                               if((String.valueOf(XDistance) + String.valueOf(YDistance)).equals(value)){

                                return Math.abs(XDistance + YDistance);

                               }

                               value = yipeee.get(m);

                            }


                        }


                        isXDistance = true;

                        isNorth = true;

                        isEast = false;
                        
                        continue;


                    }

                    
                    //Mirando hacia el oeste + elige ir a la izquierda

                    if(isXDistance == false && isEast == false && Direction.equals("L")){


                        for(int l = 1; l<Integer.parseInt(HowFar); l++){


                            YDistance--;

                            HashMapCounter++;

                            yipeee.put(HashMapCounter, (String.valueOf(XDistance) + String.valueOf(YDistance)));

                            for(int m = 0; m <= HashMapCounter; m++){

                            
                               

                               if((String.valueOf(XDistance) + String.valueOf(YDistance)).equals(value)){

                                return Math.abs(XDistance + YDistance);

                               }

                               value = yipeee.get(m);

                            }


                        }


                        isXDistance = true;

                        isNorth = false;

                        isEast = false;
                        
                        continue;


                    }

                    
                    //Mirando hacia el este + elige ir a la derecha

                    if(isXDistance == false && isEast == true && Direction.equals("R")){


                        for(int l = 1; l<Integer.parseInt(HowFar); l++){


                            YDistance--;

                            HashMapCounter++;

                            yipeee.put(HashMapCounter, (String.valueOf(XDistance) + String.valueOf(YDistance)));

                            for(int m = 0; m <= HashMapCounter; m++){

                            
                               

                               if((String.valueOf(XDistance) + String.valueOf(YDistance)).equals(value)){

                                return Math.abs(XDistance + YDistance);

                               }

                               value = yipeee.get(m);

                            }


                        }


                        isXDistance = true;

                        isNorth = false;

                        isEast = false;
                        
                        continue;


                    }

                    
                    //Mirando hacia el oeste + elige ir a la izquierda

                    if(isXDistance == false && isEast == true && Direction.equals("L")){


                        for(int l = 1; l<Integer.parseInt(HowFar); l++){


                            YDistance++;

                            HashMapCounter++;

                            yipeee.put(HashMapCounter, (String.valueOf(XDistance) + String.valueOf(YDistance)));

                            for(int m = 0; m <= HashMapCounter; m++){

                            
                               

                               if((String.valueOf(XDistance) + String.valueOf(YDistance)).equals(value)){

                                return Math.abs(XDistance + YDistance);

                               }

                               value = yipeee.get(m);

                            }


                        }


                        isXDistance = true;

                        isNorth = true;

                        isEast = false;
                        
                        continue;


                    }
                 

                    
                }
    
                }


            }

            

            catch (IOException e) {

                e.printStackTrace();
    
    
            }
            

            return Math.abs(YDistance + XDistance);

        
        
        
    }
    }



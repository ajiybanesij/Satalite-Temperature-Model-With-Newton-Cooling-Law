package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        satalite_Surface surface  =new satalite_Surface(1,25  ,55 ,12 , (float)0.10,0,0);
        satalite_Surface surface2 =new satalite_Surface(2,85  ,128,0  , (float)0.20,0,0);
        satalite_Surface surface3 =new satalite_Surface(3,33  ,100,5  , (float)0.04,0,0);
        satalite_Surface surface4 =new satalite_Surface(4,2   ,20 ,10 , (float)0.10,0,0);
        satalite_Surface surface5 =new satalite_Surface(5,48  ,55 ,40 , (float)0.20,0,0);
        satalite_Surface surface6 =new satalite_Surface(6,20 , 120,0  , (float)0.04,0,0);

        int frequency=1;
        float array[]=new float[4];

        String Surface1_Temp_Path  =("Satalite Surface 1 Temp.txt");
        String Surface1_Heater_Path=("Satalite Surface 1 Heater.txt");
        PrintStream Surface1_Temp_Writer   = new PrintStream(Surface1_Temp_Path);
        PrintStream Surface1_Heater_Writer = new PrintStream(Surface1_Heater_Path);

        String Surface2_Temp_Path  =("Satalite Surface 2 Temp.txt");
        String Surface2_Heater_Path=("Satalite Surface 2 Heater.txt");
        PrintStream Surface2_Temp_Writer   = new PrintStream(Surface2_Temp_Path);
        PrintStream Surface2_Heater_Writer = new PrintStream(Surface2_Heater_Path);

        String Surface3_Temp_Path  =("Satalite Surface 3 Temp.txt");
        String Surface3_Heater_Path=("Satalite Surface 3 Heater.txt");
        PrintStream Surface3_Temp_Writer  = new PrintStream(Surface3_Temp_Path);
        PrintStream Surface3_Heater_Writer = new PrintStream(Surface3_Heater_Path);

        String Surface4_Temp_Path  =("Satalite Surface 4 Temp.txt");
        String Surface4_Heater_Path=("Satalite Surface 4 Heater.txt");
        PrintStream Surface4_Temp_Writer    = new PrintStream(Surface4_Temp_Path);
        PrintStream Surface4_Heater_Writer  = new PrintStream(Surface4_Heater_Path);

        String Surface5_Temp_Path  =("Satalite Surface 5 Temp.txt");
        String Surface5_Heater_Path=("Satalite Surface 5 Heater.txt");
        PrintStream Surface5_Temp_Writer   = new PrintStream(Surface5_Temp_Path);
        PrintStream Surface5_Heater_Writer = new PrintStream(Surface5_Heater_Path);

        String Surface6_Temp_Path  =("Satalite Surface 6 Temp.txt");
        String Surface6_Heater_Path=("Satalite Surface 6 Heater.txt");
        PrintStream Surface6_Temp_Writer   = new PrintStream(Surface6_Temp_Path);
        PrintStream Surface6_Heater_Writer = new PrintStream(Surface6_Heater_Path);

        int i=0;
        while (i<500){
            Service service=new Service(frequency,surface);
            array=service.proces();
            service.showMessage(array[0],array[1],array[2]);
            surface.current_Temp= (array[1]);
            surface.on_Off= (int) array[2];
            surface.Limit=  array[3];
            Surface1_Temp_Writer.println(surface.current_Temp);
            Surface1_Heater_Writer.println(surface.on_Off);


            Service service2=new Service(frequency,surface2);
            array=service2.proces();
            service2.showMessage(array[0],array[1],array[2]);
            surface2.current_Temp= array[1];
            surface2.on_Off= (int)(array[2]);
            surface2.Limit=  array[3];
            Surface2_Temp_Writer.println(surface2.current_Temp);
            Surface2_Heater_Writer.println(surface2.on_Off);


            Service service3=new Service(frequency,surface3);
            array=service3.proces();
            service3.showMessage(array[0],array[1],array[2]);
            surface3.current_Temp= (array[1]);
            surface3.on_Off= (int)(array[2]);
            surface3.Limit=  array[3];
            Surface3_Temp_Writer.println(surface3.current_Temp);
            Surface3_Heater_Writer.println(surface3.on_Off);


            Service service4=new Service(frequency,surface4);
            array=service4.proces();
            service4.showMessage(array[0],array[1],array[2]);
            surface4.current_Temp= (array[1]);
            surface4.on_Off= (int) array[2];
            surface4.Limit=  array[3];
            Surface4_Temp_Writer.println(surface4.current_Temp);
            Surface4_Heater_Writer.println(surface4.on_Off);


            Service service5=new Service(frequency,surface5);
            array=service5.proces();
            service5.showMessage(array[0],array[1],array[2]);
            surface5.current_Temp= array[1];
            surface5.on_Off= (int)(array[2]);
            surface5.Limit=  array[3];
            Surface5_Temp_Writer.println(surface5.current_Temp);
            Surface5_Heater_Writer.println(surface5.on_Off);


            Service service6=new Service(frequency,surface6);
            array=service6.proces();
            service6.showMessage(array[0],array[1],array[2]);
            surface6.current_Temp= (array[1]);
            surface6.on_Off= (int)(array[2]);
            surface6.Limit=  array[3];
            Surface6_Temp_Writer.println(surface6.current_Temp);
            Surface6_Heater_Writer.println(surface6.on_Off);


            i++;
        }

        Surface1_Temp_Writer.close();
        Surface1_Heater_Writer.close();

        Surface2_Temp_Writer.close();
        Surface2_Heater_Writer.close();

        Surface3_Temp_Writer.close();
        Surface3_Heater_Writer.close();

        Surface4_Temp_Writer.close();
        Surface4_Heater_Writer.close();

        Surface5_Temp_Writer.close();
        Surface5_Heater_Writer.close();

        Surface6_Temp_Writer.close();
        Surface6_Heater_Writer.close();

    }
}
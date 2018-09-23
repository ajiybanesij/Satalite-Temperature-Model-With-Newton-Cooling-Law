package com.company;

import java.io.*;

public class Service {
    private  satalite_Surface surface;
    private PrintStream fileWriter;
    private  int frequency;
    public  int periyot;
    private  float[] array=new float[4];


    public Service(int frequency ,satalite_Surface surface) throws InterruptedException {
       // System.out.println("Data receiving is starting...");
       // Thread.sleep(1000);
        this.frequency=frequency;
        this.periyot=(1/frequency)*1000;
        this.surface=surface;
    }


    public  void newProcess(float Limit){
        surface.new_Temp= (float) (Limit + (surface.current_Temp - Limit)*Math.exp(-surface.delta_Temp));
        surface.current_Temp= surface.new_Temp;
    }

    public void showMessage(float id,float cur_Temp,float header) throws IOException {

        if(header == 0){
            System.out.println("Satalite Surface "+id+" Current Temperature : "+cur_Temp+" Heater: Off");
        }else{
            System.out.println("Satalite Surface "+id+" Current Temperature: "+cur_Temp+" Heater: On");
        }
       // writeFile(id,cur_Temp,header);
    }

    private void writeFile(float id,float cur_Temp,float header) throws IOException {
        String path=("C:\\Users\\ajiyb\\IdeaProjects\\Temp_Model\\Satalite 3 Temp.txt");
        fileWriter = new PrintStream(path);
        fileWriter.println(cur_Temp);
        //fileWriter.flush();
        fileWriter.close();;
    }

    public float[] proces() throws InterruptedException {
        //while(true){
            newProcess(surface.Limit);
            if(surface.on_Off==0){
                //showMessage(surface.id,surface.current_Temp,surface.on_Off);
                array[0]= (surface.id);
                array[1]= (surface.current_Temp);
                array[2]= (surface.on_Off);
                array[3]= (surface.Limit);
                if(surface.current_Temp-1 <= surface.cold_Limit){
                    surface.on_Off=1;
                    surface.Limit= surface.hot_Limit;
                    array[2]= (surface.on_Off);
                    array[3]= (surface.Limit);

                }
            }else {
                //showMessage(surface.id,surface.current_Temp,surface.on_Off);
                array[0]= (surface.id);
                array[1]= (surface.current_Temp);
                array[2]= (surface.on_Off);
                array[3]= (surface.Limit);
                if(surface.current_Temp+1 >= surface.hot_Limit){
                    surface.on_Off=0;
                    surface.Limit= surface.cold_Limit;
                    array[2]= (surface.on_Off);
                    array[3]= (surface.Limit);
                }
            }
            Thread.sleep(periyot);
        //}
        return array;
    }
    }



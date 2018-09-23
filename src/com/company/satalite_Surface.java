package com.company;

public class satalite_Surface {
    public int id;
    public float new_Temp;
    public float current_Temp;
    public float delta_Temp;
    public float hot_Limit;
    public float cold_Limit;
    public int on_Off;
    public float Limit;


    public satalite_Surface(int id,float current_Temp, float hot_Limit, float cold_Limit, float delta_Temp, int on_Off,float Limit){
        this.id=id;
        this.cold_Limit=cold_Limit;
        this.current_Temp=current_Temp;
        this.hot_Limit=hot_Limit;
        this.delta_Temp=delta_Temp;
        this.on_Off=on_Off;
        this.Limit=Limit;
    }

}

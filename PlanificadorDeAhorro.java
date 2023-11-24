package com.clases;

public class PlanificadorDeAhorro {
    private float MetaAhorro=0;
    public float YaAhorrado=0;
    
    public PlanificadorDeAhorro() {
        YaAhorrado = 0;
    }
    
    public int AnalisisDeSaldo(float diferencia){
        if(diferencia >= 1000000){
            return 3000000;
        }else if(diferencia>=100000){
            return 1000000;
        }else{
            return 500000;
        }
    }
    
    public void IngresarDinero(float Cantidad){
        YaAhorrado += Cantidad;
    }
    
    public float PorcentajeHaAhorrar(){
        return (this.MetaAhorro-this.YaAhorrado);
    }
    
    public void crearMeta(float diferencia){
        this.MetaAhorro = AnalisisDeSaldo(diferencia);
    }

    public float getMetaAhorro() {
        return MetaAhorro;
    }

    public void setMetaAhorro(float MetaAhorro) {
        this.MetaAhorro = MetaAhorro;
    }

    public float getYaAhorrado() {
        return YaAhorrado;
    }

    public void setYaAhorrado(float YaAhorrado) {
        this.YaAhorrado = YaAhorrado;
    }
    
    public void ResetValores() {
        this.MetaAhorro = 0;
        this.YaAhorrado = 0;
    }
}

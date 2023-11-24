package com.clases;

public class CalculadoraYOperaciones {
    public float totalI=0,totalG=0;
    public int contI=0,contG=0;
    
    public float DiferenciaDeValores(){
        return this.totalI - this.totalG;
    }
    /*
    public void PorcentajeDeGastos(ArrayList lista){
        
    }
    
    public void PorcentajeIngresos(ArrayList lista){
        
    }
    **/
    public double CambioDeValoresIngresoMensual(){
        double Cambio=0;
        
        return Cambio;
    }
    
    public double CambioDeValoresGastosMensual(){
        double Cambio=0;
        
        return Cambio;
    }
    
    public float SumaIngresos(float valor){
        totalI += valor;
        return totalI;
    }
    
    public float SumaGastos(float valor){
        totalG += valor;
        return totalG;
    }
    
    public float deleteIngreso(float valor){
        totalI -= valor;
        return totalI;
    }
    
    public float deleteGasto(float valor){
        totalG -= valor;
        return totalG;
    }
    
    public void MasIngreso(){
        contI++;
    }
    
    public void MasGasto(){
        contG++;
    }
    
    public void MenosIngreso(){
        contI++;
    }
    
    public void MenosGasto(){
        contG--;
    }
}

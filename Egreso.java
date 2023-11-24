package com.clases;

public class Egreso extends Cuenta{
    String EntidadFinanciera;

    public Egreso(String Categoria, String MedioDePago, Boolean TipoDeCiclo, Float Magnitud, int NumCuotas, int NumRegistro, String entidad) {
        super(Categoria, MedioDePago, TipoDeCiclo, Magnitud, NumCuotas, NumRegistro);
        this.EntidadFinanciera = entidad;
    }

    public String getEntidadFinanciera() {
        return EntidadFinanciera;
    }

    public void setEntidadFinanciera(String EntidadFinanciera) {
        this.EntidadFinanciera = EntidadFinanciera;
    }
    
    public float AnalisisDeCostos(){
        return switch (this.EntidadFinanciera) {
            case "BANCOLOMBIA" -> this.Magnitud * (3/20);
            case "BANCO DE BOGOTA" -> this.Magnitud * (1/10);
            default -> this.Magnitud * (1/5);
        };
    }
}

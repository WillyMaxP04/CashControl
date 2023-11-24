package com.clases;

public class Cuenta {
    private String Categoria,MedioDePago;
    private Boolean TipoDeCiclo;
    public Float Magnitud;
    public int NumCuotas, NumRegistro; 

    public Cuenta(String Categoria, String MedioDePago, Boolean TipoDeCiclo, Float Magnitud, int NumCuotas, int NumRegistro) {
        this.Categoria = Categoria;
        this.MedioDePago = MedioDePago;
        this.TipoDeCiclo = TipoDeCiclo;
        this.Magnitud = Magnitud;
        this.NumCuotas = NumCuotas;
        this.NumRegistro = NumRegistro;
    }

    public void ModificarValor(Float valor) {
        this.Magnitud = valor;
    }

    public Float getValor() {
        return Magnitud;
    }
    
    public void setValor(float valor){
        this.Magnitud = valor;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getMedioDePago() {
        return MedioDePago;
    }

    public void setMedioDePago(String MedioDePago) {
        this.MedioDePago = MedioDePago;
    }

    public Boolean getTipoDeCiclo() {
        return TipoDeCiclo;
    }

    public void setTipoDeCiclo(Boolean TipoDeCiclo) {
        this.TipoDeCiclo = TipoDeCiclo;
    }

    public int getNumCuotas() {
        return NumCuotas;
    }

    public void setNumCuotas(int NumCuotas) {
        this.NumCuotas = NumCuotas;
    }

    public int getNumRegistro() {
        return NumRegistro;
    }

    public void setNumRegistro(int NumRegistro) {
        this.NumRegistro = NumRegistro;
    }
    
    public String ImprimirInfo() {
      return "\nNumero de Registro: " + this.NumRegistro + ", Valor: " + this.Magnitud;
    }
    
    public String ImprimirInfo2() {
        return  "\n Cateogira: "+ this.getCategoria() + ", Medio de pago: " + this.getMedioDePago();
    }
}

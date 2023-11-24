package com.clases;

import java.util.*;

public class Usuario{
    //Atributos
    private String nombre;
    private String correo;
    private String clave;
    private String nickname;
    
    //Variables
    public List<Ingreso> Ingresos;
    public List<Egreso> Gastos;
    CalculadoraYOperaciones calcu = new CalculadoraYOperaciones();
    PlanificadorDeAhorro Ahorros = new PlanificadorDeAhorro();
    private UsuarioNode usuarioNode;
    
    //Constructor
    public Usuario(String nombre,String nickname, String correo, String clave) {
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.nickname = nickname;
        this.Ingresos = new ArrayList<>();
        this.Gastos = new ArrayList<>();
        this.usuarioNode = null;
    }
    
    //Getter y setter de cada variable
    public UsuarioNode getUsuarioNode() {
        return usuarioNode;
    }
    public void setUsuarioNode(UsuarioNode usuarioNode) {
        this.usuarioNode = usuarioNode;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {return nickname;}

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public void EstablecerMeta() {
        Ahorros.crearMeta(this.calcu.DiferenciaDeValores());
    }
    
    //Metodos especificos de la clase usuario
    public void AñadirIngreso(String Categoria, String MedioDePago, Boolean TipoDeCiclo, Float Magnitud, int NumCuotas,Boolean Tipo){
        Ingreso nuevoI = new Ingreso(Categoria,MedioDePago,TipoDeCiclo,Magnitud,NumCuotas,(calcu.contI + 1), Tipo);
        Ingresos.add(nuevoI);
        calcu.SumaIngresos(Magnitud);
        calcu.MasIngreso();
    }
    
    public void AñadirGasto(String Categoria, String MedioDePago, Boolean TipoDeCiclo, Float Magnitud, int NumCuotas,String entidad){
        Egreso nuevoG = new Egreso(Categoria, MedioDePago, TipoDeCiclo, Magnitud, NumCuotas, (calcu.contG + 1), entidad);
        Gastos.add(nuevoG);
        calcu.SumaGastos(Magnitud);
        calcu.MasGasto();
    }
    
    public void EliminarIngreso(int numero){
        calcu.deleteIngreso(Ingresos.get(numero).Magnitud);
        calcu.MenosIngreso();
        Ingresos.remove(numero);
    }
    
    public void EliminarGasto(int numero){
        calcu.deleteGasto(Gastos.get(numero).Magnitud);
        calcu.MenosGasto();
        Gastos.remove(numero);
    } 
    
    public String LecturaIngresos1(int i){
        return Ingresos.get(i).ImprimirInfo();
    }
    
    public String LecturaIngresos2(int i){
        return Ingresos.get(i).ImprimirInfo2();
    }
    
    public String LecturaGastos1(int i){
        return Gastos.get(i).ImprimirInfo();
    }
    
    public String LecturaGastos2(int i){
        return Gastos.get(i).ImprimirInfo2();
    }  

    public List<Ingreso> getIngresos() {
        return Ingresos;
    }

    public List<Egreso> getGastos() {
        return Gastos;
    }
    
    public Ingreso getIngreso(int i) {
        return Ingresos.get(i);
    }
    
    public Egreso getGasto(int i) {
        return Gastos.get(i);
    }
    
    public void ModificarIngreso(int f,Ingreso modificado){
        calcu.deleteIngreso(Ingresos.get(f).Magnitud);
        calcu.MenosIngreso();
        Ingresos.set(f, modificado);
        calcu.SumaIngresos(Ingresos.get(f).Magnitud);
        calcu.MasIngreso();
    }
    
    public void ModificarGasto(int f, Egreso modificado){
        calcu.deleteIngreso(Gastos.get(f).Magnitud);
        calcu.MenosGasto();
        Gastos.set(f, modificado);
        calcu.SumaIngresos(Gastos.get(f).Magnitud);
        calcu.MasGasto();
    }
}

package com.acalabuig.model;

public class Cultivo {

    private String nombre;
    /* En hectareas */
    private double area;
    /* En toneladas por area */

    private double rendimiento;
    /**
     * Constructor del objeto Cultivo
     * 
     * @param nombre nombre del Cultivo
     * @param area representa el area con un double
     * @param rendimiento representa el rendimiento 
     */
    public Cultivo(String nombre, double area, double rendimiento) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre del cultivo no puede ser nullo o vacío.");
        }
        if (area <= 0 || rendimiento <= 0) {
            throw new IllegalArgumentException("Area y rendimiento deben ser números positivos");
        }
        this.nombre = nombre;
        this.area = area;
        this.rendimiento = rendimiento;
    }

    /**
     * Obtener el nombre del cultivo
     * 
     * @return el nombre del cultivo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * obtener el area del cultivo
     * 
     * @return el area del cultivo
     */
    public double getArea() {
        return area;
    }

    /**
     * Obtener el rendimiento del cultivo
     * 
     * @return el rendimiento del cultivo
     */
    public double getRendimiento() {
        return rendimiento;
    }

    /**
     * Calcular el rendimiento total del cultivo
     * 
     * @return el rendimiento total
     */
    public double calcularRendimientoTotal() {
        return area * rendimiento;
    }

    /**
     * 
     * @param precioPorTonelada precio por tonelada que pasamos por parametro
     * @return 
     * @see calcularRendimientoTotal
     */
    public double calcularIngresos(double precioPorTonelada) {
        return calcularRendimientoTotal() * precioPorTonelada;
    }

    /**
     * Establecer el nombre del cultivo
     * 
     * @param nombre el nombre del cultivo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establecer el area del cultivo
     * 
     * @param area el area del cultivo
     */
    public void setArea(double area) {
        this.area = area;
    }
    /**
     * Establecer el rendimiento del cultivo
     * 
     * @param rendimiento el rendimiento cultivo
     */
    public void setRendimiento(double rendimiento) {
        this.rendimiento = rendimiento;
    }

    
}

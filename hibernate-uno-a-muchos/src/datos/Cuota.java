package datos;

import java.time.LocalDate;

public class Cuota {
    private long idCuota;
    private int nroCuota;
    private LocalDate fechaVencimiento;
    private double saldoPendiente;
    private double amortizacion;
    private double interesCuota;
    private double cuota;
    private double deuda;
    private boolean cancelada;
    private LocalDate fechaDePago;
    private double punitorios;
    private Prestamo prestamo;

    public Cuota() {
    }

    public Cuota(int nroCuota, LocalDate fechaVencimiento, double saldoPendiente, double amortizacion,
            double interesCuota, double cuota, double deuda, boolean cancelada, LocalDate fechaDePago,
            double punitorios, Prestamo prestamo) {
        this.nroCuota = nroCuota;
        this.fechaVencimiento = fechaVencimiento;
        this.saldoPendiente = saldoPendiente;
        this.amortizacion = amortizacion;
        this.interesCuota = interesCuota;
        this.cuota = cuota;
        this.deuda = deuda;
        this.cancelada = cancelada;
        this.fechaDePago = fechaDePago;
        this.punitorios = punitorios;
        this.prestamo = prestamo;
    }

    public long getIdCuota() {
        return this.idCuota;
    }

    protected void setIdCuota(long idCuota) {
        this.idCuota = idCuota;
    }

    public int getNroCuota() {
        return this.nroCuota;
    }

    public void setNroCuota(int nroCuota) {
        this.nroCuota = nroCuota;
    }

    public LocalDate getFechaVencimiento() {
        return this.fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public double getSaldoPendiente() {
        return this.saldoPendiente;
    }

    public void setSaldoPendiente(double saldoPendiente) {
        this.saldoPendiente = saldoPendiente;
    }

    public double getAmortizacion() {
        return this.amortizacion;
    }

    public void setAmortizacion(double amortizacion) {
        this.amortizacion = amortizacion;
    }

    public double getInteresCuota() {
        return this.interesCuota;
    }

    public void setInteresCuota(double interesCuota) {
        this.interesCuota = interesCuota;
    }

    public double getCuota() {
        return this.cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getDeuda() {
        return this.deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public boolean isCancelada() {
        return this.cancelada;
    }

    public void setcancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }

    public LocalDate getFechaDePago() {
        return this.fechaDePago;
    }

    public void setFechaDePago(LocalDate fechaDePago) {
        this.fechaDePago = fechaDePago;
    }

    public double getPunitorios() {
        return this.punitorios;
    }

    public void setPunitorios(double punitorios) {
        this.punitorios = punitorios;
    }

    public Prestamo getPrestamo() {
        return this.prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    @Override
    public String toString() {
        return "{" + " idCuota='" + getIdCuota() + "'" + ", nroCuota='" + getNroCuota() + "'" + ", fechaVencimiento='"
                + getFechaVencimiento() + "'" + ", saldoPendiente='" + getSaldoPendiente() + "'" + ", amortizacion='"
                + getAmortizacion() + "'" + ", interesCuota='" + getInteresCuota() + "'" + ", cuota='" + getCuota()
                + "'" + ", deuda='" + getDeuda() + "'" + ", cancelada='" + isCancelada() + "'" + ", fechaDePago='"
                + getFechaDePago() + "'" + ", punitorios='" + getPunitorios() + "'" + ", prestamo='" + getPrestamo()
                + "'" + "}";
    }
}
package fr.easycar.rental.easycar;

import java.time.LocalDate;

public class Reservation {
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean paid;

    public Reservation(LocalDate startDate, LocalDate endDate, boolean paid) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.paid = paid;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public boolean getPaid() {
        return paid;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}

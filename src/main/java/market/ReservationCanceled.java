package market;

import market.AbstractEvent;

public class ReservationCanceled extends AbstractEvent {

    private Long id;
    private String reservationStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }
}
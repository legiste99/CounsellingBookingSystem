package za.ac.cput.entity;

/**BookingStatus.java
 * Entity for the Booking Status
 * Author: Lindokuhle Nini (218196504)
 * Date: 9 June 2021
 */
public class BookingStatus {
    private String statusId;
    private String status;

    public BookingStatus(){}

    public BookingStatus(Builder builder) {
        this.status = builder.status;
        this.statusId = builder.status;
    }

    @Override
    public String toString() {
        return "BookingStatus{" +
                "statusId='" + statusId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getStatusId() {
        return statusId;
    }

    public String getStatus() {
        return status;
    }

    public static class Builder {
        private String status, statusId;
        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setStatusId(String statusId) {
            this.statusId = statusId;
            return this;
        }

        public BookingStatus build(){
            return new BookingStatus(this);
        }

        public Builder copy (BookingStatus bookingStatus){
            this.statusId = bookingStatus.statusId;
            this.status = bookingStatus.status;
            return this;
        }
    }

    }

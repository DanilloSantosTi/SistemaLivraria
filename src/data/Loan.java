package data;

import java.util.Date;

public class Loan {
    private boolean bookAvailable;
    private Date dateLoaned;

    public Loan(boolean bookAvailable, Date dateLoaned) {
        this.bookAvailable = bookAvailable;
        this.dateLoaned = dateLoaned;
    }

    public boolean isBookAvailable() {
        return bookAvailable;
    }

    public void setBookAvailable(boolean bookAvailable) {
        this.bookAvailable = bookAvailable;
    }

    public Date getDateLoaned() {
        return dateLoaned;
    }

    public void setDateLoaned(Date dateLoaned) {
        this.dateLoaned = dateLoaned;
    }
}

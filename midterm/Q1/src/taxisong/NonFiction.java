package taxisong;

public class NonFiction extends Book implements iBorrowable{
    private int BorrowDay;
    private int ReturnDay;

    public NonFiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public String description() {
        return this.getTitle() + " all events are true and based on real facts.";
    }

    @Override
    public void setBorrowDate(int BorrowDay) {

        this.BorrowDay = BorrowDay;
    }

    @Override
    public void setReturnDate(int ReturnDay) {

        this.ReturnDay = ReturnDay;
    }

    @Override
    public boolean isAvailable(int day) {
        if(day >= BorrowDay && day <= ReturnDay){
            return false;
        }
        return true;
    }
}

package taxisong;

public class Reference extends Book implements iBorrowable{
    private int BorrowDay;
    private int ReturnDay;

    public Reference(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public String description() {
        return this.getTitle() + " all information is real.";
    }

    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

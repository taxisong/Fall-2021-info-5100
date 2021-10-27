package taxisong;

public class Fiction extends Book implements iBorrowable{
    private int BorrowDay;
    private int ReturnDay;

    public Fiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public String description() {
        return this.getTitle() + " all events are imaginary and not based on real facts";
    }

    @Override
    public void setBorrowDate(int BorrowDay) {
        this.BorrowDay = BorrowDay;
    }

    @Override
    public void setReturnDate(int Returnday) {
        this.ReturnDay = Returnday;
    }

    @Override
    public boolean isAvailable(int day) {
        if(day >= BorrowDay && day <= ReturnDay){
            return false;
        }
        return true;
    }


}

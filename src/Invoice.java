import java.util.List;

public class Invoice {
    Integer id;
    String title;
    Integer amount;
    List<String> customer ;

    public Invoice(Integer id, String title, Integer amount) {
        this.id = id;
        this.title = title;
        this.amount = amount;
    }

    public List<String> getCustomer() {
        return customer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}

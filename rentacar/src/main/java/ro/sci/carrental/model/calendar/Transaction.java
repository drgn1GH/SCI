package ro.sci.carrental.model.calendar;

/**
 * Created by tudor on 14.06.2017.
 */
public class Transaction {
    private int id = 0;
    private String name;

    public Transaction() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0 && id <= 1000) {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction)) return false;

        Transaction that = (Transaction) o;

        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 17 * result;
        return result;
    }
}


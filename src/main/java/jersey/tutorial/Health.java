package jersey.tutorial;

/**
 * Created by drag0sd0g on 08/08/2015.
 */
public class Health {
    private String status;

    public Health(String status) {
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public Health(){}
}

public class DVDBean {

    //名称
    private String name;
    //状态
    private Integer state;
    //日期
    private Integer date;
    //次数
    private Integer count;

    public DVDBean() {
    }
    public DVDBean(String name, Integer state, Integer date, Integer count) {
        this.name = name;
        this.state = state;
        this.date = date;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


}

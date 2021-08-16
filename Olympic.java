//奥运类
public class Olympic implements Comparable<Olympic> {

    //国家
    private String country;
    //金牌数量
    private int jnum;
    //银牌数量
    private int ynum;
    //铜牌数量
    private int tnum;

    public Olympic() {
    }

    public Olympic(int jnum, int ynum, int tnum) {
        this.jnum = jnum;
        this.ynum = ynum;
        this.tnum = tnum;
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public int getJnum() {
        return jnum;
    }

    public void setJnum(int jnum) {
        this.jnum = jnum;
    }

    public int getYnum() {
        return ynum;
    }

    public void setYnum(int ynum) {
        this.ynum = ynum;
    }

    public int getTnum() {
        return tnum;
    }

    public void setTnum(int tnum) {
        this.tnum = tnum;
    }

    //被动比较的方法，当进行排序比较时调用。
    @Override
    public int compareTo(Olympic olympic) {
        //对象比大小，只比金牌
        int result = this.jnum-olympic.jnum;
        if (result>0){
            result = 1;
        }else if(result<0){
            result = -1;
        }else {
            result = 0;
        }
        return result;

        //对象比大小，比较顺序为金牌-银牌
    }

    @Override
    public String toString() {
        //return super.toString();
        return "hsbc-->"+this.country+"-->[jnum="+this.jnum+",ynum="+this.ynum+",tnum="+this.tnum+"]";
    }
}

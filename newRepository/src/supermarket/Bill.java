package supermarket;

import java.util.List;
import java.util.Map;

/**
 * 账单类
 */
public class Bill {
    private String bid; //账单编号
    private Map<String, String> idAndNum; // 商品id和数量
    private String vipFlag; // vip标记 1.代表是会员 0.代表不是会员
    private String vipName; // vip姓名
    private String vipMoney; // vip余额
    private int vipIntegral; // vip积分
    private String total; // 总金额

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public Map<String, String> getIdAndNum() {
        return idAndNum;
    }

    public void setIdAndNum(Map<String, String> idAndNum) {
        this.idAndNum = idAndNum;
    }

    public String getVipFlag() {
        return vipFlag;
    }

    public void setVipFlag(String vipFlag) {
        this.vipFlag = vipFlag;
    }

    public String getVipName() {
        return vipName;
    }

    public void setVipName(String vipName) {
        this.vipName = vipName;
    }

    public String getVipMoney() {
        return vipMoney;
    }

    public void setVipMoney(String vipMoney) {
        this.vipMoney = vipMoney;
    }

    public int getVipIntegral() {
        return vipIntegral;
    }

    public void setVipIntegral(int vipIntegral) {
        this.vipIntegral = vipIntegral;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "bid='" + bid + '\'' +
                ", idAndNum=" + idAndNum +
                ", vipFlag='" + vipFlag + '\'' +
                ", vipName='" + vipName + '\'' +
                ", vipMoney=" + vipMoney +
                ", vipIntegral=" + vipIntegral +
                ", total=" + total +
                '}';
    }
}

package supermarket;

/**
 * 会员类
 */
public class Vip {

    private String vid; // vip编号
    private String vipFlag; // vip 标记
    private String vipName; // vip名字
    private String vipMoney; // vip余额
    private int vipIntegral; // vip积分

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
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

    @Override
    public String toString() {
        return "Vip{" +
                "vid='" + vid + '\'' +
                ", vipFlag='" + vipFlag + '\'' +
                ", vipName='" + vipName + '\'' +
                ", vipMoney='" + vipMoney + '\'' +
                ", vipIntegral=" + vipIntegral +
                '}';
    }
}

package supermarket;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

public class MoneyManage {

    //购物车集合
    static Map<String, String> map = new HashMap<String, String>();

    // 收银管理
    static void moneyManage(ArrayList<Goods> goodsArray, ArrayList<Bill> billArray, ArrayList<Vip> vipArray) {
        while (true) {
            // 用输出语句完主界面的编写
            System.out.println("---------欢迎进入方舟购物系统---------");
            System.out.println("1. 查看所有的账单");
            System.out.println("2. 购物车");
            System.out.println("3. 结账");
            System.out.println("4. 返回");
            System.out.println("请输入你的选择");
            // 用Scanner实现键盘录入数据
            Scanner input = new Scanner(System.in);
            String line = input.nextLine();
            // 用switch语句完成操作的选择
            switch (line) {

                case "1":
                    searchBill(goodsArray, billArray, vipArray);
                    break;

                case "2":
                    shoppingCart(goodsArray, billArray, vipArray);
                    break;

                case "3":
                    closeAccounts(goodsArray, billArray, vipArray);
                    break;

                case "4":
                    ShopMenu.manageMenu(); // 返回到主菜单
            }
        }
    }

    // 结账
    private static void closeAccounts(ArrayList<Goods> goodsArray, ArrayList<Bill> billArray, ArrayList<Vip> vipArray) {
        showShopCart(map, goodsArray, billArray, vipArray); // 显示购物车数据
        Scanner sc = new Scanner(System.in);
        Bill bill = new Bill();
        System.out.println("是否有会员卡?(1有, 0没有)");
        String vipFlag = sc.nextLine();
        int index = 0;

        if("1".equals(vipFlag)) {
            while (true) {
                System.out.println("请输入你的会员卡号: ");
                String vid = sc.nextLine();
                index = isVip(vipArray, vid); //返回索引值, 方便打印账单
                if(index!=-1) {
                    break;
                }else if("-1".equals(vid)){
                    closeAccounts(goodsArray, billArray, vipArray);
                }else {
                    System.out.println("对不起, 不是会员, 请重新输入会员编号(或者按-1重新结账)");
                }
            }

            Vip vip = vipArray.get(index); // 通过索引得到会员
            bill.setBid(getBid());
            bill.setVipFlag(vipFlag);
            bill.setVipName(vip.getVipName());
            Map<String, String> actualMap = (Map<String, String>) ((HashMap<String, String>) map).clone();
            bill.setIdAndNum(actualMap);

            // 开始计算总金额
            String total = vipPrintBill(map, goodsArray,vipArray, index);
            bill.setTotal(total);
            bill.setVipMoney(vip.getVipMoney());
            bill.setVipIntegral(vip.getVipIntegral());
            billArray.add(bill);


        }else {
            bill.setBid(getBid());
            bill.setVipFlag(vipFlag);
            Map<String, String> actualMap = (Map<String, String>) ((HashMap<String, String>) map).clone();
            bill.setIdAndNum(actualMap);
            // 开始计算总金额
            String total = printBill(map, goodsArray);
            bill.setTotal(total);
            billArray.add(bill);

        }
    }

    // 显示购物车
    private static void showShopCart(Map<String, String> map, ArrayList<Goods> goodsArray, ArrayList<Bill> billArray, ArrayList<Vip> vipArray) {
        if(map.isEmpty()) {
            System.out.println("请先购买东西, 再进行结账!");
            moneyManage(goodsArray, billArray, vipArray);
        } else {
            System.out.println("购物车里有如下物品: ");
            Iterator it = map.keySet().iterator(); // 迭代器

            System.out.println("--------------购物车----------------");

            System.out.println("商品名称\t\t数量\t单价");
            // 遍历map集合
            while (it.hasNext()) {
                String key = it.next().toString(); // 主键
                // 商品名称
                String goodsName = findGoodsName(key, goodsArray);
                // 商品数量
                String goodsSize = map.get(key);
                // 商品单价
                String goodsPrice = findGoodsPrice(key, goodsArray);
                // 商品
                System.out.println(goodsName + "\t\t" + goodsSize + "\t" + goodsPrice);

            }
            System.out.println("1. 结账");
            System.out.println("2. 继续购买");
            Scanner sc = new Scanner(System.in);
            String selectNum = sc.nextLine();
            if ("2".equals(selectNum)) {
                moneyManage(goodsArray, billArray, vipArray);
            }
        }

    }

    // 收藏至购物车
    private static void shoppingCart(ArrayList<Goods> goodsArray, ArrayList<Bill> billArray, ArrayList<Vip> vipArray) {
        GoodsManage.showGoods(goodsArray);
        System.out.println("已进入购物车,请根据商品编号,添加到购物车");
        System.out.println("请输入你需要的商品(填写商品编号, 输入-1退出选择): ");

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入商品编号: ");
            String goodsId = sc.nextLine();

            if("-1".equals(goodsId)) {
                System.out.println("已退出购物车选择");
                break;
            }
            String goodsSize = "0";
            while(true) {
                System.out.println("请输入商品购买数量: ");
                goodsSize = sc.nextLine();
                int actualStock = findGoodsStock(goodsId, goodsArray);
                if( actualStock >= Integer.parseInt(goodsSize) || "-1".equals(goodsSize)) {
                    break;
                }else {
                    System.out.println("库存不足, 现存货" + actualStock + ", 请重新购买(按-1跳出此商品购买)");
                }
            }

            map.put(goodsId, goodsSize);

        }
        moneyManage(goodsArray, billArray, vipArray);

    }

    // 查询所有的账单
    private static void searchBill(ArrayList<Goods> goodsArray, ArrayList<Bill> billArray, ArrayList<Vip> vipArray) {

        // 如果商品集合为空
        if (billArray.isEmpty()) {
            System.out.println("暂无账单, 请先添加购物车,在结账生成账单!");
            moneyManage(goodsArray, billArray, vipArray);
        }

        // 展示账单
        showBill(goodsArray,billArray);
    }

    //展示账单
    private static void showBill(ArrayList<Goods> goodsArray, ArrayList<Bill> billArray) {

        // 显示表头信息
        System.out.println("------------账单-----------");

        // 将集合中数据取出按照对应格式显示商品信息
        for (int i = 0; i < billArray.size(); i++) {
            Bill b = billArray.get(i);
            System.out.println("账单编号: " + b.getBid());

            // 判断是否为会员
            if ("1".equals(b.getVipFlag())) {
                Map<String, String> idAndNum = b.getIdAndNum();
                Iterator it = idAndNum.keySet().iterator();
                double totalMoney = 0; // 总金额

                System.out.println("商品名称\t\t数量\t单价");

                // 遍历map集合
                while (it.hasNext()) {

                    String key = it.next().toString(); // 主键
                    // 商品名称
                    String goodsName = findGoodsName(key, goodsArray);
                    // 商品数量
                    String goodsSize = idAndNum.get(key);
                    // 商品单价
                    String goodsPrice = findGoodsPrice(key, goodsArray);
                    // 商品
                    System.out.println(goodsName + "\t\t" + goodsSize + "\t" + goodsPrice);

                }

                System.out.println("商品数量: " + idAndNum.size());
                System.out.println("商品总金额: " + b.getTotal());
                System.out.println("会员名称: " + b.getVipName());
                System.out.println("会员卡余额: " + b.getVipMoney());
                System.out.println("会员卡积分: " + b.getVipIntegral());
                System.out.println("-------------------------");
            } else {

                Map<String, String> idAndNum = b.getIdAndNum();
                Iterator it = idAndNum.keySet().iterator();
                double totalMoney = 0; // 总金额

                System.out.println("商品名称\t\t数量\t单价");

                // 遍历map集合
                while (it.hasNext()) {
                    String key = it.next().toString(); // 主键
                    // 商品名称
                    String goodsName = findGoodsName(key, goodsArray);
                    // 商品数量
                    String goodsSize = idAndNum.get(key);
                    // 商品单价
                    String goodsPrice = findGoodsPrice(key, goodsArray);
                    // 商品
                    System.out.println(goodsName + "\t\t" + goodsSize + "\t" + goodsPrice);

                }


                System.out.println("商品数量: " + idAndNum.size());
                System.out.println("商品总金额: " + b.getTotal());
                System.out.println("-------------------------");


            }
        }
    }

    // 收银员登录
    public static void CashierLogin() {

        Scanner scan = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        String username = null, password = null;
        String username1 = "employee";
        String password1 = "123";
        boolean flag = true;
        do {
            System.out.println("请输入用户名(employee)：");
            username = reader.next();
            System.out.println("请输入密码：");
            password = reader.next();
            if (username.equals(username1) && password.equals(password1)) {
                System.out.println("登入成功!");
                flag = false;
            } else {
                System.out.println("用户名或密码输入错误，请重新输入:");
            }

        } while (flag);
    }

    // 通过商品id找商品名称
    public static String findGoodsName(String goodsId, ArrayList<Goods> goodsArray) {

        String goodsName = "";

        for (int i = 0; i < goodsArray.size(); i++) {
            if(goodsArray.get(i).getGid().equals(goodsId)) {
                goodsName = goodsArray.get(i).getName();
            }
        }

        return goodsName;
    }

    // 通过商品id找商品库存
    public static int findGoodsStock(String goodsId, ArrayList<Goods> goodsArray) {

        int goodsStock = 0;

        for (int i = 0; i < goodsArray.size(); i++) {
            if(goodsArray.get(i).getGid().equals(goodsId)) {
                goodsStock = goodsArray.get(i).getStock();
            }
        }

        return goodsStock;
    }

    // 通过商品id找商品单价
    public static String findGoodsPrice(String goodsId, ArrayList<Goods> goodsArray) {

        String goodsPrice = "";

        for (int i = 0; i < goodsArray.size(); i++) {
            if(goodsArray.get(i).getGid().equals(goodsId)) {
                goodsPrice = goodsArray.get(i).getPrice();
            }
        }

        return goodsPrice;
    }

    // 通过商品id减少库存
    public static void reduceGoodsStock(String goodsId, ArrayList<Goods> goodsArray, String goodsSize) {
        int goodsStock = 0;

        for (int i = 0; i < goodsArray.size(); i++) {
            if(goodsArray.get(i).getGid().equals(goodsId)) {
                goodsStock = goodsArray.get(i).getStock();
                goodsArray.get(i).setStock(goodsStock-Integer.parseInt(goodsSize));
            }
        }

    }

    // 通过会员id找会员名称
    public static String findVipName(String vid, ArrayList<Vip> vipArray) {

        String vipName = "";

        for (int i = 0; i < vipArray.size(); i++) {
            if(vipArray.get(i).getVid().equals(vid)) {
                vipName = vipArray.get(i).getVipName();
            }
        }

        return vipName;
    }

    // 通过会员id找商品余额
    public static String findVipMoney(String vid, ArrayList<Vip> vipArray) {

        String vipMoney = "";

        for (int i = 0; i < vipArray.size(); i++) {
            if(vipArray.get(i).getVid().equals(vid)) {
                vipMoney = vipArray.get(i).getVipMoney();
            }
        }

        return vipMoney;
    }

    // 通过会员id增加会员积分
    public static int addVipIntegral(int index, ArrayList<Vip> vipArray, int vipIntegral) {

        int newVipIntegral = vipArray.get(index).getVipIntegral() + vipIntegral;  // 积分的计算规则
        vipArray.get(index).setVipIntegral(newVipIntegral);

        return newVipIntegral;
    }

    // 通过会员id减少会员余额
    public static String reduceVipMoney(String vid, ArrayList<Vip> vipArray, String vipMoney) {
        String newVipMoney = "";
        String newVipMoneyCpoy = "";
        BigDecimal money1 = new BigDecimal(vipMoney);

        for (int i = 0; i < vipArray.size(); i++) {
            if(vipArray.get(i).getVid().equals(vid)) {
                newVipMoney = vipArray.get(i).getVipMoney();
                BigDecimal money2 = new BigDecimal(newVipMoney);
                vipArray.get(i).setVipMoney(money2.subtract(money1).toString());
                newVipMoneyCpoy = vipArray.get(i).getVipMoney();
            }
        }
        return newVipMoneyCpoy;
    }

    // 查询会员id是否存在
    public static int isVip(ArrayList<Vip> vipArray, String vid) {

        int flag = -1;
        for (int j = 0; j < vipArray.size(); j++) {

            Vip v = vipArray.get(j);
            if (v.getVid().equals(vid)) {

                flag = j;
                break;
            }

        }
        return flag;
    }

    // 获得账单的编号 用年月日时分秒作为账单的编号
    public static String getBid () {

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmss");
        String format = sdf.format(date);
        return format;
    }

    // 打印发票
    public static String printBill(Map<String, String> map, ArrayList<Goods> goodsArray) {

        Iterator it = map.keySet().iterator(); // 迭代器

        double totalMoney = 0; // 总金额
        System.out.println("---------欢迎使用方舟购物系统----------");
        System.out.println("---------------小票-----------------");
        System.out.println("商品名称\t\t数量\t单价");
        int totalSize = 0 ; // 商品总数量
        BigDecimal sum = new BigDecimal("0");  // 总金额
        int mapSize = map.size();

        // 遍历map集合
        while (it.hasNext()) {
            String key = it.next().toString(); // 主键
            // 商品名称
            String goodsName = findGoodsName(key ,goodsArray);
            // 商品数量
            String goodsSize = map.get(key);
            BigDecimal goods_Size = new BigDecimal(goodsSize);
            totalSize += Integer.parseInt(goodsSize);
            // 商品单价
            String goodsPrice = findGoodsPrice(key, goodsArray);
            BigDecimal goods_Price = new BigDecimal(goodsPrice);
            sum = sum.add(goods_Price.multiply(goods_Size));
            // 商品
            System.out.println(goodsName +"\t\t" + goodsSize + "\t" + goodsPrice);

            // 减少库存
            reduceGoodsStock(key, goodsArray, goodsSize);

            // 打印后去除Map中的数据
            it.remove();
            map.remove(key);
        }


        System.out.println("商品种类: " + mapSize);
        System.out.println("商品总数量: " + totalSize);
        System.out.println("商品总额: " + sum.toString());
        System.out.println("-----------------------------------");

        return sum.toString();
    }

    // Vip打印发票
    public static String vipPrintBill(Map<String, String> map, ArrayList<Goods> goodsArray, ArrayList<Vip> vipArray, int index) {

        Iterator it1 = map.keySet().iterator(); // 迭代器
        Iterator it2 = map.keySet().iterator(); // 迭代器

        int totalSize = 0 ; // 商品总数量
        BigDecimal sum = new BigDecimal("0");  // 总金额
        BigDecimal advanceSum = new BigDecimal("0");  // 提前计算总金额
        
        Vip vip = vipArray.get(index); // 会员对象
        BigDecimal vipMoney = new BigDecimal(vip.getVipMoney());  // 会员卡余额
        String balance = ""; // 支付后会员余额
        int totalIntegral = 0; // 支付后会员积分

        int mapSize = map.size();

        // 遍历map集合
        while (it1.hasNext()) {
            String key = it1.next().toString(); // 主键

            // 商品数量
            String goodsSize = map.get(key);
            BigDecimal goods_Size = new BigDecimal(goodsSize);

            // 商品单价
            String goodsPrice = findGoodsPrice(key, goodsArray);
            BigDecimal goods_Price = new BigDecimal(goodsPrice);
            advanceSum = advanceSum.add(goods_Price.multiply(goods_Size));
        }

        if(vipMoney.compareTo(advanceSum) > -1) {
            System.out.println("会员卡里余额大于等于支付的总金额,是否选择会员卡余额支付?");
            System.out.println("1. 会员支付");
            System.out.println("2. 直接支付");
            Scanner sc = new Scanner(System.in);
            String payType = sc.nextLine();
            if("1".equals(payType)) {
                balance = reduceVipMoney(vip.getVid(), vipArray, advanceSum.toString()); // 支付扣卡里余额

            }
            totalIntegral = addVipIntegral(index, vipArray, Integer.parseInt(advanceSum.toString().split("\\.")[0])); // 会员增加积分
        }

        System.out.println("---------欢迎使用方舟购物系统----------");
        System.out.println("---------------小票-----------------");
        System.out.println("商品名称\t\t数量\t单价");

        // 遍历map集合
        while (it2.hasNext()) {
            String key = it2.next().toString(); // 主键
            // 商品名称
            String goodsName = findGoodsName(key ,goodsArray);
            // 商品数量
            String goodsSize = map.get(key);
            BigDecimal goods_Size = new BigDecimal(goodsSize);
            totalSize += Integer.parseInt(goodsSize);
            // 商品单价
            String goodsPrice = findGoodsPrice(key, goodsArray);
            BigDecimal goods_Price = new BigDecimal(goodsPrice);
            sum = sum.add(goods_Price.multiply(goods_Size));
            // 商品
            System.out.println(goodsName +"\t\t" + goodsSize + "\t" + goodsPrice);

            // 减少库存
            reduceGoodsStock(key, goodsArray, goodsSize);

            // 打印后去除Map中的数据
            it2.remove();
            map.remove(key);
        }




        System.out.println("商品种类: " + mapSize);
        System.out.println("商品总数量: " + totalSize);
        System.out.println("商品总额: " + sum.toString());
        System.out.println("会员编号:" + vip.getVid());
        System.out.println("会员余额:" + vip.getVipMoney());
//        System.out.println("检测会员余额是否修改" + balance);
        System.out.println("会员积分:" + vip.getVipIntegral());
//        System.out.println("检测会员积分是否修改:" + totalIntegral);
        System.out.println("-----------------------------------");

        return sum.toString();
    }
}

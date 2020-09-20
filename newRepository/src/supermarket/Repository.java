package supermarket;

import java.util.Arrays;
import java.util.List;

public class Repository {

    public static List<Goods> getArray() {

        Goods[] data = new Goods[38];
        data[0]= new Goods("2019122800","八宝粥","4.5",10);
        data[1]= new Goods("2019122801","可乐","3",10);
        data[2]= new Goods("2019122802","矿泉水","2",10);
        data[3]= new Goods("2019122803","椰子汁","8",10);
        data[4]= new Goods("2019122804","牛奶","2",10);
        data[5]= new Goods("2019122805","薯片","6",10);
        data[6]= new Goods("2019122806","蛋糕","5",10);
        data[7]= new Goods("2019122807","饼干","6",10);
        data[8]= new Goods("2019122808","蛋黄酥","8",10);
        data[9]= new Goods("2019122809","辣条","1.5",10);
        data[10]= new Goods("2019122810","小鱼干","2",10);
        data[11]= new Goods("2019122811","青菜","2",10);
        data[12]= new Goods("2019122812","萝卜","1",10);
        data[13]= new Goods("2019122813","金针菇","3",10);
        data[14]= new Goods("2019122814","西兰花","4",10);
        data[15]= new Goods("2019122815","香蕉","6",10);
        data[16]= new Goods("2019122816","火龙果","8",10);
        data[17]= new Goods("2019122817","苹果","16",10);
        data[18]= new Goods("2019122818","草莓","38",10);
        data[19]= new Goods("2019122819","牛肉","50",10);
        data[20]= new Goods("2019122820","羊肉","50",10);
        data[21]= new Goods("2019122821","猪肉","60",10);
        data[22]= new Goods("2019122822","鸡肉","50",10);
        data[23]= new Goods("2019122823","基围虾","38",10);
        data[24]= new Goods("2019122824","带鱼","26",10);
        data[25]= new Goods("2019122825","三文鱼","45",10);
        data[26]= new Goods("2019122826","餐巾纸","15",10);
        data[27]= new Goods("2019122827","毛巾","8",10);
        data[28]= new Goods("2019122828","牙刷","6",10);
        data[29]= new Goods("2019122829","洁厕灵","25",10);
        data[30]= new Goods("2019122830","洗洁精","25",10);
        data[31]= new Goods("2019122831","冰箱","8000",10);
        data[32]= new Goods("2019122832","空调","8000",10);
        data[33]= new Goods("2019122833","吹风机","200",10);
        data[34]= new Goods("2019122834","风扇","300",10);
        data[35]= new Goods("2019122835","小号塑料袋","0.5",10);
        data[36]= new Goods("2019122836","中号塑料袋","0.8",10);
        data[37]= new Goods("2019122837","大号塑料袋","1",10);
        List<Goods> goodsArray = Arrays.asList(data);
        return goodsArray;
    }


}

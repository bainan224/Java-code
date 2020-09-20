package Teacher;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
public class persion {

	static int s;
	 static boolean huiyuan,xhuiyuan;
	 static String bke="百事可乐",ke="500ml可乐一瓶",m="5公斤面粉",ss="1个苏泊尔炒菜锅",o="欧莱雅爽肤水一瓶";
	 static ArrayList<String>array=new ArrayList<String>();
	 static Preferences customsnodes = Preferences.systemRoot().node("goods"); //创建节点
	 static Preferences customschildnode = customsnodes.node( "goods");  //创建子节点 

	 public static void main(String []args) {


	  outline();
	  System.out.println("----------------------");
	  System.out.println("\t 欢迎使用管理员系统");
	  System.out.println("\t 1.登陆系统\n\t2.退出程序\n ");
	  
	  outline();
	  int n =scanint(); 
	  if(n == 1){ 
	   login();  
	  }else if( n== 2){ 
	  System.out.println("已退出");
	  System.exit(0);
	  }else {
	  System.out.println("请重新选择：");
	  main(null);
	 }

	 }
	 public static void outline(){
	  System.out.println("* * * * * * * * * * * * * * * * * * * * * * *\n");
	 }

	 public static int scanint(){
	 int x = 0;
	 try {
	  Scanner scan =new Scanner(System.in);
	  x = scan.nextInt();
	 } catch (Exception e) {
	  System.out.println("输入有误,请输入数字：");
	 }
	 return x; 
	 }

	 public static String scanStr(){
	 String x = null;
	 try {

	  Scanner scan =new Scanner(System.in);
	  x = scan.next();
	 } catch (Exception e) {
	  System.out.println("输入有误,请输入字符串：");
	 }
	 return x; 
	 }
	 public static void login(){
	  System.out.println(" * * * * * * * * * 登陆 * * * * * * * * * * * *\n请输入密码\n：");
	  int n1 =scanint();
	  if(n1==(123123)){
	  System.out.println("登陆成功\n");
	  showMain();
	  }else{ 
	  System.out.println("密码错误");
	  System.out.println("请重新输入密码\n：");
	  login();
	  } 
	 }
	 private static void showMain() {
	 System.out.println("\n\n\t欢迎使用购物管理系统\n"); 
	 outline(); 
	 System.out.println("\t\t 1. 会 员 信 息 管 理\n"); 
	 System.out.println("\t\t 2. 货 物 信 息 管 理\n"); 
	 System.out.println("\t\t 3. 购 物 结 算\n"); 
	 System.out.println("\t\t 4. 注 销\n"); 
	 outline(); 
	 System.out.print("请选择,输入数字:"); 
	 int n2 =scanint();
	 switch (n2) {
	 case 1:
	  new user();
	  break;
	 case 2:
	  customs();
	  break;
	 case 3:
	  jiesuan();
	  break;
	 case 4:
	  System.out.println("注销成功");
	  main(null);
	 default:
	  System.out.println("没有您要的选项请重新输入");
	  showMain();
	  break;
	 }
	 }
	 private static void customs() {
	 //商品管理 ：添加商品： 编号 品名 价格
	 // 删除：选择标号删除

	 outline();
	 System.out.println("\t\t商品信息管理\n");
	 System.out.println("\t\t1,显示商品\n");
	 System.out.println("\t\t2,添加物品\n");
	 System.out.println("\t\t3,删除商品\n");
	 System.out.println("\t\t4,返回上级\n");
	 outline();
	 int n = scanint();
	 if (n==1){
	  showcustoms();
	 }else if(n==2){
	  addcustoms();
	 }else if(n ==3){
	  delcustoms();
	 }else if(n==4) {
	  showMain();
	 }else {
	  customs();
	 }
	 }
	 private static void delcustoms() {
	   System.out.println("请选择要删除商品的ID：\n按0返回上级");
	   try {
	   Scanner scan =new Scanner(System.in);
	   int x = scan.nextInt();
	   boolean remove=false;
	   for (int i=0;i<array.size();i++){
	    if(x==Integer.parseInt(array.get(i))){
	    remove=true;
	    }
	   }
	   if (remove){
		   customschildnode.remove(Integer.toString(x));
	    System.out.println("删除成功");
	    customs();
	   }else if (x==0) {
		   customs();
	   }else {
	   System.out.println("没有此商品！"); 
	    delcustoms();
	   }
	   new user();
	   } catch (Exception e) {
	   System.out.println("请输入数字");
	    delcustoms();
	   }
	 }
	 private static void showcustoms() {
	  try {
	   int leng =customschildnode.keys().length;
	   syncread();
	   if(leng==0){
	   System.out.println("没有商品");
	   }else{
	   try {
	    System.out.println("当前有"+customschildnode.keys().length+"种商品");
	    for(int i = 0;i<=customschildnode.keys().length;i++){
	    String shows =customschildnode.get(array.get(i), "");
	     System.out.println(shows);
	     System.out.println("──────────────────────────────────────────────"); 
	    }
	    System.out.println("00000000");
	    } catch (Exception e) {
	    }
	   }

	  } catch (BackingStoreException e) {

	  }
	  System.out.println("111111111");
	  customs(); 
	 }

	 private static void syncread() {
	  try {
	  String[] arr= customschildnode.keys();
	  customschildnode.sync();
	  array.clear();
	  for(int i=0;i<arr.length;i++){
	  array.add(arr[i]);
	  }
	  } catch (Exception e) {
	  }
	 }

	 private static int check(int x) {
	  Random n=new Random();
	  syncread();
	  for(int i=0;i<array.size();i++){
	   if(x==Integer.parseInt(array.get(i))){
	   check(n.nextInt(999)+1);
	   } 
	  } 
	  return x;

	 }
		
	


private static void addcustoms(){
  outline();
  System.out.println("\t\t请输入商品信息");
  System.out.println("\t\t品名,价格(元),单位");
  System.out.println("\t\t回车换行区分");
  outline();
  syncread();
  String name =scanStr();
  String nuit =scanStr();
  int price = scanint(); 
  Random n=new Random();
  String id ;
   id=Integer.toString(check(n.nextInt(999)+1));
   try{
	   customschildnode.put(id, "ID:"+id+" 品名："+name+" 价格："+price+" 单位："+nuit);
   syncread();
   System.out.println("第"+(customschildnode.keys().length)+"种商品添加成功");
   System.out.println("当前商品"+customschildnode.keys().length+"种\n"+array+"\n"+array.size());
   customs(); 
  } catch (Exception e) {
	  customs(); 
  }
 }


static void jiesuan(){
 try{
  System.out.println("是否会员？是选1 否选0");
  int x= scanint();
  if (x==1){
   huiyuan = true;
   Scanner sc =new Scanner(System.in); 
   System.out.println("请输入您的会员号：");
   int hui = sc.nextInt()/100%10;
   if(hui==9){
   System.out.println("恭喜你属于幸运会员,可以享受全场八折优惠");
   xhuiyuan = true;
   }else{
   xhuiyuan = false;
   }
  }else if (x==0) {
   huiyuan = false;
  }
  System.out.println("请输入消费金额:");
  Scanner scan =new Scanner(System.in); 
  if(scan.hasNext()){
  s=scan.nextInt();
  outline();
  System.out.println("是否参加优惠换购活动：" );
  System.out.println("1:满50元，加2元换购"+bke );
  System.out.println("2:满100元，加3元换购" +ke);
  System.out.println("3:满100元，加10元换购" +m );
  System.out.println("4:满200元，加10元换购" +ss );
  System.out.println("5:满200元，加20元换购 " +o );
  System.out.println("0：不换购\n请选择：\n" );
  outline();
  os();
  } 
 } catch (Exception e) {
  System.out.println("请输入数字");
  jiesuan();

 }
 }


static void out(String n , double s){
 if(!(n==null)){
  System.out.println("成功换购"+n);
 }
 System.out.println("本次消费总金额："+s+"元");
 if (huiyuan && xhuiyuan){
  System.out.println("尊敬的幸运会员，本次消费享受8折优惠");
  double x =s*0.8;
  System.out.println("折扣为您节省："+(s-x)+"元");
 }else if (huiyuan) {
  System.out.println("尊敬的会员，本次消费享受9折优惠");
  double x =s*0.9;
  System.out.println("折扣为您节省："+(s-x)+"元");
 }
 System.out.println("实际消费总金额："+s+"元");
 showMain();
 }


static void os(){
  switch (scanint()) {
  case 0:
  out(null,s);
  case 1:
  if(s>=52){
   out(bke,s+2);
  }else{
   Err();
  }
  case 2:
  if(s>=103){
   out(ke,s+3);
  }else{
   Err();
  }
  break;
  case 3:
  if(s>=110){
   out(m,s+10);
  }else{
   Err();
  }
  break;
  case 4:
  if(s>=210){
   out(ss,s+10);
  }else{
   Err();
  }
  break;
  case 5:
  if(s>=220){
   out(o,s+20);
  }else{
   Err();
  }
  break;
  default:
  System.out.println("请重新选择");
  os();
  }
 }


static void Err(){

  System.out.println("金额不足\n");
  main(null);
 } 
 static class user{
  static ArrayList<String>array=new ArrayList<>();
  static Preferences nodes = Preferences.systemRoot().node("user"); //创建节点
  static Preferences childnode = nodes.node( "user");  //创建子节点


public user() {
  outline();
  System.out.println("\t\t1,添加用户");
  System.out.println("\t\t2,删除用户");
  System.out.println("\t\t3,显示用户");
  System.out.println("\t\t4,返回上级");
  outline();
  try {
   int x=scanint();
   switch (x) {
   case 1:
   add();
   break;
   case 2:
   deluser();
   break;
   case 3:
   show();
   break;
   case 4:
   showMain();
   break;
   default:
   System.out.println("没有您要的选项！请重新选择");
    new user();
   break;
   }
  } catch (Exception e) {
  new user();
  } 
 }


private void deluser() throws BackingStoreException {
   System.out.println("请选择要删除用户的ID：\n按0返回上级");
   try {
   Scanner scan =new Scanner(System.in);
   int x = scan.nextInt();
   boolean remove=false;
   for (int i=0;i<array.size();i++){
    if(x==Integer.parseInt(array.get(i))){
    remove=true;
    }
   }
   if (remove){
    childnode.remove(Integer.toString(x));
    System.out.println("删除成功");
   }else if (x==0) {
   new user();
   }else {
   System.out.println("没有此用户！"); 
    deluser();
   }
   new user();
   } catch (Exception e) {
   System.out.println("请输入数字");
    deluser();
   }
 }


private static void show() {
  try {
   int leng =childnode.keys().length;
   syncread();
   if(leng==0){
   System.out.println("没有用户");
   }else{
   System.out.println("当前有"+childnode.keys().length+"位用户");
   for(int i = 0;i<=childnode.keys().length;i++){
    String shows =childnode.get(childnode.keys()[i], "");
    System.out.println(shows);
    System.out.println("──────────────────────────────────────────────"); 
   }
   }
  } catch (BackingStoreException e) {
  }
  new user();  
 }


private static void syncread() {
  try {
  String[] arr= childnode.keys();
  childnode.sync();
  array.clear();
  for(int i=0;i<arr.length;i++){
  array.add(arr[i]);
  }
  } catch (Exception e) {
  }
 }


private static void add(){
  Preferences nodes = Preferences.systemRoot().node("user"); //创建节点
  Preferences childnode = nodes.node( "user");  //创建子节点 
  outline();
  System.out.println("\t\t请输入用户信息");
  System.out.println("\t\t姓名,6位卡号,年龄,电话");
  System.out.println("\t\t回车换行区分");
  outline();
  syncread();
  String name =scanStr();
  int card = scanint();
  int age =scanint();
  String tel =scanStr();
  Random n=new Random();

  String id ;
   id = Integer.toString(n.nextInt(999)+1);
   try{
   childnode.put(id, "ID:"+id+" 姓名："+name+" 卡号："+card+" 年龄："+age+" 电话："+tel);
   syncread();
   System.out.println("第"+(childnode.keys().length)+"位会员添加成功");
   System.out.println("当前用户"+childnode.keys().length+"位\n"+array+"\n"+array.size());
   new user(); 
  } catch (Exception e) {
   new user(); 
  }
 }
 } 
}



package Teacher;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
public class persion {

	static int s;
	 static boolean huiyuan,xhuiyuan;
	 static String bke="���¿���",ke="500ml����һƿ",m="5�������",ss="1���ղ������˹�",o="ŷ����ˬ��ˮһƿ";
	 static ArrayList<String>array=new ArrayList<String>();
	 static Preferences customsnodes = Preferences.systemRoot().node("goods"); //�����ڵ�
	 static Preferences customschildnode = customsnodes.node( "goods");  //�����ӽڵ� 

	 public static void main(String []args) {


	  outline();
	  System.out.println("----------------------");
	  System.out.println("\t ��ӭʹ�ù���Աϵͳ");
	  System.out.println("\t 1.��½ϵͳ\n\t2.�˳�����\n ");
	  
	  outline();
	  int n =scanint(); 
	  if(n == 1){ 
	   login();  
	  }else if( n== 2){ 
	  System.out.println("���˳�");
	  System.exit(0);
	  }else {
	  System.out.println("������ѡ��");
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
	  System.out.println("��������,���������֣�");
	 }
	 return x; 
	 }

	 public static String scanStr(){
	 String x = null;
	 try {

	  Scanner scan =new Scanner(System.in);
	  x = scan.next();
	 } catch (Exception e) {
	  System.out.println("��������,�������ַ�����");
	 }
	 return x; 
	 }
	 public static void login(){
	  System.out.println(" * * * * * * * * * ��½ * * * * * * * * * * * *\n����������\n��");
	  int n1 =scanint();
	  if(n1==(123123)){
	  System.out.println("��½�ɹ�\n");
	  showMain();
	  }else{ 
	  System.out.println("�������");
	  System.out.println("��������������\n��");
	  login();
	  } 
	 }
	 private static void showMain() {
	 System.out.println("\n\n\t��ӭʹ�ù������ϵͳ\n"); 
	 outline(); 
	 System.out.println("\t\t 1. �� Ա �� Ϣ �� ��\n"); 
	 System.out.println("\t\t 2. �� �� �� Ϣ �� ��\n"); 
	 System.out.println("\t\t 3. �� �� �� ��\n"); 
	 System.out.println("\t\t 4. ע ��\n"); 
	 outline(); 
	 System.out.print("��ѡ��,��������:"); 
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
	  System.out.println("ע���ɹ�");
	  main(null);
	 default:
	  System.out.println("û����Ҫ��ѡ������������");
	  showMain();
	  break;
	 }
	 }
	 private static void customs() {
	 //��Ʒ���� �������Ʒ�� ��� Ʒ�� �۸�
	 // ɾ����ѡ����ɾ��

	 outline();
	 System.out.println("\t\t��Ʒ��Ϣ����\n");
	 System.out.println("\t\t1,��ʾ��Ʒ\n");
	 System.out.println("\t\t2,�����Ʒ\n");
	 System.out.println("\t\t3,ɾ����Ʒ\n");
	 System.out.println("\t\t4,�����ϼ�\n");
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
	   System.out.println("��ѡ��Ҫɾ����Ʒ��ID��\n��0�����ϼ�");
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
	    System.out.println("ɾ���ɹ�");
	    customs();
	   }else if (x==0) {
		   customs();
	   }else {
	   System.out.println("û�д���Ʒ��"); 
	    delcustoms();
	   }
	   new user();
	   } catch (Exception e) {
	   System.out.println("����������");
	    delcustoms();
	   }
	 }
	 private static void showcustoms() {
	  try {
	   int leng =customschildnode.keys().length;
	   syncread();
	   if(leng==0){
	   System.out.println("û����Ʒ");
	   }else{
	   try {
	    System.out.println("��ǰ��"+customschildnode.keys().length+"����Ʒ");
	    for(int i = 0;i<=customschildnode.keys().length;i++){
	    String shows =customschildnode.get(array.get(i), "");
	     System.out.println(shows);
	     System.out.println("��������������������������������������������������������������������������������������������"); 
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
  System.out.println("\t\t��������Ʒ��Ϣ");
  System.out.println("\t\tƷ��,�۸�(Ԫ),��λ");
  System.out.println("\t\t�س���������");
  outline();
  syncread();
  String name =scanStr();
  String nuit =scanStr();
  int price = scanint(); 
  Random n=new Random();
  String id ;
   id=Integer.toString(check(n.nextInt(999)+1));
   try{
	   customschildnode.put(id, "ID:"+id+" Ʒ����"+name+" �۸�"+price+" ��λ��"+nuit);
   syncread();
   System.out.println("��"+(customschildnode.keys().length)+"����Ʒ��ӳɹ�");
   System.out.println("��ǰ��Ʒ"+customschildnode.keys().length+"��\n"+array+"\n"+array.size());
   customs(); 
  } catch (Exception e) {
	  customs(); 
  }
 }


static void jiesuan(){
 try{
  System.out.println("�Ƿ��Ա����ѡ1 ��ѡ0");
  int x= scanint();
  if (x==1){
   huiyuan = true;
   Scanner sc =new Scanner(System.in); 
   System.out.println("���������Ļ�Ա�ţ�");
   int hui = sc.nextInt()/100%10;
   if(hui==9){
   System.out.println("��ϲ���������˻�Ա,��������ȫ�������Ż�");
   xhuiyuan = true;
   }else{
   xhuiyuan = false;
   }
  }else if (x==0) {
   huiyuan = false;
  }
  System.out.println("���������ѽ��:");
  Scanner scan =new Scanner(System.in); 
  if(scan.hasNext()){
  s=scan.nextInt();
  outline();
  System.out.println("�Ƿ�μ��Żݻ������" );
  System.out.println("1:��50Ԫ����2Ԫ����"+bke );
  System.out.println("2:��100Ԫ����3Ԫ����" +ke);
  System.out.println("3:��100Ԫ����10Ԫ����" +m );
  System.out.println("4:��200Ԫ����10Ԫ����" +ss );
  System.out.println("5:��200Ԫ����20Ԫ���� " +o );
  System.out.println("0��������\n��ѡ��\n" );
  outline();
  os();
  } 
 } catch (Exception e) {
  System.out.println("����������");
  jiesuan();

 }
 }


static void out(String n , double s){
 if(!(n==null)){
  System.out.println("�ɹ�����"+n);
 }
 System.out.println("���������ܽ�"+s+"Ԫ");
 if (huiyuan && xhuiyuan){
  System.out.println("�𾴵����˻�Ա��������������8���Ż�");
  double x =s*0.8;
  System.out.println("�ۿ�Ϊ����ʡ��"+(s-x)+"Ԫ");
 }else if (huiyuan) {
  System.out.println("�𾴵Ļ�Ա��������������9���Ż�");
  double x =s*0.9;
  System.out.println("�ۿ�Ϊ����ʡ��"+(s-x)+"Ԫ");
 }
 System.out.println("ʵ�������ܽ�"+s+"Ԫ");
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
  System.out.println("������ѡ��");
  os();
  }
 }


static void Err(){

  System.out.println("����\n");
  main(null);
 } 
 static class user{
  static ArrayList<String>array=new ArrayList<>();
  static Preferences nodes = Preferences.systemRoot().node("user"); //�����ڵ�
  static Preferences childnode = nodes.node( "user");  //�����ӽڵ�


public user() {
  outline();
  System.out.println("\t\t1,����û�");
  System.out.println("\t\t2,ɾ���û�");
  System.out.println("\t\t3,��ʾ�û�");
  System.out.println("\t\t4,�����ϼ�");
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
   System.out.println("û����Ҫ��ѡ�������ѡ��");
    new user();
   break;
   }
  } catch (Exception e) {
  new user();
  } 
 }


private void deluser() throws BackingStoreException {
   System.out.println("��ѡ��Ҫɾ���û���ID��\n��0�����ϼ�");
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
    System.out.println("ɾ���ɹ�");
   }else if (x==0) {
   new user();
   }else {
   System.out.println("û�д��û���"); 
    deluser();
   }
   new user();
   } catch (Exception e) {
   System.out.println("����������");
    deluser();
   }
 }


private static void show() {
  try {
   int leng =childnode.keys().length;
   syncread();
   if(leng==0){
   System.out.println("û���û�");
   }else{
   System.out.println("��ǰ��"+childnode.keys().length+"λ�û�");
   for(int i = 0;i<=childnode.keys().length;i++){
    String shows =childnode.get(childnode.keys()[i], "");
    System.out.println(shows);
    System.out.println("��������������������������������������������������������������������������������������������"); 
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
  Preferences nodes = Preferences.systemRoot().node("user"); //�����ڵ�
  Preferences childnode = nodes.node( "user");  //�����ӽڵ� 
  outline();
  System.out.println("\t\t�������û���Ϣ");
  System.out.println("\t\t����,6λ����,����,�绰");
  System.out.println("\t\t�س���������");
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
   childnode.put(id, "ID:"+id+" ������"+name+" ���ţ�"+card+" ���䣺"+age+" �绰��"+tel);
   syncread();
   System.out.println("��"+(childnode.keys().length)+"λ��Ա��ӳɹ�");
   System.out.println("��ǰ�û�"+childnode.keys().length+"λ\n"+array+"\n"+array.size());
   new user(); 
  } catch (Exception e) {
   new user(); 
  }
 }
 } 
}



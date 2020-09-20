//package Shixun;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Scanner;
//public class StudentManage {
//	//创建集合对象，用于存储学生数据
//    static ArrayList<Goods> array = new ArrayList<Goods>();
//    
//    public static void main(String[] args) {
//        manageMenu();
//    }
//    
//    private static void manageMenu() {
//		// TODO Auto-generated method stub
//
//        //用循环完成再次回到主界面
//        while (true) {
//            //用输出语句完主界面的编写
//            System.out.println("---------欢迎来到学生管理系统---------");
//            System.out.println("1. 我是老师");
//            System.out.println("2. 我是学生");
//            System.out.println("3. 退出");
//            System.out.println("请输入你的选择");
//            //用Scanner实现键盘录入数据
//            Scanner input = new Scanner(System.in);
//            String line = input.nextLine();
//            //用switch语句完成操作的选择
//            switch (line) {
//            
//                case "1":
////                    System.out.println("添加学生");
//                    teacherManage(array);
//                    break;
//                    
//                case "2":
////                    System.out.println("删除学生");
//                    studentManage(array);
//                    break;
//
//                case "3":
//                    System.out.println("谢谢使用");
//                    //break;
//                    System.exit(0);//JVM退出
//            }
//        }
//	}
//
//	//老师管理
//    public static void teacherManage(ArrayList<Goods> array) {
//    	
//    	while (true) {
//            //用输出语句完主界面的编写
//            System.out.println("---------欢迎来到学生管理系统---------");
//            System.out.println("1. 录入学生信息");
//            System.out.println("2. 修改学生信息");
//            System.out.println("3. 删除学生信息");
//            System.out.println("4. 显示学生信息");
//            System.out.println("5. 学生总分排序");
//            System.out.println("6. 返回上一层");
//            System.out.println("请输入你的选择");
//            //用Scanner实现键盘录入数据
//            Scanner input = new Scanner(System.in);
//            String line = input.nextLine();
//            //用switch语句完成操作的选择
//            switch (line) {
//            
//                case "1":
//                    addStudentMessage(array); // 录入学生信息
//                    break;
//                    
//                case "2":
//                    updateStudentMessage(array); // 修改学生信息
//                    break;
//                
//                case "3":
//                	deleteStudentMessage(array); // 删除学生信息
//                	break;
//                	
//                case "4":
//                	showStudentMessage(array); // 显示学生信息
//                	break;
//                	
//                case "5":
//                	sortStudentScore(array); // 学生总分排序
//                	break;
//                
//                case "6":
//                    manageMenu();
//            }
//        }
//    }
//    
//    // 学生总分排序
//    private static void sortStudentScore(ArrayList<Goods> array) {
//		// TODO Auto-generated method stub
//    	
////		Collections.sort(array, new Comparator<Goods>() {
////
////			@Override
////			public int compare(Goods o1, Goods o2) {
////				// TODO Auto-generated method stub
////					Integer i = o2.getSumScore() - o1.getSumScore(); // 先按照成绩排序
////					
////					 if(i == 0){  
////		                    return Integer.parseInt(o1.getUid()) - Integer.parseInt(o2.getUid());  
////		                }
////				return i;
////			}
////			
////		});
//    	int i = 1;
//    	//按照总分降序排序
//    	System.out.println("排名\t学号\t\t姓名\tJAVA\t数学\t英语\t总分");
//    	
//    	for (Goods s : array) {
//    		
////    		 System.out.println("第"+ i + "名\t" + s.getUid() + "\t" + s.getUsername() + "\t" + s.getJava() + "\t" + s.getMath() + "\t" + s.getEnglish() + "\t" + s.getSumScore());
//    		 i++;
//		}
//
//	}
//    
//    // 显示学生信息
//	private static void showStudentMessage(ArrayList<Goods> array) {
//		// TODO Auto-generated method stub
//    	//判断集合中是否有数据，如果没有显示提示信息。
//        if(array.size() == 0) {
//            System.out.println("无信息，请先录入学生信息再查询！");
//            //为了让程序不再往下执行。
//            return;
//        }
//
//        //显示表头信息
//        //\t其实就是tab键的位置
//        System.out.println("学号\t\t姓名\tJAVA\t数学\t英语\t总成绩");
//        //将集合中数据取出按照对应格式显示学生信息，年龄显示补充“岁”
//        for (int i = 0; i < array.size(); i++) {
//            Goods s = array.get(i);
////            System.out.println(s.getUid() + "\t" + s.getUsername() + "\t" + s.getJava() + "\t" + s.getMath() + "\t" + s.getEnglish() + "\t" + s.getSumScore());
//        }
//		
//	}
//
//	// 删除学生成绩
//    private static void deleteStudentMessage(ArrayList<Goods> array) {
//		// TODO Auto-generated method stub
//    	
//    	 //键盘录入要删除的学生学号，显示提示信息。
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("请输入你要删除的学号：");
//        String uid = input.nextLine();
//        //再删除/修改学生操作前，对学号是否存在进行判断
//        //如果不存在，显示提示信息
//        //如在存在，进行遍历集合操作将对应学生对象从集合中删除
//        int index = -1;
//        for (int i = 0; i < array.size(); i++) {
//            Goods s = array.get(i);
////            if(s.getUid().equals(uid)) {
////                index = i;
////                break;
////            }
//        }
//        if(index == -1) {
//            System.out.println("该信息不存在，请重新输入");
//        }else {
//            array.remove(index);
//            //给出删除成功提示
//            System.out.println("删除学生成功");
//        }
//        
//	}
//    
//    // 修改学生成绩
//	private static void updateStudentMessage(ArrayList<Goods> array) {
//		// TODO Auto-generated method stub
//		//键盘录入要修改的学生学号，显示提示信息
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("请输入你要修改的学生的学号");
//        String uid = input.nextLine();
//        int flag = -1;
//        for (int j = 0; j < array.size(); j++) {
//        	
//            Goods s1 = array.get(j);
//            if(s1.getUid().equals(uid)) {
//            	
//                flag = j;
//                break;
//                
//            }
//            
//        }
//        if(flag == -1) {
//        	
//            System.out.println("该信息不存在，无法修改，请重新输入！");
//            return;
//            
//        }else {
//        	
//            //键盘录入要修改的学生信息
//            System.out.println("请输入学生新姓名：");
//            String username = input.nextLine();
//            System.out.println("请输入学生新JAVA成绩：");
//            int java = input.nextInt();
//            System.out.println("请输入学生新数学成绩：");
//            int math = input.nextInt();
//            System.out.println("请输入学生新英语成绩：");
//            int english = input.nextInt();
//            
//            //创建学生对象
//            Goods s = new Goods();
//            s.setUid(uid);
//            s.setUsername(username);
//            s.setJava(java);
//            s.setMath(math);
//            s.setEnglish(english);
//            s.setSumScore(s.getJava() + s.getMath() + s.getEnglish());
//            //根据上面的索引值修改对应的学生信息
//            array.set(flag, s);
//
//            }
//        
//        //给出修改成功提示
//        System.out.println("修改学生成功");
//		
//	}
//	
//	// 录入学生成绩
//	private static void addStudentMessage(ArrayList<Goods> array) {
//		// TODO Auto-generated method stub
//		 //键盘录入学生对象所需要的数据，显示提示信息，提示要输入何种信息
//        Scanner input = new Scanner(System.in);
//        
//        //为了uid在while循环外面被访问到，我们就把他定义在了循环外；
//        String uid;
//        
//        //为了让程序回到这里，我们使用循环实现
//        while(true) {
//            System.out.println("请输入学生学号(建议最多9位)");
//            uid = input.nextLine();
//            boolean flag = isUsed(array, uid);
//            if (flag) {
//                System.out.println("你输入的学号已经被使用，请重新输入!");
//            } else {
//                break;
//            }
//        }
//        
//            System.out.println("请输入学生姓名");
//            String username = input.nextLine();
//            System.out.println("请输入学生JAVA成绩");
//            int java = input.nextInt();
//            System.out.println("请输入学生数学成绩");
//            int math = input.nextInt();
//            System.out.println("请输入学生英语成绩");
//            int english = input.nextInt();
//            
//            //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
//            Goods s = new Goods();
//            s.setUid(uid);
//            s.setUsername(username);
//            s.setJava(java);
//            s.setMath(math);
//            s.setEnglish(english);
//            s.setSumScore(s.getJava() + s.getMath() + s.getEnglish());
//            //把学生对象添加到集合中
//            array.add(s);
//            System.out.println("添加学生成功");
//		
//	}
//
//	//学生管理
//    public  static void studentManage(ArrayList<Goods> array) {
//    	System.out.println("请输入学号查找成绩(不能用姓名,姓名可能会重复): ");
//    	Scanner input = new Scanner(System.in);
//    	String uid = input.nextLine();
//    	int flag = -1;
//    	Goods s = new Goods();
//    	
//    	System.out.println("学号\t\t姓名\tJAVA\t数学\t英语\t总成绩");
//    	for (int i = 0; i < array.size(); i++) {
//			s = array.get(i);
//			if(uid.equals(s.getUid())) {
//				flag = 1;
//			}
//		}
//    	if(flag == 1) {
//    		System.out.println(s.getUid() + "\t" + s.getUsername() + "\t" + s.getJava() + "\t" + s.getMath() + "\t" + s.getEnglish() + "\t" + s.getSumScore());
//    	}else {
//    		System.out.println("此学号暂无信息,请稍后查询");
//    	}
//    }
//    
//    
// 
//    //添加一个方法，判断学号是否被使用
//    public static boolean isUsed(ArrayList<Goods> array, String uid) {
//        //如果与集合中的某一个学生学号相同，返回true；如果都不相同，返回false
//        boolean flag = false;
//        for (int i = 0; i < array.size(); i++) {
//            Goods s = array.get(i);
//            if(s.getUid().equals(uid)) {
//                flag = true;
//                break;
//            }
//        }
//        return flag;
//    }
//}
//

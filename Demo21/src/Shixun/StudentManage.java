//package Shixun;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Scanner;
//public class StudentManage {
//	//�������϶������ڴ洢ѧ������
//    static ArrayList<Goods> array = new ArrayList<Goods>();
//    
//    public static void main(String[] args) {
//        manageMenu();
//    }
//    
//    private static void manageMenu() {
//		// TODO Auto-generated method stub
//
//        //��ѭ������ٴλص�������
//        while (true) {
//            //����������������ı�д
//            System.out.println("---------��ӭ����ѧ������ϵͳ---------");
//            System.out.println("1. ������ʦ");
//            System.out.println("2. ����ѧ��");
//            System.out.println("3. �˳�");
//            System.out.println("���������ѡ��");
//            //��Scannerʵ�ּ���¼������
//            Scanner input = new Scanner(System.in);
//            String line = input.nextLine();
//            //��switch�����ɲ�����ѡ��
//            switch (line) {
//            
//                case "1":
////                    System.out.println("���ѧ��");
//                    teacherManage(array);
//                    break;
//                    
//                case "2":
////                    System.out.println("ɾ��ѧ��");
//                    studentManage(array);
//                    break;
//
//                case "3":
//                    System.out.println("ллʹ��");
//                    //break;
//                    System.exit(0);//JVM�˳�
//            }
//        }
//	}
//
//	//��ʦ����
//    public static void teacherManage(ArrayList<Goods> array) {
//    	
//    	while (true) {
//            //����������������ı�д
//            System.out.println("---------��ӭ����ѧ������ϵͳ---------");
//            System.out.println("1. ¼��ѧ����Ϣ");
//            System.out.println("2. �޸�ѧ����Ϣ");
//            System.out.println("3. ɾ��ѧ����Ϣ");
//            System.out.println("4. ��ʾѧ����Ϣ");
//            System.out.println("5. ѧ���ܷ�����");
//            System.out.println("6. ������һ��");
//            System.out.println("���������ѡ��");
//            //��Scannerʵ�ּ���¼������
//            Scanner input = new Scanner(System.in);
//            String line = input.nextLine();
//            //��switch�����ɲ�����ѡ��
//            switch (line) {
//            
//                case "1":
//                    addStudentMessage(array); // ¼��ѧ����Ϣ
//                    break;
//                    
//                case "2":
//                    updateStudentMessage(array); // �޸�ѧ����Ϣ
//                    break;
//                
//                case "3":
//                	deleteStudentMessage(array); // ɾ��ѧ����Ϣ
//                	break;
//                	
//                case "4":
//                	showStudentMessage(array); // ��ʾѧ����Ϣ
//                	break;
//                	
//                case "5":
//                	sortStudentScore(array); // ѧ���ܷ�����
//                	break;
//                
//                case "6":
//                    manageMenu();
//            }
//        }
//    }
//    
//    // ѧ���ܷ�����
//    private static void sortStudentScore(ArrayList<Goods> array) {
//		// TODO Auto-generated method stub
//    	
////		Collections.sort(array, new Comparator<Goods>() {
////
////			@Override
////			public int compare(Goods o1, Goods o2) {
////				// TODO Auto-generated method stub
////					Integer i = o2.getSumScore() - o1.getSumScore(); // �Ȱ��ճɼ�����
////					
////					 if(i == 0){  
////		                    return Integer.parseInt(o1.getUid()) - Integer.parseInt(o2.getUid());  
////		                }
////				return i;
////			}
////			
////		});
//    	int i = 1;
//    	//�����ֽܷ�������
//    	System.out.println("����\tѧ��\t\t����\tJAVA\t��ѧ\tӢ��\t�ܷ�");
//    	
//    	for (Goods s : array) {
//    		
////    		 System.out.println("��"+ i + "��\t" + s.getUid() + "\t" + s.getUsername() + "\t" + s.getJava() + "\t" + s.getMath() + "\t" + s.getEnglish() + "\t" + s.getSumScore());
//    		 i++;
//		}
//
//	}
//    
//    // ��ʾѧ����Ϣ
//	private static void showStudentMessage(ArrayList<Goods> array) {
//		// TODO Auto-generated method stub
//    	//�жϼ������Ƿ������ݣ����û����ʾ��ʾ��Ϣ��
//        if(array.size() == 0) {
//            System.out.println("����Ϣ������¼��ѧ����Ϣ�ٲ�ѯ��");
//            //Ϊ���ó���������ִ�С�
//            return;
//        }
//
//        //��ʾ��ͷ��Ϣ
//        //\t��ʵ����tab����λ��
//        System.out.println("ѧ��\t\t����\tJAVA\t��ѧ\tӢ��\t�ܳɼ�");
//        //������������ȡ�����ն�Ӧ��ʽ��ʾѧ����Ϣ��������ʾ���䡰�ꡱ
//        for (int i = 0; i < array.size(); i++) {
//            Goods s = array.get(i);
////            System.out.println(s.getUid() + "\t" + s.getUsername() + "\t" + s.getJava() + "\t" + s.getMath() + "\t" + s.getEnglish() + "\t" + s.getSumScore());
//        }
//		
//	}
//
//	// ɾ��ѧ���ɼ�
//    private static void deleteStudentMessage(ArrayList<Goods> array) {
//		// TODO Auto-generated method stub
//    	
//    	 //����¼��Ҫɾ����ѧ��ѧ�ţ���ʾ��ʾ��Ϣ��
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("��������Ҫɾ����ѧ�ţ�");
//        String uid = input.nextLine();
//        //��ɾ��/�޸�ѧ������ǰ����ѧ���Ƿ���ڽ����ж�
//        //��������ڣ���ʾ��ʾ��Ϣ
//        //���ڴ��ڣ����б������ϲ�������Ӧѧ������Ӽ�����ɾ��
//        int index = -1;
//        for (int i = 0; i < array.size(); i++) {
//            Goods s = array.get(i);
////            if(s.getUid().equals(uid)) {
////                index = i;
////                break;
////            }
//        }
//        if(index == -1) {
//            System.out.println("����Ϣ�����ڣ�����������");
//        }else {
//            array.remove(index);
//            //����ɾ���ɹ���ʾ
//            System.out.println("ɾ��ѧ���ɹ�");
//        }
//        
//	}
//    
//    // �޸�ѧ���ɼ�
//	private static void updateStudentMessage(ArrayList<Goods> array) {
//		// TODO Auto-generated method stub
//		//����¼��Ҫ�޸ĵ�ѧ��ѧ�ţ���ʾ��ʾ��Ϣ
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("��������Ҫ�޸ĵ�ѧ����ѧ��");
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
//            System.out.println("����Ϣ�����ڣ��޷��޸ģ����������룡");
//            return;
//            
//        }else {
//        	
//            //����¼��Ҫ�޸ĵ�ѧ����Ϣ
//            System.out.println("������ѧ����������");
//            String username = input.nextLine();
//            System.out.println("������ѧ����JAVA�ɼ���");
//            int java = input.nextInt();
//            System.out.println("������ѧ������ѧ�ɼ���");
//            int math = input.nextInt();
//            System.out.println("������ѧ����Ӣ��ɼ���");
//            int english = input.nextInt();
//            
//            //����ѧ������
//            Goods s = new Goods();
//            s.setUid(uid);
//            s.setUsername(username);
//            s.setJava(java);
//            s.setMath(math);
//            s.setEnglish(english);
//            s.setSumScore(s.getJava() + s.getMath() + s.getEnglish());
//            //�������������ֵ�޸Ķ�Ӧ��ѧ����Ϣ
//            array.set(flag, s);
//
//            }
//        
//        //�����޸ĳɹ���ʾ
//        System.out.println("�޸�ѧ���ɹ�");
//		
//	}
//	
//	// ¼��ѧ���ɼ�
//	private static void addStudentMessage(ArrayList<Goods> array) {
//		// TODO Auto-generated method stub
//		 //����¼��ѧ����������Ҫ�����ݣ���ʾ��ʾ��Ϣ����ʾҪ���������Ϣ
//        Scanner input = new Scanner(System.in);
//        
//        //Ϊ��uid��whileѭ�����汻���ʵ������ǾͰ�����������ѭ���⣻
//        String uid;
//        
//        //Ϊ���ó���ص��������ʹ��ѭ��ʵ��
//        while(true) {
//            System.out.println("������ѧ��ѧ��(�������9λ)");
//            uid = input.nextLine();
//            boolean flag = isUsed(array, uid);
//            if (flag) {
//                System.out.println("�������ѧ���Ѿ���ʹ�ã�����������!");
//            } else {
//                break;
//            }
//        }
//        
//            System.out.println("������ѧ������");
//            String username = input.nextLine();
//            System.out.println("������ѧ��JAVA�ɼ�");
//            int java = input.nextInt();
//            System.out.println("������ѧ����ѧ�ɼ�");
//            int math = input.nextInt();
//            System.out.println("������ѧ��Ӣ��ɼ�");
//            int english = input.nextInt();
//            
//            //����ѧ�����󣬰Ѽ���¼������ݸ�ֵ��ѧ������ĳ�Ա����
//            Goods s = new Goods();
//            s.setUid(uid);
//            s.setUsername(username);
//            s.setJava(java);
//            s.setMath(math);
//            s.setEnglish(english);
//            s.setSumScore(s.getJava() + s.getMath() + s.getEnglish());
//            //��ѧ��������ӵ�������
//            array.add(s);
//            System.out.println("���ѧ���ɹ�");
//		
//	}
//
//	//ѧ������
//    public  static void studentManage(ArrayList<Goods> array) {
//    	System.out.println("������ѧ�Ų��ҳɼ�(����������,�������ܻ��ظ�): ");
//    	Scanner input = new Scanner(System.in);
//    	String uid = input.nextLine();
//    	int flag = -1;
//    	Goods s = new Goods();
//    	
//    	System.out.println("ѧ��\t\t����\tJAVA\t��ѧ\tӢ��\t�ܳɼ�");
//    	for (int i = 0; i < array.size(); i++) {
//			s = array.get(i);
//			if(uid.equals(s.getUid())) {
//				flag = 1;
//			}
//		}
//    	if(flag == 1) {
//    		System.out.println(s.getUid() + "\t" + s.getUsername() + "\t" + s.getJava() + "\t" + s.getMath() + "\t" + s.getEnglish() + "\t" + s.getSumScore());
//    	}else {
//    		System.out.println("��ѧ��������Ϣ,���Ժ��ѯ");
//    	}
//    }
//    
//    
// 
//    //���һ���������ж�ѧ���Ƿ�ʹ��
//    public static boolean isUsed(ArrayList<Goods> array, String uid) {
//        //����뼯���е�ĳһ��ѧ��ѧ����ͬ������true�����������ͬ������false
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

package Twelve;

public class San {

	public static void main(String[] args) {
		char[][] ChunXiao=new char[4][];
		ChunXiao[0]=new char[5];
		ChunXiao[0][0]='��';
		ChunXiao[0][1]='��';
		ChunXiao[0][2]='��';
		ChunXiao[0][3]='��';
		ChunXiao[0][4]='��';
		
		ChunXiao[1]=new char[] {'��','��','��','��','��'};
		ChunXiao[2]=new char[]{'ҹ','��','��','��','��'};
		ChunXiao[3]=new char[]{'��','��','֪','��','��'};
		
		for(char[] clause:ChunXiao) {
			for(char word:clause) {
				System.out.print(" "+word);
			}
		System.out.println();
		}
		System.out.println("-------��ʫ��˳��----------");
		for(int i=0;i<ChunXiao[0].length;i++) {
			for(int j=0;j<ChunXiao.length;j++) {
				System.out.print(" "+ChunXiao[ChunXiao.length-1-j][i]);
			}
			System.out.println();
		}
	}


	}



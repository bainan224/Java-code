package Twelve;

public class San {

	public static void main(String[] args) {
		char[][] ChunXiao=new char[4][];
		ChunXiao[0]=new char[5];
		ChunXiao[0][0]='春';
		ChunXiao[0][1]='眠';
		ChunXiao[0][2]='不';
		ChunXiao[0][3]='觉';
		ChunXiao[0][4]='晓';
		
		ChunXiao[1]=new char[] {'处','处','闻','啼','鸟'};
		ChunXiao[2]=new char[]{'夜','来','风','雨','声'};
		ChunXiao[3]=new char[]{'花','落','知','多','少'};
		
		for(char[] clause:ChunXiao) {
			for(char word:clause) {
				System.out.print(" "+word);
			}
		System.out.println();
		}
		System.out.println("-------古诗词顺序----------");
		for(int i=0;i<ChunXiao[0].length;i++) {
			for(int j=0;j<ChunXiao.length;j++) {
				System.out.print(" "+ChunXiao[ChunXiao.length-1-j][i]);
			}
			System.out.println();
		}
	}


	}



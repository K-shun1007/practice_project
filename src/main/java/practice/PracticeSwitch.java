package practice;

public class PracticeSwitch {
	public static void main(String[] args){
	    int[] classcode = {1,2,3,4,5};
	    String[] name = {"勇者","バトルマスター","パラディン","海賊","魔法剣士"};

	    for (int i = 0; i < 5; i++){
	      System.out.print(name[i]);

	      switch(classcode[i]){
	        case 1:
	          System.out.println();
	          break;
	        case 2:
	          System.out.println();
	          break;
	        case 3:
	          System.out.println();
	          break;
	        case 4:
	          System.out.println();
	          break;
	        case 5:
	          System.out.println();
	          break;
	      }
	    }
	  }
}

package kr.hs.dgsw.java.K0413;

public class studyArray {
	public void studyArray() {
		
		//배열 선언
		/*int[] array1;
		int array2[];*/
		
		//배열 정의
		int[] array = new int[5];
		array[0] = 1;
		array[1] = 3;
		/*for (int i =0; i<10; i++) {
		System.out.println(array[i]);
		}*/
		
		
		//배열의 초기값
	    int[] intArray = new int[1];
	    double[] doubleArray = new double[1];
	    boolean[] booleanArray = new boolean[1];
	    String[] StringArray = new String[1];
	    
	    System.out.println(intArray[0]);
	    System.out.println(doubleArray[0]);
	    System.out.println(booleanArray[0]);
	    System.out.println(StringArray[0]);
	    
	    
	    //배열의 정의와 초기화
	    String[] colors = {"red","green","black"};
	    for (int i =0; i<3; i++) {
		System.out.println(colors[i]);
		}
	    
	    /* 평균값 구하기 */
	    
	   int[] age = {18,20,30,12,33,7,2,80,15,17,20};
	   
	   double average = 0;
	   
	   for (int i=0; i< age.length; i++) average += age[i];
	   average /= age.length;
	   System.out.printf("평균 나이 : %.2f\n",average);
	   
	   
	   
	   int value1 = 5;
	   int value2 = value1;
	   value2 = 10;
	   
	   System.out.printf("value :"+" "+value1+" "+value2+"\n");
	   
	   int[] array1 = {1,2,3};
	   int[] array2 = array1;
	   int[] array3 = copy(array1);
	   array2[1]=100;
	   System.out.printf("array :"+" "+array1[1]+" "+array2[1]+" "+array3[1]+" "+"\n");
	}
	public int[] copy(int[] array){
		int[] arr = new int[array.length];
		for(int i=0; i<array.length; i++)arr[i]=array[i];
				
		return arr;
	}

	public static void main(String[] args) {
		studyArray study = new studyArray();
		study.studyArray();
	}
}

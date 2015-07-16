class hw40{
	public static void main (String []args){
		int [] arr = new int [10];
		arr [0] = Integer.parseInt(args[0]);
		arr [1] = Integer.parseInt(args[1]);
		arr [2] = Integer.parseInt(args[2]);
		arr [3] = Integer.parseInt(args[3]);
		arr [4] = Integer.parseInt(args[4]);
		arr [5] = Integer.parseInt(args[5]);
		arr [6] = Integer.parseInt(args[6]);
		arr [7] = Integer.parseInt(args[7]);
		arr [8] = Integer.parseInt(args[8]);
		arr [9] = Integer.parseInt(args[9]);
		int sum = 0;
		for (int i=0; i <10;i++){
			sum += arr[i];
		}
		System.out.println (sum);
		
	}
}
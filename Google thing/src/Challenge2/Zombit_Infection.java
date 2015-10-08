package Challenge2;

public class Zombit_Infection {
	int[][] infected;
	int x;
	int y;
	int strength;
	int length;
	int height;
	
	public Zombit_Infection(int[][] array, int x, int y, int strength){
		this.infected = array;
		
		this.x = x;
		this.y = y;
		this.strength = strength;
		this.length = array.length;
		this.height = array[0].length;
		infect(x,y);
		for(int i=0; i<length; i++){
			for(int j=0; j<height; j++){
				System.out.print(infected[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private int[][] infect(int x, int y){
		if(infected[y][x] <= strength && infected[y][x] != -1){
			infected[y][x] = -1;
			if(x < height-1){
				infect(x+1, y);
			}
			if(x > 0){
				infect(x-1, y);
			}
			if(y < length-1){
				infect(x, y+1);
			}
			if(y > 0){
				infect(x, y-1);
			}
		}
		return infected;
	}
	
	public static void main(String args[]){
		int[][] array = new int[][]{{4, 3},{4,3},{3,1}};
		System.out.print(array[2][1]);
		@SuppressWarnings("unused")
		Zombit_Infection zi = new Zombit_Infection(array, 1, 2, 5);
	}
}

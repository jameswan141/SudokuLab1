package pkgHelper;

public class LatinSquare {
	
	private int[][] LatinSquare;
	
	public LatinSquare() {
		super();
	}

	public LatinSquare(int[][] latinSquare) {
		super();
		LatinSquare = latinSquare;
	}
	
	public int[][] getLatinSquare(){
		return LatinSquare;
	}
	
	public void setLatinSquare(int[][] myLatinSquare) {
		LatinSquare=myLatinSquare;
	}
	
	public boolean hasDuplicates(int[] myArray) {
		for (int i=0;i<myArray.length-1;i++) {
			int val = myArray[i];
			if (i==0) {
				for (int j=1;j<myArray.length;j++) {
					if (myArray[j]==val) return true;
				}
			}else {
				for (int j=0;j<i;j++) {
					if (myArray[j]==val) return true;
				}for (int j=i+1;j<myArray.length;j++) {
					if (myArray[j]==val) return true;
				}
			}
		}return false;
	}
	
	public boolean doesElementExist(int[] myArray, int myInt) {
		for (int i=0;i<myArray.length;i++) {
			if (myArray[i]==myInt)
				return true;
		}return false;
	}
	
	public boolean hasAllValues(int[] first, int[] second) {
		boolean[] check = new boolean[first.length];
		for (int i=0;i<first.length;i++) {
			int val=first[i];
			for (int j=0;j<second.length;j++) {
				if (second[j]==val)
					check[i]=true;
			}
		}
		for (int i=0;i<check.length;i++) {
			if (check[i]==false)
				return false;
		}return true;
	}
	
	public int[] getColumn(int column) {
		int[] myColumn = new int[LatinSquare.length];
		
		for (int i=0;i<LatinSquare.length;i++) {
			myColumn[i] = LatinSquare[i][column];
		}
		return myColumn;
	}
	
	public int[] getRow(int row) {
		return LatinSquare[row];
	}
	
	public boolean ContainsZero(){
		for (int i=0;i<LatinSquare.length;i++) {
			for (int j=0;j<LatinSquare[i].length;j++) {
				if (LatinSquare[i][j]==0)
					return true;
			}
		}return false;
	}

	public boolean isLatinSquare() {
		if (ContainsZero()==true) return false;
		for (int i=0;i<LatinSquare.length;i++) {
			int[] myColumn=getColumn(i);
			if (hasDuplicates(LatinSquare[i])==true || hasDuplicates(myColumn)==true) return false;
			int[] vals = new int[LatinSquare.length];
			for (int j=0;j<LatinSquare.length;j++) {
				vals[j] = j+1;
			}
			
			if (hasAllValues(LatinSquare[i],vals)==false || hasAllValues(myColumn,vals)==false) return false;
		}
		return true;
	}
	
}

import java.util.ArrayList;

public class FakeDie {

	private ArrayList<Integer> fakeRolls;
	private int indexOfNextValue;
	
	public FakeDie(){
		this(new int []{1,2,3,4,5,6});
	}

	
	public FakeDie(int[] is) {
		// TODO Auto-generated constructor stub
		fakeRolls = new ArrayList<Integer>();
		for (int i : is)
			fakeRolls.add(i);
		if (is.length==0)
			fakeRolls.add(1);
	}


	public void roll()
	{
		indexOfNextValue++;
		
		if (indexOfNextValue >= fakeRolls.size())
		{
			indexOfNextValue = 0;
		}

	}
	
	public int getLastRoll()
	{
		return fakeRolls.get(indexOfNextValue);
		
	}
	
	public ArrayList<Integer> getFakeRolls() {
		return fakeRolls;
	}

	public void setFakeRolls(ArrayList<Integer> fakeRolls) {
		this.fakeRolls = fakeRolls;
	}


	public int getIndexOfNextValue() {
		return indexOfNextValue;
	}


	public void setIndexOfNextValue(int indexOfNextValue) {
		this.indexOfNextValue = indexOfNextValue;
	}
}


public class PurdueChallange2 {

	public static void main(String[] args) 
	{
		System.out.println(compareCurrency(68));
		System.out.println(compareCurrency(105));
		System.out.println(compareCurrency(22));

	}
	
	public static boolean compareCurrency(int dol)
	{
		boolean moreEfficent = true;
		int hundred;
		if(dol > 100)
			{
			hundred = dol % 100;
			}
		else
			{	
			hundred = 100 / dol;
			}
		System.out.println(hundred);
		
		
		return moreEfficent;
	}

}

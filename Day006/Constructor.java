class Bead
{
	int count;

	public Bead(int count)
	{
		this.count = count;	
	}
		
	public int getBead(int num)
	{
		count += num;
		return count;
	}

	public int loseBead(int num)
	{
		count -= num;
		return count;
	}

	public void print()
	{
		System.out.println("구슬의 개수 : " + count);
	}
}

class BeadMain
{
	public static void main(String[] args)
	{
		Bead bead1 = new Bead(15);
		Bead bead2 = new Bead(9);

		// 첫번째
		bead1.getBead(2);
		bead2.loseBead(2);

		// 두번째
		bead1.loseBead(7);
		bead2.getBead(7);

		bead1.print();
		bead2.print();
	}
}
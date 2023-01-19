class Bead
{
	String name;
	int count;

	public Bead(String name, int count)
	{
		this.name = name;
		this.count = count;
	}
		
	public void getBead(Bead bead, int num)
	{
		this.count += bead.loseBead(num);
	}

	public int loseBead(int num)
	{
		if(this.count < num)
		{
			int temp = this.count;
			this.count = 0;
			return temp;	
		}

		this.count -= num;
		return num;
	}

	public void print()
	{
		System.out.println(name +" 구슬의 개수 : " + count);
	}
}

class BeadMain
{
	public static void main(String[] args)
	{
		Bead bead1 = new Bead("어린이1", 15);
		Bead bead2 = new Bead("어린이2", 9);

		// 첫번째
		bead1.getBead(bead2, 2);

		// 두번째
		bead2.getBead(bead1, 7);

		bead1.print();
		bead2.print();
	}
}
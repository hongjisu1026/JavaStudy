class BeadMain
{
	public static void main(String[] args)
	{
		Child c1 = new Child("어린이1", 15);
		Child c2 = new Child("어린이2", 9);

		c1.win(c2, 2);
		c1.print();
		c2.print();

		c2.win(c1, 7);
		c1.print();
		c2.print();
	}
}

class Child
{
	String name;
	int bead;
	public Child(String name, int bead)
	{
		this.name = name;
		this.bead = bead;
	}

	public void win(Child child, int bead)
	{
		this.bead += child.lose(bead);
	}

	public int lose(int bead)
	{
		this.bead -= bead;
		return bead;
	}

	public void print()
	{
		System.out.println(name + "의 보유자산 : " + bead);
	}
}
class PhoneInfo
{
    private String name;
    private String phone;
    private String birth;
/*
    public PhoneInfo(String name, String phone, String birth)
    {
        this.name = name;
        this.phone = phone;
        this.birth = birth;
    }
    public void showPhoneInfo()
    {
        System.out.println("name : " + name);
        System.out.println("phone : " + phone);
        System.out.println("birth : " + birth);
    }
*/
	public String initPhoneInfo(String name, String phone, String birth)
	{
		this.name = name;
		this.phone = phone;
		this.birth = birth;

		return name;
	}
	
    public String getName()
    {
        return name;
    }
}

class PhoneMain
{
	public static void main(String[] args)
	{
		PhoneInfo info = new PhoneInfo();
		System.out.println(info.initPhoneInfo("홍", "134", "1234"));
	}
}
		
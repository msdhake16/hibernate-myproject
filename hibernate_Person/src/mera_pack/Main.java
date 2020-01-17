package mera_pack;

public class Main {

	public static void main(String[] args) 
	{
		Person p = new Person();
		p.setName("MAnoj");
		p.setGender("MAle");
		p.setAge(23);
		
		PersonDAO perdao = new PersonImplDAO();
		Intermediate il = new Intermediate(perdao);
		
		il.add(p);
		System.out.println(il.getElements());
		
		System.out.println("kaam hogaya bc");

	}

}

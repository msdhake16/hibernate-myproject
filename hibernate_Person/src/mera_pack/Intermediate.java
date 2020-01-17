package mera_pack;

public class Intermediate 
{
	private PersonDAO perdao;

	public Intermediate(PersonDAO perdao) {
		this.perdao = perdao;
	}
	
	public void add(Person per)
	{
		perdao.insert(per);
	}
	
	public Person getElements()
	{
		return perdao.get();
	}
}

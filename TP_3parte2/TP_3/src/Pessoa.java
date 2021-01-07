public class Pessoa {
	
	protected static int kp;
	protected String nome;
	protected String sexo;
	protected int idade;
	
	public Pessoa()
	{
		
	}
	
	public Pessoa(String nom, String sex, int ida)
	{
		nome = nom;
		sexo = sex;
		idade = ida;
	}
	
	public static void setKp() 
	{
		
	}
	
	public void setNome(String nom)
	{
		nome = nom;
	}
	
	public void setSexo(String sex)
	{
		sexo = sex;
	}
	
	public void setIdade(int ida)
	{
		idade = ida;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public String getSexo()
	{
		return sexo;
	}
	
	public int getIdade()
	{
		return idade;
	}
	
	
}

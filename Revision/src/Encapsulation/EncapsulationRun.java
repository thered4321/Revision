package Encapsulation;

public class EncapsulationRun {

	public static void main(String[] args) 
	{
		EncapsulationTest encap = new EncapsulationTest();
		
		encap.setName("Anand");
		encap.setId("Anda7653");
		encap.setAge(26);

		System.out.println("The details are:");
		System.out.println("name:"+encap.getName());
		System.out.println("Id:" + encap.getId());
		System.out.println("Age:" + encap.getAge() );
		
	}

}

package day9;

interface SoftDrink{
	String taste(String taste);
	String colour(String colr);
}

class Maaza implements SoftDrink{

	@Override
	public String taste(String tst) {
		// TODO Auto-generated method stub
		System.out.println("Taste of the Maaza is : "+tst);
		return tst;
	}

	@Override
	public String colour(String clr) {
		// TODO Auto-generated method stub
		System.out.println("Colr of the Maaza is : "+clr);

		return  clr;
	}

}
class Fizz implements SoftDrink{

	@Override
	public String taste(String tst) {
		// TODO Auto-generated method stub
		System.out.println("Taste of the Fizz is : "+tst);
		return tst;
	}

	@Override
	public String colour(String clr) {
		// TODO Auto-generated method stub
		System.out.println("Colr of the Fizz is : "+clr);

		return  clr;
	}

}

public class SoftDrinksDemo {
	public static void main(String[] args) {
		SoftDrink d=new Maaza();
		SoftDrink d1=new Fizz();
		d1.colour("Brown");
		d1.taste("Apple");
		d.colour("Yellow");
		d.taste("Mango");

	}

}
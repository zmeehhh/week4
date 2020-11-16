import SemuaCircle.CircleKecil.Circle;

public class DriverCircle{

	public static void main(String[] args) {
		Circle bulat, bulat1, bulat2, bulat3;
		bulat = new Circle();  //default constructor
		System.out.println("Print apa ?" + bulat); //call method toString

		bulat1 = new Circle(76); //overloading constructor 1 parameter
		System.out.println("Print apa ?" + bulat1); //call method toString

		bulat2 = new Circle(8,3); //overloading constructor 2 parameter
		System.out.println("Print apa ?" + bulat2); //call method toString

		bulat3 = new Circle(8,3); //overloading constructor 2 parameter
		System.out.println("Print apa ?" + bulat3); //call method toString
	
		System.out.println("Ukurlilit = " + UkurLilit(bulat3.getJejari()));

		System.out.println("Ukurlilit = " + Circle.UkurLilit(bulat3.getJejari()));
	
		System.out.println("Luas ialah " + KiraLuas(bulat2));
	
		System.out.println("Paparan adalah = " + Papar());
	}

	//static method that return a reference (object)
	public static Circle Papar(){
		int j = 5;

		return new Circle(j); //create objek
	}

	//call by reference static method that accept object as its parameter
	public static double KiraLuas(Circle b){
		return b.getJejari() * b.getJejari() * Math.PI;
	}

	public static double UkurLilit (double jejari) {
		return 2 * Math.PI * jejari; //Math.pow(2)
	}
}
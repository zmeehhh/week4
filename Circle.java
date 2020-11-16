package SemuaCircle.CircleKecil; //create package here

public class Circle{
	//field or attribute
	private double jejari, x; //non-static field
	public static int bilObjekWujud = 0; //static field

	//overload method toString
	public String toString(){
		String tentangCircle;
		tentangCircle = "Bil Objek adalah : " + bilObjekWujud;
		// tentangCircle = "Jejari = " + jejari +
		// 				"\nx = " + x +
		// 			    "\nLuas adalah " + kiraLuas();
		return tentangCircle;
	}

	//setter atau mutator
	public void setJejari(double jejari){
		this.jejari = jejari;
	}

	//getter atau accessor
	public double getJejari(){
		return jejari;
	}

	//default constructor
	public Circle(){
		jejari = 1;
		x = 5;
		bilObjekWujud++;
		// System.out.println("Default constructor dipanggil");
	}

	// overloading constructor - parameter
	public Circle(double jejari){
		// this(); //panggil default constructor
		this.jejari = jejari;
		x = 5;
		//System.out.println("Jejari = " + jejari);
		//this(jejari,59); //panggil constructor 2 parameter
		bilObjekWujud++;
	}

	//overloading constructor - 2 parameter
	public Circle(double jejari, double x){
		this.jejari = jejari;
		this.x = x;
		bilObjekWujud++;
		// System.out.println("Jejari = " + jejari + " String = " + s);
	}

	//method
	public double kiraLuas(){
		return getJejari() * getJejari() * Math.PI;
	}

	public static double UkurLilit (double j) {
		return 2 * Math.PI * j;
	}
}
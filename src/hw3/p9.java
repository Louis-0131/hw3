package hw3;

public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carp9 car1;
		car1 = new Carp9();
		car1.num = 1234;
		car1.gas = 20.5;
	}

}
//Car類別
class Carp9
{
	int num;
	double gas;

	void show()
	{
		System.out.println("車號是"+ num);
		System.out.println("汽油量是"+ gas);
		//System.out.println("車號是"+ this.num);
		//System.out.println("汽油量是"+ this.gas);
	}


}

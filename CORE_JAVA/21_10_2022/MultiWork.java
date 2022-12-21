package myjavaproject;
//parent class
class HeroBike{
	public void herobike() {
		System.out.println("HeroBike");
	}
}
//hirarchical
class BikeOwner extends HeroBike{
	public void bikeowner() {
		System.out.println("Mangaldip");
	}
}
//hirarchical
class BikeId extends HeroBike{
	public void bikeid() {
		System.out.println("1025");
	}
}
//Multiple
class BikeName extends HeroBike{
	public void bikename() {
		System.out.println("Suzuki");
	}
}
class BikePrice extends BikeName{
	public void bikeprice() {
		System.out.println("120520");
	}
}
public class MultiWork {

	public static void main(String[] args) {
		BikePrice bc=new BikePrice();
		bc.bikeprice();
		BikeName bn=new BikeName();
		bn.bikename();
		BikeId bi=new BikeId();
		bi.bikeid();
		BikeOwner bo=new BikeOwner();
		bo.bikeowner();
		HeroBike hb=new HeroBike();
		hb.herobike();

	}

}

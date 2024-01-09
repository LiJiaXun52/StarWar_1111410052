package StarWar_1111410052;

import java.util.Arrays;

public class TieFighter {

	

	private String[] Manufacture= {"賽納爾艦隊系統"}; 
	private String[] StringModel= {"雙離子引擎生產線星際戰鬥機"}; 
	private double[] Length = {6.3};
	private double[] AirSpeed  = {1200};
	private String[] SpaceSpeed = {"4100G"};
	private String[] StdandardEngine = {"SFS P-s4 雙離子引擎"};
	private String[] HyperSpaceEngine= {"無"};
	private String[] Weapon={ "SFS L-s1 型雷射加農炮”,” SFS L-s1 型雷射加農炮"	};
	private double[] Weapon_power ={1000,1000} ;
	private int[] Passenger = {0,1};
	private String[] Shield= {"無護盾（升級版可選） "};
	private String[] Model;
	static double[] ShieldPower = {0};
	
	public TieFighter() 
	{
	}
	
	public TieFighter(String[] Model,double[] Length,double[] AirSpeed,String[] SpaceSpeed,String[] StdandardEngine,
			String[] HyperSpaceEngine,String[] Passenge,double[] Weapon_power, int[] Passenger,String[] Shield,
			double[] ShieldPower) 
	{
		this.Model= Model;
		this.Length = Length;
		this.AirSpeed = AirSpeed;
		this.SpaceSpeed = SpaceSpeed;
		this.StdandardEngine = StdandardEngine;
		this.HyperSpaceEngine = HyperSpaceEngine;
		this.Weapon = Weapon;
		this.Weapon_power = Weapon_power;
		this.Passenger = Passenger;
		this.Shield = Shield;
		TieFighter.ShieldPower = ShieldPower;
		
	}
	
	public String[] getManufacture() {
		return Manufacture;
	}

	public void setManufacture(String[] manufacture) {
		Manufacture = manufacture;
	}

	public String[] getStringModel() {
		return StringModel;
	}

	public void setStringModel(String[] stringModel) {
		StringModel = stringModel;
	}

	public double[] getLength() {
		return Length;
	}

	public void setLength(double[] length) {
		Length = length;
	}

	public double[] getAirSpeed() {
		return AirSpeed;
	}

	public void setAirSpeed(double[] airSpeed) {
		AirSpeed = airSpeed;
	}

	public String[] getSpaceSpeed() {
		return SpaceSpeed;
	}

	public void setSpaceSpeed(String[] spaceSpeed) {
		SpaceSpeed = spaceSpeed;
	}

	public String[] getStdandardEngine() {
		return StdandardEngine;
	}

	public void setStdandardEngine(String[] stdandardEngine) {
		StdandardEngine = stdandardEngine;
	}

	public String[] getHyperSpaceEngine() {
		return HyperSpaceEngine;
	}

	public void setHyperSpaceEngine(String[] hyperSpaceEngine) {
		HyperSpaceEngine = hyperSpaceEngine;
	}

	public String[] getWeapon() {
		return Weapon;
	}

	public void setWeapon(String[] weapon) {
		Weapon = weapon;
	}

	public double[] getWeapon_power() {
		return Weapon_power;
	}

	public void setWeapon_power(double[] weapon_power) {
		Weapon_power = weapon_power;
	}

	public int[] getPassenger() {
		return Passenger;
	}

	public void setPassenger(int[] passenger) {
		Passenger = passenger;
	}

	public String[] getShield() {
		return Shield;
	}

	public void setShield(String[] shield) {
		Shield = shield;
	}

	public static double[] getShieldpower() {
		return ShieldPower;
	}

	@Override
	public String toString() {
		return "TieFighter [Manufacture=" + Arrays.toString(Manufacture) + ", StringModel="
				+ Arrays.toString(StringModel) + ", Length=" + Arrays.toString(Length) + ", AirSpeed="
				+ Arrays.toString(AirSpeed) + ", SpaceSpeed=" + Arrays.toString(SpaceSpeed) + ", StdandardEngine="
				+ Arrays.toString(StdandardEngine) + ", HyperSpaceEngine=" + Arrays.toString(HyperSpaceEngine)
				+ ", Weapon=" + Arrays.toString(Weapon) + ", Weapon_power=" + Arrays.toString(Weapon_power)
				+ ", Passenger=" + Arrays.toString(Passenger) + ", Shield=" + Arrays.toString(Shield) + "]";
	}
	
	}

package StarWar_1111410052;

import java.util.Arrays;

public class AirCraft {
	

	private String[] Model= {"賽納爾艦隊系統","Incom Corporation T65B X-Wing Space Superiority Fighter"}; 

	private double[] Length = {6.3,12.5};
	private double[] AirSpeed  = {1200,1050};
	private String[] SpaceSpeed = {"4100G","100MGL"};
	private String[] StdandardEngine = {"SFS P-s4 雙離子引擎","80MGLT "};
	private String[] HyperSpaceEngine= {"無","Class 1 Koensayr R300-H 之超空間飛行引擎"};
	private String[] Weapon=
		{ 
			"SFS L-s1 型雷射加農炮”,” SFS L-s1 型雷射加農炮",
			"Taim & Bak KX9 雷射加農炮”,” Taim & Bak KX9 雷射加農炮", 
			"Taim & Bak KX9 雷射加農炮”,” Taim & Bak KX9 雷射加農炮", 
			"Krupx MG7 質子魚雷發射器", "Krupx MG7 質子魚雷發射器"};
	private double[] Weapon_power = {1000,1000,1000,1000,1000,1000,5,5 } ;
	private int[] Passenger = {0,1,2};
	private static String[] Shield = {"無護盾（升級版可選） ","Chempat防禦者型偏轉幕發射器","Chempat偏轉防護盾投射器","鈦合金加勁外殼"};
	private static double[] ShieldPower = {0,2000,3000,1000};
	
	public AirCraft() 
	{
	}
	public AirCraft(String[] Model,double[] Length,double[] AirSpeed,String[] SpaceSpeed,String[] StdandardEngine,
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
	
	public String[] getModel() {
		return Model;
	}

	public void setModel(String[] model) {
		Model = model;
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

	public static String[] getShield() {
		return Shield;
	}

	public static void setShield(String[] shield) {
		Shield = shield;
	}

	public static double[] getShieldPower() {
		return ShieldPower;
	}

	public static void setShieldPower(double[] shieldPower) {
		ShieldPower = shieldPower;
	}

	

	@Override
	public String toString() {
		return "AirCraft [Model=" + Arrays.toString(Model) + ", Length=" + Arrays.toString(Length) + ", AirSpeed="
				+ Arrays.toString(AirSpeed) + ", SpaceSpeed=" + Arrays.toString(SpaceSpeed) + ", StdandardEngine="
				+ Arrays.toString(StdandardEngine) + ", HyperSpaceEngine=" + Arrays.toString(HyperSpaceEngine)
				+ ", Weapon=" + Arrays.toString(Weapon) + ", Weapon_power=" + Arrays.toString(Weapon_power)
				+ ", Passenger=" + Arrays.toString(Passenger) + "]";
	}

}

package StarWar_1111410052;

import java.util.Arrays;

public class X_Wing {

	
	private String[] Model= {"Incom Corporation T65B X-Wing Space Superiority Fighter"}; 
	private double[] Length = {12.5};
	private double[] AirSpeed  = {1050};
	private String[] SpaceSpeed = {"100MGL"};
	private String[] StdandardEngine = {"80MGLT "};
	private String[] HyperSpaceEngine= {"Class 1 Koensayr R300-H 之超空間飛行引擎"};
	private String[] Weapon=
		{ 
			"Taim & Bak KX9 雷射加農炮”,” Taim & Bak KX9 雷射加農炮", 
			"Taim & Bak KX9 雷射加農炮”,” Taim & Bak KX9 雷射加農炮", 
			"Krupx MG7 質子魚雷發射器", "Krupx MG7 質子魚雷發射器"};
	private double[] Weapon_power = {1000,1000,1000,1000,5,5 } ;
	private int[] Passenger = {2};
	private static String[] Shield = {"Chempat防禦者型偏轉幕發射器","Chempat偏轉防護盾投射器","鈦合金加勁外殼"};
	private static double[] ShieldPower = {2000,3000,1000};
	
	
	public X_Wing(String[] Model,double[] Length,double[] AirSpeed,String[] SpaceSpeed,String[] StdandardEngine,
			String[] HyperSpaceEngine,String[] Passenge,double[] Weapon_power, int[] Passenger,String[] Shield,
			double[] ShieldPower) 
	{
		this.Model = Model;
		this.Length = Length;
		this.AirSpeed = AirSpeed;
		this.SpaceSpeed = SpaceSpeed;
		this.StdandardEngine = StdandardEngine;
		this.HyperSpaceEngine = HyperSpaceEngine;
		this.Weapon = Weapon;
		this.Weapon_power = Weapon_power;
		this.Passenger = Passenger;
		this.Shield = Shield;
		this.ShieldPower = ShieldPower;
		
	}
	
	public X_Wing() 
	{
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
	public static double[] getShieldpower() {
		return ShieldPower;
	}

	//protected RemainShieldPower(AttackStrength:double);
	
	@Override
	public String toString() {
		return "X_Wing [Model=" + Arrays.toString(Model) + ", Length=" + Arrays.toString(Length) + ", AirSpeed="
				+ Arrays.toString(AirSpeed) + ", SpaceSpeed=" + Arrays.toString(SpaceSpeed) + ", StdandardEngine="
				+ Arrays.toString(StdandardEngine) + ", HyperSpaceEngine=" + Arrays.toString(HyperSpaceEngine)
				+ ", Weapon=" + Arrays.toString(Weapon) + ", Weapon_power=" + Arrays.toString(Weapon_power)
				+ ", Passenger=" + Arrays.toString(Passenger) + "]";
	}
}


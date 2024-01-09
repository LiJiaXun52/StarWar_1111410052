package StarWar_1111410052;

import java.io.PrintStream;
import java.util.ArrayList;

import StarWar_1111410052. TieFighter.*;
import StarWar_1111410052. AirCraft.*;
import StarWar_1111410052. X_Wing.*;


public class Main {

		public static void main(String[] args) 
		{
			
			TieFighter TieFighter=new TieFighter();	
			X_Wing  X_Wing=new  X_Wing();	
			
			System.out.printf(TieFighter.toString());
			System.out.printf("%n",X_Wing.toString());
			
			
		}

		

}

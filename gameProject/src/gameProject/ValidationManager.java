package gameProject;

public class ValidationManager implements ValidationService {

	@Override
	public boolean iAmNotARobot(Gamer gamer) {
		if (gamer.getTc().length() == 11 ) {
			System.out.println("Kimlik dogrulamas� ba�ar�l�.");
			return true;
		}
		else
			System.out.println("Robot :)");
		return false;
		
	}

}

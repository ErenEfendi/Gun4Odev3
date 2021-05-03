package gameProject;

public class ValidationManager implements ValidationService {

	@Override
	public boolean iAmNotARobot(Gamer gamer) {
		if (gamer.getTc().length() == 11 ) {
			System.out.println("Kimlik dogrulamasý baþarýlý.");
			return true;
		}
		else
			System.out.println("Robot :)");
		return false;
		
	}

}

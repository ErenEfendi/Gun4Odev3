package gameProject;

public class GamerManager implements GamerService {

	private ValidationManager validationManager;

	public GamerManager(ValidationManager validationManager) {
		this.validationManager = validationManager;
	}
	
	@Override
	public void register(Gamer gamer) {
		
		if (validationManager.iAmNotARobot(gamer) == true) {
			System.out.println(
					gamer.getFirstName() + " " + gamer.getLastName() + " Kaydınız başarılı bir şekilde tamamlandı.");
		}else
			System.out.println(" Hatalı Kayıt");
		
		
	}

	@Override
	public void login(Gamer gamer) {
		
		if (validationManager.iAmNotARobot(gamer) == true) {
			System.out.println(
					gamer.getFirstName() + " " + gamer.getLastName() + " Başarılı giriş");
		}else
			System.out.println(" Hatalı giriş ");
	
	}

	@Override
	public void update(Gamer gamer) {
		
		if (validationManager.iAmNotARobot(gamer) == true) {
			System.out.println("Başarıyla Güncellendi :  " + gamer.getFirstName());
		}else
			System.out.println(" Hatalı Güncelleme ");
		
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		if (validationManager.iAmNotARobot(gamer) == true) {
			System.out.println("Basarıyla Silindi :  " + gamer.getFirstName());
		}else
			System.out.println(" Hatalı, Silme İslemi Basarizi ");
		
	}

}

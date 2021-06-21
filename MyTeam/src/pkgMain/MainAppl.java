package pkgMain;

import pkgData.Player;

public class MainAppl {

	public static void main(String[] args) {
		Player player = new Player(2, "Spiela", "Defense");
		System.out.println(player);
		
		player = new Player(8, "Alaba", "Defense");
		System.out.println(player);
		
		
		player = new Player(12, "Baumgartlinger", "Mittelfeld");
		System.out.println(player);
		player = new Player(12, "Baumgartlinger", "Mittelfeld");
		System.out.println(player);

	}

}

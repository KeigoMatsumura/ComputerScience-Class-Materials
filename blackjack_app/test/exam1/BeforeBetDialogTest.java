package exam1;

import cardgame.Player;
import cardgame.blackjack.BlackJackPlayer;
import cardgame.blackjack.gui.BetDialog;
import cardgame.blackjack.gui.AWBetDialog;
import cardgame.blackjack.gui.SWBetDialog;

import org.junit.Test;

/**
 * BetDialog JUnitテスト
 */
public class BeforeBetDialogTest {

	/**
	 * AWT BetDialog表示テスト（人間）
	 */
	@Test
	public void AWTBetDialog人間表示テスト() {
		
		boolean human = true;

		BetDialog betDialog = new AWBetDialog();
		
		Player player = new BlackJackPlayer();
		player.setSeatNumber(1);
		player.setName("五郎丸");
		player.setStrategyName("テスト");
		player.setHuman(human);
		player.setExchangeChips(1024);
		player.setChipsValue(500);
		player.setBetChips(30);
		
		betDialog.displayDialog(player);
		betDialog.redisplayDialog();
		System.out.printf("AWTBetDialog人間表示テスト： 座席番号 = %d, 名前 = %s, 人間 = %s, 戦略名 = %s, 購入チップ数 = %d, 所持チップ = %d, ベット数 = %d\n",
			player.getSeatNumber(), player.getName(), player.isHuman(), player.getStrategyName(), player.getExchangeChips(), 
			player.getChipsValue(), player.getBetChips());
	}
	
	/**
	 * AWT BetDialog表示テスト（エージェント）
	 */
	@Test
	public void AWTBetDialogエージェント表示テスト() {
		
		boolean human = false;

		BetDialog betDialog = new AWBetDialog();
		
		Player player = new BlackJackPlayer();
		player.setSeatNumber(1);
		player.setName("五郎丸");
		player.setStrategyName("テスト");
		player.setHuman(human);
		player.setExchangeChips(1024);
		player.setChipsValue(500);
		player.setBetChips(30);
		
		betDialog.displayDialog(player);
		betDialog.redisplayDialog();
		System.out.printf("AWTBetDialogエージェント表示テスト： 座席番号 = %d, 名前 = %s, 人間 = %s, 戦略名 = %s, 購入チップ数 = %d, 所持チップ = %d, ベット数 = %d\n",
			player.getSeatNumber(), player.getName(), player.isHuman(), player.getStrategyName(), player.getExchangeChips(), 
			player.getChipsValue(), player.getBetChips());
	}
	
	/**
	 * Swing JoinDialog表示テスト
	 */
	@Test
	public void SwingBetDialog人間表示テスト() {
		
		boolean human = true;

		BetDialog betDialog = new SWBetDialog();
		
		Player player = new BlackJackPlayer();
		player.setSeatNumber(1);
		player.setName("五郎丸");
		player.setStrategyName("テスト");
		player.setHuman(human);
		player.setExchangeChips(1024);
		player.setChipsValue(500);
		player.setBetChips(30);
		
		betDialog.displayDialog(player);
		betDialog.redisplayDialog();
		System.out.printf("SwingBetDialog人間表示テスト： 座席番号 = %d, 名前 = %s, 人間 = %s, 戦略名 = %s, 購入チップ数 = %d, 所持チップ = %d, ベット数 = %d\n",
			player.getSeatNumber(), player.getName(), player.isHuman(), player.getStrategyName(), player.getExchangeChips(), 
			player.getChipsValue(), player.getBetChips());
	}

	
	@Test
	public void SWingBetDialogエージェント表示テスト() {
		
		boolean human = false;

		BetDialog betDialog = new SWBetDialog();
		
		Player player = new BlackJackPlayer();
		player.setSeatNumber(1);
		player.setName("五郎丸");
		player.setStrategyName("テスト");
		player.setHuman(human);
		player.setExchangeChips(1024);
		player.setChipsValue(500);
		player.setBetChips(30);
		
		betDialog.displayDialog(player);
		betDialog.redisplayDialog();
		System.out.printf("SWingBetDialogエージェント表示テスト： 座席番号 = %d, 名前 = %s, 人間 = %s, 戦略名 = %s, 購入チップ数 = %d, 所持チップ = %d, ベット数 = %d\n",
			player.getSeatNumber(), player.getName(), player.isHuman(), player.getStrategyName(), player.getExchangeChips(), 
			player.getChipsValue(), player.getBetChips());
	}

}

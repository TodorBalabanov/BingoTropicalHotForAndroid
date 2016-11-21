package eu.veldsoft.bingo.tropical.hot;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * 
 * @author Todor Balabanov
 */
public class GameActivity extends Activity {

	/**
	 * 
	 */
	private View.OnClickListener onCredit = new View.OnClickListener() {
		@Override
		public void onClick(View view) {
			Toast.makeText(GameActivity.this, "Credit button clicked!", Toast.LENGTH_SHORT).show();
		}
	};

	/**
	 * 
	 */
	private View.OnClickListener onSpins = new View.OnClickListener() {
		@Override
		public void onClick(View view) {
			Toast.makeText(GameActivity.this, "Spins button clicked!", Toast.LENGTH_SHORT).show();
		}
	};

	/**
	 * 
	 */
	private View.OnClickListener onLines = new View.OnClickListener() {
		@Override
		public void onClick(View view) {
			Toast.makeText(GameActivity.this, "Lines button clicked!", Toast.LENGTH_SHORT).show();
		}
	};

	/**
	 * 
	 */
	private View.OnClickListener onCoins = new View.OnClickListener() {
		@Override
		public void onClick(View view) {
			Toast.makeText(GameActivity.this, "Coins button clicked!", Toast.LENGTH_SHORT).show();
		}
	};

	/**
	 * 
	 */
	private View.OnClickListener onBet = new View.OnClickListener() {
		@Override
		public void onClick(View view) {
			Toast.makeText(GameActivity.this, "Bet button clicked!", Toast.LENGTH_SHORT).show();
		}
	};

	/**
	 * 
	 */
	private View.OnClickListener onWin = new View.OnClickListener() {
		@Override
		public void onClick(View view) {
			Toast.makeText(GameActivity.this, "Win button clicked!", Toast.LENGTH_SHORT).show();
		}
	};

	/**
	 * 
	 */
	private View.OnClickListener onMaxBet = new View.OnClickListener() {
		@Override
		public void onClick(View view) {
			Toast.makeText(GameActivity.this, "Max bet button clicked!", Toast.LENGTH_SHORT).show();
		}
	};

	/**
	 * 
	 */
	private View.OnClickListener onAutoPlay = new View.OnClickListener() {
		@Override
		public void onClick(View view) {
			Toast.makeText(GameActivity.this, "Auto play button clicked!", Toast.LENGTH_SHORT).show();
		}
	};

	/**
	 * 
	 */
	private View.OnClickListener onPayeout = new View.OnClickListener() {
		@Override
		public void onClick(View view) {
			Toast.makeText(GameActivity.this, "Payout button clicked!", Toast.LENGTH_SHORT).show();
		}
	};

	/**
	 * 
	 */
	private View.OnClickListener onSwapScreen = new View.OnClickListener() {
		@Override
		public void onClick(View view) {
			Toast.makeText(GameActivity.this, "Swap screen button clicked!", Toast.LENGTH_SHORT).show();
		}
	};

	/**
	 * 
	 */
	private View.OnClickListener onSpin = new View.OnClickListener() {
		@Override
		public void onClick(View view) {
			Toast.makeText(GameActivity.this, "Spin button clicked!", Toast.LENGTH_SHORT).show();
		}
	};

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);

		findViewById(R.id.creditbutton).setOnClickListener(onCredit);
		findViewById(R.id.spins).setOnClickListener(onSpins);
		findViewById(R.id.linesbutton).setOnClickListener(onLines);
		findViewById(R.id.coinsbutton).setOnClickListener(onCoins);
		findViewById(R.id.betbutton).setOnClickListener(onBet);
		findViewById(R.id.win).setOnClickListener(onWin);
		findViewById(R.id.maxbetbutton).setOnClickListener(onMaxBet);
		findViewById(R.id.autoplaybutton).setOnClickListener(onAutoPlay);
		findViewById(R.id.payoutbutton).setOnClickListener(onPayeout);
		findViewById(R.id.swapbutton).setOnClickListener(onSwapScreen);
		findViewById(R.id.spinbutton).setOnClickListener(onSpin);
	}
}

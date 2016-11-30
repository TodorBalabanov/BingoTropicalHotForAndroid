package eu.veldsoft.bingo.tropical.hot;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import eu.veldsoft.bingo.tropical.hot.model.Util;

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
			for (int i = 0; i < symbol.length; i++) {
				for (int j = 0; j < symbol[i].length; j++) {
					int r = 0;
					do {
						r = Util.PRNG.nextInt(symbolId.length);
					} while (symbolId[r] == 0);
					symbol[i][j].setImageResource(symbolId[r]);
				}
			}

			bingoBall.setImageResource(ballId[1 + Util.PRNG.nextInt(ballId.length - 1)]);
		}
	};

	/**
	 * Symbols identifiers.
	 */
	private int symbolId[] = null;

	/**
	 * Bingo balls identifiers.
	 */
	private int ballId[] = null;

	/**
	 * References to all image view components.
	 */
	private List<ImageView> allImages = new ArrayList<ImageView>();

	/**
	 * Reels symbols references.
	 */
	private ImageView[][] symbol = new ImageView[5][3];

	/**
	 * Bingo ball reference;
	 */
	private ImageView bingoBall = null;

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);

		/*
		 * Get references to all image views in the application.
		 */
		for (Field field : R.id.class.getDeclaredFields()) {
			try {
				if (findViewById(field.getInt(field)) instanceof ImageView) {
					allImages.add((ImageView) findViewById(field.getInt(field)));
				}
			} catch (IllegalAccessException e) {
			} catch (IllegalArgumentException e) {
			}
		}

		/*
		 * Scale all image views.
		 */
		for (ImageView view : allImages) {
			view.setMaxWidth((int) (view.getMaxWidth() * 1.0));
			view.setMaxHeight((int) (view.getMaxHeight() * 1.0));
		}

		symbolId = new int[] { 0, 0, 0, R.drawable.symbol03, R.drawable.symbol04, R.drawable.symbol05,
				R.drawable.symbol06, R.drawable.symbol07, R.drawable.symbol08, R.drawable.symbol09, R.drawable.symbol10,
				R.drawable.symbol11, R.drawable.symbol12, 0, 0, 0, 0, };

		ballId = new int[] { 0, R.drawable.bingoball01, R.drawable.bingoball02, R.drawable.bingoball03,
				R.drawable.bingoball04, R.drawable.bingoball05, R.drawable.bingoball06, R.drawable.bingoball07,
				R.drawable.bingoball08, R.drawable.bingoball09, R.drawable.bingoball10, R.drawable.bingoball11,
				R.drawable.bingoball12, R.drawable.bingoball13, R.drawable.bingoball14, R.drawable.bingoball15,
				R.drawable.bingoball16, R.drawable.bingoball17, R.drawable.bingoball18, R.drawable.bingoball19,
				R.drawable.bingoball20, R.drawable.bingoball21, R.drawable.bingoball22, R.drawable.bingoball23,
				R.drawable.bingoball24, R.drawable.bingoball25, R.drawable.bingoball26, R.drawable.bingoball27,
				R.drawable.bingoball28, R.drawable.bingoball29, R.drawable.bingoball30, R.drawable.bingoball31,
				R.drawable.bingoball32, R.drawable.bingoball33, R.drawable.bingoball34, R.drawable.bingoball35,
				R.drawable.bingoball36, R.drawable.bingoball37, R.drawable.bingoball38, R.drawable.bingoball39,
				R.drawable.bingoball40, R.drawable.bingoball41, R.drawable.bingoball42, R.drawable.bingoball43,
				R.drawable.bingoball44, R.drawable.bingoball45, R.drawable.bingoball46, R.drawable.bingoball47,
				R.drawable.bingoball48, R.drawable.bingoball49, R.drawable.bingoball50, R.drawable.bingoball51,
				R.drawable.bingoball52, R.drawable.bingoball53, R.drawable.bingoball54, R.drawable.bingoball55,
				R.drawable.bingoball56, R.drawable.bingoball57, R.drawable.bingoball58, R.drawable.bingoball59,
				R.drawable.bingoball60, R.drawable.bingoball61, R.drawable.bingoball62, R.drawable.bingoball63,
				R.drawable.bingoball64, R.drawable.bingoball65, R.drawable.bingoball66, R.drawable.bingoball67,
				R.drawable.bingoball68, R.drawable.bingoball69, R.drawable.bingoball70, R.drawable.bingoball71,
				R.drawable.bingoball72, R.drawable.bingoball73, R.drawable.bingoball74, R.drawable.bingoball75,
				R.drawable.bingoball76, R.drawable.bingoball77, R.drawable.bingoball78, R.drawable.bingoball79,
				R.drawable.bingoball80, R.drawable.bingoball81, R.drawable.bingoball82, R.drawable.bingoball83,
				R.drawable.bingoball84, R.drawable.bingoball85, R.drawable.bingoball86, R.drawable.bingoball87,
				R.drawable.bingoball88, R.drawable.bingoball89, R.drawable.bingoball90, R.drawable.bingoball91,
				R.drawable.bingoball92, R.drawable.bingoball93, R.drawable.bingoball94, R.drawable.bingoball95,
				R.drawable.bingoball96, R.drawable.bingoball97, R.drawable.bingoball98, R.drawable.bingoball99, };

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

		symbol[0][0] = (ImageView) findViewById(R.id.symbol00);
		symbol[1][0] = (ImageView) findViewById(R.id.symbol10);
		symbol[2][0] = (ImageView) findViewById(R.id.symbol20);
		symbol[3][0] = (ImageView) findViewById(R.id.symbol30);
		symbol[4][0] = (ImageView) findViewById(R.id.symbol40);
		symbol[0][1] = (ImageView) findViewById(R.id.symbol01);
		symbol[1][1] = (ImageView) findViewById(R.id.symbol11);
		symbol[2][1] = (ImageView) findViewById(R.id.symbol21);
		symbol[3][1] = (ImageView) findViewById(R.id.symbol31);
		symbol[4][1] = (ImageView) findViewById(R.id.symbol41);
		symbol[0][2] = (ImageView) findViewById(R.id.symbol02);
		symbol[1][2] = (ImageView) findViewById(R.id.symbol12);
		symbol[2][2] = (ImageView) findViewById(R.id.symbol22);
		symbol[3][2] = (ImageView) findViewById(R.id.symbol32);
		symbol[4][2] = (ImageView) findViewById(R.id.symbol42);

		bingoBall = (ImageView) findViewById(R.id.bingoball);
	}
}

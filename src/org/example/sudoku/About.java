package org.example.sudoku;
import android.app.Activity;
import android.os.Bundle;
/** this java file creates and activity for the about button, in other words when the about button is pressed the program uses this file to 
 * tell the program what to do next. it says create new instance and set layout to about.xml
 * Jared
 *
 */
public class About extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
	}
}

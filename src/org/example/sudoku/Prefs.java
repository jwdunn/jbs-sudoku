package org.example.sudoku;

import android.os.Bundle;
import android.preference.PreferenceActivity;
/** this creates and activity for the settings menu
 * 
 * @author Jared
 *ps im practicing using java docs i'll talk to you about them idk if its nessisary to use them in every class file.
 */
public class Prefs extends PreferenceActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.settings);
	}
}

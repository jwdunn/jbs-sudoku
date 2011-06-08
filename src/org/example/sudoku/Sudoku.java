package org.example.sudoku;

import android.view.View.OnClickListener;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;


public class Sudoku extends Activity implements OnClickListener {
    /** Called when the activity is first created. main file 
     * i have added my walkerdunn button onclicklistener here along with what happends when it is pressed*/
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
     // Set up click listeners for all the buttons
        View continueButton = findViewById(R.id.continue_button);
        continueButton.setOnClickListener(this);
        View newButton = findViewById(R.id.new_button);
        newButton.setOnClickListener(this);
        View aboutButton = findViewById(R.id.about_button);
        aboutButton.setOnClickListener(this);
        
        // here is where i added my button
        View walkerDunnButton= findViewById(R.id.walkerDunn_button);
        walkerDunnButton.setOnClickListener(this);
        View exitButton = findViewById(R.id.exit_button);
        exitButton.setOnClickListener(this);
        }
    
    // this is what happends when the buttons are clicked. it uses a case and brake statements to choose the best choise based on what button you select
    public void onClick(View v) {
    	switch (v.getId()) {
    	
    	case R.id.new_button:
    		openNewGameDialog();
    		break;
    		
    	case R.id.exit_button:
    		finish();
    		break;
    	case R.id.walkerDunn_button:
    		Intent j = new Intent(this, Question.class);
    		startActivity(j);
    		break;	
        
    	case R.id.about_button:
    		Intent i = new Intent(this, About.class);
    		startActivity(i);
    		break;
    	// More buttons go here (if any) ...
    	}
    }
    	
    //creates the meunu item
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch (item.getItemId()) {
    	case R.id.settings:
    	startActivity(new Intent(this, Prefs.class));
    return true;
    	// More items go here (if any) ...
    	}
    return false;
    }

   // this one creates an options menu
    public boolean onCreateOptionsMenu(Menu menu) {
    	super.onCreateOptionsMenu(menu);
    	MenuInflater inflater = getMenuInflater();
    	inflater.inflate(R.menu.menu, menu);
    	return true;	
    }
    
    private static final String TAG = "Sudoku" ;
    
    private void openNewGameDialog() {
    	new AlertDialog.Builder(this)
    	.setTitle(R.string.new_game_title)
    	.setItems(R.array.difficulty,
    			new DialogInterface.OnClickListener() {
    				public void onClick(DialogInterface dialoginterface,
    						int i) {
    					startGame(i);
    					}
    				})
    			.show();
    	}
    	private void startGame(int i) {
    		Log.d(TAG, "clicked on " + i);
    		Intent intent = new Intent(Sudoku.this, Game.class);
    		intent.putExtra(Game.KEY_DIFFICULTY, i);
    		startActivity(intent);
    	}
    	
}


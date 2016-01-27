package com.example.uiswitchbutton;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends Activity {
	private UISwitchButton switchButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initSwitch();
	}

	/**
	 * [初始化开关，默认是不选中的状态，可结合Sp来初始化开关的状态]
	 */
	private void initSwitch() {
		switchButton = (UISwitchButton) findViewById(R.id.switch1);
		switchButton.setChecked(false);
		switchButton
				.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

					@Override
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						if (isChecked) {
							Toast.makeText(getApplicationContext(),
									"isChecked", Toast.LENGTH_SHORT).show();
						} else {
							Toast.makeText(getApplicationContext(),
									"cancelChecked", Toast.LENGTH_SHORT).show();
						}
					}
				});
	}

}

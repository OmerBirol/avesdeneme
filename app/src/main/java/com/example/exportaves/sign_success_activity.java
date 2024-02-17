
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		sign_success
	 *	@date 		Tuesday 19th of December 2023 05:25:46 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.exportaves;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

public class sign_success_activity extends Activity {

	
	private View _bg__sign_success;
	private View _bg__continuebutton_ek1;
	private View rectangle_3;
	private TextView devam_et;
	private TextView kay_t_oldunuz_tesekk_rler;
	private View _bg__login_1_ek1;
	private ImageView vector;
	private ImageView vector_ek1;
	private ImageView vector_ek2;
	private ImageView vector_ek3;
	private ImageView vector_ek4;
	private ImageView vector_ek5;
	private ImageView vector_ek6;
	private ImageView vector_ek7;
	private ImageView vector_ek8;
	private ImageView vector_ek9;
	private ImageView vector_ek10;
	private ImageView vector_ek11;
	private ImageView vector_ek12;
	private ImageView vector_ek13;
	private ImageView vector_ek14;
	private ImageView vector_ek15;
	private ImageView vector_ek16;
	private ImageView vector_ek17;
	private ImageView vector_ek18;
	private ImageView vector_ek19;
	private ImageView vector_ek20;
	private ImageView vector_ek21;
	private ImageView vector_ek22;
	private ImageView vector_ek23;
	private ImageView vector_ek24;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.sign_success);

		
		_bg__sign_success = (View) findViewById(R.id._bg__sign_success);
		rectangle_3 = (View) findViewById(R.id.rectangle_3);
		devam_et = (TextView) findViewById(R.id.devam_et);
		kay_t_oldunuz_tesekk_rler = (TextView) findViewById(R.id.kay_t_oldunuz_tesekk_rler);



		devam_et.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// login_menu_activity adlı yeni aktiviteyi başlatmak için Intent
				Intent intent = new Intent(sign_success_activity.this, login_menu_activity.class);
				startActivity(intent);
			}
		});
		//custom code goes here
	
	}
}
	
	

	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		button_main
	 *	@date 		Tuesday 19th of December 2023 05:26:08 PM
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
import android.widget.ImageView;
import android.widget.TextView;

public class button_main_activity extends Activity {

	
	private View _bg__button_main;
	private View _bg__circle_ek1;
	private ImageView clip_path_group;
	private ImageView icon_08;
	private TextView yardim__ste;
	private TextView adres_bilgilerimi_g_ncelle;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.button_main);

		
		_bg__button_main = (View) findViewById(R.id._bg__button_main);
		_bg__circle_ek1 = (View) findViewById(R.id._bg__circle_ek1);
		clip_path_group = (ImageView) findViewById(R.id.clip_path_group);
		icon_08 = (ImageView) findViewById(R.id.icon_08);
		yardim__ste = (TextView) findViewById(R.id.yardim__ste);
		adres_bilgilerimi_g_ncelle = (TextView) findViewById(R.id.adres_bilgilerimi_g_ncelle);

		// kayıt ol tusuna basıldıgında kayıt ol eklenıcek
		adres_bilgilerimi_g_ncelle.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// login_menu_activity adlı yeni aktiviteyi başlatmak için Intent
				Intent intent = new Intent(button_main_activity.this, profile_update_activity.class);
				startActivity(intent);
			}
		});


		_bg__circle_ek1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// login_menu_activity adlı yeni aktiviteyi başlatmak için Intent
				Intent intent = new Intent(button_main_activity.this, help_menu_activity.class);
				startActivity(intent);
			}
		});

		//custom code goes here
	
	}
}
	
	
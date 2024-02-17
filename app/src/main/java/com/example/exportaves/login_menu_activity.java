
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		login_menu
	 *	@date 		Tuesday 19th of December 2023 05:25:57 PM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.exportaves;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

public class login_menu_activity extends Activity {

	
	private View _bg__login_menu;
	private TextView yeniden_hosgeldiniz;
	private TextView _ifremi_unuttum;
	private View _bg__loginbutton_ek1;
	private View rectangle_3;
	private TextView giri__yap;
	private TextView kay_t_ol;
	private View rectangle_28;
	private ImageView vector_ek1;
	private TextView sifre;
	private ImageView vector_ek7;
	private ImageView vector_ek3;
	private View rectangle_27;
	private TextView telefon_email;


	@SuppressLint("MissingInflatedId")
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_menu);

		
		_bg__login_menu = (View) findViewById(R.id._bg__login_menu);
		yeniden_hosgeldiniz = (TextView) findViewById(R.id.yeniden_hosgeldiniz);
		_ifremi_unuttum = (TextView) findViewById(R.id._ifremi_unuttum);
		_bg__loginbutton_ek1 = (View) findViewById(R.id._bg__loginbutton_ek1);
		rectangle_3 = (View) findViewById(R.id.rectangle_3);
		giri__yap = (TextView) findViewById(R.id.giri__yap);
		kay_t_ol = (TextView) findViewById(R.id.kay_t_ol);
		rectangle_28 = (View) findViewById(R.id.rectangle_28);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		vector_ek7 = (ImageView) findViewById(R.id.vector_ek7);

		sifre = (TextView) findViewById(R.id.sifre_input);
		rectangle_27 = (View) findViewById(R.id.rectangle_27);
		telefon_email = (TextView) findViewById(R.id.telefon_email_input);


		// kayıt ol tusuna basıldıgında kayıt ol eklenıcek
		giri__yap.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// login_menu_activity adlı yeni aktiviteyi başlatmak için Intent
				Intent intent = new Intent(login_menu_activity.this, button_main_activity.class);
				startActivity(intent);
			}
		});
		//kayıt ol tusuna bastıgında oraya atıvak
		kay_t_ol.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// login_menu_activity adlı yeni aktiviteyi başlatmak için Intent
				Intent intent = new Intent(login_menu_activity.this, signup_menu_activity.class);
				startActivity(intent);
			}
		});

		//sifremi unuttum tusuna bastıgında oraya atıvak
		_ifremi_unuttum.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// login_menu_activity adlı yeni aktiviteyi başlatmak için Intent
				Intent intent = new Intent(login_menu_activity.this, forgot_password_activity.class);
				startActivity(intent);
			}
		});

		//custom code goes here
	
	}
}
	
	

	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		signup_menu
	 *	@date 		Tuesday 19th of December 2023 05:25:28 PM
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

public class signup_menu_activity extends Activity {

	
	private View _bg__signup_menu;
	private View _bg__signupbutton_ek1;
	private View rectangle_3;
	private TextView kay_t_ol;
	private View rectangle_29;
	private View rectangle_27;
	private View rectangle_30;
	private View rectangle_31;
	private View rectangle_32;
	private ImageView vector;
	private TextView e_posta;
	private TextView ad_soyad;
	private TextView telefon;
	private TextView _l__l_e;
	private TextView adres_1;
	private ImageView vector_ek1;
	private ImageView vector_ek2;
	private View _bg__home_ek1;
	private ImageView vector_ek3;
	private View _bg__home_ek3;
	private ImageView vector_ek4;
	private ImageView map;
	private ImageView polygon_1;
	private ImageView polygon_2;
	private View rectangle_33;
	private TextView adres_2;
	private View _bg__home_ek5;
	private ImageView vector_ek5;
	private View _bg__home_ek7;
	private ImageView vector_ek6;
	private ImageView polygon_3;
	private View rectangle_28;
	private ImageView vector_ek7;
	private TextView sifre;
	private View _bg__group_ek1;
	private ImageView vector_ek8;
	private ImageView vector_ek9;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.signup_menu);

		
		_bg__signup_menu = (View) findViewById(R.id._bg__signup_menu);
		rectangle_3 = (View) findViewById(R.id.rectangle_3);
		kay_t_ol = (TextView) findViewById(R.id.kay_t_ol);
		rectangle_29 = (View) findViewById(R.id.rectangle_29);
		rectangle_27 = (View) findViewById(R.id.rectangle_27);
		rectangle_30 = (View) findViewById(R.id.rectangle_30);
		rectangle_31 = (View) findViewById(R.id.rectangle_31);
		rectangle_32 = (View) findViewById(R.id.rectangle_32);
		vector = (ImageView) findViewById(R.id.vector);
		e_posta = (TextView) findViewById(R.id.e_posta_input);
		ad_soyad = (TextView) findViewById(R.id.ad_soyad_input);
		telefon = (TextView) findViewById(R.id.telefon);
		_l__l_e = (TextView) findViewById(R.id._l__l_e_input);
		adres_1 = (TextView) findViewById(R.id.adres_1_input);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
		vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		map = (ImageView) findViewById(R.id.map);
		polygon_1 = (ImageView) findViewById(R.id.polygon_1);
		polygon_2 = (ImageView) findViewById(R.id.polygon_2);
		rectangle_33 = (View) findViewById(R.id.rectangle_33);
		adres_2 = (TextView) findViewById(R.id.adres_2_input);
		vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
		vector_ek6 = (ImageView) findViewById(R.id.vector_ek6);
		polygon_3 = (ImageView) findViewById(R.id.polygon_3);
		rectangle_28 = (View) findViewById(R.id.rectangle_28);
		vector_ek7 = (ImageView) findViewById(R.id.vector_ek7);
		sifre = (TextView) findViewById(R.id.sifre_input);

		// kayıt ol tusuna basıldıgında kayıt ol eklenıcek
		kay_t_ol.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// login_menu_activity adlı yeni aktiviteyi başlatmak için Intent
				Intent intent = new Intent(signup_menu_activity.this, sign_success_activity.class);
				startActivity(intent);
			}
		});
		//custom code goes here
	
	}
}
	
	
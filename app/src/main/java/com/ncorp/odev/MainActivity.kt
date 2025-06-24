package com.ncorp.odev

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContentView(R.layout.activity_main)
		ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
			val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
			v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
			insets
		}
		/*
		1-Çalışanlar sınıfını oluştur
		2-Çalışanların ismi-maaşı-departman-yaşı olacak
		3- 10 tane çalışan oluştur, bir listede topla
		4-Sınıfın içerisine:
			İsim bilgileri sadece okunabilir
			Maaş bilgileri okunamaz ve yazılamaz, sadece maaş göster fonksiyonu ile gösterilebilecek,
			bu fonksiyon içerisine aldıgı onjenin maaşını gösterecek
		5-Mainactivity içerisinde yaşı 30dan büyük olan ve departmanı yazılım olan kişilerin maaşlarını tutan bir liste oluştur
		6-Mainactivity içerisinde yaşı 25den küçük olan kişileirn isimlerini tutan bir liste
		*/
		class Calisanlar(val isim: String, maas: Int, var departman: String, var yas: Int) {
			private val _maas = maas
			fun maasgoster() {
				println(this._maas)

			}
		}


		var calisan1 = Calisanlar("Ahmet", 1000, "Yazılım", 25)
		var calisan2 = Calisanlar("Ebru", 500, "Finans", 20)
		var calisan3 = Calisanlar("Mehmet", 1500, "Yazılım", 41)
		var calisan4 = Calisanlar("Fatih", 2000, "Yazılım", 24)
		var calisan5 = Calisanlar("Kerem", 900, "Satış", 28)
		var calisan6 = Calisanlar("İrem", 1500, "Muhasebe", 30)
		var calisan7 = Calisanlar("Ali", 1000, "Yazılım", 38)
		var calisan8 = Calisanlar("Sadi", 650, "Satış", 28)
		var calisan9 = Calisanlar("Evra", 600, "Çaycı", 40)
		var calisan10 = Calisanlar("Saadet", 1000, "Yazılım", 25)

		var calisanlarlistesi = arrayListOf<Calisanlar>(
			calisan1,
			calisan2,
			calisan3,
			calisan4,
			calisan5,
			calisan6,
			calisan7,
			calisan8,
			calisan9,
			calisan10
		)



		println("----Yaşı 30dan büyük, departmanı yazılım olanların maaşlarının listesi-----")

		val altinciSoruListesi = calisanlarlistesi.filter { it.yas > 30 }.filter { it.departman == "Yazılım" }.map { it.maasgoster() }




	}


}
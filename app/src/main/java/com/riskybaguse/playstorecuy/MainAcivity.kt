package com.riskybaguse.playstorecuy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // PRABOWO PREMIUM
        val item1 = findViewById<View>(R.id.premium1)
        item1.findViewById<ImageView>(R.id.img_game).setImageResource(R.drawable.em2)
        item1.findViewById<TextView>(R.id.tv_title).text = "EM 2 - Simulator Presiden"
        item1.findViewById<TextView>(R.id.tv_desc).text = "Strategi geopolitik - menjadi presiden, memerintah negara, mengubah dunia!"
        item1.findViewById<TextView>(R.id.tv_size).text = "164 MB"
        item1.findViewById<TextView>(R.id.tv_rating).text = "4,7 ★"
        item1.findViewById<TextView>(R.id.tv_price).text = "Rp 15.999,00"

        // GEOMETRY DASH
        val item2 = findViewById<View>(R.id.premium2)
        item2.findViewById<ImageView>(R.id.img_game).setImageResource(R.drawable.geometry)
        item2.findViewById<TextView>(R.id.tv_title).text = "Geometry Dash"
        item2.findViewById<TextView>(R.id.tv_desc).text = "Melompat dan terbang melewati bahaya dalam platformer aksi berbasis ritme"
        item2.findViewById<TextView>(R.id.tv_size).text = "148 MB"
        item2.findViewById<TextView>(R.id.tv_rating).text = "4,6 ★"
        item2.findViewById<TextView>(R.id.tv_price).text = "Rp 35.000,00"

        // GTA
        val item3 = findViewById<View>(R.id.premium3)
        item3.findViewById<ImageView>(R.id.img_game).setImageResource(R.drawable.gta)
        item3.findViewById<TextView>(R.id.tv_title).text = "Grand Theft Auto: San Andreas"
        item3.findViewById<TextView>(R.id.tv_desc).text = "Rockstar Games menghadirkan perilisan terbesarnya untuk perangkat seluler."
        item3.findViewById<TextView>(R.id.tv_size).text = "632 MB"
        item3.findViewById<TextView>(R.id.tv_rating).text = "4,4 ★"
        item3.findViewById<TextView>(R.id.tv_price).text = "Rp 81.000,00"

        // Batman
        val item4 = findViewById<View>(R.id.premium4)
        item4.findViewById<ImageView>(R.id.img_game).setImageResource(R.drawable.lego)
        item4.findViewById<TextView>(R.id.tv_title).text = "LEGO ® Batman: Beyond Gotham"
        item4.findViewById<TextView>(R.id.tv_desc).text = "Bermainlah sebagai Batman dan bergabunglah dengan karakter dari dunia DC Comics!"
        item4.findViewById<TextView>(R.id.tv_size).text = "3,8 MB"
        item4.findViewById<TextView>(R.id.tv_rating).text = "3,5 ★"
        item4.findViewById<TextView>(R.id.tv_price).text = "Rp 70.000,00"

        // Naruto
        val item5 = findViewById<View>(R.id.premium5)
        item5.findViewById<ImageView>(R.id.img_game).setImageResource(R.drawable.naruto)
        item5.findViewById<TextView>(R.id.tv_title).text = "NARUTO: Ultimate Ninja Storm"
        item5.findViewById<TextView>(R.id.tv_desc).text = "Game Naruto penuh aksi kompetitig 3D!"
        item5.findViewById<TextView>(R.id.tv_size).text = "641 MB"
        item5.findViewById<TextView>(R.id.tv_rating).text = "4,2 ★"
        item5.findViewById<TextView>(R.id.tv_price).text = "Rp 209.000,00"


        // Sheep Clouds
        val item6 = findViewById<View>(R.id.premium6)
        item6.findViewById<ImageView>(R.id.img_game).setImageResource(R.drawable.kambing)
        item6.findViewById<TextView>(R.id.tv_title).text = "Clouds &amp; Sheep Premium"
        item6.findViewById<TextView>(R.id.tv_desc).text = "Berilah mereka makan, bermainlah dengan mereka, dan KAMU akan jadi pujaan mereka!"
        item6.findViewById<TextView>(R.id.tv_size).text = "32 MB"
        item6.findViewById<TextView>(R.id.tv_rating).text = "4,8 ★"
        item6.findViewById<TextView>(R.id.tv_price).text = "Rp 5.000,00"

        // Minecraft
        val item7 = findViewById<View>(R.id.premium7)
        item7.findViewById<ImageView>(R.id.img_game).setImageResource(R.drawable.minecraft)
        item7.findViewById<TextView>(R.id.tv_title).text = "Minecraft: Bangun Kotamu"
        item7.findViewById<TextView>(R.id.tv_desc).text = "Bangun, jelajahi, bertahan hidup! Main dengan teman dan buat duniamu sendiri!"
        item7.findViewById<TextView>(R.id.tv_size).text = "554 MB"
        item7.findViewById<TextView>(R.id.tv_rating).text = "4,3 ★"
        item7.findViewById<TextView>(R.id.tv_price).text = "Rp 19.000,00"

        // animek
        val item8 = findViewById<View>(R.id.premium8)
        item8.findViewById<ImageView>(R.id.img_game).setImageResource(R.drawable.muse)
        item8.findViewById<TextView>(R.id.tv_title).text = "Muse Dash!"
        item8.findViewById<TextView>(R.id.tv_desc).text = "Surganya game parkour & ritme -- Muse Dash"
        item8.findViewById<TextView>(R.id.tv_size).text = "1,8 GB"
        item8.findViewById<TextView>(R.id.tv_rating).text = "4,8 ★"
        item8.findViewById<TextView>(R.id.tv_price).text = "Rp 49.000,00"

        // GTA definitive
        val item9 = findViewById<View>(R.id.premium9)
        item9.findViewById<ImageView>(R.id.img_game).setImageResource(R.drawable.gtadef)
        item9.findViewById<TextView>(R.id.tv_title).text = "GTA: San Andreas - Definitive"
        item9.findViewById<TextView>(R.id.tv_desc).text = "Rockstar kini hadir dengan visual baru dan pengalaman bermain yang disempurnakan."
        item9.findViewById<TextView>(R.id.tv_size).text = "694MB"
        item9.findViewById<TextView>(R.id.tv_rating).text = "3,6 ★"
        item9.findViewById<TextView>(R.id.tv_price).text = "Rp 219.000,00"
    }
}

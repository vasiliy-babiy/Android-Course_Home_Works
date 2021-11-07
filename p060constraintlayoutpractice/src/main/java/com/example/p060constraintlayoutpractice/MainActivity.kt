package com.example.p060constraintlayoutpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var teamA = 0
        var teamB = 0

        val teamACount: TextView = findViewById(R.id.teamACount)
        val teamBCount: TextView = findViewById(R.id.teamBCount)

        val teamA1Button: Button = findViewById(R.id.teamA1Button)
        teamA1Button.setOnClickListener {
            teamA += 1
            teamACount.text = teamA.toString()
        }

        val teamA2Button: Button = findViewById(R.id.teamA2Button)
        teamA2Button.setOnClickListener {
            teamA += 2
            teamACount.text = teamA.toString()
        }

        val teamA3Button: Button = findViewById(R.id.teamA3Button)
        teamA3Button.setOnClickListener {
            teamA += 3
            teamACount.text = teamA.toString()
        }

        val teamB1Button: Button = findViewById(R.id.teamB1Button)
        teamB1Button.setOnClickListener {
            teamB += 1
            teamBCount.text = teamB.toString()
        }

        val teamB2Button: Button = findViewById(R.id.teamB2Button)
        teamB2Button.setOnClickListener {
            teamB += 2
            teamBCount.text = teamB.toString()
        }

        val teamB3Button: Button = findViewById(R.id.teamB3Button)
        teamB3Button.setOnClickListener {
            teamB += 3
            teamBCount.text = teamB.toString()
        }

        val resetButton: Button = findViewById(R.id.resetButton)
        resetButton.setOnClickListener {
            teamA = 0
            teamB = 0
            teamACount.text = teamA.toString()
            teamBCount.text = teamB.toString()
        }

    }
}
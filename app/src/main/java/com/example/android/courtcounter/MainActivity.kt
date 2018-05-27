package com.example.android.courtcounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    // Tracks the score for Team A
    private var scoreTeamA:Int = 0

    // Tracks the score for Team B
    private var scoreTeamB:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    fun addOneForTeamA(v: View) {
        scoreTeamA = scoreTeamA + 1
        displayForTeamA(scoreTeamA)
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    fun addTwoForTeamA(v: View) {
        scoreTeamA = scoreTeamA + 2
        displayForTeamA(scoreTeamA)
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    fun addThreeForTeamA(v: View) {
        scoreTeamA = scoreTeamA + 3
        displayForTeamA(scoreTeamA)
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    fun addOneForTeamB(v: View) {
        scoreTeamB = scoreTeamB + 1
        displayForTeamB(scoreTeamB)
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    fun addTwoForTeamB(v: View) {
        scoreTeamB = scoreTeamB + 2
        displayForTeamB(scoreTeamB)
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    fun addThreeForTeamB(v: View) {
        scoreTeamB = scoreTeamB + 3
        displayForTeamB(scoreTeamB)
    }

    /*
     * Reset score
     */
    fun resetScore(v: View) {
        scoreTeamA = 0
        scoreTeamB = 0
        displayForTeamA(scoreTeamA)
        displayForTeamB(scoreTeamB)
    }

    /**
     * Displays the given score for Team A.
     */
    fun displayForTeamA(score: Int) {
        val scoreView = findViewById(R.id.team_a_score) as TextView
        scoreView.text = score.toString()
    }

    /**
     * Displays the given score for Team B.
     */
    fun displayForTeamB(score: Int) {
        val scoreView = findViewById<View>(R.id.team_b_score) as TextView
        scoreView.text = score.toString()
    }
}

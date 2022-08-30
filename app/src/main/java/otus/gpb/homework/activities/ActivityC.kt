package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        Log.d(TAG, "voj onCreate")
        findViewById<Button>(R.id.buttonOpenActivityA).setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
                .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
        findViewById<Button>(R.id.buttonOpenActivityD).setOnClickListener {
            val intent = Intent(this, ActivityD::class.java)
                .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)
        }
        findViewById<Button>(R.id.buttonCloseActivityC).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.buttonCloseStack).setOnClickListener {
            val intent = Intent(this, ActivityA::class.java)
                .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            finishAffinity()
            startActivity(intent)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG, "voj onNewIntent")
    }

    private val TAG = "Activity C"

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "voj onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "voj onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "voj onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "voj onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "voj onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "voj onDestroy")
    }
}
package example.irenepoem.myapplicationpoem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG="MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "Здравствуй, Дедушка Мороз!")
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Отдохни немного -")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Ты большой мешок принес")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "И устал с дороги")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Мы тебя повеселим,")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Спать, конечно, не дадим")
    }
}
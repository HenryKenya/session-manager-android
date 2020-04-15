package ke.co.skylinedesign.sessionmanagerexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ke.co.skylinedesign.session_manager.SessionManagerUtil
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val currentTime = Calendar.getInstance().time

        val sessionIsActive = SessionManagerUtil.isSessionActive(currentTime, this)

        if (sessionIsActive) startActivity(Intent(this, DashboardActivity::class.java))

        button.setOnClickListener {
            SessionManagerUtil.startUserSession(this, 60)
            SessionManagerUtil.storeUserToken(this, "randomUserToken")
            startActivity(Intent(this, DashboardActivity::class.java))
        }
    }
}

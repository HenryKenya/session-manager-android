package ke.co.skylinedesign.sessionmanagerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ke.co.skylinedesign.session_manager.SessionManagerUtil
import kotlinx.android.synthetic.main.activity_dashboard.*
import java.util.*

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        // check if session is active
        val currentTime = Calendar.getInstance().time
        val sessionStatus = SessionManagerUtil.isSessionActive(currentTime, this)
        val token = SessionManagerUtil.getUserToken(this)
        textToken.text = token
        textSessionStatus.text = sessionStatus.toString()
    }
}

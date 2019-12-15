package kids.a1ia3.samplejetpackcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.core.setContent
import androidx.ui.material.MaterialTheme
import kids.a1ia3.samplejetpackcompose.ui.SampleApp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                SampleApp()
            }
        }
    }
}

package com.company.velogtimber

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.company.velogtimber.ui.theme.VelogTimberTheme
import timber.log.Timber

/**
 * INBOX
 *
 * 1. Add Timber ✅
 * 2. Add Crashlytics ✅
 * 3. Wire Timber+Crashlytics ✅
 * 4. Profit ✅
 */

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VelogTimberTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {

                        Image(
                            painter = painterResource(id = R.drawable.ic_launcher_foreground),
                            contentDescription = "A picture of Spike",
                            modifier = Modifier.padding(32.dp)
                        )
                    }
                }
                Timber.d("황건희D")
                Timber.i("황건희I")
                Timber.e("황건희E")
            }
        }
    }


}
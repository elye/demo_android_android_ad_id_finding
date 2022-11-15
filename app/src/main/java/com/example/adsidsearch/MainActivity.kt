package com.example.adsidsearch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.adsidsearch.ui.theme.AdsIDSearchTheme
import com.google.android.gms.ads.MobileAds
import com.krux.androidsdk.aggregator.KruxEventAggregator
import com.krux.androidsdk.aggregator.KruxSegments



//import com.google.android.gms.ads.identifier.AdvertisingIdClient

class MainActivity : ComponentActivity() {
    val emptyClass = EmptyClass(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        MobileAds.initialize(this) {}

//        emptyClass.beingCalled()

        val kruxSegmentsCallback = KruxSegments {}
        KruxEventAggregator.initialize(this, "copy_from_krux_ui", kruxSegmentsCallback , true);

        setContent {
            AdsIDSearchTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }

    private fun notBeingCalled() {
//        AdvertisingIdClient.getAdvertisingIdInfo(this)
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AdsIDSearchTheme {
        Greeting("Android")
    }
}
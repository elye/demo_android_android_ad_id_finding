package com.example.adsidsearch

import android.content.Context
import com.google.android.gms.ads.identifier.AdvertisingIdClient

class EmptyClass(private val context: Context) {
    fun beingCalled() {
        AdvertisingIdClient.getAdvertisingIdInfo(context)
    }
}

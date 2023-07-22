/*
 * Copyright 2022 Esri
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.arcgismaps.ApiKey
import com.arcgismaps.ArcGISEnvironment
import com.arcgismaps.mapping.ArcGISMap
import com.arcgismaps.mapping.view.MapView
import com.arcgismaps.portal.Portal
import com.arcgismaps.mapping.PortalItem
import com.example.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val activityMainBinding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    private val mapView: MapView by lazy {
        activityMainBinding.mapView
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycle.addObserver(mapView)

        setApiKey()

        setupMap()


    }

    private fun setupMap() {
        val portal = Portal("https:///www.arcgis.com", Portal.Connection.Anonymous)

        val itemId = "41281c51f9de45edaf1c8ed44bb10e30"
        val portalItem = PortalItem(portal, itemId)
        val map = ArcGISMap(portalItem)

        mapView.map = map

    }

    private fun setApiKey() {
        // It is not best practice to store API keys in source code. We have you insert one here
        // to streamline this tutorial.

        ArcGISEnvironment.apiKey = ApiKey.create("AAPK80848b2e603341559f0b825f203064c4jjuOzGRGwi6Nt2iDESThlpvLccJ_t8DeEUrNEh60gEDc8Oz7TcxE6vCBVIAB5st6")

    }

    private fun showError(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_LONG).show()
        Log.e(localClassName, message)
    }

}


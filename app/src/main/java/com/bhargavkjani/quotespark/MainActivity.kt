package com.bhargavkjani.quotespark

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bhargavkjani.quotespark.ui.screens.QuoteListScreen
import com.bhargavkjani.quotespark.ui.screens.QuoteDetailScreen
import com.bhargavkjani.quotespark.ui.theme.QuoteSparkTheme
import com.bhargavkjani.quotespark.ui.theme.SplashBackground
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen() // before setContent

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        MobileAds.initialize(this) { initializationStatus ->
            // Optional: handle when initialization is complete
            Log.d("AdMob", "Initialization complete")
        }
        setContent {
            QuoteSparkTheme {
                val navController = rememberNavController()


                Scaffold(modifier = Modifier.fillMaxSize()) {
                    padding ->
                    NavHost(
                        navController = navController,
                        startDestination = "list",
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color = SplashBackground)
                            .padding(padding)
                    ) {
                        composable("list") {
                            QuoteListScreen(
                                onQuoteClick = { quote ->
                                    navController.navigate("detail/${quote}")
                                }
                            )
                        }
                        composable("detail/{quoteText}") { backStackEntry ->
                            val quote = backStackEntry.arguments?.getString("quoteText")
                            QuoteDetailScreen(quote = quote ?: "No quote found")
                        }
                    }
                }
            }
        }
    }
}

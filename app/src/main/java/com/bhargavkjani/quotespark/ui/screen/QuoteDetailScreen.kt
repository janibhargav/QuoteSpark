package com.bhargavkjani.quotespark.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bhargavkjani.quotespark.ui.components.BannerAdView

@Composable
fun QuoteDetailScreen(quote: String) {
    Scaffold(
        topBar = {
            QuoteTopAppBar2()
        },
        bottomBar = {
            BannerAdView() // ✅ Add the banner here too
        }
    ) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp)
        ) {
            Text(text = quote, fontSize = 20.sp)
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuoteTopAppBar2() {
    TopAppBar(
        title = { Text("Quote Detail") }
    )
}

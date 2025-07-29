package com.bhargavkjani.quotespark.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.bhargavkjani.quotespark.ui.screens.QuoteListScreen
import com.bhargavkjani.quotespark.ui.screens.QuoteDetailScreen

@Composable
fun QuoteNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "quoteList") {

        composable("quoteList") {
            QuoteListScreen(
                onQuoteClick = { selectedQuote ->
                    navController.navigate("quoteDetail/${selectedQuote}")
                }
            )
        }

        composable("quoteDetail/{quote}") { backStackEntry ->
            val quote = backStackEntry.arguments?.getString("quote") ?: ""
            QuoteDetailScreen(quote = quote)
        }
    }
}

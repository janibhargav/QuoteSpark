package com.bhargavkjani.quotespark.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.bhargavkjani.quotespark.ui.components.BannerAdView

@Composable
fun QuoteListScreen(onQuoteClick: (String) -> Unit){
    val quotes = listOf(
        "Believe you can and you're halfway there.",
        "Success is not final, failure is not fatal: it is the courage to continue that counts.",
        "Don't watch the clock; do what it does. Keep going.",
        "Push yourself, because no one else is going to do it for you.",
        "Great things never come from comfort zones.",
        "Dream big. Start small. Act now.",
        "Your only limit is your mind.",
        "Hard work beats talent when talent doesn't work hard.",
        "Stay focused and never give up.",
        "Success doesn’t come to you, you go to it.",
        "Believe in yourself, even when no one else does.",
        "Discipline is the bridge between goals and accomplishment.",
        "Every day is a second chance.",
        "Wake up with determination, go to bed with satisfaction.",
        "Turn your dreams into plans.",
        "One day or day one. You decide.",
        "Work hard in silence, let success make the noise.",
        "You don’t have to be great to start, but you have to start to be great.",
        "Do something today that your future self will thank you for.",
        "Success is what comes after you stop making excuses.",
        "Perseverance is the hard work you do after you get tired of doing the hard work you already did.",
        "Make it happen. Shock everyone.",
        "Little things make big days.",
        "Be stronger than your excuses.",
        "You were born to be real, not perfect.",
        "You are your only limit.",
        "Doubt kills more dreams than failure ever will.",
        "Focus on your goal. Don’t look in any direction but ahead.",
        "The only time success comes before work is in the dictionary.",
        "If not now, when?",
        "Act like you already are the person you want to become.",
        "Your future is created by what you do today, not tomorrow.",
        "Strive for progress, not perfection.",
        "Start where you are. Use what you have. Do what you can.",
        "The harder you work for something, the greater you'll feel when you achieve it.",
        "Difficult roads often lead to beautiful destinations.",
        "It always seems impossible until it’s done.",
        "Your potential is endless.",
        "Do it with passion or not at all.",
        "If you can dream it, you can do it.",
        "Never stop learning because life never stops teaching.",
        "Hustle in silence and let your success be the noise.",
        "Success doesn’t just find you. You have to go out and get it.",
        "Don’t wait for opportunity. Create it.",
        "It’s going to be hard, but hard does not mean impossible.",
        "Great things take time. Be patient.",
        "Sometimes later becomes never. Do it now.",
        "The key to success is to focus on goals, not obstacles.",
        "Failure is not the opposite of success; it’s part of success.",
        "Success starts with self-discipline.",
        "Your vibe attracts your tribe.",
        "You are capable of amazing things.",
        "Stay positive. Work hard. Make it happen.",
        "Don’t be afraid to give up the good to go for the great.",
        "Think it. Want it. Get it.",
        "Do what you can with all you have, wherever you are.",
        "Live as if you were to die tomorrow. Learn as if you were to live forever.",
        "If you don’t like the road you’re walking, start paving another one.",
        "You miss 100% of the shots you don’t take.",
        "A goal without a plan is just a wish.",
        "In the middle of every difficulty lies opportunity.",
        "Success is not in what you have, but who you are.",
        "Only those who dare to fail greatly can ever achieve greatly.",
        "Don't limit your challenges. Challenge your limits.",
        "Action is the foundational key to all success.",
        "Quality is not an act, it is a habit.",
        "You don’t get what you wish for. You get what you work for.",
        "The only person you should try to be better than is the person you were yesterday.",
        "Success is the sum of small efforts repeated day in and day out.",
        "You’re closer than you were yesterday.",
        "Start today, not tomorrow.",
        "You got this!",
        "Keep going. You're getting there.",
        "Progress over perfection.",
        "Stay hungry. Stay foolish.",
        "Failure is another stepping stone to greatness.",
        "There is no substitute for hard work.",
        "Believe more. Doubt less.",
        "Great minds discuss ideas; average minds discuss events; small minds discuss people.",
        "Nothing worth having comes easy.",
        "Courage doesn’t always roar. Sometimes it’s the quiet voice saying, 'I’ll try again tomorrow.'",
        "Don't just exist. Live.",
        "Be a voice, not an echo.",
        "The best way to predict the future is to create it.",
        "Make each day your masterpiece.",
        "You are more than capable.",
        "Success is built on consistency.",
        "Let your dreams be bigger than your fears.",
        "Fall seven times, stand up eight.",
        "Chase the vision, not the money.",
        "Don't stop until you're proud.",
        "Good things come to those who hustle.",
        "Keep moving forward.",
        "Energy and persistence conquer all things.",
        "Winners are not afraid of losing. But losers are.",
        "Grind now. Shine later.",
        "Success is a journey, not a destination.",
        "Stay disciplined. Stay focused.",
        "You were not born to be average.",
        "Get up. Dress up. Show up. Never give up.",
        "Work until your idols become your rivals.",
        "Make your life a story worth telling."
    )
/*

    Scaffold(
        topBar = {
            QuoteTopAppBar()
        }
    ) { padding ->
        LazyColumn(
            contentPadding = padding,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            items(quotes) { quote ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                        .clickable { onQuoteClick(quote) },
                    elevation = CardDefaults.cardElevation(4.dp)
                ) {
                    Text(
                        text = quote,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }

        BannerAdView()
    }*/

    Scaffold(
        topBar = { QuoteTopAppBar() },
        bottomBar = {
            BannerAdView()
        }
    ) { padding ->
        LazyColumn(
            contentPadding = padding,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            items(quotes) { quote ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                        .clickable { onQuoteClick(quote) },
                    elevation = CardDefaults.cardElevation(4.dp)
                ) {
                    Text(
                        text = quote,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuoteTopAppBar() {
    TopAppBar(
        title = { Text("QuoteSpark") }
    )
}

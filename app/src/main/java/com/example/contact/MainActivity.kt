package com.example.contact

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.contact.routing.PhoneBookRouter
import com.example.contact.routing.Screen
import com.example.contact.screens.ListScreen
import com.example.contact.screens.UpdateScreen
import com.example.contact.screens.DeleteScreen
import com.example.contact.ui.theme.PhoneBookTheme
import com.example.contact.ui.theme.PhoneBookThemeSettings
import com.example.contact.viewmodel.MainViewModel
import com.example.contact.viewmodel.MainViewModelFactory

class MainActivity : ComponentActivity() {
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PhoneBookTheme(darkTheme = PhoneBookThemeSettings.isDarkThemeEnabled) {
                val viewModel: MainViewModel = viewModel(
                    factory = MainViewModelFactory(LocalContext.current.applicationContext as Application)
                )
                MainActivityScreen(viewModel)
            }
        }
    }
}

@ExperimentalMaterialApi
@Composable
fun MainActivityScreen(viewModel: MainViewModel) {
    Surface {
        when (PhoneBookRouter.currentScreen) {
            is Screen.List -> ListScreen(viewModel)
            is Screen.Update -> UpdateScreen(viewModel)
            is Screen.Delete -> DeleteScreen(viewModel)
        }
    }
}

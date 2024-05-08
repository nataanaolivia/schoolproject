package net.ezra.navigation

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.ezra.ui.SplashScreen
import net.ezra.ui.auth.LoginScreen
import net.ezra.ui.auth.SignupScreen
import net.ezra.ui.home.HomeScreen
import net.ezra.ui.products.ProductsScreen
import net.ezra.ui.shop.ShopScreen
import net.ezra.ui.store.StoreScreen
import net.ezra.ui.voucher.VoucherScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_SPLASH


) {
    BackHandler {
        navController.popBackStack()

        }
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {


        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }


        composable(ROUTE_SIGNUP) {
            SignupScreen(navController)
        }


        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }


        composable(ROUTE_VOUCHER) {
            VoucherScreen(navController)
        }





        composable(ROUTE_SHOP) {
            ShopScreen(navController)
        }

        composable(ROUTE_PRODUCTS) {
            ProductsScreen(navController)
        }

        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }


        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }


        composable(ROUTE_STORE) {
            StoreScreen(navController)
        }

































    }
}
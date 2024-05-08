package net.ezra.ui.voucher

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_VOUCHER
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun VoucherScreen(navController: NavHostController) {

        var voucherCode by remember { mutableStateOf("") }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .background(Color(0xff1e78a1))
        ) {
            OutlinedTextField(
                value = voucherCode,
                onValueChange = { voucherCode = it },
                label = { Text(text = "Enter Voucher Code") }
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = { /* Verify Voucher Code Logic */ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Apply Voucher")
            }

            // Display Result or Error
            Text(
                text = "Applied succefully!!!",
                modifier = Modifier.padding(top = 16.dp)
            )


            Column {
                Text(text = "VOUCHER CARDS")

                Spacer(modifier = Modifier.height(60.dp))


                Button(onClick = {
                    navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_VOUCHER) { inclusive = true }
                    }
                }) {

                    Text(text = "THE HOME PAGE",
                        fontSize = 20.sp,
                        color = (Color(0xff8f248d ))




                    )

                }




            }

        }







}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun VoucherScreenPreviewLight() {
    VoucherScreen(rememberNavController())
}


package net.ezra.ui.home

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP

import net.ezra.R
import net.ezra.navigation.ROUTE_ADD_STUDENTS
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_SIGNUP
import net.ezra.navigation.ROUTE_STORE
import net.ezra.navigation.ROUTE_VOUCHER


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable

fun HomeScreen(navController: NavHostController) {


    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "WELCOME TO THE MARKET PLACE",
                        modifier = Modifier
                            .background(Color(0xff3b168a))




                    )


                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.ArrowBack, "backIcon")
                    }
                },
            )
        }, content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)
                    .padding(top = 10.dp)
                    .background(Color(0xff65168a)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){



                Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically) {
                    var text by remember { mutableStateOf(TextFieldValue("")) }
                    OutlinedTextField(
                        value = text,
                        trailingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "searchIcon",modifier=Modifier.clickable {  navController.navigate(ROUTE_HOME) { popUpTo(
                            ROUTE_PRODUCTS)} }) },
                        //trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
                        onValueChange = {
                            text = it
                        },
                        label = { Text(text = "Search desired goods") },
                        placeholder = { Text(text = "Search desired goods") },
                        modifier = Modifier
                            .background(Color.White)
                            .width(300.dp)
                    )
                }




                Image(
                    painter = painterResource(R.drawable.cake),
                    contentDescription = "Circle Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(128.dp)
                        .clip(CircleShape) // clip to the circle shape
                        .border(5.dp, Color.Gray, CircleShape)//optional
                )















                Spacer(modifier = Modifier.height(30.dp))







                Button(onClick = {
                    navController.navigate(ROUTE_SIGNUP) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                }) {

                    Text(text = "GET STARTED BY SIGNING UP",
                        fontSize = 20.sp,
                        color = (Color(0xff4e3486))




                    )

                }






                Spacer(modifier = Modifier.height(30.dp))


                Button(onClick = {
                    navController.navigate(ROUTE_VOUCHER) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                }) {

                    Text(text = "SECURE YOUR VOUCHER CARD",
                        fontSize = 20.sp,
                        color = (Color(0xff8f248d ))




                    )

                }

                Spacer(modifier = Modifier.height(60.dp))



                Button(onClick = {
                    navController.navigate(ROUTE_PRODUCTS) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                }) {

                    Text(text = "WE HAVE AMAZING PRODUCTS",
                        fontSize = 20.sp,
                        color = (Color(0xff551c62 ))




                    )

                }


                LazyRow (modifier=Modifier.fillMaxWidth()){
                    item{




                        Card(onClick = { navController.navigate(ROUTE_HOME) { popUpTo(ROUTE_PRODUCTS)} } ,modifier = Modifier
                            .padding(15.dp)
                            .height(150.dp)
                            .width(150.dp)
                            .border(shape = RoundedCornerShape(10.dp), width = 1.dp, color = Color.White)
                            .shadow(elevation = 10.dp)
                        ) {
                            Row (horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.background(
                                Color.White)){
                                Image(painter = painterResource(id = R.drawable.image1), contentDescription = "" , modifier = Modifier.size(70.dp))
                                Text(text = " wedding dresses")
                            }
                        }
                        Spacer(modifier = Modifier.width(15.dp))

                        Card(onClick = { navController.navigate(ROUTE_HOME) { popUpTo(ROUTE_STORE)} } ,modifier = Modifier
                            .padding(15.dp)
                            .height(150.dp)
                            .width(150.dp)
                            .border(shape = RoundedCornerShape(10.dp), width = 1.dp, color = Color.White)
                            .shadow(elevation = 10.dp)) {
                            Row(horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                Color.White)) {
                                Image(painter = painterResource(id = R.drawable.image2), contentDescription = "" , modifier = Modifier.size(70.dp))
                                Text(text = " Baby toys")
                            }
                        }
                        Spacer(modifier = Modifier.width(15.dp))

                        Card(
                            onClick = { navController.navigate(ROUTE_HOME) { popUpTo(ROUTE_PRODUCTS) } },
                            modifier = Modifier
                                .padding(15.dp)
                                .height(150.dp)
                                .width(150.dp)
                                .border(shape = RoundedCornerShape(10.dp), width = 1.dp, color = Color.White)
                                .shadow(elevation = 10.dp)
                        ) {
                            Row(horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                Color.White)){
                                Image(painter = painterResource(id = R.drawable.image3), contentDescription = "" , modifier = Modifier.size(70.dp))
                                Text(text = "Cool cars")
                            }
                        }
                        Spacer(modifier = Modifier.width(15.dp))

                        Card(onClick = { navController.navigate(ROUTE_HOME) { popUpTo(ROUTE_STORE)} },modifier = Modifier
                            .padding(15.dp)
                            .height(150.dp)
                            .width(150.dp)
                            .border(shape = RoundedCornerShape(10.dp), width = 1.dp, color = Color.White)
                            .shadow(elevation = 10.dp)) {
                            Row (horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                Color.White)){
                                Image(painter = painterResource(id = R.drawable.stock), contentDescription = "", modifier = Modifier.size(70.dp) )
                                Text(text = " food ingredients")
                            }
                        }
                        Spacer(modifier = Modifier.width(15.dp))


                        Card(onClick = { navController.navigate(ROUTE_HOME) { popUpTo(ROUTE_STORE)} },modifier = Modifier
                            .padding(15.dp)
                            .height(150.dp)
                            .width(150.dp)
                            .border(shape = RoundedCornerShape(10.dp), width = 1.dp, color = Color.White)
                            .shadow(elevation = 10.dp)) {
                            Row (horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                Color.White)){
                                Image(painter = painterResource(id = R.drawable.photo1), contentDescription = "", modifier = Modifier.size(70.dp) )
                                Text(text = " Smart phones")
                            }
                        }

                        Spacer(modifier = Modifier.width(15.dp))



                        Card(onClick = { navController.navigate(ROUTE_HOME) { popUpTo(ROUTE_PRODUCTS)} },modifier = Modifier
                            .padding(15.dp)
                            .height(150.dp)
                            .width(150.dp)
                            .border(shape = RoundedCornerShape(10.dp), width = 1.dp, color = Color.White)
                            .shadow(elevation = 10.dp)) {
                            Row (horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                Color.White)){
                                Image(painter = painterResource(id = R.drawable.image4), contentDescription = "" , modifier = Modifier.size(70.dp))
                                Text(text = " Beautiful baby clothes")
                            }
                        }
                        Spacer(modifier = Modifier.width(15.dp))

                        Card(onClick = { navController.navigate(ROUTE_HOME) { popUpTo(ROUTE_STORE)} },modifier = Modifier
                            .padding(15.dp)
                            .height(150.dp)
                            .width(150.dp)
                            .border(shape = RoundedCornerShape(10.dp), width = 1.dp, color = Color.White)
                            .shadow(elevation = 10.dp)) {
                            Row (horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                Color.White)){
                                Image(painter = painterResource(id = R.drawable.image5), contentDescription = "" , modifier = Modifier.size(70.dp))
                                Text(text = " Amazing shoes")
                            }
                        }


                    }

                }










                }




                }
                )











            }

















@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}


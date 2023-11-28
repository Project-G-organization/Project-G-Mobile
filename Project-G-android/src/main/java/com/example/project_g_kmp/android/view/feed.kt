@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.project_g_kmp.android.view

import android.graphics.drawable.VectorDrawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project_g_kmp.android.R
import com.example.project_g_kmp.android.presentation.components.SliderBanner

data class BottomNavigatioItem(

    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val hasNews: Boolean
)



@Composable
fun Feed(modifier: Modifier = Modifier.background(Color(0xFFEBEBEB))){

    Column(
        Modifier
            .fillMaxSize()
            .background(color = Color(0xFFEBEBEB))
    ) {

        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(10.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(modifier = Modifier
                .padding(0.dp, 5.dp)
                .horizontalScroll(rememberScrollState())
            ) {
                Image(
                    bitmap = ImageBitmap.imageResource(id = R.drawable.carr1),
                    contentDescription = null,
                    Modifier
                        .size(80.dp)
                )
                Image(
                    bitmap = ImageBitmap.imageResource(id = R.drawable.carr2),
                    contentDescription = null,
                    Modifier
                        .size(80.dp)
                )
                Image(
                    bitmap = ImageBitmap.imageResource(id = R.drawable.carr3),
                    contentDescription = null,
                    Modifier
                        .size(80.dp)
                )
                Image(
                    bitmap = ImageBitmap.imageResource(id = R.drawable.carr4),
                    contentDescription = null,
                    Modifier
                        .size(80.dp)
                )
                Image(
                    bitmap = ImageBitmap.imageResource(id = R.drawable.carr5),
                    contentDescription = null,
                    Modifier
                        .size(80.dp)
                )
                Image(
                    bitmap = ImageBitmap.imageResource(id = R.drawable.carr6),
                    contentDescription = null,
                    Modifier
                        .size(80.dp)
                )
                Image(
                    bitmap = ImageBitmap.imageResource(id = R.drawable.carr7),
                    contentDescription = null,
                    Modifier
                        .size(80.dp)
                )
                Image(
                    bitmap = ImageBitmap.imageResource(id = R.drawable.carr8),
                    contentDescription = null,
                    Modifier
                        .size(80.dp)
                )
            }

            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White,
                ),
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(),
            ) {
                Row(
                    modifier = Modifier
                        .padding(all = 10.dp)
                        .horizontalScroll(rememberScrollState())
                        .fillMaxWidth()
                ) {
                    Image(
                        bitmap = ImageBitmap.imageResource(id = R.drawable.carr1),
                        contentDescription = null,
                        Modifier
                            .size(60.dp)
                    )

                    Column(
                        modifier = Modifier
                        .padding(3.dp, 10.dp)
                    ){

                        Text(
                            "marcelo",
                            color = Color(0xFFE5684A),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                        )

                        Text(
                            text = "MARANHAO",
                            color = Color.Black,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }

                }
                SliderBanner()
//                LazyRow(
//                    modifier = Modifier
//                        .padding(all = 10.dp)
//                        .clip(RoundedCornerShape(18.dp))
////                        .horizontalScroll(rememberScrollState())
//                        .fillMaxWidth()
//                ) {
//                    item {
//                        Image(
//                            painter = painterResource(id = R.drawable.backlogin),
//                            contentDescription = null,
//                            contentScale = ContentScale.FillBounds,
//                            modifier = Modifier
//                                .width(300.dp)
//                                .height(500.dp)
//                                .padding(horizontal = 15.dp)
//                        )
//                    }
//                    item {
//                        Image(
//                            painter = painterResource(id = R.drawable.backlogin),
//                            contentDescription = null,
//                            contentScale = ContentScale.FillBounds,
//                            modifier = Modifier
//                                .width(300.dp)
//                                .height(500.dp)
//                                .padding(horizontal = 15.dp)
//                        )
//                    }
//                }
//                Box(
//                    modifier = Modifier
//                        .padding(all = 10.dp)
//                        .clip(RoundedCornerShape(18.dp))
////                        .horizontalScroll(rememberScrollState())
//                        .fillMaxWidth()
//                        .scrollable(rememberScrollableState {
//                            it
//                        }, Orientation.Horizontal)
//                ) {
//                    Image(
//                        painter = painterResource(id = R.drawable.backlogin),
//                        contentDescription = null,
//                        contentScale = ContentScale.FillBounds,
//                        modifier = Modifier
//                            .width(300.dp)
//                            .height(500.dp)
//                            .background(Color.Red)
//                    )
//                    Image(
//                        painter = painterResource(id = R.drawable.backlogin),
//                        contentDescription = null,
//                        contentScale = ContentScale.FillBounds,
//                        modifier = Modifier
//                            .width(300.dp)
//                            .height(500.dp)
//                            .background(Color.Red)
//                    )
//                }

                Row(modifier = Modifier
                    .height(40.dp)
                    .fillMaxWidth()
                    .background(color = Color.White),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {

                    Icon(painterResource(id = R.drawable.baseline_mode_comment_24),
                        contentDescription = null,
                        Modifier.size(30.dp),
                        tint = Color(0xFFE5684A))

                    Icon(painterResource(id = R.drawable.baseline_thumb_up_24),
                        contentDescription = null,
                        Modifier.size(30.dp),
                        tint = Color(0xFFE5684A))

                    Icon(painterResource(id = R.drawable.baseline_share_24),
                        contentDescription = null,
                        Modifier.size(30.dp),
                        tint = Color(0xFFE5684A))

                    Icon(painterResource(id = R.drawable.baseline_save_alt_24),
                        contentDescription = null,
                        Modifier.size(30.dp),
                        tint = Color(0xFFE5684A))

                }
            }

            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White,
                ),
                modifier = Modifier
                    .padding(10.dp, 5.dp)
                    .fillMaxWidth(),
            ) {
                Row(
                    modifier = Modifier
                        .padding(all = 10.dp)
                        .horizontalScroll(rememberScrollState())
                        .fillMaxWidth()
                ) {
                    Image(
                        bitmap = ImageBitmap.imageResource(id = R.drawable.perf2),
                        contentDescription = null,
                        Modifier
                            .size(60.dp)
                    )

                    Column(
                        modifier = Modifier
                            .padding(3.dp, 10.dp)
                    ){

                        Text(
                            "dojavam",
                            color = Color(0xFFE5684A),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                        )

                        Text(
                            text = "EUA CALIFORMIA",
                            color = Color.Black,
                            fontSize = 12.sp,
                        )
                    }

                }

                Column(
                    modifier = Modifier
                        .padding(25.dp, 5.dp)
                        .fillMaxWidth()
                ) {

                    Text(
                        text = "Et eius voluptate dolorum debitis ducimus fugit molestiae dolor. Eum et dolores aut reprehenderit dignissimos nihil error. Ducimus voluptas velit laboriosam provident. Labore est quis ad eum sed. Ratione quibusdam fugiat. Qui labore quisquam dolorum maiores deserunt dolores nihil.Et eius voluptate dolorum debitis ducimus fugit molestiae dolor. Eum et dolores aut reprehenderit dignissimos nihil error. Ducimus voluptas velit laboriosam provident. Labore est quis ad eum sed. Ratione quibusdam fugiat. Qui labore quisquam dolorum maiores deserunt dolores nihil.",
                        color = Color.Black,
                        fontSize = 12.sp,
                    )

                }

                Column(
                    modifier = Modifier
                        .padding(15.dp)
                        .clip(RoundedCornerShape(18.dp))
                        .fillMaxWidth()
                ) {

                        Image(
                            painter = painterResource(id = R.drawable.post4),
                            contentDescription = null,
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(600.dp)

                        )
                }
                
                Row(modifier = Modifier
                    .height(40.dp)
                    .fillMaxWidth()
                    .background(color = Color.White),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {

                    Icon(painterResource(id = R.drawable.baseline_mode_comment_24),
                        contentDescription = null,
                        Modifier.size(30.dp),
                        tint = Color(0xFFE5684A))

                    Icon(painterResource(id = R.drawable.baseline_thumb_up_24),
                        contentDescription = null,
                        Modifier.size(30.dp),
                        tint = Color(0xFFE5684A))

                    Icon(painterResource(id = R.drawable.baseline_share_24),
                        contentDescription = null,
                        Modifier.size(30.dp),
                        tint = Color(0xFFE5684A))

                    Icon(painterResource(id = R.drawable.baseline_save_alt_24),
                        contentDescription = null,
                        Modifier.size(30.dp),
                        tint = Color(0xFFE5684A))
                }
            }

            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White,
                ),
                modifier = Modifier
                    .padding(10.dp, 5.dp)
                    .fillMaxWidth(),
            ) {
                Row(
                    modifier = Modifier
                        .padding(all = 10.dp)
                        .horizontalScroll(rememberScrollState())
                        .fillMaxWidth()
                ) {
                    Image(
                        bitmap = ImageBitmap.imageResource(id = R.drawable.perf2),
                        contentDescription = null,
                        Modifier
                            .size(60.dp)
                    )

                    Column(
                        modifier = Modifier
                            .padding(3.dp, 10.dp)
                    ){

                        Text(
                            "dojavam",
                            color = Color(0xFFE5684A),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                        )

                        Text(
                            text = "EUA CALIFORMIA",
                            color = Color.Black,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }

                }

                Column(
                    modifier = Modifier
                        .padding(25.dp, 5.dp)
                        .fillMaxWidth()
                ) {

                    Text(
                        text = "Et eius voluptate dolorum debitis ducimus fugit molestiae dolor. Eum et dolores aut reprehenderit dignissimos nihil error. Ducimus voluptas velit laboriosam provident. Labore est quis ad eum sed. Ratione quibusdam fugiat. Qui labore quisquam dolorum maiores deserunt dolores nihil.Et eius voluptate dolorum debitis ducimus fugit molestiae dolor. Eum et dolores aut reprehenderit dignissimos nihil error. Ducimus voluptas velit laboriosam provident. Labore est quis ad eum sed. Ratione quibusdam fugiat. Qui labore quisquam dolorum maiores deserunt dolores nihil.",
                        color = Color.Black,
                        fontSize = 12.sp,
                    )

                }

                Row(modifier = Modifier
                    .height(40.dp)
                    .fillMaxWidth()
                    .background(color = Color.White),
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {

                    Icon(painterResource(id = R.drawable.baseline_mode_comment_24),
                        contentDescription = null,
                        Modifier.size(30.dp),
                        tint = Color(0xFFE5684A))

                    Icon(painterResource(id = R.drawable.baseline_thumb_up_24),
                        contentDescription = null,
                        Modifier.size(30.dp),
                        tint = Color(0xFFE5684A))

                    Icon(painterResource(id = R.drawable.baseline_share_24),
                        contentDescription = null,
                        Modifier.size(30.dp),
                        tint = Color(0xFFE5684A))

                    Icon(painterResource(id = R.drawable.baseline_save_alt_24),
                        contentDescription = null,
                        Modifier.size(30.dp),
                        tint = Color(0xFFE5684A))
                }
            }
        }

    }

    Column(Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Bottom){



    Row(modifier = Modifier
        .height(60.dp)
        .fillMaxWidth()
        .background(color = Color(0xFF202020)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {

        Icon(
            painterResource(id = R.drawable.baseline_add_24),
            contentDescription = null,
            Modifier.size(30.dp),
            tint = Color(0xFFE5684A)
        )

        Icon(
            painterResource(id = R.drawable.baseline_home_24),
            contentDescription = null,
            Modifier.size(30.dp),
            tint = Color(0xFFE5684A)
        )

        Icon(
            painterResource(id = R.drawable.baseline_search_24),
            contentDescription = null,
            Modifier.size(30.dp),
            tint = Color(0xFFE5684A)
        )

        Icon(
            painterResource(id = R.drawable.baseline_person_24),
            contentDescription = null,
            Modifier.size(30.dp),
            tint = Color(0xFFE5684A)
        )
      }
    }
}


@Composable
@Preview
private fun Preview(){
    Feed()
}
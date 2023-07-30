# Jetpack Compose Carousel

This is a simple Android app showcasing a carousel implemented using Jetpack Compose, a modern toolkit for building native UI in Android. The carousel displays a series of images that automatically scroll through at a specified interval.

## Demo

![Carousel Demo]([URL_TO_YOUR_GIF](https://imgur.com/a/tzlGtLd))


## Features

- Auto-scrolling carousel with images.
- Dots indicator at the bottom to show the current image position.
- Customizable delay time for automatic image changes.
- Option to show/hide dots indicator.

## Tech Stack

- [Jetpack Compose](https://developer.android.com/jetpack/compose) - Declarative UI framework for Android.
- [Kotlin](https://kotlinlang.org/) - Programming language for Android development.
- [Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) - For handling asynchronous operations.
- [Material3](https://material.io/) - Material Design components for Android.
- [AndroidX](https://developer.android.com/jetpack/androidx) - Android Jetpack libraries.

## Getting Started

To run the app on your local machine, follow these steps:

1. Clone the repository:

git clone https://github.com/your-username/jetpack-compose-carousel.git


2. Open the project in Android Studio.

3. Build and run the app on an emulator or a physical device.

## Usage

- The carousel will automatically start scrolling through the images.
- You can manually swipe left or right to change the displayed image.
- Dots at the bottom represent the current image position. Click on a dot to jump to the corresponding image.

## Customization

To customize the carousel behavior, you can use the `Carousel` composable function in the `MainActivity.kt` file:

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
 super.onCreate(savedInstanceState)
 setContent {
     JetpackComposeCarouselTheme {
         // A surface container using the 'background' color from the theme
         Surface(
             modifier = Modifier.fillMaxSize(),
             color = MaterialTheme.colorScheme.background
         ) {
             Carousel(
                 carouselItems = listOf(
                     R.drawable.image1,
                     R.drawable.image2,
                     R.drawable.image3,
                     // Add more image resources here...
                 ),
                 showDots = true, // Set this to true to show dots, false to hide dots
                 delayMillis = 3000L // Set the delay time in milliseconds (3 seconds in this case)
             )
         }
     }
 }
}

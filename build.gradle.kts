dependencies { 
    // Existing dependencies
    
    // Retrofit for network calls
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    
    // OkHttp for HTTP client
    implementation("com.squareup.okhttp3:okhttp:4.9.3")
    
    // Hilt for dependency injection
    implementation("com.google.dagger:hilt-android:2.42")
    kapt("com.google.dagger:hilt-compiler:2.42")
    
    // Coroutines for asynchronous programming
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2")
    
    // Gson for JSON serialization
    implementation("com.google.code.gson:gson:2.8.8")
    
    // Lifecycle management
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.4.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.1")
}

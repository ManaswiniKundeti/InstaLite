package com.example.instalite.di

import com.google.firebase.Firebase
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.firestore
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.storage
import dagger.Provides

@Module
@InstallIn(ViewModelComponent::class)
object FirebaseModule {

    @Provides
    fun provideFirebaseAuthentication(): FirebaseAuth = Firebase.auth

    @Provides
    fun provideFirebaseFirestore(): FirebaseFirestore = Firebase.firestore

    @Provides
    fun provideFirebaseStorage(): FirebaseStorage = Firebase.storage
}
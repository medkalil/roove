package com.mmdev.roove.core

import com.mmdev.business.auth.repository.AuthRepository
import com.mmdev.business.cards.repository.CardsRepository
import com.mmdev.business.chat.repository.ChatRepository
import com.mmdev.business.conversations.repository.ConversationsRepository
import com.mmdev.business.user.repository.UserRepository
import com.mmdev.data.core.AuthModule
import com.mmdev.data.core.FirebaseModule
import com.mmdev.data.core.RepositoryModule
import com.mmdev.data.core.UserModule
import com.mmdev.roove.ui.auth.viewmodel.AuthViewModelFactory
import com.mmdev.roove.ui.cards.viewmodel.CardsViewModelFactory
import com.mmdev.roove.ui.chat.viewmodel.ChatViewModelFactory
import com.mmdev.roove.ui.conversations.viewmodel.ConversationsViewModelFactory
import com.mmdev.roove.ui.main.viewmodel.MainViewModelFactory
import dagger.Component
import javax.inject.Singleton

@Component(modules = [
    AppModule::class,
    AuthModule::class,
    RepositoryModule::class,
    FirebaseModule::class,
    ViewModelModule::class,
    UserModule::class
])

@Singleton
interface AppComponent {

    //factories
    fun authViewModelFactory(): AuthViewModelFactory
    fun cardsViewModelFactory(): CardsViewModelFactory
    fun chatViewModelFactory(): ChatViewModelFactory
    fun conversationsViewModelFactory(): ConversationsViewModelFactory
    fun mainViewModelFactory(): MainViewModelFactory


    //repos
    fun authRepository(): AuthRepository
    fun cardsRepository(): CardsRepository
    fun chatRepository(): ChatRepository
    fun conversationsRepository(): ConversationsRepository
    fun userRepository(): UserRepository

}
package com.android.taskvision.feature.navigation.content


sealed class Content(val route: String) {
    object Splash : Content("splash")
    object OnBoard : Content("onBoard")
    object SignUp : Content("register")
    object SignIn : Content("login")
    object Main : Content("main")
    object Task : Content("task")
    object Chat : Content("chat")
    companion object {
        const val AUTH_GRAPH = "auth_graph"
        const val MAIN_GRAPH = "home_graph"
    }
}
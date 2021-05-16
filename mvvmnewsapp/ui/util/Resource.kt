package com.androiddevs.mvvmnewsapp.ui.util


//sealed class allows only mentioned classes to inherit from it not other classes.
sealed class Resource<T>(
    val data: T? = null,
    val message: String? = null
) {

    //classes allowed to inherit resource class.
    class Success<T>(data : T) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
    class Loading<T> : Resource<T>()
}
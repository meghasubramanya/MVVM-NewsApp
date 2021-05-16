package com.androiddevs.mvvmnewsapp.ui.db

import androidx.room.TypeConverter

//this class converts from one type to other type objects.
class Converters {

    @TypeConverter
    fun fromSource(source : com.androiddevs.mvvmnewsapp.ui.models.Source) : String {
        return source.name
    }

    @TypeConverter
    fun toSource(name : String) : com.androiddevs.mvvmnewsapp.ui.models.Source {
        return com.androiddevs.mvvmnewsapp.ui.models.Source(name, name)
    }
}
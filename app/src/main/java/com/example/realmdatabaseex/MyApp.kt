package com.example.realmdatabaseex

import android.app.Application
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration
import models.Address
import models.Course
import models.Student
import models.Teacher

class MyApp :Application() {

    companion object{
        lateinit var  realm :Realm
            private set
    }

    override fun onCreate() {
        super.onCreate()
        realm = Realm.open(
            configuration = RealmConfiguration.create(
                schema = setOf(
                    Address::class,
                    Teacher::class,
                    Student::class,
                    Course::class,


                )
            )
        )
    }
}
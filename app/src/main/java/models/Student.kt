package models

import io.realm.kotlin.ext.backlinks
import io.realm.kotlin.query.RealmResults
import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey
import org.mongodb.kbson.ObjectId

class Student : RealmObject {

    @PrimaryKey var id : ObjectId = ObjectId()
    var name : String= ""
    val enrolledCourses :RealmResults<Course> by backlinks(Course::enrolledStudents)
}
package com.example.contact.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ContactDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,

    @ColumnInfo(name = "first_name") val firstName: String,
    @ColumnInfo(name = "last_name") val lastName: String,
    @ColumnInfo(name = "number") val number: String,

    @ColumnInfo(name = "tag_id") val tagId: Long,
    @ColumnInfo(name = "in_trash") val isInTrash: Boolean
) {
    companion object {
        val DEFAULT_CONTACTS = listOf(
            ContactDbModel(1, "Woraphat", "Wannaphong", "0923151274", 1, false),
            ContactDbModel(2, "Woraphat", "Wannaphong", "0923151274", 2, false),
            ContactDbModel(3, "Woraphat", "Wannaphong", "0923151274", 1, false),
            ContactDbModel(4, "Woraphat", "Wannaphong", "0923151274", 1, false),
            ContactDbModel(5, "Woraphat", "Wannaphong", "0923151274", 3, false),
            ContactDbModel(6, "Woraphat", "Wannaphong", "0923151274", 2, false),
            ContactDbModel(7, "Woraphat", "Wannaphong", "0923151274", 2, false),
            ContactDbModel(8, "Woraphat", "Wannaphong", "0923151274", 2, false),
            ContactDbModel(9, "Woraphat", "Wannaphong", "0923151274", 3, false),
            ContactDbModel(10, "Woraphat", "Wannaphong", "0923151274", 3, false),
        )
    }
}

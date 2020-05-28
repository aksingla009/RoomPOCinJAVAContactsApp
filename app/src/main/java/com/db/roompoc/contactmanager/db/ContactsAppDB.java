package com.db.roompoc.contactmanager.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.db.roompoc.contactmanager.db.entity.Contact;

@Database(entities = {Contact.class}, version = 1)
public abstract class ContactsAppDB extends RoomDatabase {

    public abstract ContactDAO getContactDAO();

}

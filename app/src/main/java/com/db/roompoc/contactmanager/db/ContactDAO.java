package com.db.roompoc.contactmanager.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.db.roompoc.contactmanager.db.entity.Contact;

import java.util.List;

@Dao
public interface ContactDAO {

    @Insert
    public long insertContact(Contact contactObj);

    @Update
    public void updateContact(Contact contactObj);

    @Delete
    public void deleteContact(Contact OBJ);

    @Query("Select * from contacts")
    public List<Contact> getAllContacts();

    @Query("Select * from contacts where contact_id ==:contactID")
    public Contact getContact(long contactID);


}

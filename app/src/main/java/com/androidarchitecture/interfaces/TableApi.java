package com.androidarchitecture.interfaces;

import com.androidarchitecture.data.Data;

import java.util.List;

/**
 * Created by Peter on 29.06.2017.
 */

/** Base DataBase interface */
public interface TableApi<T> {

    /**Push data to dataBase*/
    void addOrUpdate(Data<T> data);

    /** Create new record */
    void update(Data<T> data);

    /** Request all available records */
    List<Data<T>> getAll();

    /** Search record by id */
    Data<T> findById();

    /** Search record by id */
    boolean delete(Data<T> data);

    /** Search record by id */
    boolean dropTable();
}

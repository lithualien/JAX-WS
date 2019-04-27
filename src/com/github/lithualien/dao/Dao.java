package com.github.lithualien.dao;

import java.util.List;

public interface Dao<T> {
    List<T> getAll();
}

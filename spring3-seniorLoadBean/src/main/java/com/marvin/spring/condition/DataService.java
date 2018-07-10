package com.marvin.spring.condition;

import com.marvin.spring.profile.Database;
import org.springframework.beans.factory.annotation.Autowired;

public class DataService {
    private Database database;

    public void say(){
        database.sayProfile();
    }

    public void setDatabase(Database database) {
        this.database = database;
    }
}

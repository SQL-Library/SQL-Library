package com.sqllibrary.lib.sqllibMethods.Implements;

import com.sqllibrary.lib.sqllibMethods.Secrets;

public class RunSQLCommand extends SQL{

    public void runSQLCommand(String query, Secrets credentials) {
        SQLCommand(query, credentials);
    }
}

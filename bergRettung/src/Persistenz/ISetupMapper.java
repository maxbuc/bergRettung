package Persistenz;

import java.sql.SQLSyntaxErrorException;

public interface ISetupMapper{
    void deleteTable() throws SQLSyntaxErrorException;
    void createTable() throws SQLSyntaxErrorException;
}

package com.kcs.auto.adverts.service.impl;

import com.kcs.auto.adverts.service.AdvertsService;
import com.kcs.auto.adverts.service.ConnectionService;
import com.kcs.auto.adverts.vo.Advert;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by andriusbaltrunas on 3/9/2017.
 */
public class AdvertsServiceImpl implements AdvertsService {

    @Override
    public List<Advert> getAdverts() {
        List<Advert> adverts = new ArrayList<>();
        ConnectionService connectionService = new ConnectionServiceImpl();
        Connection connection = connectionService.createConnection();

        if(connection != null){
            try {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM adverts");
                while (resultSet.next()){
                    Advert advert = new Advert(resultSet.getInt("ID"),
                            resultSet.getBigDecimal(2),
                            resultSet.getString("DESCRIPTION"),
                            resultSet.getDate("INSERT_TIME"),
                            resultSet.getString("CITY"),
                            resultSet.getDate("ACTIVE_TIME"),
                            resultSet.getString("EMAIL"),
                            resultSet.getString("PHONE"),
                            resultSet.getString("SHORT_DESCRIPTION"));
                    adverts.add(advert);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return adverts;
    }
}

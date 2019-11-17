package com.antodev;

import com.github.shyiko.mysql.binlog.BinaryLogClient;
import com.github.shyiko.mysql.binlog.event.Event;
import com.github.shyiko.mysql.binlog.event.QueryEventData;
import com.github.shyiko.mysql.binlog.event.deserialization.EventDeserializer;

import java.io.IOException;

public class Replica {

    public static void main(String[] args){
        BinaryLogClient client = new BinaryLogClient("68.183.46.163", 3306, "api", "PUe3m9");
        EventDeserializer eventDeserializer = new EventDeserializer();
        eventDeserializer.setCompatibilityMode(EventDeserializer.CompatibilityMode.DATE_AND_TIME_AS_LONG, EventDeserializer.CompatibilityMode.CHAR_AND_BINARY_AS_BYTE_ARRAY);
        client.setEventDeserializer(eventDeserializer);

        client.registerEventListener(new BinaryLogClient.EventListener() {
            @Override
            public void onEvent(Event event) {
                if(event.getData() instanceof QueryEventData){
                    QueryEventData data = (QueryEventData) event.getData();
                    SQLParser.parse(data.getSql());
                }
            }
        });
        try {
            client.setBinlogFilename("mysql-bin.000001");
            client.setBinlogPosition(1);
            client.connect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

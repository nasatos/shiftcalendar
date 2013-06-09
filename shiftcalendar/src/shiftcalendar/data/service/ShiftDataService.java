package shiftcalendar.data.service;

import java.util.Map;

import org.slim3.datastore.Datastore;
import org.slim3.util.BeanUtil;

import com.google.appengine.api.datastore.Transaction;

import shiftcalendar.data.model.ShiftData;


public class ShiftDataService {
    public ShiftData shiftData(Map<String, Object> input) {
        ShiftData shiftData = new ShiftData();
        BeanUtil.copy(input, shiftData);
        Transaction tx = Datastore.beginTransaction();
        Datastore.put(shiftData);
        tx.commit();

        return shiftData;

    }
}

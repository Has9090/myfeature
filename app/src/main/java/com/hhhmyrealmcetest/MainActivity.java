package com.hhhmyrealmcetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmList;

public class MainActivity extends AppCompatActivity {

    public Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Realm.init(this);
        setRealmConfiguration();


//        List<PassengerTaskLine> mListline = new ArrayList<PassengerTaskLine>() ;
        RealmList<PassengerTaskLine> mListline = new RealmList<>();

        PassengerTaskLine mone = new PassengerTaskLine();
        PassengerTaskLine mtwo = new PassengerTaskLine();
        mone.setEndStation("end1");
        mone.setEndTime("endtime1");
        mone.setStartStation("station1");
        mone.setStartTime("startTime1");
        mone.setTrainNo("no1");
        mone.setTrainNumber("number1");
        mListline.add(mone);
        mtwo.setEndStation("end2");
        mtwo.setEndTime("endtime2");
        mtwo.setStartStation("station2");
        mtwo.setStartTime("startTime2");
        mtwo.setTrainNo("no2");
        mtwo.setTrainNumber("number2");
        mListline.add(mtwo);

        PassengerTaskInfo user = new PassengerTaskInfo();
        user.setState(11);
        user.setTaskDate("mytaskData");
        user.setTaskId("id");
        user.setTaskSummary("zongjie");
        user.setUserId("user");
        user.setUserName("name");
        user.setLineList(mListline);


// Copy the object to Realm. Any further changes must happen on realmUser
        realm.beginTransaction();
        realm.copyToRealm(user);
        realm.commitTransaction();

    }

    /**
     * realm数据库配置： 注意迁移升级配置
     */
    private void setRealmConfiguration() {
        RealmConfiguration realmConfig = new RealmConfiguration
                .Builder()
                .schemaVersion(6) // 结构改变时增加，默认初始值为0
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(realmConfig);



        realm = Realm.getDefaultInstance();
    }
}
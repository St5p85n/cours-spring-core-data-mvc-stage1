package com.gl.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class SMSNotificationRepositoryImp implements NotificationRepository {
    @Override
    public void sendNotification() {
        IO.println("INFOS De l'heure de debut pas SMS");
    }
}

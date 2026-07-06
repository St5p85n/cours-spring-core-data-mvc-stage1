package com.gl.Repository;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class EmailNotificationRepository implements NotificationRepository {
    @Override
    public void sendNotification() {
        IO.println("INFOS De l'heure de debut pas EMail");

    }
}

package org.example.task2;

import com.mailjet.client.errors.MailjetException;

import java.util.List;

public class MailBox {
    private List<MailInfo> infos;

    public void addMailInfo(MailInfo info) {
        infos.add(info);
    }

    public void sendAll() throws MailjetException {
        for (MailInfo inf: infos) {
            MailSender send = new MailSender();
            send.sendMail(inf);
        }
    }
}

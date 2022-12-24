package org.example.task2;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;


public class MailSender {
    public void sendMail(MailInfo mailInfo) throws MailjetException {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        client = new MailjetClient("e6bc1764616397a431196d89ed935231", "14633c1b6d81fd36b42a11002ae94c42", new ClientOptions("v3.1"));
        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", "v.kocherkevych@ucu.edu.ua")
                                        .put("Name", "Viktoria Kocherkevych"))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email",mailInfo.getClient().getId() + "@gmail.com")
                                                .put("Name", mailInfo.getClient().getName())))
                                .put(Emailv31.Message.SUBJECT, mailInfo.getMailCode().toString())
                                .put(Emailv31.Message.TEXTPART, "")
                                .put(Emailv31.Message.HTMLPART,  mailInfo.generate())
                                .put(Emailv31.Message.CUSTOMID, "Mail")));
        response = client.post(request);
    }
}

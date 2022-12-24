package org.example.task2;

public class GiftMail implements MailCode{
    private static String TEMPLATE = "BLACK FRIDAY! %XNAME, 50% discount on everything is waiting for you!";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%XNAME", client.getName());
    }
}

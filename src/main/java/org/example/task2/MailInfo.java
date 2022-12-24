package org.example.task2;

import lombok.Getter;

public class MailInfo {
    @Getter
    private Client client;
    @Getter
    private MailCode mailCode;

    public String generate() {
        return mailCode.generate(client);
    }
}

package org.example.email_configuration_retention_program.repositories;

import org.example.email_configuration_retention_program.models.EmailSetting;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class EmailRepo implements IEmailRepo{
    private static EmailSetting emailSetting = new EmailSetting("England",47,true,"Thầy Cửa Nam");
    private static List<EmailSetting> emailList = new ArrayList<>();
    @Override
    public void save(EmailSetting emailSetting) {
        emailSetting.setLanguage(emailSetting.getLanguage());
        emailSetting.setPageSize(emailSetting.getPageSize());
        emailSetting.setSpamFilter(emailSetting.isSpamFilter());
        emailSetting.setSignature(emailSetting.getSignature());
    }

    @Override
    public EmailSetting getAll() {
        return emailSetting;
    }
}

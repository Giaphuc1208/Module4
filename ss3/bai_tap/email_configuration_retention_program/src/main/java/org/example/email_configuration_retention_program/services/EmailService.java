package org.example.email_configuration_retention_program.services;
import org.example.email_configuration_retention_program.models.EmailSetting;
import org.example.email_configuration_retention_program.repositories.IEmailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements IEmailService{
    @Autowired
    private IEmailRepo emailRepo;

    @Override
    public void save(EmailSetting emailSetting) {
        emailRepo.save(emailSetting);
    }

    @Override
    public EmailSetting getAll() {
        return emailRepo.getAll();
    }
}

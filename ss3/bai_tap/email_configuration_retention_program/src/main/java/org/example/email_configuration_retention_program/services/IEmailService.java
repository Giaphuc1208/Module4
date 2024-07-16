package org.example.email_configuration_retention_program.services;

import org.example.email_configuration_retention_program.models.EmailSetting;

public interface IEmailService {

    void save(EmailSetting emailSetting);

    EmailSetting getAll();
}

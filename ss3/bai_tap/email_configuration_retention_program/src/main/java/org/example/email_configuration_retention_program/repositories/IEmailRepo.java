package org.example.email_configuration_retention_program.repositories;

import org.example.email_configuration_retention_program.models.EmailSetting;

public interface IEmailRepo {
    void save(EmailSetting emailSetting);

    EmailSetting getAll();
}

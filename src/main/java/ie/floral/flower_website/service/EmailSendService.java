package ie.floral.flower_website.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.scheduling.annotation.Async;

@Async
public interface EmailSendService {
    void sendContactEmail(String email, String subject, String body);
}
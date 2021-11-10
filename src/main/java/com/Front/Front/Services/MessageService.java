package com.Front.Front.Services;

import com.Front.Front.Entity.Message;
import com.Front.Front.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    MessageRepository messageRepository;

    public List<Message> getAll(){
        return messageRepository.findAll();
    }
}

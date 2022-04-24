/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expmail;

import java.util.Date;

/**
 *
 * @author shash
 */
public class Email {

    private final int id;
    private int status;
    private final Date time = new Date();
    private final String sender;
    private final String senderEmail;
    private final String reciever;
    private final String recieverEmail;
    private final String subject;
    private final String content;
    private boolean hasSenderDeleted = false;
    private boolean hasRecieverDeleted = false;

    public Email(int id, int status, String sender, String senderEmail, String reciever, String recieverEmail, String subject, String content) {
        this.id = id;
        this.status = status;
        this.sender = sender;
        this.senderEmail = senderEmail;
        this.reciever = reciever;
        this.recieverEmail = recieverEmail;
        this.subject = subject;
        this.content = content;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getStatus() {
        return status;
    }

    public Date getTime() {
        return time;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public String getRecieverEmail() {
        return recieverEmail;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getReciever() {
        return reciever;
    }

    public String getSearchString() {
        return sender + " " + senderEmail.split("@")[0] + " " + reciever + " " + recieverEmail.split("@")[0] + " " + subject + " " + content;
    }

    public boolean isHasSenderDeleted() {
        return hasSenderDeleted;
    }

    public boolean isHasRecieverDeleted() {
        return hasRecieverDeleted;
    }

    @Override
    public String toString() {
        return "Email{" + "id=" + id + ", status=" + status + ", time=" + time + ", senderEmail=" + senderEmail + ", recieverEmail=" + recieverEmail + ", subject=" + subject + ", content=" + content + ", hasSenderDeleted=" + hasSenderDeleted + ", hasRecieverDeleted=" + hasRecieverDeleted + '}';
    }

}

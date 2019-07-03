package factory;

public class SendMailFactory implements Provide {
	@Override
	public Sender produce() {
		return new MailSender();
	}
}

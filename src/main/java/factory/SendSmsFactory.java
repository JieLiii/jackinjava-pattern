package factory;

public class SendSmsFactory implements Provide {
	@Override
	public Sender produce() {
		return new SmsSender();
	}
}

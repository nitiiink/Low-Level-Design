package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String userName, StocksObservable observable) {
        this.observable = observable;
        this.userName = userName;
    }
    @Override
    public void update() {
        sendSms(userName, "product in stock.");
    }

    public void sendSms(String userName, String msg) {
        System.out.println("sms sent to : "+ userName+ " msg : "+ msg);
    }
}

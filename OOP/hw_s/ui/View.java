package hw_s.ui;

import hw_s.presenter.Presenter;

public interface View {
    void setPresenter(Presenter presenter);

    void start();

    void print(String text);

    String scan();
}

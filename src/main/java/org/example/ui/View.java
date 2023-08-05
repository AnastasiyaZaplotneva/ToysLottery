package org.example.ui;

import org.example.presenter.Presenter;

public interface View {

    void setPresenter(Presenter presenter);
    void start();
}
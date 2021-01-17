package com.java.kilhyun.OOP;

public class Button {

    OnClickListener listener;

    void setClickListener(OnClickListener listener)
    {
        this.listener = listener;
    }

    void touch()
    {
        listener.onClick();
    }

    interface OnClickListener
    {
        void onClick();
    }

}

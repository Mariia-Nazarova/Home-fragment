package ru.kkuzmichev.simpleappforespresso;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;
import androidx.test.espresso.NoMatchingViewException;
import androidx.test.espresso.ViewAssertion;

public class CustomViewAssertions {
    public static ViewAssertion isRecyclerView() {
        return new ViewAssertion() {
            @Override
            public void check(View view, NoMatchingViewException noViewFoundException) {
                if (!(view instanceof RecyclerView)){
                    throw new IllegalStateException("This si not RecyclerView");
                }
//                try {
//                    RecyclerView recyclerView = (RecyclerView) view;
//                } catch (ClassCastException cce) {
//                    throw new IllegalStateException("This si not RecyclerView");
//                }

            }
        };
    }
}

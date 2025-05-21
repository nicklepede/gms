package com.google.android.gms.ads.internal.util.weaklisteners;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class c {
    private final WeakReference a;

    public c(View view) {
        this.a = new WeakReference(view);
    }

    public final ViewTreeObserver a() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.a.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }
}

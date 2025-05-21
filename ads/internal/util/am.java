package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class am {
    public boolean a;
    public boolean b;
    private final View c;
    private final Activity d;
    private boolean e;
    private final ViewTreeObserver.OnGlobalLayoutListener f;

    public am(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.d = activity;
        this.c = view;
        this.f = onGlobalLayoutListener;
    }

    private static ViewTreeObserver c(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        Activity activity = this.d;
        if (activity != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f;
            ViewTreeObserver c = c(activity);
            if (c != null) {
                c.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        com.google.android.gms.ads.internal.util.weaklisteners.a aVar = com.google.android.gms.ads.internal.c.a.j;
        com.google.android.gms.ads.internal.util.weaklisteners.b bVar = new com.google.android.gms.ads.internal.util.weaklisteners.b(this.c, this.f);
        ViewTreeObserver a = bVar.a();
        if (a != null) {
            a.addOnGlobalLayoutListener(bVar);
        }
        this.e = true;
    }

    public final void b() {
        Activity activity = this.d;
        if (activity != null && this.e) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f;
            ViewTreeObserver c = c(activity);
            if (c != null) {
                c.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.e = false;
        }
    }
}

package com.google.android.gms.ads.internal.appcontent;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.internal.util.m;
import defpackage.byhr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class b implements Application.ActivityLifecycleCallbacks {
    public Activity a;
    public final Object b = new Object();
    public boolean c = true;
    public boolean d = false;
    public final List e = new ArrayList();
    private final List f = new ArrayList();
    private Runnable g;

    private final void a(Activity activity) {
        synchronized (this.b) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.a = activity;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.b) {
            Activity activity2 = this.a;
            if (activity2 == null) {
                return;
            }
            if (activity2.equals(activity)) {
                this.a = null;
            }
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                try {
                    if (((e) it.next()).a()) {
                        it.remove();
                    }
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.c.d().d(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                    int i = com.google.android.gms.ads.internal.util.c.a;
                    h.g(e);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(activity);
        synchronized (this.b) {
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                try {
                    ((e) it.next()).b();
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.c.d().d(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    int i = com.google.android.gms.ads.internal.util.c.a;
                    h.g(e);
                }
            }
        }
        this.d = true;
        if (this.g != null) {
            m.a.removeCallbacks(this.g);
        }
        byhr byhrVar = m.a;
        a aVar = new a(this);
        this.g = aVar;
        byhrVar.postDelayed(aVar, 0L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(activity);
        this.d = false;
        boolean z = this.c;
        this.c = true;
        if (this.g != null) {
            m.a.removeCallbacks(this.g);
        }
        synchronized (this.b) {
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                try {
                    ((e) it.next()).c();
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.c.d().d(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    int i = com.google.android.gms.ads.internal.util.c.a;
                    h.g(e);
                }
            }
            if (z) {
                int i2 = com.google.android.gms.ads.internal.util.c.a;
                h.d("App is still foreground.");
            } else {
                Iterator it2 = this.e.iterator();
                while (it2.hasNext()) {
                    try {
                        ((com.google.android.gms.ads.internal.state.h) it2.next()).a(true);
                    } catch (Exception e2) {
                        int i3 = com.google.android.gms.ads.internal.util.c.a;
                        h.g(e2);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}

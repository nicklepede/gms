package com.google.android.gms.update;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.auid;
import defpackage.ausn;
import defpackage.djqa;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class StateWatcher extends TracingBroadcastReceiver {
    private static final ausn c = ausn.b("StateWatcher", auid.OTA);
    public final Context a;
    public int b;
    private final Runnable d;
    private boolean e;
    private int f;
    private boolean g;

    public StateWatcher(Context context, Runnable runnable) {
        super("ota");
        this.b = 0;
        this.e = false;
        this.f = 100;
        this.g = false;
        this.a = context;
        this.d = runnable;
        this.b = context.getSharedPreferences("update", 0).getInt("battery_state", 0);
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        int i;
        boolean z;
        String action = intent.getAction();
        boolean z2 = true;
        boolean z3 = false;
        if (action.equals("android.intent.action.BATTERY_CHANGED")) {
            this.f = intent.getIntExtra("level", -1);
            this.g = intent.getIntExtra("plugged", 0) != 0;
        }
        if (this.g) {
            if (this.f < djqa.f().intValue()) {
                i = 1;
            }
            i = 0;
        } else {
            if (this.f < djqa.e().intValue()) {
                i = 2;
            }
            i = 0;
        }
        if (i != this.b) {
            this.b = i;
            z = true;
        } else {
            z = false;
        }
        if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            boolean z4 = this.e;
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                ((eluo) ((eluo) c.j()).ai((char) 11983)).x("couldn't get connectivity manager");
                z3 = z4;
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isRoaming()) {
                    z3 = true;
                }
            }
            if (z3 != this.e) {
                this.e = z3;
                if (action.equals("com.google.android.checkin.CHECKIN_COMPLETE") || z2) {
                    this.d.run();
                }
                return;
            }
        }
        z2 = z;
        if (action.equals("com.google.android.checkin.CHECKIN_COMPLETE")) {
            return;
        }
        this.d.run();
    }
}

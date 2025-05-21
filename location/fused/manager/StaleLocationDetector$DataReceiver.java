package com.google.android.gms.location.fused.manager;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.location.fused.manager.StaleLocationDetector$DataReceiver;
import defpackage.asmf;
import defpackage.bzso;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class StaleLocationDetector$DataReceiver extends TracingBroadcastReceiver {
    public final /* synthetic */ bzso a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaleLocationDetector$DataReceiver(bzso bzsoVar) {
        super("location");
        this.a = bzsoVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, final Intent intent) {
        final String action = intent.getAction();
        if (action == null) {
            return;
        }
        new asmf(1, 9).execute(new Runnable() { // from class: bzsm
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // java.lang.Runnable
            public final void run() {
                char c;
                String str;
                String str2 = action;
                boolean z = false;
                switch (str2.hashCode()) {
                    case -1886648615:
                        if (str2.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -343630553:
                        if (str2.equals("android.net.wifi.STATE_CHANGE")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 702756315:
                        if (str2.equals("com.google.android.location.activity.DEEP_STILL_MODE_DISABLED")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1019184907:
                        if (str2.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1729471458:
                        if (str2.equals("com.google.android.location.activity.DEEP_STILL_MODE_ENABLED")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                StaleLocationDetector$DataReceiver staleLocationDetector$DataReceiver = StaleLocationDetector$DataReceiver.this;
                if (c == 0) {
                    staleLocationDetector$DataReceiver.a.c(false);
                    return;
                }
                if (c == 1) {
                    staleLocationDetector$DataReceiver.a.c(true);
                    return;
                }
                if (c == 2) {
                    staleLocationDetector$DataReceiver.a.d(true);
                    return;
                }
                if (c == 3) {
                    staleLocationDetector$DataReceiver.a.d(false);
                    return;
                }
                if (c != 4) {
                    return;
                }
                NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                boolean z2 = networkInfo != null && networkInfo.isConnected();
                String str3 = null;
                if (z2) {
                    WifiManager wifiManager = staleLocationDetector$DataReceiver.a.d;
                    eiig.x(wifiManager);
                    WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                    str = connectionInfo != null ? connectionInfo.getBSSID() : null;
                    if (str != null) {
                        z = z2;
                    }
                } else {
                    z = z2;
                    str = null;
                }
                bzso bzsoVar = staleLocationDetector$DataReceiver.a;
                synchronized (bzsoVar) {
                    if (bzsoVar.g == z) {
                        if (z && !TextUtils.equals(str, bzsoVar.h)) {
                            z = true;
                        }
                    }
                    bzsoVar.g = z;
                    if (true == z) {
                        str3 = str;
                    }
                    bzsoVar.h = str3;
                    bzsoVar.a.add(new eiie(Boolean.valueOf(z), bzsoVar.h));
                }
            }
        });
    }
}

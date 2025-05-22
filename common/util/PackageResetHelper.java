package com.google.android.gms.common.util;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.autt;
import defpackage.auwr;
import defpackage.ekvl;
import defpackage.ekxj;
import defpackage.fpkc;
import defpackage.ind;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class PackageResetHelper extends TracingBroadcastReceiver {
    private final Context a;
    private final boolean b;
    private autt c;

    public PackageResetHelper(Context context) {
        super("common-base");
        this.a = context;
        this.b = true;
    }

    public final synchronized void b(autt auttVar, Handler handler) {
        Throwable th;
        try {
            try {
                if (fpkc.h()) {
                    try {
                        ekvl.q(this.c == null);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.c = auttVar;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                intentFilter.addAction("android.intent.action.QUERY_PACKAGE_RESTART");
                intentFilter.addDataScheme("package");
                Context context = this.a;
                ind.c(context, this, intentFilter, null, handler, 2);
                if (this.b) {
                    IntentFilter intentFilter2 = new IntentFilter();
                    intentFilter2.addAction("com.google.android.gms.INSTANT_APP_STOPPED");
                    try {
                        ind.c(context, this, intentFilter2, "com.google.android.gms.permission.INTERNAL_BROADCAST", handler, 4);
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final synchronized void c() {
        if (fpkc.h()) {
            ekvl.q(this.c != null);
            this.c = null;
        }
        this.a.unregisterReceiver(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        autt auttVar;
        char c;
        synchronized (this) {
            auttVar = this.c;
        }
        if (auttVar == null) {
            return;
        }
        Uri data = intent.getData();
        String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
        if (schemeSpecificPart != null) {
            String action = intent.getAction();
            ekxj.e(action);
            switch (action.hashCode()) {
                case -1072806502:
                    if (action.equals("android.intent.action.QUERY_PACKAGE_RESTART")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -757780528:
                    if (action.equals("android.intent.action.PACKAGE_RESTARTED")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 172491798:
                    if (action.equals("android.intent.action.PACKAGE_CHANGED")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 525384130:
                    if (action.equals("android.intent.action.PACKAGE_REMOVED")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 666876841:
                    if (action.equals("com.google.android.gms.INSTANT_APP_STOPPED")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                String[] stringArrayExtra = intent.getStringArrayExtra("android.intent.extra.PACKAGES");
                if (stringArrayExtra != null) {
                    for (String str : stringArrayExtra) {
                        if (auttVar.is(str)) {
                            setResultCode(-1);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (c != 1) {
                if (c == 2 || c == 3) {
                    auttVar.lO(schemeSpecificPart);
                    return;
                } else {
                    if (c == 4 && this.b) {
                        auttVar.lO(schemeSpecificPart);
                        return;
                    }
                    return;
                }
            }
            String[] stringArrayExtra2 = intent.getStringArrayExtra("android.intent.extra.changed_component_name_list");
            if (stringArrayExtra2 != null) {
                for (String str2 : stringArrayExtra2) {
                    if (schemeSpecificPart.equals(str2)) {
                        try {
                            if (auwr.b(context).e(schemeSpecificPart, 0).enabled) {
                                return;
                            }
                            auttVar.lO(schemeSpecificPart);
                            return;
                        } catch (PackageManager.NameNotFoundException unused) {
                            return;
                        }
                    }
                }
            }
        }
    }
}

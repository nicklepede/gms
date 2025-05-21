package com.google.android.gms.common.util;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.aspz;
import defpackage.assx;
import defpackage.eiig;
import defpackage.eike;
import defpackage.fmse;
import defpackage.iln;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class PackageResetHelper extends TracingBroadcastReceiver {
    private final Context a;
    private final boolean b;
    private aspz c;

    public PackageResetHelper(Context context) {
        super("common-base");
        this.a = context;
        this.b = true;
    }

    public final synchronized void b(aspz aspzVar, Handler handler) {
        Throwable th;
        try {
            try {
                if (fmse.g()) {
                    try {
                        eiig.p(this.c == null);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.c = aspzVar;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                intentFilter.addAction("android.intent.action.QUERY_PACKAGE_RESTART");
                intentFilter.addDataScheme("package");
                Context context = this.a;
                iln.c(context, this, intentFilter, null, handler, 2);
                if (this.b) {
                    IntentFilter intentFilter2 = new IntentFilter();
                    intentFilter2.addAction("com.google.android.gms.INSTANT_APP_STOPPED");
                    try {
                        iln.c(context, this, intentFilter2, "com.google.android.gms.permission.INTERNAL_BROADCAST", handler, 4);
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
        if (fmse.g()) {
            eiig.p(this.c != null);
            this.c = null;
        }
        this.a.unregisterReceiver(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        aspz aspzVar;
        char c;
        synchronized (this) {
            aspzVar = this.c;
        }
        if (aspzVar == null) {
            return;
        }
        Uri data = intent.getData();
        String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
        if (schemeSpecificPart != null) {
            String action = intent.getAction();
            eike.e(action);
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
                        if (aspzVar.id(str)) {
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
                    aspzVar.lr(schemeSpecificPart);
                    return;
                } else {
                    if (c == 4 && this.b) {
                        aspzVar.lr(schemeSpecificPart);
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
                            if (assx.b(context).e(schemeSpecificPart, 0).enabled) {
                                return;
                            }
                            aspzVar.lr(schemeSpecificPart);
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

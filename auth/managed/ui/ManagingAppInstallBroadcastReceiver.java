package com.google.android.gms.auth.managed.ui;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.abvr;
import defpackage.abzv;
import defpackage.arwm;
import defpackage.fiko;
import defpackage.iln;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ManagingAppInstallBroadcastReceiver extends TracingBroadcastReceiver {
    static final IntentFilter a = new IntentFilter("com.google.android.gms.auth.DM_PACKAGE_INSTALLED");
    static final IntentFilter b;
    private final Context c;
    private final fiko d;
    private boolean e;
    private boolean f;
    private boolean g;
    private final abvr h;

    static {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        b = intentFilter;
        intentFilter.addDataScheme("package");
    }

    public ManagingAppInstallBroadcastReceiver(Context context, abvr abvrVar, fiko fikoVar) {
        super("auth_managed");
        arwm.s(context);
        this.c = context;
        this.h = abvrVar;
        arwm.s(fikoVar);
        this.d = fikoVar;
    }

    public final synchronized void b() {
        if (this.g) {
            return;
        }
        abzv.a();
        Context context = this.c;
        if (iln.a(context, "com.google.android.gms.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION") == 0) {
            Log.i("Auth", "[AuthManaged, ManagingAppInstallReceiver] Register with new receiver");
            iln.b(context, this, a, 4);
            iln.b(context, this, b, 4);
        } else {
            Log.i("Auth", "[AuthManaged, ManagingAppInstallReceiver] Register with legacy receiver");
            iln.b(context, this, a, 2);
            iln.b(context, this, b, 2);
        }
        this.g = true;
        Log.i("Auth", String.format(Locale.US, "[AuthManaged, ManagingAppInstallReceiver] receiver is registered", new Object[0]));
    }

    public final synchronized void c() {
        if (this.g) {
            this.c.unregisterReceiver(this);
            this.g = false;
        }
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        Log.i("Auth", String.format(Locale.US, "[AuthManaged, ManagingAppInstallReceiver] received ".concat(String.valueOf(intent.getAction())), new Object[0]));
        if ("com.google.android.gms.auth.DM_PACKAGE_INSTALLED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.content.pm.extra.STATUS", 1);
            if (intExtra == 0) {
                this.e = true;
            } else if (intExtra == -1) {
                abvr abvrVar = this.h;
                Intent intent2 = (Intent) intent.getParcelableExtra("android.intent.extra.INTENT");
                if (intent2 == null) {
                    Log.e("Auth", String.format(Locale.US, "[AuthManaged, ManagingAppInstallLoader] User action intent missing!", new Object[0]));
                    abvrVar.a(-1);
                } else if (abvrVar.isStarted()) {
                    abvrVar.b(intent2);
                } else {
                    abvrVar.b = intent2;
                }
            } else if (intExtra == 3) {
                this.h.a(-2);
            } else {
                abvr abvrVar2 = this.h;
                Log.e("Auth", String.format(Locale.US, "[AuthManaged, ManagingAppInstallLoader] Managing app installation failed.", new Object[0]));
                abvrVar2.a(-1);
            }
        } else {
            if (!"android.intent.action.PACKAGE_ADDED".equals(intent.getAction())) {
                return;
            }
            Uri data = intent.getData();
            if (this.d.c.equals(data != null ? data.getSchemeSpecificPart() : null)) {
                this.f = true;
            }
        }
        if (this.f && this.e) {
            c();
            abvr abvrVar3 = this.h;
            Log.i("Auth", String.format(Locale.US, "[AuthManaged, ManagingAppInstallLoader] onInstallCompleted", new Object[0]));
            abvrVar3.a(101);
        }
    }
}

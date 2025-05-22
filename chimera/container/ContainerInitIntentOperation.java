package com.google.android.gms.chimera.container;

import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import defpackage.apzs;
import defpackage.auvc;
import defpackage.cykl;
import defpackage.dpya;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ContainerInitIntentOperation extends apzs {
    private static final void e() {
        int c = auvc.c();
        int f = auvc.f();
        if (c != f) {
            SharedPreferences.Editor edit = auvc.i().edit();
            edit.putInt("version_code", f);
            edit.putInt("prev_version_code", c);
            edit.apply();
        }
        String m = auvc.m();
        String n = auvc.n();
        if (m.equals(n)) {
            return;
        }
        SharedPreferences.Editor edit2 = auvc.i().edit();
        edit2.putString("version_code_and_timestamp", n);
        edit2.apply();
    }

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        e();
        if (dpya.j() && dpya.i(this)) {
            cykl.l(this);
            cykl.l(this);
        }
        List startIntentsForBroadcast = IntentOperation.getStartIntentsForBroadcast(this, new Intent("com.google.android.gms.chimera.container.CONTAINER_UPDATED").setPackage(getPackageName()), false, false, false);
        if (startIntentsForBroadcast != null) {
            Iterator it = startIntentsForBroadcast.iterator();
            while (it.hasNext()) {
                startService((Intent) it.next());
            }
        }
    }

    @Override // defpackage.apzs
    protected final void j(Intent intent) {
        if (dpya.j()) {
            e();
        }
    }
}

package com.google.android.gms.chimera.container;

import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import defpackage.anya;
import defpackage.asri;
import defpackage.cwao;
import defpackage.dnnr;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ContainerInitIntentOperation extends anya {
    private static final void e() {
        int c = asri.c();
        int f = asri.f();
        if (c != f) {
            SharedPreferences.Editor edit = asri.i().edit();
            edit.putInt("version_code", f);
            edit.putInt("prev_version_code", c);
            edit.apply();
        }
        String m = asri.m();
        String n = asri.n();
        if (m.equals(n)) {
            return;
        }
        SharedPreferences.Editor edit2 = asri.i().edit();
        edit2.putString("version_code_and_timestamp", n);
        edit2.apply();
    }

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        e();
        if (dnnr.j() && dnnr.i(this)) {
            cwao.l(this);
            cwao.l(this);
        }
        List startIntentsForBroadcast = IntentOperation.getStartIntentsForBroadcast(this, new Intent("com.google.android.gms.chimera.container.CONTAINER_UPDATED").setPackage(getPackageName()), false, false, false);
        if (startIntentsForBroadcast != null) {
            Iterator it = startIntentsForBroadcast.iterator();
            while (it.hasNext()) {
                startService((Intent) it.next());
            }
        }
    }

    @Override // defpackage.anya
    protected final void j(Intent intent) {
        if (dnnr.j()) {
            e();
        }
    }
}

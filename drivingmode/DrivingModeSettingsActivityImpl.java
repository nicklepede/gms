package com.google.android.gms.drivingmode;

import android.os.Bundle;
import android.view.MenuItem;
import defpackage.axpv;
import defpackage.axqb;
import defpackage.axqh;
import defpackage.axqi;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DrivingModeSettingsActivityImpl extends qet implements axqh {
    axqi j;
    public axpv k;

    @Override // defpackage.axqh
    public final Bundle a() {
        return new Bundle();
    }

    @Override // defpackage.axqh
    public final axqi b() {
        return this.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (new defpackage.axmq(r2).d() == false) goto L17;
     */
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r3) {
        /*
            r2 = this;
            super.onCreate(r3)
            android.content.Intent r3 = r2.getIntent()
            java.lang.String r0 = r3.getAction()
            if (r0 == 0) goto L2c
            java.lang.String r3 = r3.getAction()
            java.lang.String r0 = "com.google.android.gms.drivingmode.Invoked_from_search"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L2c
            defpackage.axqg.b()
            android.content.Context r3 = r2.getApplicationContext()
            axmz r0 = new axmz
            r0.<init>(r3)
            elxw r3 = defpackage.elxw.DRIVING_MODE
            elxv r1 = defpackage.elxv.ib
            r0.b(r3, r1)
        L2c:
            defpackage.axqg.b()
            java.lang.String r3 = "driving_mode_frx_prefs"
            r0 = 0
            android.content.SharedPreferences r3 = r2.getSharedPreferences(r3, r0)
            java.lang.String r1 = "force_frx_rerun_once"
            boolean r1 = r3.getBoolean(r1, r0)
            if (r1 == 0) goto L42
            defpackage.axpj.a(r0, r3)
            goto L5d
        L42:
            boolean r0 = defpackage.axpj.b(r3)
            if (r0 != 0) goto L7b
            boolean r0 = defpackage.axpj.c(r3)
            if (r0 == 0) goto L4f
            goto L7b
        L4f:
            defpackage.axqg.b()
            axmq r0 = new axmq
            r0.<init>(r2)
            boolean r0 = r0.d()
            if (r0 != 0) goto L7b
        L5d:
            defpackage.axqg.b()
            axmz r3 = new axmz
            r3.<init>(r2)
            elxw r0 = defpackage.elxw.DRIVING_MODE
            elxv r1 = defpackage.elxv.iq
            r3.b(r0, r1)
            android.content.ComponentName r3 = defpackage.axmp.b()
            android.content.Intent r3 = android.content.Intent.makeMainActivity(r3)
            r2.startActivity(r3)
            r2.finish()
            return
        L7b:
            fltb r0 = defpackage.fltb.a
            fltf r0 = r0.a()
            boolean r0 = r0.g()
            if (r0 == 0) goto L8b
            r0 = 1
            defpackage.axpj.a(r0, r3)
        L8b:
            axqi r3 = new axqi
            ig r0 = r2.hy()
            r3.<init>(r2, r0)
            r2.j = r3
            axqb r0 = new axqb
            r0.<init>()
            r3.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.drivingmode.DrivingModeSettingsActivityImpl.onCreate(android.os.Bundle):void");
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        axpv axpvVar = this.k;
        if (axpvVar == null || !z) {
            return;
        }
        axqb axqbVar = axpvVar.a;
        if (axqbVar.ah.a() == 2) {
            axqbVar.K();
        }
    }
}

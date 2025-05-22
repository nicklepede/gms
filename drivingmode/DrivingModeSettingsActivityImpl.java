package com.google.android.gms.drivingmode;

import android.os.Bundle;
import android.view.MenuItem;
import defpackage.aztv;
import defpackage.azub;
import defpackage.azuh;
import defpackage.azui;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DrivingModeSettingsActivityImpl extends rxx implements azuh {
    azui j;
    public aztv k;

    @Override // defpackage.azuh
    public final Bundle a() {
        return new Bundle();
    }

    @Override // defpackage.azuh
    public final azui b() {
        return this.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (new defpackage.azqq(r2).d() == false) goto L17;
     */
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
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
            defpackage.azug.b()
            android.content.Context r3 = r2.getApplicationContext()
            azqz r0 = new azqz
            r0.<init>(r3)
            eolk r3 = defpackage.eolk.DRIVING_MODE
            eolj r1 = defpackage.eolj.ib
            r0.b(r3, r1)
        L2c:
            defpackage.azug.b()
            java.lang.String r3 = "driving_mode_frx_prefs"
            r0 = 0
            android.content.SharedPreferences r3 = r2.getSharedPreferences(r3, r0)
            java.lang.String r1 = "force_frx_rerun_once"
            boolean r1 = r3.getBoolean(r1, r0)
            if (r1 == 0) goto L42
            defpackage.aztj.a(r0, r3)
            goto L5d
        L42:
            boolean r0 = defpackage.aztj.b(r3)
            if (r0 != 0) goto L7b
            boolean r0 = defpackage.aztj.c(r3)
            if (r0 == 0) goto L4f
            goto L7b
        L4f:
            defpackage.azug.b()
            azqq r0 = new azqq
            r0.<init>(r2)
            boolean r0 = r0.d()
            if (r0 != 0) goto L7b
        L5d:
            defpackage.azug.b()
            azqz r3 = new azqz
            r3.<init>(r2)
            eolk r0 = defpackage.eolk.DRIVING_MODE
            eolj r1 = defpackage.eolj.iq
            r3.b(r0, r1)
            android.content.ComponentName r3 = defpackage.azqp.b()
            android.content.Intent r3 = android.content.Intent.makeMainActivity(r3)
            r2.startActivity(r3)
            r2.finish()
            return
        L7b:
            fokk r0 = defpackage.fokk.a
            foko r0 = r0.lK()
            boolean r0 = r0.g()
            if (r0 == 0) goto L8b
            r0 = 1
            defpackage.aztj.a(r0, r3)
        L8b:
            azui r3 = new azui
            ig r0 = r2.hO()
            r3.<init>(r2, r0)
            r2.j = r3
            azub r0 = new azub
            r0.<init>()
            r3.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.drivingmode.DrivingModeSettingsActivityImpl.onCreate(android.os.Bundle):void");
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        aztv aztvVar = this.k;
        if (aztvVar == null || !z) {
            return;
        }
        azub azubVar = aztvVar.a;
        if (azubVar.ah.a() == 2) {
            azubVar.K();
        }
    }
}

package com.google.android.gms.drivingmode;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import com.google.android.gms.R;
import defpackage.axqh;
import defpackage.axqi;
import defpackage.edjt;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DrivingModeFrxActivityImpl extends qfp implements axqh {
    private static final edjt k;
    axqi j;

    static {
        edjt d = edjt.d();
        int i = d.a;
        String str = d.b;
        boolean z = d.c;
        k = new edjt(R.style.SudThemeGlifV3_DayNight, true);
    }

    @Override // defpackage.axqh
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean booleanExtra = getIntent().getBooleanExtra("frx_immediate_start", false);
        bundle.putBoolean("DrivingMode.ImmediateStart", booleanExtra);
        int intExtra = getIntent().getIntExtra("client_trigger_reason", 0);
        bundle.putInt("DrivingMode.ClientTriggerReason", intExtra);
        Log.i("CAR.DRIVINGMODE", String.format("DrivingModeFrxActivityImpl started with session arguments: immediateStart = %s; clientTriggerReason = %s", Boolean.valueOf(booleanExtra), Integer.valueOf(intExtra)));
        return bundle;
    }

    @Override // defpackage.axqh
    public final axqi b() {
        return this.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        if (r5.equals("DND_ACCESS") != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            boolean r0 = defpackage.fpsg.t()
            r1 = 0
            if (r0 == 0) goto L15
            edjt r0 = com.google.android.gms.drivingmode.DrivingModeFrxActivityImpl.k
            android.content.Intent r2 = r4.getIntent()
            int r0 = r0.b(r2, r1)
            r4.setTheme(r0)
            goto L2a
        L15:
            boolean r0 = defpackage.asqh.c()
            if (r0 == 0) goto L2a
            java.lang.String r0 = "setupwizard.theme"
            java.lang.String r2 = ""
            java.lang.String r0 = android.os.SystemProperties.get(r0, r2)
            int r0 = defpackage.nie.a(r0)
            r4.setTheme(r0)
        L2a:
            super.onCreate(r5)
            axqi r5 = new axqi
            r0 = 0
            r5.<init>(r4, r0)
            r4.j = r5
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "FRX_START_FRAGMENT"
            boolean r5 = r5.hasExtra(r0)
            r2 = 1
            if (r5 == 0) goto L83
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r5 = r5.getStringExtra(r0)
            int r0 = r5.hashCode()
            r3 = -1135185847(0xffffffffbc567049, float:-0.013088294)
            if (r0 == r3) goto L63
            r1 = 1733800235(0x6757b12b, float:1.018577E24)
            if (r0 == r1) goto L59
            goto L6c
        L59:
            java.lang.String r0 = "GEARHEAD_INSTALL"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L6c
            r1 = r2
            goto L6d
        L63:
            java.lang.String r0 = "DND_ACCESS"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L6c
            goto L6d
        L6c:
            r1 = -1
        L6d:
            if (r1 == 0) goto L7d
            if (r1 == r2) goto L77
            axpi r5 = new axpi
            r5.<init>()
            goto L88
        L77:
            axpc r5 = new axpc
            r5.<init>()
            goto L88
        L7d:
            axoz r5 = new axoz
            r5.<init>()
            goto L88
        L83:
            axpi r5 = new axpi
            r5.<init>()
        L88:
            axqi r0 = r4.j
            r0.c(r5)
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "com.google.android.location.activity.DRIVING_MODE_NOTIFICATION"
            boolean r5 = r5.getBooleanExtra(r0, r2)
            if (r5 == 0) goto La8
            defpackage.axqg.b()
            axmz r5 = new axmz
            r5.<init>(r4)
            elxw r0 = defpackage.elxw.DRIVING_MODE_FRX_INTRO
            elxv r1 = defpackage.elxv.is
            r5.b(r0, r1)
        La8:
            boolean r5 = defpackage.fpsg.t()
            if (r5 != 0) goto Lb1
            r4.setRequestedOrientation(r2)
        Lb1:
            axqe r5 = new axqe
            android.content.Context r0 = r4.getApplicationContext()
            r5.<init>(r0)
            r5.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.drivingmode.DrivingModeFrxActivityImpl.onCreate(android.os.Bundle):void");
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}

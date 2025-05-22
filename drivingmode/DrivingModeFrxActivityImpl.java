package com.google.android.gms.drivingmode;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import com.google.android.gms.R;
import defpackage.azuh;
import defpackage.azui;
import defpackage.efwo;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DrivingModeFrxActivityImpl extends ryt implements azuh {
    private static final efwo k;
    azui j;

    static {
        efwo d = efwo.d();
        int i = d.a;
        String str = d.b;
        boolean z = d.c;
        k = new efwo(R.style.SudThemeGlifV3_DayNight, true);
    }

    @Override // defpackage.azuh
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean booleanExtra = getIntent().getBooleanExtra("frx_immediate_start", false);
        bundle.putBoolean("DrivingMode.ImmediateStart", booleanExtra);
        int intExtra = getIntent().getIntExtra("client_trigger_reason", 0);
        bundle.putInt("DrivingMode.ClientTriggerReason", intExtra);
        Log.i("CAR.DRIVINGMODE", String.format("DrivingModeFrxActivityImpl started with session arguments: immediateStart = %s; clientTriggerReason = %s", Boolean.valueOf(booleanExtra), Integer.valueOf(intExtra)));
        return bundle;
    }

    @Override // defpackage.azuh
    public final azui b() {
        return this.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        if (r5.equals("DND_ACCESS") != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            boolean r0 = defpackage.fsly.t()
            r1 = 0
            if (r0 == 0) goto L15
            efwo r0 = com.google.android.gms.drivingmode.DrivingModeFrxActivityImpl.k
            android.content.Intent r2 = r4.getIntent()
            int r0 = r0.b(r2, r1)
            r4.setTheme(r0)
            goto L2a
        L15:
            boolean r0 = defpackage.auub.c()
            if (r0 == 0) goto L2a
            java.lang.String r0 = "setupwizard.theme"
            java.lang.String r2 = ""
            java.lang.String r0 = android.os.SystemProperties.get(r0, r2)
            int r0 = defpackage.pbh.a(r0)
            r4.setTheme(r0)
        L2a:
            super.onCreate(r5)
            azui r5 = new azui
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
            azti r5 = new azti
            r5.<init>()
            goto L88
        L77:
            aztc r5 = new aztc
            r5.<init>()
            goto L88
        L7d:
            azsz r5 = new azsz
            r5.<init>()
            goto L88
        L83:
            azti r5 = new azti
            r5.<init>()
        L88:
            azui r0 = r4.j
            r0.c(r5)
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "com.google.android.location.activity.DRIVING_MODE_NOTIFICATION"
            boolean r5 = r5.getBooleanExtra(r0, r2)
            if (r5 == 0) goto La8
            defpackage.azug.b()
            azqz r5 = new azqz
            r5.<init>(r4)
            eolk r0 = defpackage.eolk.DRIVING_MODE_FRX_INTRO
            eolj r1 = defpackage.eolj.is
            r5.b(r0, r1)
        La8:
            boolean r5 = defpackage.fsly.t()
            if (r5 != 0) goto Lb1
            r4.setRequestedOrientation(r2)
        Lb1:
            azue r5 = new azue
            android.content.Context r0 = r4.getApplicationContext()
            r5.<init>(r0)
            r5.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.drivingmode.DrivingModeFrxActivityImpl.onCreate(android.os.Bundle):void");
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}

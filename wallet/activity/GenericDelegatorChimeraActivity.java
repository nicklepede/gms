package com.google.android.gms.wallet.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import defpackage.aurq;
import defpackage.dkqh;
import defpackage.rhf;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes7.dex */
public class GenericDelegatorChimeraActivity extends rhf {
    private static final Set a = aurq.j("com.google.android.gms.wallet.ib.ACTION_GCORE_UPDATE_REQUIRED", "com.google.android.gms.wallet.firstparty.ACTION_VERIFY_PIN_ACTIVITY", "com.google.android.gms.wallet.firstparty.ACTION_ADD_INSTRUMENT_FROM_NOTIFICATION");
    private dkqh b;

    protected boolean e() {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    @Override // defpackage.rhf, defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r0 = r0.getAction()
            java.lang.String r1 = "Intent action must not be null"
            defpackage.atzb.t(r0, r1)
            java.util.Set r1 = com.google.android.gms.wallet.activity.GenericDelegatorChimeraActivity.a
            boolean r2 = r1.contains(r0)
            if (r2 == 0) goto L24
            boolean r2 = r6.e()
            if (r2 != 0) goto L1c
            goto L24
        L1c:
            java.lang.SecurityException r7 = new java.lang.SecurityException
            java.lang.String r0 = "This action can't be handled through an exported activity."
            r7.<init>(r0)
            throw r7
        L24:
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L39
            boolean r1 = r6.e()
            if (r1 == 0) goto L31
            goto L39
        L31:
            java.lang.SecurityException r7 = new java.lang.SecurityException
            java.lang.String r0 = "This action can't be handled through a non exported activity."
            r7.<init>(r0)
            throw r7
        L39:
            int r1 = r0.hashCode()
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case -1594089724: goto L63;
                case -762011845: goto L59;
                case -760491807: goto L4f;
                case -261123784: goto L45;
                default: goto L44;
            }
        L44:
            goto L6d
        L45:
            java.lang.String r1 = "com.google.android.gms.wallet.firstparty.ACTION_FILTER_ACTIVITY"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L6d
            r1 = r2
            goto L6e
        L4f:
            java.lang.String r1 = "com.google.android.gms.wallet.firstparty.ACTION_VERIFY_PIN_ACTIVITY"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L6d
            r1 = r5
            goto L6e
        L59:
            java.lang.String r1 = "com.google.android.gms.wallet.ib.ACTION_GCORE_UPDATE_REQUIRED"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L6d
            r1 = r4
            goto L6e
        L63:
            java.lang.String r1 = "com.google.android.gms.wallet.firstparty.ACTION_ADD_INSTRUMENT_FROM_NOTIFICATION"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L6d
            r1 = r3
            goto L6e
        L6d:
            r1 = -1
        L6e:
            if (r1 == 0) goto L8b
            if (r1 == r5) goto L85
            if (r1 == r4) goto L7d
            if (r1 == r3) goto L77
            goto L92
        L77:
            dldb r1 = new dldb
            r1.<init>(r6)
            goto L82
        L7d:
            dlch r1 = new dlch
            r1.<init>(r6)
        L82:
            r6.b = r1
            goto L92
        L85:
            dluf r1 = new dluf
            r1.<init>(r6)
            goto L90
        L8b:
            dlrz r1 = new dlrz
            r1.<init>(r6)
        L90:
            r6.b = r1
        L92:
            dkqh r1 = r6.b
            if (r1 == 0) goto La2
            r1.a(r7)
            super.onCreate(r7)
            dkqh r0 = r6.b
            r0.b(r7)
            return
        La2:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r3[r2] = r0
            java.lang.String r0 = "Unsupported intent action: %s"
            java.lang.String r0 = java.lang.String.format(r1, r0, r3)
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.activity.GenericDelegatorChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.b.f(menuItem) || super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        super.onPause();
        this.b.c();
    }

    @Override // defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        this.b.d();
    }

    @Override // defpackage.rhf, defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.b.e(bundle);
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onNewIntent(Intent intent) {
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }
}

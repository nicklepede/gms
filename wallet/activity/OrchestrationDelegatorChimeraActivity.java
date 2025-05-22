package com.google.android.gms.wallet.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.atzb;
import defpackage.dkqj;
import defpackage.dkqk;
import defpackage.fdfa;
import defpackage.fgrc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class OrchestrationDelegatorChimeraActivity extends dkqk {
    private dkqj h;

    public static Intent Z(Context context, Intent intent, BuyFlowConfig buyFlowConfig) {
        atzb.s(buyFlowConfig);
        atzb.s(buyFlowConfig.b);
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.google.android.gms.wallet.activity.OrchestrationDelegatorActivity");
        intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
        intent2.putExtra("com.google.android.gms.wallet.account", buyFlowConfig.b.b);
        if (intent.getExtras() != null) {
            intent2.putExtras(intent.getExtras());
        }
        return intent2;
    }

    @Override // defpackage.dkqk
    protected final fgrc Y() {
        fgrc Y = super.Y();
        int intExtra = getIntent().getIntExtra("entryWidgetType", -1);
        if (intExtra != -1) {
            if (!Y.b.L()) {
                Y.U();
            }
            fdfa fdfaVar = (fdfa) Y.b;
            fdfa fdfaVar2 = fdfa.a;
            fdfaVar.b |= 128;
            fdfaVar.j = intExtra;
        }
        return Y;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    @Override // defpackage.dkqk, defpackage.rhf, defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r0 = r0.getAction()
            java.lang.String r1 = "Intent action must not be null"
            defpackage.atzb.t(r0, r1)
            int r1 = r0.hashCode()
            r2 = -361129170(0xffffffffea799b2e, float:-7.5438836E25)
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L28
            r2 = 1565825493(0x5d5499d5, float:9.5746936E17)
            if (r1 == r2) goto L1e
            goto L32
        L1e:
            java.lang.String r1 = "com.google.android.gms.wallet.firstparty.ACTION_WEB_VIEW_WIDGET"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L32
            r1 = r4
            goto L33
        L28:
            java.lang.String r1 = "com.google.android.gms.wallet.firstparty.ACTION_EMBEDDED_LANDING_PAGE"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L32
            r1 = r3
            goto L33
        L32:
            r1 = -1
        L33:
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L38
            goto L45
        L38:
            dluj r1 = new dluj
            r1.<init>(r5)
            goto L43
        L3e:
            dkzo r1 = new dkzo
            r1.<init>(r5)
        L43:
            r5.h = r1
        L45:
            dkqj r1 = r5.h
            if (r1 == 0) goto L55
            r1.a(r6)
            super.onCreate(r6)
            dkqj r0 = r5.h
            r0.b(r6)
            return
        L55:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r3] = r0
            java.lang.String r0 = "Unsupported intent action: %s"
            java.lang.String r0 = java.lang.String.format(r1, r0, r2)
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.activity.OrchestrationDelegatorChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.dkqk, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        this.h.f(menuItem);
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        super.onPause();
        this.h.c();
    }

    @Override // defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        this.h.d();
    }

    @Override // defpackage.dkqk, defpackage.rhf, defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.h.e(bundle);
    }

    @Override // defpackage.dkqk, defpackage.dlqp
    public final void z(Parcelable parcelable, boolean z) {
        if (this.h.g(parcelable, z)) {
            return;
        }
        super.z(parcelable, z);
    }
}

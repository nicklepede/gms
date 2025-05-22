package com.google.android.gms.auth.authzen.transaction.secondscreen;

import android.content.Intent;
import android.os.Bundle;
import defpackage.auad;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fgti;
import defpackage.fiig;
import defpackage.fiiu;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SecondScreenGetTokenChimeraActivity extends ryt {
    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10) {
            fiig fiigVar = fiig.NO_RESPONSE_SELECTED;
            if (i2 == -1) {
                fiigVar = fiig.APPROVE_SELECTED;
            } else if (i2 == 0) {
                fiigVar = fiig.REJECT_SELECTED;
            }
            Intent intent2 = getIntent();
            auad auadVar = SecondScreenIntentOperation.a;
            String stringExtra = intent2.getStringExtra("account");
            byte[] byteArrayExtra = intent2.getByteArrayExtra("encryption_key_handle");
            try {
                byte[] byteArrayExtra2 = intent2.getByteArrayExtra("tx_request");
                fiiu fiiuVar = fiiu.a;
                int length = byteArrayExtra2.length;
                fgqp fgqpVar = fgqp.a;
                fgti fgtiVar = fgti.a;
                fgri y = fgri.y(fiiuVar, byteArrayExtra2, 0, length, fgqp.a);
                fgri.M(y);
                SecondScreenIntentOperation.a(this, stringExtra, byteArrayExtra, (fiiu) y, fiigVar);
            } catch (fgsd e) {
                SecondScreenIntentOperation.a.g("Unable to parse TxRequest", e, new Object[0]);
            }
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        Intent intent2 = getIntent();
        if (intent2 == null || intent2.getExtras() == null || (intent = (Intent) intent2.getExtras().getParcelable("token_intent")) == null) {
            return;
        }
        startActivityForResult(intent, 10);
    }
}

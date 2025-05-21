package com.google.android.gms.auth.authzen.transaction.secondscreen;

import android.content.Intent;
import android.os.Bundle;
import defpackage.arxo;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.feep;
import defpackage.ffti;
import defpackage.fftw;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SecondScreenGetTokenChimeraActivity extends qfp {
    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10) {
            ffti fftiVar = ffti.NO_RESPONSE_SELECTED;
            if (i2 == -1) {
                fftiVar = ffti.APPROVE_SELECTED;
            } else if (i2 == 0) {
                fftiVar = ffti.REJECT_SELECTED;
            }
            Intent intent2 = getIntent();
            arxo arxoVar = SecondScreenIntentOperation.a;
            String stringExtra = intent2.getStringExtra("account");
            byte[] byteArrayExtra = intent2.getByteArrayExtra("encryption_key_handle");
            try {
                byte[] byteArrayExtra2 = intent2.getByteArrayExtra("tx_request");
                fftw fftwVar = fftw.a;
                int length = byteArrayExtra2.length;
                febw febwVar = febw.a;
                feep feepVar = feep.a;
                fecp y = fecp.y(fftwVar, byteArrayExtra2, 0, length, febw.a);
                fecp.M(y);
                SecondScreenIntentOperation.a(this, stringExtra, byteArrayExtra, (fftw) y, fftiVar);
            } catch (fedk e) {
                SecondScreenIntentOperation.a.g("Unable to parse TxRequest", e, new Object[0]);
            }
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
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

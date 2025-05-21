package com.google.android.gms.autofill.operation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aery;
import defpackage.aesb;
import defpackage.afjr;
import defpackage.afjs;
import defpackage.ahfh;
import defpackage.aqxo;
import defpackage.asej;
import defpackage.asot;
import defpackage.bajh;
import defpackage.enre;
import defpackage.ensj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class FeedbackOperation extends IntentOperation {
    public static final asot a = asot.b("FeedbackOperation", asej.AUTOFILL);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        aqxo aqxoVar = (aqxo) ((aesb) aery.a(this)).N.a();
        bajh bajhVar = new bajh();
        bajhVar.e = "com.google.android.gms.autofill.USER_INITIATED_FEEDBACK_REPORT";
        bajhVar.d(new afjs(this), true);
        if (intent.getStringExtra("account_name_in_use") != null) {
            bajhVar.b = intent.getStringExtra("account_name_in_use");
        }
        ensj.t(ahfh.a(aqxoVar.aa(bajhVar.a())), new afjr(), enre.a);
    }
}

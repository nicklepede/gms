package com.google.android.gms.autofill.operation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.agsl;
import defpackage.agso;
import defpackage.ahkd;
import defpackage.ahke;
import defpackage.ajfx;
import defpackage.atad;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bcnd;
import defpackage.eqex;
import defpackage.eqgc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class FeedbackOperation extends IntentOperation {
    public static final ausn a = ausn.b("FeedbackOperation", auid.AUTOFILL);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        atad atadVar = (atad) ((agso) agsl.a(this)).N.a();
        bcnd bcndVar = new bcnd();
        bcndVar.e = "com.google.android.gms.autofill.USER_INITIATED_FEEDBACK_REPORT";
        bcndVar.d(new ahke(this), true);
        if (intent.getStringExtra("account_name_in_use") != null) {
            bcndVar.b = intent.getStringExtra("account_name_in_use");
        }
        eqgc.t(ajfx.a(atadVar.aa(bcndVar.a())), new ahkd(), eqex.a);
    }
}

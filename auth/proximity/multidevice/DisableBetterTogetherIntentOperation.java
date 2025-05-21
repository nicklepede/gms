package com.google.android.gms.auth.proximity.multidevice;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import defpackage.acnd;
import defpackage.acnr;
import defpackage.acqe;
import defpackage.arxo;
import defpackage.eixf;
import defpackage.flcj;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class DisableBetterTogetherIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final arxo b = new arxo("ProximityAuth", "DisableBetterTogether");

    public DisableBetterTogetherIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        acqe acqeVar = new acqe();
        String stringExtra = intent.getStringExtra("EXTRA_ACCOUNT_NAME");
        if (stringExtra == null) {
            acqeVar.o(1);
            return;
        }
        SyncedCryptauthDevice b2 = acnd.b(this, stringExtra);
        if (b2 == null) {
            b.m("Can't disable Better Together because synced metadata is null.", new Object[0]);
            acqeVar.o(2);
            return;
        }
        List list = b2.m;
        if (flcj.f()) {
            acnr.b(list, stringExtra, this);
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                acnr.b(eixf.d((String) it.next()), stringExtra, this);
            }
        }
        acqeVar.o(0);
    }

    public DisableBetterTogetherIntentOperation(Context context) {
        attachBaseContext(context);
    }
}

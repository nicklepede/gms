package com.google.android.gms.auth.proximity.multidevice;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import defpackage.aend;
import defpackage.aenr;
import defpackage.aeqe;
import defpackage.auad;
import defpackage.elkk;
import defpackage.fnts;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DisableBetterTogetherIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final auad b = new auad("ProximityAuth", "DisableBetterTogether");

    public DisableBetterTogetherIntentOperation() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        aeqe aeqeVar = new aeqe();
        String stringExtra = intent.getStringExtra("EXTRA_ACCOUNT_NAME");
        if (stringExtra == null) {
            aeqeVar.o(1);
            return;
        }
        SyncedCryptauthDevice b2 = aend.b(this, stringExtra);
        if (b2 == null) {
            b.m("Can't disable Better Together because synced metadata is null.", new Object[0]);
            aeqeVar.o(2);
            return;
        }
        List list = b2.m;
        if (fnts.f()) {
            aenr.b(list, stringExtra, this);
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aenr.b(elkk.d((String) it.next()), stringExtra, this);
            }
        }
        aeqeVar.o(0);
    }

    public DisableBetterTogetherIntentOperation(Context context) {
        attachBaseContext(context);
    }
}

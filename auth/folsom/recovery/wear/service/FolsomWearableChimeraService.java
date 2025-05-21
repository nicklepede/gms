package com.google.android.gms.auth.folsom.recovery.wear.service;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.folsom.recovery.wear.WearKeyProviderChimeraActivity;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import defpackage.abha;
import defpackage.abng;
import defpackage.asoe;
import defpackage.asot;
import defpackage.dkbc;
import defpackage.ejhf;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FolsomWearableChimeraService extends dkbc {
    private static final asot a = abng.b("FolsomWearService");

    @Override // defpackage.dkbc, defpackage.djkh
    public final void a(MessageEventParcelable messageEventParcelable) {
        if (Objects.equals(messageEventParcelable.b, "/auth_folsom/key_retrieval_request")) {
            asot asotVar = a;
            ((ejhf) asotVar.h()).x("Received retrieval request. Opening provider activity. ");
            byte[] bArr = messageEventParcelable.c;
            if (bArr == null) {
                ((ejhf) asotVar.j()).x("Request has no data.");
                return;
            }
            try {
                fecp y = fecp.y(abha.a, bArr, 0, bArr.length, febw.a());
                fecp.M(y);
                abha abhaVar = (abha) y;
                String str = abhaVar.b;
                String str2 = abhaVar.c;
                String str3 = messageEventParcelable.d;
                asot asotVar2 = WearKeyProviderChimeraActivity.h;
                Bundle bundle = new Bundle();
                bundle.putString("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT_NAME", str);
                bundle.putString("SECURITY_DOMAIN", str2);
                bundle.putString("com.google.android.gms.auth.folsom.EXTRA_RECEIVER_NODE_ID", str3);
                startActivity(new Intent().setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.auth.folsom.recovery.wear.WearKeyProviderActivity")).setFlags(67108864).setFlags(268435456).putExtras(bundle));
            } catch (fedk e) {
                ((ejhf) ((ejhf) a.i()).s(e)).x("Unable to parse request");
            }
        }
    }

    @Override // defpackage.dkbc, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        if (asoe.j(getApplicationContext())) {
            ((ejhf) a.h()).x("listening for retrieval request");
        } else {
            ((ejhf) a.h()).x("stopping service on non-phone device");
            stopSelf();
        }
    }
}

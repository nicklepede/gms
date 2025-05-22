package com.google.android.gms.auth.folsom.recovery.wear.service;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.folsom.recovery.wear.WearKeyProviderChimeraActivity;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import defpackage.adha;
import defpackage.adng;
import defpackage.aury;
import defpackage.ausn;
import defpackage.dmmv;
import defpackage.eluo;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FolsomWearableChimeraService extends dmmv {
    private static final ausn a = adng.b("FolsomWearService");

    @Override // defpackage.dmmv, defpackage.dlwa
    public final void a(MessageEventParcelable messageEventParcelable) {
        if (Objects.equals(messageEventParcelable.b, "/auth_folsom/key_retrieval_request")) {
            ausn ausnVar = a;
            ((eluo) ausnVar.h()).x("Received retrieval request. Opening provider activity. ");
            byte[] bArr = messageEventParcelable.c;
            if (bArr == null) {
                ((eluo) ausnVar.j()).x("Request has no data.");
                return;
            }
            try {
                fgri y = fgri.y(adha.a, bArr, 0, bArr.length, fgqp.a());
                fgri.M(y);
                adha adhaVar = (adha) y;
                String str = adhaVar.b;
                String str2 = adhaVar.c;
                String str3 = messageEventParcelable.d;
                ausn ausnVar2 = WearKeyProviderChimeraActivity.h;
                Bundle bundle = new Bundle();
                bundle.putString("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT_NAME", str);
                bundle.putString("SECURITY_DOMAIN", str2);
                bundle.putString("com.google.android.gms.auth.folsom.EXTRA_RECEIVER_NODE_ID", str3);
                startActivity(new Intent().setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.auth.folsom.recovery.wear.WearKeyProviderActivity")).setFlags(67108864).setFlags(268435456).putExtras(bundle));
            } catch (fgsd e) {
                ((eluo) ((eluo) a.i()).s(e)).x("Unable to parse request");
            }
        }
    }

    @Override // defpackage.dmmv, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        if (aury.j(getApplicationContext())) {
            ((eluo) a.h()).x("listening for retrieval request");
        } else {
            ((eluo) a.h()).x("stopping service on non-phone device");
            stopSelf();
        }
    }
}

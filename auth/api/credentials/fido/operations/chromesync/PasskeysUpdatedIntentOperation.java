package com.google.android.gms.auth.api.credentials.fido.operations.chromesync;

import android.content.Intent;
import android.util.Pair;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.api.credentials.fido.operations.chromesync.PasskeysUpdatedIntentOperation;
import defpackage.asot;
import defpackage.asqh;
import defpackage.bmkf;
import defpackage.bmld;
import defpackage.eitj;
import defpackage.enre;
import defpackage.ensa;
import defpackage.ensj;
import defpackage.enss;
import defpackage.wjk;
import defpackage.xde;
import defpackage.xlb;
import defpackage.xlc;
import defpackage.xlf;
import defpackage.xul;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PasskeysUpdatedIntentOperation extends IntentOperation {
    public static final asot a = xul.a("PasskeysUpdatedIntentOperation");

    public static /* synthetic */ Pair a(enss enssVar, bmld bmldVar) {
        String str;
        try {
            str = (String) ensj.r(enssVar);
        } catch (CancellationException | ExecutionException e) {
            ByteBuffer e2 = xde.e();
            String d = e2 == null ? null : xde.d(e2);
            if (d == null) {
                throw e;
            }
            str = d;
        }
        return Pair.create(str, (eitj) ensj.r(bmldVar));
    }

    public static void b() {
        final bmld a2 = ((bmkf) wjk.a.a()).L().a();
        final bmld a3 = ((xlb) xlc.a.a()).a(null, "").a();
        ensa b = ensj.b(a2, a3);
        Callable callable = new Callable() { // from class: xld
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return PasskeysUpdatedIntentOperation.a(enss.this, a3);
            }
        };
        enre enreVar = enre.a;
        ensj.t(b.a(callable, enreVar), new xlf(), enreVar);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (asqh.e() && xde.f()) {
            String action = intent.getAction();
            if ((action == null || !action.equals("com.google.android.gms.auth.api.credentials.PASSKEYS_UPDATED")) && xde.c().exists()) {
                return;
            }
            b();
        }
    }
}

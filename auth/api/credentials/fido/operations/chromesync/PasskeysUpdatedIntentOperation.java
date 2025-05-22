package com.google.android.gms.auth.api.credentials.fido.operations.chromesync;

import android.content.Intent;
import android.util.Pair;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.api.credentials.fido.operations.chromesync.PasskeysUpdatedIntentOperation;
import defpackage.ausn;
import defpackage.auub;
import defpackage.boqy;
import defpackage.borw;
import defpackage.elgo;
import defpackage.eqex;
import defpackage.eqft;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.yfq;
import defpackage.yzy;
import defpackage.ziy;
import defpackage.ziz;
import defpackage.zjc;
import defpackage.zsi;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PasskeysUpdatedIntentOperation extends IntentOperation {
    public static final ausn a = zsi.a("PasskeysUpdatedIntentOperation");

    public static /* synthetic */ Pair a(eqgl eqglVar, borw borwVar) {
        String str;
        try {
            str = (String) eqgc.r(eqglVar);
        } catch (CancellationException | ExecutionException e) {
            ByteBuffer e2 = yzy.e();
            String d = e2 == null ? null : yzy.d(e2);
            if (d == null) {
                throw e;
            }
            str = d;
        }
        return Pair.create(str, (elgo) eqgc.r(borwVar));
    }

    public static void b() {
        final borw a2 = ((boqy) yfq.a.lK()).N().a();
        final borw a3 = ((ziy) ziz.a.lK()).a(null, "").a();
        eqft b = eqgc.b(a2, a3);
        Callable callable = new Callable() { // from class: zja
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return PasskeysUpdatedIntentOperation.a(eqgl.this, a3);
            }
        };
        eqex eqexVar = eqex.a;
        eqgc.t(b.a(callable, eqexVar), new zjc(), eqexVar);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (auub.e() && yzy.f()) {
            String action = intent.getAction();
            if ((action == null || !action.equals("com.google.android.gms.auth.api.credentials.PASSKEYS_UPDATED")) && yzy.c().exists()) {
                return;
            }
            b();
        }
    }
}

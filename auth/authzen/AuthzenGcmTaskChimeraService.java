package com.google.android.gms.auth.authzen;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.auth.authzen.transaction.TransactionReplyIntentOperation;
import com.google.android.gms.chimera.modules.auth.authzen.phone.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.abwh;
import defpackage.abwj;
import defpackage.atzb;
import defpackage.auad;
import defpackage.cauf;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fgti;
import defpackage.fiig;
import defpackage.fiir;
import defpackage.fiiu;
import defpackage.fiiv;
import defpackage.filp;
import defpackage.filq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AuthzenGcmTaskChimeraService extends GmsTaskChimeraService {
    public static final /* synthetic */ int a = 0;
    private static final auad b = new auad("AuthzenGcmTaskChimeraService");

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        String str = caufVar.a;
        if (!str.startsWith("dismiss:")) {
            if (!str.startsWith("expired:")) {
                b.f("Received unexpected task: ".concat(str), new Object[0]);
                return 2;
            }
            Bundle bundle = caufVar.b;
            if (bundle == null || bundle.getLong("creation_elapsed_time") == 0) {
                b.f("Missing extras for task: ".concat(str), new Object[0]);
                return 2;
            }
            long j = bundle.getLong("creation_elapsed_time");
            Intent intent = new Intent("AUTHZEN_ACTIVITY_EXPIRED");
            intent.setPackage("com.google.android.gms");
            intent.putExtra("creation_elapsed_time", j);
            intent.addCategory("creation_elapsed_time:" + j);
            AppContextProvider.a().sendBroadcast(intent);
            return 0;
        }
        Bundle bundle2 = caufVar.b;
        if (bundle2 == null) {
            b.f("Missing extras for task: ".concat(str), new Object[0]);
            return 2;
        }
        String string = bundle2.getString("account");
        try {
            byte[] decode = Base64.decode(bundle2.getString("encryption_key_handle"), 2);
            byte[] decode2 = Base64.decode(bundle2.getString("tx_request"), 2);
            fiiu fiiuVar = null;
            if (decode2 != null) {
                try {
                    fiiu fiiuVar2 = fiiu.a;
                    int length = decode2.length;
                    fgqp fgqpVar = fgqp.a;
                    fgti fgtiVar = fgti.a;
                    fgri y = fgri.y(fiiuVar2, decode2, 0, length, fgqp.a);
                    fgri.M(y);
                    fiiuVar = (fiiu) y;
                } catch (fgsd e) {
                    b.f("Invalid protobuff: ".concat(e.toString()), new Object[0]);
                }
            }
            atzb.s(string);
            atzb.s(decode);
            atzb.s(fiiuVar);
            abwh.h(fiiuVar.c.M(), 11, this);
            abwj.b(this).e(abwj.d(fiiuVar));
            fgrc v = fiiv.a.v();
            fiig fiigVar = fiig.EXPIRED;
            if (!v.b.L()) {
                v.U();
            }
            fiiv fiivVar = (fiiv) v.b;
            fiivVar.c = fiigVar.j;
            fiivVar.b |= 1;
            long currentTimeMillis = System.currentTimeMillis();
            if (!v.b.L()) {
                v.U();
            }
            fiiv fiivVar2 = (fiiv) v.b;
            fiivVar2.b |= 4;
            fiivVar2.e = currentTimeMillis;
            fiiv fiivVar3 = (fiiv) v.Q();
            fgrc v2 = fiir.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            fgri fgriVar = v2.b;
            fiir fiirVar = (fiir) fgriVar;
            fiiuVar.getClass();
            fiirVar.c = fiiuVar;
            fiirVar.b |= 1;
            if (!fgriVar.L()) {
                v2.U();
            }
            fiir fiirVar2 = (fiir) v2.b;
            fiivVar3.getClass();
            fiirVar2.d = fiivVar3;
            fiirVar2.b |= 2;
            startService(TransactionReplyIntentOperation.b(string, decode, fiiuVar, new filp(filq.TX_REPLY, ((fiir) v2.Q()).r())));
            return 0;
        } catch (IllegalArgumentException | NullPointerException e2) {
            b.f("Extras parsing error: ".concat(e2.toString()), new Object[0]);
            return 2;
        }
    }
}

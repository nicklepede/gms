package com.google.android.gms.auth.authzen.wear;

import com.google.android.gms.auth.authzen.transaction.TransactionReplyIntentOperation;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import defpackage.abtp;
import defpackage.abtq;
import defpackage.abwj;
import defpackage.atae;
import defpackage.auad;
import defpackage.dlvy;
import defpackage.dlwl;
import defpackage.dmmv;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fgti;
import defpackage.fiir;
import defpackage.fiiu;
import defpackage.fiiv;
import defpackage.filp;
import defpackage.filq;
import defpackage.fnmm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AuthZenListenerChimeraService extends dmmv {
    private static final auad b = new auad("AuthZenListenerService");
    abtp a;

    @Override // defpackage.dmmv, defpackage.dlwa
    public final void a(MessageEventParcelable messageEventParcelable) {
        auad auadVar = b;
        String str = messageEventParcelable.b;
        auadVar.d("onMessageReceived: %s, Path: %s", messageEventParcelable, str);
        if ("/send-tx-response".equals(str)) {
            dlvy b2 = dlvy.b(messageEventParcelable.c);
            try {
                byte[] x = b2.x("tx_request");
                fiiu fiiuVar = fiiu.a;
                int length = x.length;
                fgqp fgqpVar = fgqp.a;
                fgti fgtiVar = fgti.a;
                fgqp fgqpVar2 = fgqp.a;
                fgri y = fgri.y(fiiuVar, x, 0, length, fgqpVar2);
                fgri.M(y);
                fiiu fiiuVar2 = (fiiu) y;
                byte[] x2 = b2.x("tx_response");
                fgri y2 = fgri.y(fiiv.a, x2, 0, x2.length, fgqpVar2);
                fgri.M(y2);
                fiiv fiivVar = (fiiv) y2;
                abwj.b(this).e(abwj.d(fiiuVar2));
                String d = b2.d("email");
                byte[] x3 = b2.x("key_handle");
                fgrc v = fiir.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fgri fgriVar = v.b;
                fiir fiirVar = (fiir) fgriVar;
                fiiuVar2.getClass();
                fiirVar.c = fiiuVar2;
                fiirVar.b = 1 | fiirVar.b;
                if (!fgriVar.L()) {
                    v.U();
                }
                fiir fiirVar2 = (fiir) v.b;
                fiivVar.getClass();
                fiirVar2.d = fiivVar;
                fiirVar2.b = 2 | fiirVar2.b;
                startService(TransactionReplyIntentOperation.b(d, x3, fiiuVar2, new filp(filq.TX_REPLY, ((fiir) v.Q()).r())));
                dlvy dlvyVar = new dlvy();
                dlvyVar.k("tx_request", fiiuVar2.r());
                dlvyVar.k("tx_response", fiivVar.r());
                abtq b3 = this.a.b("/send-tx-response-ack", dlvyVar.y());
                if (fnmm.c()) {
                    b3.b();
                } else {
                    b3.a();
                }
            } catch (fgsd e) {
                b.g("Received a malformed TxRequest or TxResponse", e, new Object[0]);
            }
        }
    }

    @Override // defpackage.dmmv, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        atae ataeVar = new atae(this);
        ataeVar.c(dlwl.a);
        this.a = new abtp(this, ataeVar.a(), dlwl.b, dlwl.c);
    }
}

package com.google.android.gms.auth.authzen.wear;

import com.google.android.gms.auth.authzen.transaction.TransactionReplyIntentOperation;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import defpackage.aqxp;
import defpackage.arxo;
import defpackage.djkf;
import defpackage.djks;
import defpackage.dkbc;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.feep;
import defpackage.fftt;
import defpackage.fftw;
import defpackage.fftx;
import defpackage.ffwr;
import defpackage.ffws;
import defpackage.fkvj;
import defpackage.ztp;
import defpackage.ztq;
import defpackage.zwj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AuthZenListenerChimeraService extends dkbc {
    private static final arxo b = new arxo("AuthZenListenerService");
    ztp a;

    @Override // defpackage.dkbc, defpackage.djkh
    public final void a(MessageEventParcelable messageEventParcelable) {
        arxo arxoVar = b;
        String str = messageEventParcelable.b;
        arxoVar.d("onMessageReceived: %s, Path: %s", messageEventParcelable, str);
        if ("/send-tx-response".equals(str)) {
            djkf b2 = djkf.b(messageEventParcelable.c);
            try {
                byte[] x = b2.x("tx_request");
                fftw fftwVar = fftw.a;
                int length = x.length;
                febw febwVar = febw.a;
                feep feepVar = feep.a;
                febw febwVar2 = febw.a;
                fecp y = fecp.y(fftwVar, x, 0, length, febwVar2);
                fecp.M(y);
                fftw fftwVar2 = (fftw) y;
                byte[] x2 = b2.x("tx_response");
                fecp y2 = fecp.y(fftx.a, x2, 0, x2.length, febwVar2);
                fecp.M(y2);
                fftx fftxVar = (fftx) y2;
                zwj.b(this).e(zwj.d(fftwVar2));
                String d = b2.d("email");
                byte[] x3 = b2.x("key_handle");
                fecj v = fftt.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fecp fecpVar = v.b;
                fftt ffttVar = (fftt) fecpVar;
                fftwVar2.getClass();
                ffttVar.c = fftwVar2;
                ffttVar.b = 1 | ffttVar.b;
                if (!fecpVar.L()) {
                    v.U();
                }
                fftt ffttVar2 = (fftt) v.b;
                fftxVar.getClass();
                ffttVar2.d = fftxVar;
                ffttVar2.b = 2 | ffttVar2.b;
                startService(TransactionReplyIntentOperation.b(d, x3, fftwVar2, new ffwr(ffws.TX_REPLY, ((fftt) v.Q()).r())));
                djkf djkfVar = new djkf();
                djkfVar.k("tx_request", fftwVar2.r());
                djkfVar.k("tx_response", fftxVar.r());
                ztq b3 = this.a.b("/send-tx-response-ack", djkfVar.y());
                if (fkvj.c()) {
                    b3.b();
                } else {
                    b3.a();
                }
            } catch (fedk e) {
                b.g("Received a malformed TxRequest or TxResponse", e, new Object[0]);
            }
        }
    }

    @Override // defpackage.dkbc, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        aqxp aqxpVar = new aqxp(this);
        aqxpVar.c(djks.a);
        this.a = new ztp(this, aqxpVar.a(), djks.b, djks.c);
    }
}

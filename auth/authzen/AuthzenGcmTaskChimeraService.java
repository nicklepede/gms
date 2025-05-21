package com.google.android.gms.auth.authzen;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.auth.authzen.transaction.TransactionReplyIntentOperation;
import com.google.android.gms.chimera.modules.auth.authzen.phone.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.arwm;
import defpackage.arxo;
import defpackage.byln;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.feep;
import defpackage.ffti;
import defpackage.fftt;
import defpackage.fftw;
import defpackage.fftx;
import defpackage.ffwr;
import defpackage.ffws;
import defpackage.zwh;
import defpackage.zwj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AuthzenGcmTaskChimeraService extends GmsTaskChimeraService {
    public static final /* synthetic */ int a = 0;
    private static final arxo b = new arxo("AuthzenGcmTaskChimeraService");

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        String str = bylnVar.a;
        if (!str.startsWith("dismiss:")) {
            if (!str.startsWith("expired:")) {
                b.f("Received unexpected task: ".concat(str), new Object[0]);
                return 2;
            }
            Bundle bundle = bylnVar.b;
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
        Bundle bundle2 = bylnVar.b;
        if (bundle2 == null) {
            b.f("Missing extras for task: ".concat(str), new Object[0]);
            return 2;
        }
        String string = bundle2.getString("account");
        try {
            byte[] decode = Base64.decode(bundle2.getString("encryption_key_handle"), 2);
            byte[] decode2 = Base64.decode(bundle2.getString("tx_request"), 2);
            fftw fftwVar = null;
            if (decode2 != null) {
                try {
                    fftw fftwVar2 = fftw.a;
                    int length = decode2.length;
                    febw febwVar = febw.a;
                    feep feepVar = feep.a;
                    fecp y = fecp.y(fftwVar2, decode2, 0, length, febw.a);
                    fecp.M(y);
                    fftwVar = (fftw) y;
                } catch (fedk e) {
                    b.f("Invalid protobuff: ".concat(e.toString()), new Object[0]);
                }
            }
            arwm.s(string);
            arwm.s(decode);
            arwm.s(fftwVar);
            zwh.h(fftwVar.c.M(), 11, this);
            zwj.b(this).e(zwj.d(fftwVar));
            fecj v = fftx.a.v();
            ffti fftiVar = ffti.EXPIRED;
            if (!v.b.L()) {
                v.U();
            }
            fftx fftxVar = (fftx) v.b;
            fftxVar.c = fftiVar.j;
            fftxVar.b |= 1;
            long currentTimeMillis = System.currentTimeMillis();
            if (!v.b.L()) {
                v.U();
            }
            fftx fftxVar2 = (fftx) v.b;
            fftxVar2.b |= 4;
            fftxVar2.e = currentTimeMillis;
            fftx fftxVar3 = (fftx) v.Q();
            fecj v2 = fftt.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            fecp fecpVar = v2.b;
            fftt ffttVar = (fftt) fecpVar;
            fftwVar.getClass();
            ffttVar.c = fftwVar;
            ffttVar.b |= 1;
            if (!fecpVar.L()) {
                v2.U();
            }
            fftt ffttVar2 = (fftt) v2.b;
            fftxVar3.getClass();
            ffttVar2.d = fftxVar3;
            ffttVar2.b |= 2;
            startService(TransactionReplyIntentOperation.b(string, decode, fftwVar, new ffwr(ffws.TX_REPLY, ((fftt) v2.Q()).r())));
            return 0;
        } catch (IllegalArgumentException | NullPointerException e2) {
            b.f("Extras parsing error: ".concat(e2.toString()), new Object[0]);
            return 2;
        }
    }
}

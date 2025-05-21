package com.google.android.gms.auth.authzen.transaction.secondscreen;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.authzen.transaction.TransactionReplyIntentOperation;
import com.google.android.gms.auth.firstparty.shared.ApplicationInformation;
import com.google.android.gms.chimera.modules.auth.authzen.phone.AppContextProvider;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.arwm;
import defpackage.arxo;
import defpackage.feay;
import defpackage.febe;
import defpackage.febf;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.feep;
import defpackage.feex;
import defpackage.fefm;
import defpackage.ffti;
import defpackage.fftt;
import defpackage.fftv;
import defpackage.fftw;
import defpackage.fftx;
import defpackage.ffwr;
import defpackage.ffws;
import defpackage.fhmd;
import defpackage.unw;
import defpackage.uny;
import defpackage.uoh;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SecondScreenIntentOperation extends IntentOperation {
    public static final arxo a = new arxo("SecondScreenIntentOperation");
    private String b;
    private fftw c;
    private byte[] d;
    private fhmd e;

    public SecondScreenIntentOperation() {
    }

    public static void a(Context context, String str, byte[] bArr, fftw fftwVar, ffti fftiVar) {
        fecj v = fftx.a.v();
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
        context.startService(TransactionReplyIntentOperation.b(str, bArr, fftwVar, new ffwr(ffws.TX_REPLY, ((fftt) v2.Q()).r())));
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        this.b = intent.getStringExtra("account");
        this.d = intent.getByteArrayExtra("encryption_key_handle");
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("tx_request");
            fftw fftwVar = fftw.a;
            int length = byteArrayExtra.length;
            febw febwVar = febw.a;
            feep feepVar = feep.a;
            febw febwVar2 = febw.a;
            fecp y = fecp.y(fftwVar, byteArrayExtra, 0, length, febwVar2);
            fecp.M(y);
            fftw fftwVar2 = (fftw) y;
            this.c = fftwVar2;
            fftv fftvVar = fftwVar2.e;
            if (fftvVar == null) {
                fftvVar = fftv.b;
            }
            feay feayVar = fftvVar.p;
            fhmd fhmdVar = fhmd.a;
            febe k = feayVar.k();
            fecp x = fhmdVar.x();
            try {
                try {
                    feex b = feep.a.b(x);
                    b.l(x, febf.p(k), febwVar2);
                    b.g(x);
                    try {
                        k.z(0);
                        fecp.M(x);
                        fecp.M(x);
                        fhmd fhmdVar2 = (fhmd) x;
                        this.e = fhmdVar2;
                        String str = fhmdVar2.f;
                        Account account = new Account(this.b, "com.google");
                        fhmd fhmdVar3 = this.e;
                        ApplicationInformation applicationInformation = new ApplicationInformation(fhmdVar3.b, fhmdVar3.c, fhmdVar3.d, fhmdVar3.e, "");
                        Bundle bundle = new Bundle();
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("keyApplicationInformationWrapperBundle", applicationInformation);
                        bundle.putBundle("keyApplicationInformationAuthExtrasBundle", bundle2);
                        Bundle bundle3 = new unw(bundle).a;
                        if (!this.e.g.isEmpty()) {
                            bundle3.putString("KEY_DEVICE_NAME", this.e.g);
                        }
                        if (!this.e.h.isEmpty()) {
                            bundle3.putString("KEY_REMOTE_APP_LABEL", this.e.h);
                        }
                        bundle3.putBoolean("KEY_IS_REMOTE_APP", true);
                        try {
                            Context baseContext = getBaseContext();
                            String str2 = uny.a;
                            uoh.h(baseContext, account, str, bundle3);
                            a(this, this.b, this.d, this.c, ffti.APPROVE_SELECTED);
                        } catch (UserRecoverableAuthException e) {
                            fftw fftwVar3 = this.c;
                            String str3 = this.b;
                            byte[] bArr = this.d;
                            Intent a2 = e.a();
                            arwm.s(fftwVar3);
                            arwm.q(str3);
                            Intent intent2 = new Intent();
                            intent2.putExtra("token_intent", a2);
                            intent2.putExtra("account", str3);
                            intent2.putExtra("tx_request", fftwVar3.r());
                            intent2.putExtra("encryption_key_handle", bArr);
                            intent2.addFlags(268435456).addFlags(134217728).addFlags(8388608).addFlags(4).addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE).addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE);
                            intent2.setClassName(AppContextProvider.a(), "com.google.android.gms.auth.authzen.transaction.secondscreen.SecondScreenGetTokenActivity");
                            getBaseContext().startActivity(intent2);
                        } catch (Exception e2) {
                            a.n("general get token exception: ", e2, new Object[0]);
                            a(this, this.b, this.d, this.c, ffti.NO_RESPONSE_SELECTED);
                        }
                    } catch (fedk e3) {
                        throw e3;
                    }
                } catch (fedk e4) {
                    if (!e4.a) {
                        throw e4;
                    }
                    throw new fedk(e4);
                } catch (RuntimeException e5) {
                    if (!(e5.getCause() instanceof fedk)) {
                        throw e5;
                    }
                    throw ((fedk) e5.getCause());
                }
            } catch (fefm e6) {
                throw e6.a();
            } catch (IOException e7) {
                if (!(e7.getCause() instanceof fedk)) {
                    throw new fedk(e7);
                }
                throw ((fedk) e7.getCause());
            }
        } catch (fedk e8) {
            a.n("Unable to parse proto ", e8, new Object[0]);
        }
    }

    SecondScreenIntentOperation(Context context, String str, fftw fftwVar, byte[] bArr, fhmd fhmdVar) {
        attachBaseContext(context);
        this.b = str;
        this.c = fftwVar;
        this.d = bArr;
        this.e = fhmdVar;
    }
}

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
import defpackage.atzb;
import defpackage.auad;
import defpackage.fgpr;
import defpackage.fgpx;
import defpackage.fgpy;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fgti;
import defpackage.fgtq;
import defpackage.fguf;
import defpackage.fiig;
import defpackage.fiir;
import defpackage.fiit;
import defpackage.fiiu;
import defpackage.fiiv;
import defpackage.filp;
import defpackage.filq;
import defpackage.fkca;
import defpackage.wjv;
import defpackage.wjx;
import defpackage.wkg;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SecondScreenIntentOperation extends IntentOperation {
    public static final auad a = new auad("SecondScreenIntentOperation");
    private String b;
    private fiiu c;
    private byte[] d;
    private fkca e;

    public SecondScreenIntentOperation() {
    }

    public static void a(Context context, String str, byte[] bArr, fiiu fiiuVar, fiig fiigVar) {
        fgrc v = fiiv.a.v();
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
        context.startService(TransactionReplyIntentOperation.b(str, bArr, fiiuVar, new filp(filq.TX_REPLY, ((fiir) v2.Q()).r())));
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        this.b = intent.getStringExtra("account");
        this.d = intent.getByteArrayExtra("encryption_key_handle");
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("tx_request");
            fiiu fiiuVar = fiiu.a;
            int length = byteArrayExtra.length;
            fgqp fgqpVar = fgqp.a;
            fgti fgtiVar = fgti.a;
            fgqp fgqpVar2 = fgqp.a;
            fgri y = fgri.y(fiiuVar, byteArrayExtra, 0, length, fgqpVar2);
            fgri.M(y);
            fiiu fiiuVar2 = (fiiu) y;
            this.c = fiiuVar2;
            fiit fiitVar = fiiuVar2.e;
            if (fiitVar == null) {
                fiitVar = fiit.b;
            }
            fgpr fgprVar = fiitVar.p;
            fkca fkcaVar = fkca.a;
            fgpx k = fgprVar.k();
            fgri x = fkcaVar.x();
            try {
                try {
                    fgtq b = fgti.a.b(x);
                    b.l(x, fgpy.p(k), fgqpVar2);
                    b.g(x);
                    try {
                        k.z(0);
                        fgri.M(x);
                        fgri.M(x);
                        fkca fkcaVar2 = (fkca) x;
                        this.e = fkcaVar2;
                        String str = fkcaVar2.f;
                        Account account = new Account(this.b, "com.google");
                        fkca fkcaVar3 = this.e;
                        ApplicationInformation applicationInformation = new ApplicationInformation(fkcaVar3.b, fkcaVar3.c, fkcaVar3.d, fkcaVar3.e, "");
                        Bundle bundle = new Bundle();
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("keyApplicationInformationWrapperBundle", applicationInformation);
                        bundle.putBundle("keyApplicationInformationAuthExtrasBundle", bundle2);
                        Bundle bundle3 = new wjv(bundle).a;
                        if (!this.e.g.isEmpty()) {
                            bundle3.putString("KEY_DEVICE_NAME", this.e.g);
                        }
                        if (!this.e.h.isEmpty()) {
                            bundle3.putString("KEY_REMOTE_APP_LABEL", this.e.h);
                        }
                        bundle3.putBoolean("KEY_IS_REMOTE_APP", true);
                        try {
                            Context baseContext = getBaseContext();
                            String str2 = wjx.a;
                            wkg.h(baseContext, account, str, bundle3);
                            a(this, this.b, this.d, this.c, fiig.APPROVE_SELECTED);
                        } catch (UserRecoverableAuthException e) {
                            fiiu fiiuVar3 = this.c;
                            String str3 = this.b;
                            byte[] bArr = this.d;
                            Intent a2 = e.a();
                            atzb.s(fiiuVar3);
                            atzb.q(str3);
                            Intent intent2 = new Intent();
                            intent2.putExtra("token_intent", a2);
                            intent2.putExtra("account", str3);
                            intent2.putExtra("tx_request", fiiuVar3.r());
                            intent2.putExtra("encryption_key_handle", bArr);
                            intent2.addFlags(268435456).addFlags(134217728).addFlags(8388608).addFlags(4).addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE).addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE);
                            intent2.setClassName(AppContextProvider.a(), "com.google.android.gms.auth.authzen.transaction.secondscreen.SecondScreenGetTokenActivity");
                            getBaseContext().startActivity(intent2);
                        } catch (Exception e2) {
                            a.n("general get token exception: ", e2, new Object[0]);
                            a(this, this.b, this.d, this.c, fiig.NO_RESPONSE_SELECTED);
                        }
                    } catch (fgsd e3) {
                        throw e3;
                    }
                } catch (fgsd e4) {
                    if (!e4.a) {
                        throw e4;
                    }
                    throw new fgsd(e4);
                } catch (fguf e5) {
                    throw e5.a();
                }
            } catch (IOException e6) {
                if (!(e6.getCause() instanceof fgsd)) {
                    throw new fgsd(e6);
                }
                throw ((fgsd) e6.getCause());
            } catch (RuntimeException e7) {
                if (!(e7.getCause() instanceof fgsd)) {
                    throw e7;
                }
                throw ((fgsd) e7.getCause());
            }
        } catch (fgsd e8) {
            a.n("Unable to parse proto ", e8, new Object[0]);
        }
    }

    SecondScreenIntentOperation(Context context, String str, fiiu fiiuVar, byte[] bArr, fkca fkcaVar) {
        attachBaseContext(context);
        this.b = str;
        this.c = fiiuVar;
        this.d = bArr;
        this.e = fkcaVar;
    }
}

package com.google.android.gms.inappreach.receiver;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.inappreach.receiver.PushIntentOperation;
import defpackage.asej;
import defpackage.asnd;
import defpackage.asot;
import defpackage.boae;
import defpackage.boao;
import defpackage.bobg;
import defpackage.bodg;
import defpackage.bodk;
import defpackage.deqy;
import defpackage.eiho;
import defpackage.ejhf;
import defpackage.enpf;
import defpackage.etll;
import defpackage.fcts;
import defpackage.fcub;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.unx;
import defpackage.uny;
import defpackage.uoh;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class PushIntentOperation extends IntentOperation {
    static final String a = "com.google.android.gms.inappreach.receiver.PushIntentOperation";
    public static final /* synthetic */ int b = 0;
    private static final asot c = asot.b(PushIntentOperation.class.getName(), asej.INAPP_REACH);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fcts fctsVar;
        final String str;
        Context applicationContext;
        String str2;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                try {
                    String string = extras.getString("casp");
                    if (TextUtils.isEmpty(string)) {
                        fctsVar = null;
                    } else {
                        byte[] decode = Base64.decode(string, 1);
                        fecp y = fecp.y(fcts.a, decode, 0, decode.length, febw.a());
                        fecp.M(y);
                        fctsVar = (fcts) y;
                    }
                    if (fctsVar != null) {
                        String str3 = fctsVar.c;
                        if (TextUtils.isEmpty(str3)) {
                            ((ejhf) ((ejhf) c.j()).ah((char) 5182)).x("Got an intent push without any account Oid");
                        } else {
                            Context applicationContext2 = getApplicationContext();
                            Iterator it = asnd.h(applicationContext2, applicationContext2.getPackageName()).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    str = null;
                                    break;
                                }
                                Account account = (Account) it.next();
                                try {
                                    applicationContext = getApplicationContext();
                                    str2 = account.name;
                                    String str4 = uny.a;
                                } catch (IOException | unx e) {
                                    ((ejhf) ((ejhf) ((ejhf) c.j()).s(e)).ah((char) 5180)).x("Failed getting account id from GoogleAuthUtil.");
                                }
                                if (str3.equals(uoh.e(applicationContext, str2))) {
                                    str = account.name;
                                    break;
                                }
                                continue;
                            }
                            if (TextUtils.isEmpty(str)) {
                                ((ejhf) ((ejhf) c.j()).ah((char) 5181)).x("Could not find any account with the received Oid.");
                            } else {
                                fcub fcubVar = fctsVar.d;
                                if (fcubVar == null) {
                                    fcubVar = fcub.a;
                                }
                                String str5 = fcubVar.g;
                                if ("OGA_INAPP_REACH".equals(str5)) {
                                    try {
                                        ((enpf) ((boao) bobg.c().a().a()).d(new eiho() { // from class: bodb
                                            @Override // defpackage.eiho
                                            public final Object apply(Object obj) {
                                                bnzu bnzuVar = (bnzu) obj;
                                                int i = PushIntentOperation.b;
                                                fecj fecjVar = (fecj) bnzuVar.iB(5, null);
                                                fecjVar.X(bnzuVar);
                                                bnzt bnztVar = (bnzt) fecjVar;
                                                String str6 = str;
                                                str6.getClass();
                                                if (!bnztVar.b.L()) {
                                                    bnztVar.U();
                                                }
                                                bnzu bnzuVar2 = (bnzu) bnztVar.b;
                                                bnzu bnzuVar3 = bnzu.a;
                                                bnzuVar2.b().put(str6, false);
                                                return (bnzu) bnztVar.Q();
                                            }
                                        })).u();
                                    } catch (InterruptedException | ExecutionException e2) {
                                        ((ejhf) ((ejhf) ((ejhf) c.j()).s(e2)).ah((char) 5184)).x("Failed updating pending fetch account in store.");
                                    }
                                    new bodg(str, null).f(getApplicationContext());
                                } else if ("OGA_INAPP_REACH_PRERENDERED".equals(str5)) {
                                    Context applicationContext3 = getApplicationContext();
                                    fecj v = boae.a.v();
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    boae boaeVar = (boae) v.b;
                                    str.getClass();
                                    boaeVar.c = str;
                                    fecj v2 = etll.a.v();
                                    if (!v2.b.L()) {
                                        v2.U();
                                    }
                                    etll etllVar = (etll) v2.b;
                                    etllVar.c = 4;
                                    etllVar.b |= 1;
                                    etll etllVar2 = (etll) v2.Q();
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    boae boaeVar2 = (boae) v.b;
                                    etllVar2.getClass();
                                    boaeVar2.d = etllVar2;
                                    boaeVar2.b |= 1;
                                    String packageName = applicationContext3.getPackageName();
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    boae boaeVar3 = (boae) v.b;
                                    packageName.getClass();
                                    boaeVar3.b |= 2;
                                    boaeVar3.e = packageName;
                                    new bodk((boae) v.Q(), null).f(applicationContext3);
                                }
                            }
                        }
                    }
                } catch (fedk e3) {
                    ((ejhf) ((ejhf) ((ejhf) c.j()).s(e3)).ah(5183)).x("Failed parsing AndroidPayload from push notification.");
                }
            }
        } finally {
            deqy.b(intent);
        }
    }
}

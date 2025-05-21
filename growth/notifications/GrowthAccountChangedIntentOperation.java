package com.google.android.gms.growth.notifications;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.AccountChangeEvent;
import defpackage.asej;
import defpackage.asoe;
import defpackage.asot;
import defpackage.bklb;
import defpackage.bklm;
import defpackage.bklq;
import defpackage.bkxs;
import defpackage.eipl;
import defpackage.eitj;
import defpackage.ejhf;
import defpackage.esms;
import defpackage.esmu;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fixl;
import defpackage.fowr;
import defpackage.unx;
import defpackage.uny;
import defpackage.uoh;
import defpackage.vks;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.Collections;
import java.util.function.Function;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GrowthAccountChangedIntentOperation extends IntentOperation {
    private static final asot b = asot.b("GrowthNotifications", asej.GROWTH);
    bklm a;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        bklq bklqVar = new bklq();
        bklqVar.b(bklb.a());
        bklm c = bklqVar.a().a.c();
        fixl.d(c);
        this.a = c;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fowr.a.a().j()) {
            if (intent == null || !Objects.equals(intent.getAction(), "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) {
                ((ejhf) b.i()).B("Unsupported intent action: %s", intent == null ? "null" : intent.getAction());
                return;
            }
            Context applicationContext = getApplicationContext();
            for (Account account : vks.a(intent)) {
                bklm bklmVar = this.a;
                String str = account.name;
                fecj v = esms.a.v();
                String c = bkxs.c(applicationContext);
                if (!v.b.L()) {
                    v.U();
                }
                esms esmsVar = (esms) v.b;
                c.getClass();
                int i = 4;
                esmsVar.b |= 4;
                esmsVar.e = c;
                String str2 = account.name;
                try {
                    String str3 = uny.a;
                    Stream map = Collection.EL.stream(uoh.j(applicationContext, 0, str2)).map(new Function() { // from class: bkmj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo464andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Integer.valueOf(((AccountChangeEvent) obj).d);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i2 = eitj.d;
                    int frequency = Collections.frequency((java.util.Collection) map.collect(eipl.a), 1);
                    if (frequency == 1) {
                        i = 2;
                    } else if (frequency > 1) {
                        i = 3;
                    } else {
                        ((ejhf) b.j()).z("Invalid number of 'account added' events (%d) found in history while handling an account added intent.", frequency);
                    }
                } catch (IOException | unx e) {
                    ((ejhf) ((ejhf) b.i()).s(e)).x("Runtime exception encountered while handling account change intent in Growth module.");
                }
                if (!v.b.L()) {
                    v.U();
                }
                esms esmsVar2 = (esms) v.b;
                esmsVar2.c = i - 1;
                esmsVar2.b = 1 | esmsVar2.b;
                boolean i3 = asoe.i(applicationContext);
                if (!v.b.L()) {
                    v.U();
                }
                esms esmsVar3 = (esms) v.b;
                esmsVar3.b |= 2;
                esmsVar3.d = i3;
                esms esmsVar4 = (esms) v.Q();
                fecj v2 = esmu.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                fecp fecpVar = v2.b;
                esmu esmuVar = (esmu) fecpVar;
                esmuVar.d = 23;
                esmuVar.b = 2 | esmuVar.b;
                if (!fecpVar.L()) {
                    v2.U();
                }
                esmu esmuVar2 = (esmu) v2.b;
                esmsVar4.getClass();
                esmuVar2.g = esmsVar4;
                esmuVar2.b |= 32;
                bklmVar.b(str, 0, v2);
            }
        }
    }
}

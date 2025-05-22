package com.google.android.gms.growth.notifications;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.AccountChangeEvent;
import defpackage.auid;
import defpackage.aury;
import defpackage.ausn;
import defpackage.bmrr;
import defpackage.bmsc;
import defpackage.bmsg;
import defpackage.bnej;
import defpackage.elcq;
import defpackage.elgo;
import defpackage.eluo;
import defpackage.evcf;
import defpackage.evch;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.flni;
import defpackage.frpu;
import defpackage.wjw;
import defpackage.wjx;
import defpackage.wkg;
import defpackage.xgt;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.Collections;
import java.util.function.Function;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GrowthAccountChangedIntentOperation extends IntentOperation {
    private static final ausn b = ausn.b("GrowthNotifications", auid.GROWTH);
    bmsc a;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        bmsg bmsgVar = new bmsg();
        bmsgVar.b(bmrr.a());
        bmsc c = bmsgVar.a().a.c();
        flni.d(c);
        this.a = c;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (frpu.a.lK().j()) {
            if (intent == null || !Objects.equals(intent.getAction(), "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) {
                ((eluo) b.i()).B("Unsupported intent action: %s", intent == null ? "null" : intent.getAction());
                return;
            }
            Context applicationContext = getApplicationContext();
            for (Account account : xgt.a(intent)) {
                bmsc bmscVar = this.a;
                String str = account.name;
                fgrc v = evcf.a.v();
                String c = bnej.c(applicationContext);
                if (!v.b.L()) {
                    v.U();
                }
                evcf evcfVar = (evcf) v.b;
                c.getClass();
                int i = 4;
                evcfVar.b |= 4;
                evcfVar.e = c;
                String str2 = account.name;
                try {
                    String str3 = wjx.a;
                    Stream map = Collection.EL.stream(wkg.j(applicationContext, 0, str2)).map(new Function() { // from class: bmta
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo479andThen(Function function) {
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
                    int i2 = elgo.d;
                    int frequency = Collections.frequency((java.util.Collection) map.collect(elcq.a), 1);
                    if (frequency == 1) {
                        i = 2;
                    } else if (frequency > 1) {
                        i = 3;
                    } else {
                        ((eluo) b.j()).z("Invalid number of 'account added' events (%d) found in history while handling an account added intent.", frequency);
                    }
                } catch (IOException | wjw e) {
                    ((eluo) ((eluo) b.i()).s(e)).x("Runtime exception encountered while handling account change intent in Growth module.");
                }
                if (!v.b.L()) {
                    v.U();
                }
                evcf evcfVar2 = (evcf) v.b;
                evcfVar2.c = i - 1;
                evcfVar2.b = 1 | evcfVar2.b;
                boolean i3 = aury.i(applicationContext);
                if (!v.b.L()) {
                    v.U();
                }
                evcf evcfVar3 = (evcf) v.b;
                evcfVar3.b |= 2;
                evcfVar3.d = i3;
                evcf evcfVar4 = (evcf) v.Q();
                fgrc v2 = evch.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                fgri fgriVar = v2.b;
                evch evchVar = (evch) fgriVar;
                evchVar.d = 23;
                evchVar.b = 2 | evchVar.b;
                if (!fgriVar.L()) {
                    v2.U();
                }
                evch evchVar2 = (evch) v2.b;
                evcfVar4.getClass();
                evchVar2.g = evcfVar4;
                evchVar2.b |= 32;
                bmscVar.b(str, 0, v2);
            }
        }
    }
}

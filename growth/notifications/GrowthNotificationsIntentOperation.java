package com.google.android.gms.growth.notifications;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.aurp;
import defpackage.ausn;
import defpackage.auvc;
import defpackage.bkcz;
import defpackage.bmrr;
import defpackage.bmrs;
import defpackage.bmsc;
import defpackage.bmsg;
import defpackage.bmsy;
import defpackage.bmsz;
import defpackage.bnes;
import defpackage.bnfb;
import defpackage.dhcb;
import defpackage.eirz;
import defpackage.elgo;
import defpackage.eluo;
import defpackage.eqgo;
import defpackage.euul;
import defpackage.euum;
import defpackage.euun;
import defpackage.euup;
import defpackage.euuq;
import defpackage.evct;
import defpackage.evdx;
import defpackage.fgou;
import defpackage.fgqi;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsa;
import defpackage.fgub;
import defpackage.fgvn;
import defpackage.flni;
import defpackage.frpu;
import defpackage.frqh;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GrowthNotificationsIntentOperation extends IntentOperation {
    public static final /* synthetic */ int e = 0;
    private static final ausn f = ausn.b("GrowthNotifications", auid.GROWTH);
    bmsc a;
    bnfb b;
    bmsz c;
    bnes d;

    private final boolean a(String str, euum euumVar) {
        if ((euumVar.b & 32) == 0) {
            return false;
        }
        try {
            bmsz bmszVar = this.c;
            euul euulVar = euumVar.i;
            if (euulVar == null) {
                euulVar = euul.a;
            }
            bmsy bmsyVar = (bmsy) bmszVar.b(euulVar).get(5L, TimeUnit.SECONDS);
            if (bmsyVar.a) {
                return false;
            }
            fgrc v = evct.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fgri fgriVar = v.b;
            evct evctVar = (evct) fgriVar;
            evctVar.c = 2;
            evctVar.b |= 1;
            if (!fgriVar.L()) {
                v.U();
            }
            fgri fgriVar2 = v.b;
            evct evctVar2 = (evct) fgriVar2;
            evctVar2.d = 5;
            evctVar2.b |= 2;
            elgo elgoVar = bmsyVar.b;
            if (!fgriVar2.L()) {
                v.U();
            }
            evct evctVar3 = (evct) v.b;
            fgsa fgsaVar = evctVar3.f;
            if (!fgsaVar.c()) {
                evctVar3.f = fgri.E(fgsaVar);
            }
            fgou.E(elgoVar, evctVar3.f);
            evdx evdxVar = euumVar.c;
            if (evdxVar == null) {
                evdxVar = evdx.a;
            }
            if (!v.b.L()) {
                v.U();
            }
            evct evctVar4 = (evct) v.b;
            evdxVar.getClass();
            evctVar4.e = evdxVar;
            evctVar4.b |= 4;
            this.a.c(str, v);
            return true;
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            ((eluo) ((eluo) f.i()).s(e2)).x("Failed to evaluate filtering condition");
            bmsc bmscVar = this.a;
            fgrc v2 = evct.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            fgri fgriVar3 = v2.b;
            evct evctVar5 = (evct) fgriVar3;
            evctVar5.c = 2;
            evctVar5.b |= 1;
            if (!fgriVar3.L()) {
                v2.U();
            }
            evct evctVar6 = (evct) v2.b;
            evctVar6.d = 1;
            evctVar6.b = 2 | evctVar6.b;
            evdx evdxVar2 = euumVar.c;
            if (evdxVar2 == null) {
                evdxVar2 = evdx.a;
            }
            if (!v2.b.L()) {
                v2.U();
            }
            evct evctVar7 = (evct) v2.b;
            evdxVar2.getClass();
            evctVar7.e = evdxVar2;
            evctVar7.b |= 4;
            bmscVar.c(str, v2);
            return true;
        }
    }

    private static final boolean b(euum euumVar, String str) {
        evdx evdxVar = euumVar.c;
        if (evdxVar == null) {
            evdxVar = evdx.a;
        }
        try {
            return Pattern.compile(str, 2).matcher(evdxVar.e.trim()).matches();
        } catch (PatternSyntaxException e2) {
            ((eluo) f.j()).B("Illegal syntax for holdback campaign regex: [%s]", e2.getMessage());
            return false;
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        bmsg bmsgVar = new bmsg();
        bmsgVar.b(bmrr.a());
        bmrs bmrsVar = bmsgVar.a().a;
        bmsc c = bmrsVar.c();
        flni.d(c);
        this.a = c;
        bnfb f2 = bmrsVar.f();
        flni.d(f2);
        this.b = f2;
        bmrr bmrrVar = (bmrr) bmrsVar;
        Context context = (Context) bmrrVar.a.a();
        flni.d(context);
        eqgo eqgoVar = (eqgo) bmrrVar.b.a();
        flni.d(eqgoVar);
        this.c = new bmsz(context, eqgoVar);
        bnes bnesVar = (bnes) bmrrVar.o.a();
        flni.d(bnesVar);
        this.d = bnesVar;
        bmrsVar.b();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        euum c;
        Account a;
        Boolean bool;
        Account a2;
        try {
            try {
                if ("com.google.android.gms.growth.notifications.NOTIFICATION_ACTION".equals(intent.getAction())) {
                    Intent intent2 = (Intent) intent.getParcelableExtra("gcmIntent");
                    bkcz.a(this);
                    String e2 = bkcz.e(intent2);
                    if ("gcm".equals(e2)) {
                        String stringExtra = intent2.getStringExtra("gms.gnots.payload");
                        eirz b = this.d.b(stringExtra);
                        if (b != null && (c = this.d.c(b, stringExtra)) != null && (a = this.d.a(getApplicationContext(), b)) != null) {
                            String str = a.name;
                            bnes bnesVar = this.d;
                            evdx evdxVar = c.c;
                            if (evdxVar == null) {
                                evdxVar = evdx.a;
                            }
                            bnesVar.g(str, evdxVar, 2, this.a);
                            int f2 = auvc.f();
                            int i = c.e;
                            int i2 = c.f;
                            if (i2 == 0) {
                                i2 = Integer.MAX_VALUE;
                            }
                            if (f2 >= i && f2 <= i2) {
                                if (a(str, c)) {
                                    evdx evdxVar2 = c.c;
                                    if (evdxVar2 == null) {
                                        evdxVar2 = evdx.a;
                                    }
                                    if (evdxVar2.e.equals("NIU_GOOGLE_DIGITAL_GUIDE")) {
                                        bnfb bnfbVar = this.b;
                                        bnes bnesVar2 = this.d;
                                        fgrc v = euun.a.v();
                                        Intent intent3 = (Intent) intent.getParcelableExtra("gcmIntent");
                                        intent3.setClassName(getApplicationContext(), "com.google.android.gms.notifications.GcmBroadcastReceiver");
                                        String stringExtra2 = intent3.getStringExtra("gms.gnots.payload");
                                        eirz b2 = bnesVar2.b(stringExtra2);
                                        if (b2 == null) {
                                            ((eluo) ((eluo) bnes.a.j()).ai((char) 5135)).x("Failed to build session. Reason: failed to get payload.");
                                        } else {
                                            euum c2 = bnesVar2.c(b2, stringExtra2);
                                            if (c2 != null && (a2 = bnesVar2.a(this, b2)) != null) {
                                                String str2 = a2.name;
                                                if (!v.b.L()) {
                                                    v.U();
                                                }
                                                fgri fgriVar = v.b;
                                                euun euunVar = (euun) fgriVar;
                                                str2.getClass();
                                                euunVar.b |= 2;
                                                euunVar.d = str2;
                                                evdx evdxVar3 = c2.c;
                                                if (evdxVar3 == null) {
                                                    evdxVar3 = evdx.a;
                                                }
                                                int i3 = evdxVar3.c;
                                                if (!fgriVar.L()) {
                                                    v.U();
                                                }
                                                euun euunVar2 = (euun) v.b;
                                                euunVar2.b |= 4;
                                                euunVar2.e = i3;
                                                bnfbVar.f(v);
                                            }
                                        }
                                        v = null;
                                        bnfbVar.f(v);
                                    }
                                } else {
                                    Iterator it = c.g.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            String str3 = (String) it.next();
                                            bnes bnesVar3 = this.d;
                                            fgqi fgqiVar = c.h;
                                            if (fgqiVar == null) {
                                                fgqiVar = fgqi.a;
                                            }
                                            Duration c3 = fgvn.c(fgqiVar);
                                            if (c3.isNegative()) {
                                                bool = false;
                                            } else {
                                                try {
                                                    fgsa<euup> fgsaVar = ((euuq) bnesVar3.c.a().get()).d;
                                                    if (c3.isZero()) {
                                                        Iterator it2 = fgsaVar.iterator();
                                                        while (it2.hasNext()) {
                                                            if (((euup) it2.next()).c.equals(str3)) {
                                                                bool = true;
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        aurp aurpVar = bnesVar3.d;
                                                        Instant minus = Instant.ofEpochMilli(System.currentTimeMillis()).minus(c3);
                                                        for (euup euupVar : fgsaVar) {
                                                            if (euupVar.c.equals(str3)) {
                                                                fgub fgubVar = euupVar.d;
                                                                if (fgubVar == null) {
                                                                    fgubVar = fgub.a;
                                                                }
                                                                if (fgvn.d(fgubVar).isAfter(minus)) {
                                                                    bool = true;
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    bool = false;
                                                } catch (InterruptedException | ExecutionException unused) {
                                                    bool = false;
                                                }
                                            }
                                            if (bool.booleanValue()) {
                                                bmsc bmscVar = this.a;
                                                fgrc v2 = evct.a.v();
                                                if (!v2.b.L()) {
                                                    v2.U();
                                                }
                                                fgri fgriVar2 = v2.b;
                                                evct evctVar = (evct) fgriVar2;
                                                evctVar.c = 2;
                                                evctVar.b |= 1;
                                                if (!fgriVar2.L()) {
                                                    v2.U();
                                                }
                                                fgri fgriVar3 = v2.b;
                                                evct evctVar2 = (evct) fgriVar3;
                                                evctVar2.d = 4;
                                                evctVar2.b |= 2;
                                                evdx evdxVar4 = c.c;
                                                if (evdxVar4 == null) {
                                                    evdxVar4 = evdx.a;
                                                }
                                                if (!fgriVar3.L()) {
                                                    v2.U();
                                                }
                                                evct evctVar3 = (evct) v2.b;
                                                evdxVar4.getClass();
                                                evctVar3.e = evdxVar4;
                                                evctVar3.b |= 4;
                                                bmscVar.c(str, v2);
                                            }
                                        } else {
                                            if (c.d) {
                                                fgrc v3 = evct.a.v();
                                                if (!v3.b.L()) {
                                                    v3.U();
                                                }
                                                fgri fgriVar4 = v3.b;
                                                evct evctVar4 = (evct) fgriVar4;
                                                evctVar4.c = 2;
                                                evctVar4.b |= 1;
                                                if (!fgriVar4.L()) {
                                                    v3.U();
                                                }
                                                fgri fgriVar5 = v3.b;
                                                evct evctVar5 = (evct) fgriVar5;
                                                evctVar5.d = 2;
                                                evctVar5.b |= 2;
                                                evdx evdxVar5 = c.c;
                                                if (evdxVar5 == null) {
                                                    evdxVar5 = evdx.a;
                                                }
                                                if (!fgriVar5.L()) {
                                                    v3.U();
                                                }
                                                evct evctVar6 = (evct) v3.b;
                                                evdxVar5.getClass();
                                                evctVar6.e = evdxVar5;
                                                evctVar6.b |= 4;
                                                if (b(c, frpu.a.lK().h())) {
                                                    euun euunVar3 = euun.a;
                                                    fgrc v4 = euunVar3.v();
                                                    String str4 = a.name;
                                                    if (!v4.b.L()) {
                                                        v4.U();
                                                    }
                                                    fgri fgriVar6 = v4.b;
                                                    euun euunVar4 = (euun) fgriVar6;
                                                    str4.getClass();
                                                    euunVar4.b |= 2;
                                                    euunVar4.d = str4;
                                                    evdx evdxVar6 = c.c;
                                                    if (evdxVar6 == null) {
                                                        evdxVar6 = evdx.a;
                                                    }
                                                    int i4 = evdxVar6.c;
                                                    if (!fgriVar6.L()) {
                                                        v4.U();
                                                    }
                                                    euun euunVar5 = (euun) v4.b;
                                                    euunVar5.b |= 4;
                                                    euunVar5.e = i4;
                                                    Iterator it3 = frqh.a.lK().d().b.iterator();
                                                    while (it3.hasNext()) {
                                                        this.b.g((String) it3.next(), v4);
                                                    }
                                                    bnfb bnfbVar2 = this.b;
                                                    fgrc v5 = euunVar3.v();
                                                    String str5 = a.name;
                                                    if (!v5.b.L()) {
                                                        v5.U();
                                                    }
                                                    fgri fgriVar7 = v5.b;
                                                    euun euunVar6 = (euun) fgriVar7;
                                                    str5.getClass();
                                                    euunVar6.b |= 2;
                                                    euunVar6.d = str5;
                                                    evdx evdxVar7 = c.c;
                                                    if (evdxVar7 == null) {
                                                        evdxVar7 = evdx.a;
                                                    }
                                                    int i5 = evdxVar7.c;
                                                    if (!fgriVar7.L()) {
                                                        v5.U();
                                                    }
                                                    euun euunVar7 = (euun) v5.b;
                                                    euunVar7.b |= 4;
                                                    euunVar7.e = i5;
                                                    bnfbVar2.i(v5);
                                                    bnfb bnfbVar3 = this.b;
                                                    fgrc v6 = euunVar3.v();
                                                    String str6 = a.name;
                                                    if (!v6.b.L()) {
                                                        v6.U();
                                                    }
                                                    fgri fgriVar8 = v6.b;
                                                    euun euunVar8 = (euun) fgriVar8;
                                                    str6.getClass();
                                                    euunVar8.b = 2 | euunVar8.b;
                                                    euunVar8.d = str6;
                                                    evdx evdxVar8 = c.c;
                                                    if (evdxVar8 == null) {
                                                        evdxVar8 = evdx.a;
                                                    }
                                                    int i6 = evdxVar8.c;
                                                    if (!fgriVar8.L()) {
                                                        v6.U();
                                                    }
                                                    euun euunVar9 = (euun) v6.b;
                                                    euunVar9.b |= 4;
                                                    euunVar9.e = i6;
                                                    bnfbVar3.h(v6);
                                                }
                                                if (!b(c, frpu.c()) || this.d.e(this)) {
                                                    this.a.c(a.name, v3);
                                                }
                                            } else {
                                                frpu frpuVar = frpu.a;
                                                if (b(c, frpuVar.lK().f()) && frpuVar.lK().i()) {
                                                    bmsc bmscVar2 = this.a;
                                                    fgrc v7 = evct.a.v();
                                                    if (!v7.b.L()) {
                                                        v7.U();
                                                    }
                                                    fgri fgriVar9 = v7.b;
                                                    evct evctVar7 = (evct) fgriVar9;
                                                    evctVar7.c = 2;
                                                    evctVar7.b |= 1;
                                                    if (!fgriVar9.L()) {
                                                        v7.U();
                                                    }
                                                    fgri fgriVar10 = v7.b;
                                                    evct evctVar8 = (evct) fgriVar10;
                                                    evctVar8.d = 6;
                                                    evctVar8.b |= 2;
                                                    evdx evdxVar9 = c.c;
                                                    if (evdxVar9 == null) {
                                                        evdxVar9 = evdx.a;
                                                    }
                                                    if (!fgriVar10.L()) {
                                                        v7.U();
                                                    }
                                                    evct evctVar9 = (evct) v7.b;
                                                    evdxVar9.getClass();
                                                    evctVar9.e = evdxVar9;
                                                    evctVar9.b |= 4;
                                                    bmscVar2.c(str, v7);
                                                }
                                                if (b(c, frpu.c())) {
                                                    bnes bnesVar4 = this.d;
                                                    bmsc bmscVar3 = this.a;
                                                    System.currentTimeMillis();
                                                    bnesVar4.h(this, intent, bmscVar3);
                                                } else {
                                                    this.d.d(this, intent, this.a);
                                                }
                                            }
                                            bnes bnesVar5 = this.d;
                                            evdx evdxVar10 = c.c;
                                            if (evdxVar10 == null) {
                                                evdxVar10 = evdx.a;
                                            }
                                            bnesVar5.f(evdxVar10.e);
                                        }
                                    }
                                }
                            }
                            bmsc bmscVar4 = this.a;
                            fgrc v8 = evct.a.v();
                            if (!v8.b.L()) {
                                v8.U();
                            }
                            fgri fgriVar11 = v8.b;
                            evct evctVar10 = (evct) fgriVar11;
                            evctVar10.c = 2;
                            evctVar10.b |= 1;
                            if (!fgriVar11.L()) {
                                v8.U();
                            }
                            fgri fgriVar12 = v8.b;
                            evct evctVar11 = (evct) fgriVar12;
                            evctVar11.d = 3;
                            evctVar11.b |= 2;
                            evdx evdxVar11 = c.c;
                            if (evdxVar11 == null) {
                                evdxVar11 = evdx.a;
                            }
                            if (!fgriVar12.L()) {
                                v8.U();
                            }
                            evct evctVar12 = (evct) v8.b;
                            evdxVar11.getClass();
                            evctVar12.e = evdxVar11;
                            evctVar12.b |= 4;
                            bmscVar4.c(str, v8);
                        }
                    } else {
                        ((eluo) f.j()).B("Received unexpected message type: %s", e2);
                    }
                } else {
                    ((eluo) f.j()).B("Received unexpected ACTION=%s", intent.getAction());
                }
            } catch (RuntimeException e3) {
                ((eluo) ((eluo) f.i()).s(e3)).B("Failed to handle intent: %s", intent);
            }
        } finally {
            dhcb.b(intent);
        }
    }
}

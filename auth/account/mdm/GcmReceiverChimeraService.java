package com.google.android.gms.auth.account.mdm;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.google.android.gms.auth.account.be.RemoveAccountChimeraIntentService;
import com.google.android.gms.auth.account.mdm.GcmReceiverChimeraService;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.asng;
import defpackage.byhr;
import defpackage.dvni;
import defpackage.eiif;
import defpackage.fkkz;
import defpackage.vfv;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GcmReceiverChimeraService extends TracingIntentService {
    Handler a;
    private HandlerThread b;

    public GcmReceiverChimeraService() {
        super("GcmReceiverService");
        setIntentRedelivery(true);
    }

    public static final Map b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("Authorization", "GoogleDMToken token=".concat(String.valueOf(str)));
        hashMap.put("Content-type", "application/x-protobuffer");
        hashMap.put("Accept-Encoding", "gzip");
        return hashMap;
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent) {
        String stringExtra;
        if (intent == null) {
            return;
        }
        dvni dvniVar = vfv.a;
        if (fkkz.a.a().E() && (stringExtra = intent.getStringExtra("action")) != null && stringExtra.equals("account_wipe")) {
            final String stringExtra2 = intent.getStringExtra("action_token");
            final String stringExtra3 = intent.getStringExtra("email");
            if (eiif.c(stringExtra2) || eiif.c(stringExtra3)) {
                return;
            }
            final long e = asng.e(getApplicationContext());
            this.a.post(new Runnable() { // from class: vkx
                @Override // java.lang.Runnable
                public final void run() {
                    String str = stringExtra3;
                    String str2 = stringExtra2;
                    long j = e;
                    GcmReceiverChimeraService gcmReceiverChimeraService = GcmReceiverChimeraService.this;
                    try {
                        fhly fhlyVar = fhly.AUTH_NETWORK_REQUEST_DM_WIPE_CONFIRM;
                        String f = vfv.f();
                        fhqx fhqxVar = fhqx.a;
                        Map b = GcmReceiverChimeraService.b(str2);
                        String l = Long.toString(j);
                        fhqr fhqrVar = fhqr.a;
                        fecj v = fhqrVar.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fecp fecpVar = v.b;
                        fhqr fhqrVar2 = (fhqr) fecpVar;
                        l.getClass();
                        fhqrVar2.b |= 1;
                        fhqrVar2.c = l;
                        if (!fecpVar.L()) {
                            v.U();
                        }
                        fhqr fhqrVar3 = (fhqr) v.b;
                        str.getClass();
                        fhqrVar3.b |= 2;
                        fhqrVar3.d = str;
                        fhqr fhqrVar4 = (fhqr) v.Q();
                        fecj v2 = fhqs.a.v();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        fhqs fhqsVar = (fhqs) v2.b;
                        str2.getClass();
                        fhqsVar.b |= 1;
                        fhqsVar.c = str2;
                        fhqq fhqqVar = fhqq.a;
                        fecj v3 = fhqqVar.v();
                        if (!v3.b.L()) {
                            v3.U();
                        }
                        fhqq fhqqVar2 = (fhqq) v3.b;
                        fhqqVar2.c = 1;
                        fhqqVar2.b |= 1;
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        fhqs fhqsVar2 = (fhqs) v2.b;
                        fhqq fhqqVar3 = (fhqq) v3.Q();
                        fhqqVar3.getClass();
                        fhqsVar2.d = fhqqVar3;
                        fhqsVar2.b |= 2;
                        fhqs fhqsVar3 = (fhqs) v2.Q();
                        fhqu fhquVar = fhqu.a;
                        fecj v4 = fhquVar.v();
                        if (!v4.b.L()) {
                            v4.U();
                        }
                        fecp fecpVar2 = v4.b;
                        fhqu fhquVar2 = (fhqu) fecpVar2;
                        fhqrVar4.getClass();
                        fhquVar2.c = fhqrVar4;
                        fhquVar2.b |= 1;
                        if (!fecpVar2.L()) {
                            v4.U();
                        }
                        fhqu fhquVar3 = (fhqu) v4.b;
                        fhqsVar3.getClass();
                        fhquVar3.d = fhqsVar3;
                        fhquVar3.b |= 2;
                        fhqu fhquVar4 = (fhqu) v4.Q();
                        bxoi bxoiVar = bxkd.b;
                        bxoh bxohVar = bxkd.c;
                        fhqx fhqxVar2 = (fhqx) ((enpf) acbg.b(fhlyVar, f, fhqxVar, b, fhquVar4, bxoiVar, bxohVar)).u();
                        int a = fhqw.a(fhqxVar2.b);
                        if (a != 0 && a == 2) {
                            fhqt fhqtVar = fhqxVar2.c;
                            if (fhqtVar == null) {
                                fhqtVar = fhqt.a;
                            }
                            fhqq fhqqVar4 = fhqtVar.b;
                            if (fhqqVar4 == null) {
                                fhqqVar4 = fhqqVar;
                            }
                            int a2 = fhqo.a(fhqqVar4.d);
                            if (a2 == 0 || a2 != 2) {
                                return;
                            }
                            gcmReceiverChimeraService.startService(RemoveAccountChimeraIntentService.b(gcmReceiverChimeraService.getApplicationContext(), new Account(str, "com.google")));
                            String f2 = vfv.f();
                            Map b2 = GcmReceiverChimeraService.b(str2);
                            String l2 = Long.toString(j);
                            fecj v5 = fhqrVar.v();
                            if (!v5.b.L()) {
                                v5.U();
                            }
                            fecp fecpVar3 = v5.b;
                            fhqr fhqrVar5 = (fhqr) fecpVar3;
                            l2.getClass();
                            fhqrVar5.b |= 1;
                            fhqrVar5.c = l2;
                            if (!fecpVar3.L()) {
                                v5.U();
                            }
                            fhqr fhqrVar6 = (fhqr) v5.b;
                            str.getClass();
                            fhqrVar6.b |= 2;
                            fhqrVar6.d = str;
                            fhqr fhqrVar7 = (fhqr) v5.Q();
                            fecj v6 = fhqy.a.v();
                            if (!v6.b.L()) {
                                v6.U();
                            }
                            fhqy fhqyVar = (fhqy) v6.b;
                            str2.getClass();
                            fhqyVar.b |= 1;
                            fhqyVar.c = str2;
                            fecj v7 = fhqqVar.v();
                            if (!v7.b.L()) {
                                v7.U();
                            }
                            fecp fecpVar4 = v7.b;
                            fhqq fhqqVar5 = (fhqq) fecpVar4;
                            fhqqVar5.c = 1;
                            fhqqVar5.b |= 1;
                            if (!fecpVar4.L()) {
                                v7.U();
                            }
                            fhqq fhqqVar6 = (fhqq) v7.b;
                            fhqqVar6.d = 2;
                            fhqqVar6.b |= 2;
                            if (!v6.b.L()) {
                                v6.U();
                            }
                            fhqy fhqyVar2 = (fhqy) v6.b;
                            fhqq fhqqVar7 = (fhqq) v7.Q();
                            fhqqVar7.getClass();
                            fhqyVar2.d = fhqqVar7;
                            fhqyVar2.b |= 2;
                            fhqy fhqyVar3 = (fhqy) v6.Q();
                            fecj v8 = fhquVar.v();
                            if (!v8.b.L()) {
                                v8.U();
                            }
                            fecp fecpVar5 = v8.b;
                            fhqu fhquVar5 = (fhqu) fecpVar5;
                            fhqrVar7.getClass();
                            fhquVar5.c = fhqrVar7;
                            fhquVar5.b |= 1;
                            if (!fecpVar5.L()) {
                                v8.U();
                            }
                            fhqu fhquVar6 = (fhqu) v8.b;
                            fhqyVar3.getClass();
                            fhquVar6.e = fhqyVar3;
                            fhquVar6.b |= 4;
                            fhqu fhquVar7 = (fhqu) v8.Q();
                            arje.c(fhlyVar, b2);
                            asot asotVar = uqa.a;
                            uqa a3 = upz.a();
                            fvbo.f(f2, "url");
                            fvbo.f(fhquVar7, "uploadData");
                            fvbo.f(bxoiVar, "collectionDefinition");
                            fvbo.f(bxohVar, "collectionDefinitionWithType");
                            bybm bybmVar = bybm.a;
                            bybl byblVar = bybl.a;
                            bycl e2 = ((bybu) a3.c.a()).e(byci.e(f2, bxoiVar, bybmVar, byblVar), bycn.a, byhj.b.b(byhp.HIGH_SPEED), uqb.a().a((String) b2.get("app")), 1025);
                            e2.n("POST");
                            e2.l();
                            Context context = a3.b;
                            if (!fkdo.d()) {
                                fhquVar7.getClass();
                                bxvq bxvqVar = bxvq.a;
                                bxohVar = new bxoh(bxvq.a, bxox.a);
                            }
                            e2.o(context, fhquVar7, bybmVar, bxohVar);
                            bycw a4 = bycb.a(bybmVar, byblVar);
                            for (Map.Entry entry : b2.entrySet()) {
                                a4.a((String) entry.getKey(), (String) entry.getValue());
                            }
                            e2.m(new bycx(a4));
                            ((enpf) uqa.b(e2)).u();
                        }
                    } catch (IOException | InterruptedException | ExecutionException e3) {
                        Log.w("Auth", String.format(Locale.US, "[account_mdm, GcmReceiverChimeraService] Exception communicating account wipe status", new Object[0]), e3);
                    }
                }
            });
        }
    }

    @Override // com.google.android.chimera.IntentService, com.google.android.chimera.Service
    public final void onCreate() {
        HandlerThread handlerThread = new HandlerThread("dm-account-wipe", 10);
        this.b = handlerThread;
        handlerThread.start();
        this.a = new byhr(this.b.getLooper());
        super.onCreate();
    }

    @Override // com.google.android.chimera.IntentService, com.google.android.chimera.Service
    public final void onDestroy() {
        HandlerThread handlerThread = this.b;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        super.onDestroy();
    }
}

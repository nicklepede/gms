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
import defpackage.aura;
import defpackage.caqj;
import defpackage.dxyi;
import defpackage.ekvk;
import defpackage.fnbo;
import defpackage.xbw;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
        dxyi dxyiVar = xbw.a;
        if (fnbo.a.lK().D() && (stringExtra = intent.getStringExtra("action")) != null && stringExtra.equals("account_wipe")) {
            final String stringExtra2 = intent.getStringExtra("action_token");
            final String stringExtra3 = intent.getStringExtra("email");
            if (ekvk.c(stringExtra2) || ekvk.c(stringExtra3)) {
                return;
            }
            final long e = aura.e(getApplicationContext());
            this.a.post(new Runnable() { // from class: xgy
                @Override // java.lang.Runnable
                public final void run() {
                    String str = stringExtra3;
                    String str2 = stringExtra2;
                    long j = e;
                    GcmReceiverChimeraService gcmReceiverChimeraService = GcmReceiverChimeraService.this;
                    try {
                        fkbv fkbvVar = fkbv.AUTH_NETWORK_REQUEST_DM_WIPE_CONFIRM;
                        String f = xbw.f();
                        fkgu fkguVar = fkgu.a;
                        Map b = GcmReceiverChimeraService.b(str2);
                        String l = Long.toString(j);
                        fkgo fkgoVar = fkgo.a;
                        fgrc v = fkgoVar.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fgri fgriVar = v.b;
                        fkgo fkgoVar2 = (fkgo) fgriVar;
                        l.getClass();
                        fkgoVar2.b |= 1;
                        fkgoVar2.c = l;
                        if (!fgriVar.L()) {
                            v.U();
                        }
                        fkgo fkgoVar3 = (fkgo) v.b;
                        str.getClass();
                        fkgoVar3.b |= 2;
                        fkgoVar3.d = str;
                        fkgo fkgoVar4 = (fkgo) v.Q();
                        fgrc v2 = fkgp.a.v();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        fkgp fkgpVar = (fkgp) v2.b;
                        str2.getClass();
                        fkgpVar.b |= 1;
                        fkgpVar.c = str2;
                        fkgn fkgnVar = fkgn.a;
                        fgrc v3 = fkgnVar.v();
                        if (!v3.b.L()) {
                            v3.U();
                        }
                        fkgn fkgnVar2 = (fkgn) v3.b;
                        fkgnVar2.c = 1;
                        fkgnVar2.b |= 1;
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        fkgp fkgpVar2 = (fkgp) v2.b;
                        fkgn fkgnVar3 = (fkgn) v3.Q();
                        fkgnVar3.getClass();
                        fkgpVar2.d = fkgnVar3;
                        fkgpVar2.b |= 2;
                        fkgp fkgpVar3 = (fkgp) v2.Q();
                        fkgr fkgrVar = fkgr.a;
                        fgrc v4 = fkgrVar.v();
                        if (!v4.b.L()) {
                            v4.U();
                        }
                        fgri fgriVar2 = v4.b;
                        fkgr fkgrVar2 = (fkgr) fgriVar2;
                        fkgoVar4.getClass();
                        fkgrVar2.c = fkgoVar4;
                        fkgrVar2.b |= 1;
                        if (!fgriVar2.L()) {
                            v4.U();
                        }
                        fkgr fkgrVar3 = (fkgr) v4.b;
                        fkgpVar3.getClass();
                        fkgrVar3.d = fkgpVar3;
                        fkgrVar3.b |= 2;
                        fkgr fkgrVar4 = (fkgr) v4.Q();
                        bzwy bzwyVar = bzst.b;
                        bzwx bzwxVar = bzst.c;
                        fkgu fkguVar2 = (fkgu) ((eqcy) aebg.b(fkbvVar, f, fkguVar, b, fkgrVar4, bzwyVar, bzwxVar)).u();
                        int a = fkgt.a(fkguVar2.b);
                        if (a != 0 && a == 2) {
                            fkgq fkgqVar = fkguVar2.c;
                            if (fkgqVar == null) {
                                fkgqVar = fkgq.a;
                            }
                            fkgn fkgnVar4 = fkgqVar.b;
                            if (fkgnVar4 == null) {
                                fkgnVar4 = fkgnVar;
                            }
                            int a2 = fkgl.a(fkgnVar4.d);
                            if (a2 == 0 || a2 != 2) {
                                return;
                            }
                            gcmReceiverChimeraService.startService(RemoveAccountChimeraIntentService.b(gcmReceiverChimeraService.getApplicationContext(), new Account(str, "com.google")));
                            String f2 = xbw.f();
                            Map b2 = GcmReceiverChimeraService.b(str2);
                            String l2 = Long.toString(j);
                            fgrc v5 = fkgoVar.v();
                            if (!v5.b.L()) {
                                v5.U();
                            }
                            fgri fgriVar3 = v5.b;
                            fkgo fkgoVar5 = (fkgo) fgriVar3;
                            l2.getClass();
                            fkgoVar5.b |= 1;
                            fkgoVar5.c = l2;
                            if (!fgriVar3.L()) {
                                v5.U();
                            }
                            fkgo fkgoVar6 = (fkgo) v5.b;
                            str.getClass();
                            fkgoVar6.b |= 2;
                            fkgoVar6.d = str;
                            fkgo fkgoVar7 = (fkgo) v5.Q();
                            fgrc v6 = fkgv.a.v();
                            if (!v6.b.L()) {
                                v6.U();
                            }
                            fkgv fkgvVar = (fkgv) v6.b;
                            str2.getClass();
                            fkgvVar.b |= 1;
                            fkgvVar.c = str2;
                            fgrc v7 = fkgnVar.v();
                            if (!v7.b.L()) {
                                v7.U();
                            }
                            fgri fgriVar4 = v7.b;
                            fkgn fkgnVar5 = (fkgn) fgriVar4;
                            fkgnVar5.c = 1;
                            fkgnVar5.b |= 1;
                            if (!fgriVar4.L()) {
                                v7.U();
                            }
                            fkgn fkgnVar6 = (fkgn) v7.b;
                            fkgnVar6.d = 2;
                            fkgnVar6.b |= 2;
                            if (!v6.b.L()) {
                                v6.U();
                            }
                            fkgv fkgvVar2 = (fkgv) v6.b;
                            fkgn fkgnVar7 = (fkgn) v7.Q();
                            fkgnVar7.getClass();
                            fkgvVar2.d = fkgnVar7;
                            fkgvVar2.b |= 2;
                            fkgv fkgvVar3 = (fkgv) v6.Q();
                            fgrc v8 = fkgrVar.v();
                            if (!v8.b.L()) {
                                v8.U();
                            }
                            fgri fgriVar5 = v8.b;
                            fkgr fkgrVar5 = (fkgr) fgriVar5;
                            fkgoVar7.getClass();
                            fkgrVar5.c = fkgoVar7;
                            fkgrVar5.b |= 1;
                            if (!fgriVar5.L()) {
                                v8.U();
                            }
                            fkgr fkgrVar6 = (fkgr) v8.b;
                            fkgvVar3.getClass();
                            fkgrVar6.e = fkgvVar3;
                            fkgrVar6.b |= 4;
                            fkgr fkgrVar7 = (fkgr) v8.Q();
                            atlt.c(fkbvVar, b2);
                            ausn ausnVar = wlz.a;
                            wlz a3 = wly.a();
                            fxxm.f(f2, "url");
                            fxxm.f(fkgrVar7, "uploadData");
                            fxxm.f(bzwyVar, "collectionDefinition");
                            fxxm.f(bzwxVar, "collectionDefinitionWithType");
                            cake cakeVar = cake.a;
                            cakd cakdVar = cakd.a;
                            cald e2 = ((cakm) a3.c.lK()).e(cala.e(f2, bzwyVar, cakeVar, cakdVar), calf.a, caqb.b.b(caqh.HIGH_SPEED), wma.a().a((String) b2.get("app")), 1025);
                            e2.n("POST");
                            e2.l();
                            Context context = a3.b;
                            if (!fmua.d()) {
                                fkgrVar7.getClass();
                                caei caeiVar = caei.a;
                                bzwxVar = new bzwx(caei.a, bzxn.a);
                            }
                            e2.o(context, fkgrVar7, cakeVar, bzwxVar);
                            calo a4 = cakt.a(cakeVar, cakdVar);
                            for (Map.Entry entry : b2.entrySet()) {
                                a4.a((String) entry.getKey(), (String) entry.getValue());
                            }
                            e2.m(new calp(a4));
                            ((eqcy) wlz.b(e2)).u();
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
        this.a = new caqj(this.b.getLooper());
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

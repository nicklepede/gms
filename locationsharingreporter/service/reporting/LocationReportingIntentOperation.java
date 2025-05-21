package com.google.android.gms.locationsharingreporter.service.reporting;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.locationsharingreporter.AppContextProvider;
import defpackage.asej;
import defpackage.asot;
import defpackage.bzhs;
import defpackage.bzim;
import defpackage.catc;
import defpackage.catj;
import defpackage.cavi;
import defpackage.cavm;
import defpackage.cawc;
import defpackage.caws;
import defpackage.ebfg;
import defpackage.ebge;
import defpackage.ebgj;
import defpackage.ebgk;
import defpackage.eitj;
import defpackage.ejcb;
import defpackage.ejhf;
import defpackage.feay;
import defpackage.fecj;
import defpackage.fpws;
import defpackage.fpww;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LocationReportingIntentOperation extends IntentOperation implements bzim {
    private HandlerThread c;
    private String d;
    private bzhs e;
    private cavi f;
    private CountDownLatch g;
    private Intent h;
    private static final asot b = asot.b("LSR", asej.LOCATION_SHARING_REPORTER);
    public static final AtomicBoolean a = new AtomicBoolean();

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.e = caws.a(AppContextProvider.a());
        this.f = cavi.a();
        HandlerThread handlerThread = new HandlerThread("LocationReporting callbacks");
        this.c = handlerThread;
        handlerThread.start();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onDestroy() {
        this.e.f(this);
        HandlerThread handlerThread = this.c;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        a.set(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0178 A[Catch: all -> 0x021d, InterruptedException -> 0x021f, TryCatch #0 {InterruptedException -> 0x021f, blocks: (B:33:0x00ee, B:35:0x0120, B:36:0x0124, B:38:0x012e, B:39:0x0133, B:41:0x013a, B:42:0x013e, B:47:0x0157, B:50:0x0160, B:52:0x0178, B:54:0x0198, B:55:0x019b, B:57:0x01ae, B:58:0x01b1, B:60:0x01cb, B:62:0x01d3, B:63:0x01d6, B:64:0x01e4, B:66:0x01f8, B:67:0x01fb, B:68:0x0211), top: B:32:0x00ee, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x025a  */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r18) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.locationsharingreporter.service.reporting.LocationReportingIntentOperation.onHandleIntent(android.content.Intent):void");
    }

    @Override // defpackage.bzim
    public final void onLocationChanged(Location location) {
        try {
            byte[] byteArrayExtra = this.h.getByteArrayExtra("geofence_token");
            if (fpww.c()) {
                cavi caviVar = this.f;
                String str = this.d;
                String stringExtra = this.h.getStringExtra("location_refresh_session_id");
                int intExtra = this.h.getIntExtra("collection_reason", 1);
                float accuracy = location.getAccuracy();
                fecj v = ebgj.a.v();
                fecj v2 = ebgk.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                ebgk ebgkVar = (ebgk) v2.b;
                ebgkVar.b |= 1;
                ebgkVar.c = intExtra;
                if (!v.b.L()) {
                    v.U();
                }
                ebgj ebgjVar = (ebgj) v.b;
                ebgk ebgkVar2 = (ebgk) v2.Q();
                ebgkVar2.getClass();
                ebgjVar.f = ebgkVar2;
                ebgjVar.b |= 2;
                fecj v3 = ebge.a.v();
                if (!v3.b.L()) {
                    v3.U();
                }
                ebge ebgeVar = (ebge) v3.b;
                ebgeVar.b |= 1;
                ebgeVar.c = accuracy;
                if (!v.b.L()) {
                    v.U();
                }
                ebgj ebgjVar2 = (ebgj) v.b;
                ebge ebgeVar2 = (ebge) v3.Q();
                ebgeVar2.getClass();
                ebgjVar2.d = ebgeVar2;
                ebgjVar2.c = 4;
                if (!TextUtils.isEmpty(stringExtra)) {
                    if (!v.b.L()) {
                        v.U();
                    }
                    ebgj ebgjVar3 = (ebgj) v.b;
                    stringExtra.getClass();
                    ebgjVar3.b |= 1;
                    ebgjVar3.e = stringExtra;
                }
                fecj v4 = ebfg.a.v();
                ebgj ebgjVar4 = (ebgj) v.Q();
                if (!v4.b.L()) {
                    v4.U();
                }
                ebfg ebfgVar = (ebfg) v4.b;
                ebgjVar4.getClass();
                ebfgVar.c = ebgjVar4;
                ebfgVar.b = 3;
                caviVar.c(str, (ebfg) v4.Q(), 1013);
            }
            Context a2 = AppContextProvider.a();
            String stringExtra2 = this.h.getStringExtra("location_refresh_session_id");
            Account account = new Account(this.d, "com.google");
            int i = eitj.d;
            eitj eitjVar = ejcb.a;
            catc catcVar = new catc();
            catcVar.b(this.h.getIntExtra("collection_reason", 1));
            catj g = cawc.g(a2, stringExtra2, account, location, eitjVar, catcVar.a(), this.h.getBooleanExtra("has_wearable_on_body", false) ? Boolean.valueOf(this.h.getBooleanExtra("is_wearable_on_body", false)) : null, byteArrayExtra != null ? feay.w(byteArrayExtra) : null);
            if (g == null) {
                this.e.f(this);
                this.g.countDown();
            } else {
                try {
                    cavm.b().d(AppContextProvider.a(), this.d, g).get(fpws.i(), TimeUnit.MILLISECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    ((ejhf) ((ejhf) ((ejhf) b.i()).s(e)).ah(5763)).x("failed to update location reporting status");
                }
                if (!g.e) {
                    this.e.f(this);
                    this.g.countDown();
                } else if (location.getAccuracy() < fpws.g()) {
                    this.e.f(this);
                    this.g.countDown();
                }
            }
        } finally {
            this.e.f(this);
            this.g.countDown();
        }
    }
}

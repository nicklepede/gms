package com.google.android.gms.locationsharingreporter.service.reporting;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.locationsharingreporter.AppContextProvider;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cbqj;
import defpackage.cbrd;
import defpackage.cdbs;
import defpackage.cdbz;
import defpackage.cddy;
import defpackage.cdec;
import defpackage.cdes;
import defpackage.cdfi;
import defpackage.edrt;
import defpackage.edsr;
import defpackage.edsw;
import defpackage.edsx;
import defpackage.elgo;
import defpackage.elpg;
import defpackage.eluo;
import defpackage.fgpr;
import defpackage.fgrc;
import defpackage.fsqm;
import defpackage.fsqq;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LocationReportingIntentOperation extends IntentOperation implements cbrd {
    private HandlerThread c;
    private String d;
    private cbqj e;
    private cddy f;
    private CountDownLatch g;
    private Intent h;
    private static final ausn b = ausn.b("LSR", auid.LOCATION_SHARING_REPORTER);
    public static final AtomicBoolean a = new AtomicBoolean();

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.e = cdfi.a(AppContextProvider.a());
        this.f = cddy.a();
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

    @Override // defpackage.cbrd
    public final void onLocationChanged(Location location) {
        try {
            byte[] byteArrayExtra = this.h.getByteArrayExtra("geofence_token");
            if (fsqq.c()) {
                cddy cddyVar = this.f;
                String str = this.d;
                String stringExtra = this.h.getStringExtra("location_refresh_session_id");
                int intExtra = this.h.getIntExtra("collection_reason", 1);
                float accuracy = location.getAccuracy();
                fgrc v = edsw.a.v();
                fgrc v2 = edsx.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                edsx edsxVar = (edsx) v2.b;
                edsxVar.b |= 1;
                edsxVar.c = intExtra;
                if (!v.b.L()) {
                    v.U();
                }
                edsw edswVar = (edsw) v.b;
                edsx edsxVar2 = (edsx) v2.Q();
                edsxVar2.getClass();
                edswVar.f = edsxVar2;
                edswVar.b |= 2;
                fgrc v3 = edsr.a.v();
                if (!v3.b.L()) {
                    v3.U();
                }
                edsr edsrVar = (edsr) v3.b;
                edsrVar.b |= 1;
                edsrVar.c = accuracy;
                if (!v.b.L()) {
                    v.U();
                }
                edsw edswVar2 = (edsw) v.b;
                edsr edsrVar2 = (edsr) v3.Q();
                edsrVar2.getClass();
                edswVar2.d = edsrVar2;
                edswVar2.c = 4;
                if (!TextUtils.isEmpty(stringExtra)) {
                    if (!v.b.L()) {
                        v.U();
                    }
                    edsw edswVar3 = (edsw) v.b;
                    stringExtra.getClass();
                    edswVar3.b |= 1;
                    edswVar3.e = stringExtra;
                }
                fgrc v4 = edrt.a.v();
                edsw edswVar4 = (edsw) v.Q();
                if (!v4.b.L()) {
                    v4.U();
                }
                edrt edrtVar = (edrt) v4.b;
                edswVar4.getClass();
                edrtVar.c = edswVar4;
                edrtVar.b = 3;
                cddyVar.c(str, (edrt) v4.Q(), 1013);
            }
            Context a2 = AppContextProvider.a();
            String stringExtra2 = this.h.getStringExtra("location_refresh_session_id");
            Account account = new Account(this.d, "com.google");
            int i = elgo.d;
            elgo elgoVar = elpg.a;
            cdbs cdbsVar = new cdbs();
            cdbsVar.b(this.h.getIntExtra("collection_reason", 1));
            cdbz g = cdes.g(a2, stringExtra2, account, location, elgoVar, cdbsVar.a(), this.h.getBooleanExtra("has_wearable_on_body", false) ? Boolean.valueOf(this.h.getBooleanExtra("is_wearable_on_body", false)) : null, byteArrayExtra != null ? fgpr.w(byteArrayExtra) : null);
            if (g == null) {
                this.e.f(this);
                this.g.countDown();
            } else {
                try {
                    cdec.b().d(AppContextProvider.a(), this.d, g).get(fsqm.i(), TimeUnit.MILLISECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    ((eluo) ((eluo) ((eluo) b.i()).s(e)).ai(5777)).x("failed to update location reporting status");
                }
                if (!g.e) {
                    this.e.f(this);
                    this.g.countDown();
                } else if (location.getAccuracy() < fsqm.g()) {
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

package com.google.android.gms.locationsharingreporter.service.reporting.periodic;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.location.Location;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.locationsharingreporter.AppContextProvider;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.locationsharingreporter.LocationShare;
import com.google.android.gms.locationsharingreporter.NoticeAckedUpdateRequest;
import com.google.android.gms.locationsharingreporter.PeriodicLocationUploadRequest;
import com.google.android.gms.locationsharingreporter.StartLocationReportingRequest;
import com.google.android.gms.locationsharingreporter.StopLocationReportingRequest;
import defpackage.arxd;
import defpackage.asej;
import defpackage.asot;
import defpackage.caxj;
import defpackage.caym;
import defpackage.cayn;
import defpackage.cbbj;
import defpackage.cbbk;
import defpackage.cbbn;
import defpackage.cbew;
import defpackage.eigb;
import defpackage.eiho;
import defpackage.eiid;
import defpackage.eiig;
import defpackage.eitj;
import defpackage.eits;
import defpackage.ejhf;
import defpackage.enpf;
import defpackage.enps;
import defpackage.enqc;
import defpackage.ensi;
import defpackage.ensm;
import defpackage.enss;
import defpackage.fpxh;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PeriodicLocationReportingIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final asot b = asot.b("LSR", asej.LOCATION_SHARING_REPORTER);

    public static PendingIntent a() {
        Intent intent = new Intent("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACTION_PERIODIC_LOCATION_UPDATE");
        intent.setComponent(new ComponentName(AppContextProvider.a(), "com.google.android.gms.locationsharingreporter.service.reporting.periodic.PeriodicLocationReportingIntentOperation"));
        PendingIntent pendingIntent = IntentOperation.getPendingIntent(AppContextProvider.a(), PeriodicLocationReportingIntentOperation.class, intent, 0, 134217728);
        eiig.x(pendingIntent);
        return pendingIntent;
    }

    public static Intent b(Account account) {
        Intent startIntent = IntentOperation.getStartIntent(AppContextProvider.a(), PeriodicLocationReportingIntentOperation.class, "com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACTION_REFRESH_REPORTING_STATE_FOR_ACCOUNT");
        eiig.x(startIntent);
        startIntent.putExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACCOUNT_NAME", account.name);
        return startIntent;
    }

    private static void c(Intent intent) {
        enss p;
        eiid i = eiid.i((PeriodicLocationUploadRequest) arxd.b(intent, "com.google.android.gms.locationsharingreporter.service.reporting.periodic.UPLOAD_REQUEST", PeriodicLocationUploadRequest.CREATOR));
        eiid i2 = eiid.i(intent.getStringExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACCOUNT_NAME"));
        eiid i3 = eiid.i(intent.getStringExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.CALLING_PACKAGE"));
        final eiid i4 = eiid.i(intent.getStringExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ATTRIBUTION_TAG"));
        if (!i.h() || !i2.h() || !i3.h()) {
            ((ejhf) ((ejhf) b.j()).ah((char) 5858)).x("Received upload request with incomplete information, ignoring it");
            return;
        }
        try {
            final caym a2 = caym.a();
            final String str = (String) i2.c();
            final String str2 = (String) i3.c();
            final PeriodicLocationUploadRequest periodicLocationUploadRequest = (PeriodicLocationUploadRequest) i.c();
            if (!fpxh.a.a().as() || periodicLocationUploadRequest.d >= fpxh.a.a().r()) {
                ((ejhf) ((ejhf) caym.a.h()).ah((char) 5827)).x("Adding new client request");
                cbbk cbbkVar = a2.c;
                final Account account = new Account(str, "com.google");
                p = cbbkVar.p(new eiho() { // from class: cbbf
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        cauz cauzVar = (cauz) obj;
                        Map unmodifiableMap = DesugarCollections.unmodifiableMap(cauzVar.c);
                        Account account2 = account;
                        cavc cavcVar = (cavc) unmodifiableMap.get(account2.name);
                        if (cavcVar == null) {
                            cavcVar = cavc.a;
                        }
                        PeriodicLocationUploadRequest periodicLocationUploadRequest2 = periodicLocationUploadRequest;
                        fecj fecjVar = (fecj) cauzVar.iB(5, null);
                        fecjVar.X(cauzVar);
                        cauu cauuVar = (cauu) fecjVar;
                        String str3 = account2.name;
                        fecj fecjVar2 = (fecj) cavcVar.iB(5, null);
                        fecjVar2.X(cavcVar);
                        cava cavaVar = (cava) fecjVar2;
                        String str4 = account2.name;
                        fecj v = cavf.a.v();
                        caun c = cbbm.c(periodicLocationUploadRequest2);
                        if (!v.b.L()) {
                            v.U();
                        }
                        fecp fecpVar = v.b;
                        cavf cavfVar = (cavf) fecpVar;
                        c.getClass();
                        cavfVar.e = c;
                        cavfVar.b |= 4;
                        if (!fecpVar.L()) {
                            v.U();
                        }
                        fecp fecpVar2 = v.b;
                        cavf cavfVar2 = (cavf) fecpVar2;
                        str4.getClass();
                        cavfVar2.b |= 8;
                        cavfVar2.f = str4;
                        if (!fecpVar2.L()) {
                            v.U();
                        }
                        eiid eiidVar = i4;
                        String str5 = str2;
                        cavf cavfVar3 = (cavf) v.b;
                        cavfVar3.b |= 16;
                        cavfVar3.g = str5;
                        if (eiidVar.h()) {
                            String str6 = (String) eiidVar.c();
                            if (!v.b.L()) {
                                v.U();
                            }
                            cavf cavfVar4 = (cavf) v.b;
                            cavfVar4.b |= 64;
                            cavfVar4.i = str6;
                        }
                        long j = periodicLocationUploadRequest2.d;
                        if (j != 0) {
                            long currentTimeMillis = System.currentTimeMillis() + j;
                            if (!v.b.L()) {
                                v.U();
                            }
                            cavf cavfVar5 = (cavf) v.b;
                            cavfVar5.b |= 1;
                            cavfVar5.c = currentTimeMillis;
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (!v.b.L()) {
                            v.U();
                        }
                        cavf cavfVar6 = (cavf) v.b;
                        cavfVar6.b |= 2;
                        cavfVar6.d = currentTimeMillis2;
                        cavaVar.a(str5, (cavf) v.Q());
                        cauuVar.l(str3, (cavc) cavaVar.Q());
                        return (cauz) cauuVar.Q();
                    }
                }, fpxh.H() ? eiid.j(new cbbj(7, eiid.j(account), eiid.j(eitj.l(str2)))) : eigb.a);
            } else {
                ((ejhf) ((ejhf) caym.a.h()).ah((char) 5828)).x("Removing newly received client request");
                p = a2.c.j(new Account(str, "com.google"), eitj.l(str2), 3);
            }
            ((enpf) enps.f(enps.g(ensi.h(p), new enqc() { // from class: caxr
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    return caym.this.d(cayl.FORCE);
                }
            }, cbew.b()), new eiho() { // from class: caxs
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    asot asotVar = caym.a;
                    String str3 = true != fpxh.L() ? null : str;
                    String str4 = str2;
                    int i5 = cbbn.a;
                    int e = cbbp.e(str4);
                    fecj v = ebfg.a.v();
                    fecj v2 = ebgd.a.v();
                    ebfm f = cbbp.f(e);
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    ebgd ebgdVar = (ebgd) v2.b;
                    f.getClass();
                    fedh fedhVar = ebgdVar.d;
                    if (!fedhVar.c()) {
                        ebgdVar.d = fecp.E(fedhVar);
                    }
                    ebgdVar.d.add(f);
                    if (!v.b.L()) {
                        v.U();
                    }
                    ebfg ebfgVar = (ebfg) v.b;
                    ebgd ebgdVar2 = (ebgd) v2.Q();
                    ebgdVar2.getClass();
                    ebfgVar.c = ebgdVar2;
                    ebfgVar.b = 1;
                    ebfg ebfgVar2 = (ebfg) v.Q();
                    if (str3 == null) {
                        buyi.v().f(ebfgVar2);
                    } else {
                        buye.v().i(ebfgVar2, str3);
                    }
                    return null;
                }
            }, cbew.b())).v(fpxh.b(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            ((ejhf) ((ejhf) ((ejhf) b.i()).s(e)).ah((char) 5860)).x("Failed to add new client request");
        }
    }

    private static void d(Intent intent) {
        eiid i = eiid.i((NoticeAckedUpdateRequest) arxd.b(intent, "com.google.android.gms.locationsharingreporter.service.reporting.periodic.NOTICE_UPDATE_REQUEST", NoticeAckedUpdateRequest.CREATOR));
        eiid i2 = eiid.i(intent.getStringExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACCOUNT_NAME"));
        eiid i3 = eiid.i(intent.getStringExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.CALLING_PACKAGE"));
        if (!i.h() || !i2.h() || !i3.h()) {
            ((ejhf) ((ejhf) b.j()).ah((char) 5861)).x("Received notice update request with incomplete information, ignoring it");
            return;
        }
        try {
            caym.a().b((String) i2.c(), (NoticeAckedUpdateRequest) i.c()).get(fpxh.a.a().h(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            ((ejhf) ((ejhf) ((ejhf) b.i()).s(e)).ah((char) 5863)).x("Failed to handle notice update request");
        }
    }

    private static void e(Intent intent) {
        eiid i = eiid.i(intent.getStringExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACCOUNT_NAME"));
        if (!i.h()) {
            ((ejhf) ((ejhf) b.j()).ah((char) 5866)).x("Received refresh reporting state request with incomplete information, ignoring it");
            return;
        }
        try {
            ((enpf) caym.a().c((String) i.c())).v(fpxh.k(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            ((ejhf) ((ejhf) ((ejhf) b.i()).s(e)).ah((char) 5865)).x("Failed to refresh reporting state for account");
        }
    }

    private static void f(Intent intent) {
        eiid i = eiid.i((StartLocationReportingRequest) arxd.b(intent, "com.google.android.gms.locationsharingreporter.service.reporting.periodic.START_REPORTING_REQUEST", StartLocationReportingRequest.CREATOR));
        eiid i2 = eiid.i(intent.getStringExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACCOUNT_NAME"));
        eiid i3 = eiid.i(intent.getStringExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.CALLING_PACKAGE"));
        if (!i.h() || !i2.h() || !i3.h()) {
            ((ejhf) ((ejhf) b.j()).ah((char) 5867)).x("Received start reporting request with incomplete information, ignoring it");
            return;
        }
        try {
            final caym a2 = caym.a();
            final String str = (String) i2.c();
            final StartLocationReportingRequest startLocationReportingRequest = (StartLocationReportingRequest) i.c();
            ((ejhf) ((ejhf) caym.a.h()).ah((char) 5829)).x("Adding new start reporting request");
            ((enpf) enps.g(ensi.h(enps.g(ensi.h(a2.b(str, startLocationReportingRequest.e)), new enqc() { // from class: caxl
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    return caym.this.c.o(new Account(str, "com.google"), startLocationReportingRequest);
                }
            }, cbew.a())), new enqc() { // from class: caxq
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    return caym.this.d(cayl.FORCE);
                }
            }, cbew.b())).v(fpxh.b(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            ((ejhf) ((ejhf) ((ejhf) b.i()).s(e)).ah((char) 5869)).x("Failed to add new start reporting request");
        }
    }

    private static void g(Intent intent) {
        enss p;
        eiid i = eiid.i((StopLocationReportingRequest) arxd.b(intent, "com.google.android.gms.locationsharingreporter.service.reporting.periodic.STOP_REPORTING_REQUEST", StopLocationReportingRequest.CREATOR));
        eiid i2 = eiid.i(intent.getStringExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACCOUNT_NAME"));
        eiid i3 = eiid.i(intent.getStringExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.CALLING_PACKAGE"));
        if (!i.h() || !i2.h() || !i3.h()) {
            ((ejhf) ((ejhf) b.j()).ah((char) 5870)).x("Received stop reporting request with incomplete information, ignoring it");
            return;
        }
        try {
            final caym a2 = caym.a();
            final String str = (String) i2.c();
            eiid i4 = eiid.i(((StopLocationReportingRequest) i.c()).a);
            if (i4.h()) {
                cbbk cbbkVar = a2.c;
                final Account account = new Account(str, "com.google");
                final LocationShare locationShare = (LocationShare) i4.c();
                p = cbbkVar.p(new eiho() { // from class: cbai
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        int a3;
                        cauz cauzVar = (cauz) obj;
                        asot asotVar = cbbk.a;
                        Map unmodifiableMap = DesugarCollections.unmodifiableMap(cauzVar.d);
                        Account account2 = account;
                        cauq cauqVar = (cauq) unmodifiableMap.get(account2.name);
                        if (cauqVar == null || (a3 = caup.a(cauqVar.d)) == 0 || a3 != 3) {
                            return cauzVar;
                        }
                        caug a4 = cbbm.a(locationShare);
                        caug caugVar = cauqVar.e;
                        if (caugVar == null) {
                            caugVar = caug.a;
                        }
                        if (!caugVar.equals(a4)) {
                            return cauzVar;
                        }
                        fecj fecjVar = (fecj) cauzVar.iB(5, null);
                        fecjVar.X(cauzVar);
                        cauu cauuVar = (cauu) fecjVar;
                        cauuVar.m(account2.name);
                        return (cauz) cauuVar.Q();
                    }
                }, eigb.a);
            } else {
                p = ensm.a;
            }
            ((enpf) enps.g(ensi.h(p), new enqc() { // from class: cayd
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    return caym.this.c(str);
                }
            }, cbew.b())).v(fpxh.a.a().i(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            ((ejhf) ((ejhf) ((ejhf) b.i()).s(e)).ah((char) 5872)).x("Failed to handle stop reporting request");
        }
    }

    private static void h() {
        try {
            ((enpf) caym.a().h()).v(fpxh.l(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            ((ejhf) ((ejhf) ((ejhf) b.i()).s(e)).ah((char) 5876)).x("Failed to stop periodic location reporting");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        caxj caxjVar;
        if (!fpxh.E()) {
            h();
            return;
        }
        if (intent == null) {
            ((ejhf) ((ejhf) b.j()).ah((char) 5875)).x("Received null intent, ignoring it");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            ((ejhf) ((ejhf) b.j()).ah((char) 5874)).x("Received intent with null action");
            return;
        }
        switch (action.hashCode()) {
            case -2143973058:
                if (action.equals("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACTION_STOP_REPORTING_REQUEST")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1656076871:
                if (action.equals("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACTION_NEW_PERIODIC_UPLOAD_REQUEST")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1178983519:
                if (action.equals("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACTION_UPDATE_NOTICE_REQUEST")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -877291595:
                if (action.equals("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACTION_GEOFENCE_TRIGGERED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 870098519:
                if (action.equals("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACTION_REFRESH_REPORTING_STATE_FOR_ACCOUNT")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 935438309:
                if (action.equals("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACTION_NEW_START_REPORTING_REQUEST")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1910982316:
                if (action.equals("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACTION_PERIODIC_LOCATION_UPDATE")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                c(intent);
                return;
            case 1:
                f(intent);
                return;
            case 2:
                g(intent);
                return;
            case 3:
                cayn a2 = cayn.a();
                if (LocationResult.d(intent)) {
                    eiid i = eiid.i(LocationResult.c(intent));
                    eiid i2 = i.h() ? eiid.i(((LocationResult) i.c()).a()) : eigb.a;
                    if (!i2.h()) {
                        ((ejhf) ((ejhf) cayn.a.j()).ah((char) 5851)).x("Skipping upload, location result has no locations");
                        return;
                    }
                    cayn.e();
                    if (!fpxh.u()) {
                        a2.b.a((Location) i2.c(), eits.k(a2.c));
                        return;
                    }
                    Location location = (Location) i2.c();
                    eiid c2 = a2.c();
                    if (a2.f(location)) {
                        ((ejhf) ((ejhf) cayn.a.h()).ah((char) 5850)).x("Received in the callback location is accurate enough, uploading it");
                        cbbn.l(3);
                        a2.b.a(location, eits.k(a2.c));
                        return;
                    }
                    asot asotVar = cayn.a;
                    ((ejhf) ((ejhf) asotVar.h()).ah((char) 5847)).x("Received in the callback location isn't accurate enough");
                    cbbn.l(2);
                    eiid b2 = a2.b(c2);
                    if (!b2.h()) {
                        cbbn.l(8);
                        ((ejhf) ((ejhf) asotVar.h()).ah((char) 5848)).x("Failed to get accurate enough location, not uploading anything");
                        return;
                    } else {
                        ((ejhf) ((ejhf) asotVar.h()).ah((char) 5849)).x("Obtained more accurate location, uploading it");
                        Location location2 = (Location) b2.c();
                        cbbn.l(true != a2.f(location2) ? 4 : 5);
                        a2.b.a(location2, eits.k(a2.c));
                        return;
                    }
                }
                return;
            case 4:
                if (fpxh.y()) {
                    synchronized (caxj.a) {
                        if (caxj.b == null) {
                            caxj.b = new caxj();
                        }
                        caxjVar = caxj.b;
                    }
                    intent.getStringExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACCOUNT_NAME");
                    caxjVar.a();
                    return;
                }
                return;
            case 5:
                e(intent);
                return;
            case 6:
                d(intent);
                return;
            default:
                ((ejhf) ((ejhf) b.j()).ah((char) 5873)).B("Received intent with unknown action: %s", action);
                return;
        }
    }
}

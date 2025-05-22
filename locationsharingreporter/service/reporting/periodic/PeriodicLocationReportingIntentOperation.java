package com.google.android.gms.locationsharingreporter.service.reporting.periodic;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.locationsharingreporter.AppContextProvider;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.locationsharingreporter.LocationShare;
import com.google.android.gms.locationsharingreporter.NoticeAckedUpdateRequest;
import com.google.android.gms.locationsharingreporter.PeriodicLocationUploadRequest;
import com.google.android.gms.locationsharingreporter.StartLocationReportingRequest;
import com.google.android.gms.locationsharingreporter.StopLocationReportingRequest;
import defpackage.atzs;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cdgc;
import defpackage.cdhh;
import defpackage.cdhi;
import defpackage.cdkb;
import defpackage.cdkc;
import defpackage.cdkf;
import defpackage.cdno;
import defpackage.ektg;
import defpackage.ekut;
import defpackage.ekvi;
import defpackage.ekvl;
import defpackage.elgo;
import defpackage.elgx;
import defpackage.eluo;
import defpackage.eqcy;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqgb;
import defpackage.eqgf;
import defpackage.eqgl;
import defpackage.fsrb;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class PeriodicLocationReportingIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final ausn b = ausn.b("LSR", auid.LOCATION_SHARING_REPORTER);

    public static PendingIntent a(String str) {
        Intent intent = new Intent("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACTION_GEOFENCE_TRIGGERED");
        intent.setComponent(d());
        intent.putExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACCOUNT_NAME", str);
        intent.setData(Uri.fromParts("mailto", str, "com.google"));
        PendingIntent pendingIntent = IntentOperation.getPendingIntent(AppContextProvider.a(), PeriodicLocationReportingIntentOperation.class, intent, 0, 134217728, true);
        ekvl.y(pendingIntent);
        return pendingIntent;
    }

    public static PendingIntent b() {
        Intent intent = new Intent("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACTION_PERIODIC_LOCATION_UPDATE");
        intent.setComponent(d());
        PendingIntent pendingIntent = IntentOperation.getPendingIntent(AppContextProvider.a(), PeriodicLocationReportingIntentOperation.class, intent, 0, 134217728);
        ekvl.y(pendingIntent);
        return pendingIntent;
    }

    public static Intent c(Account account) {
        Intent startIntent = IntentOperation.getStartIntent(AppContextProvider.a(), PeriodicLocationReportingIntentOperation.class, "com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACTION_REFRESH_REPORTING_STATE_FOR_ACCOUNT");
        ekvl.y(startIntent);
        startIntent.putExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACCOUNT_NAME", account.name);
        return startIntent;
    }

    private static ComponentName d() {
        return new ComponentName(AppContextProvider.a(), "com.google.android.gms.locationsharingreporter.service.reporting.periodic.PeriodicLocationReportingIntentOperation");
    }

    private static void e(Intent intent) {
        eqgl p;
        ekvi i = ekvi.i((PeriodicLocationUploadRequest) atzs.b(intent, "com.google.android.gms.locationsharingreporter.service.reporting.periodic.UPLOAD_REQUEST", PeriodicLocationUploadRequest.CREATOR));
        ekvi i2 = ekvi.i(intent.getStringExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACCOUNT_NAME"));
        ekvi i3 = ekvi.i(intent.getStringExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.CALLING_PACKAGE"));
        final ekvi i4 = ekvi.i(intent.getStringExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ATTRIBUTION_TAG"));
        if (!i.h() || !i2.h() || !i3.h()) {
            ((eluo) ((eluo) b.j()).ai((char) 5877)).x("Received upload request with incomplete information, ignoring it");
            return;
        }
        try {
            final cdhh a2 = cdhh.a();
            final String str = (String) i2.c();
            final String str2 = (String) i3.c();
            final PeriodicLocationUploadRequest periodicLocationUploadRequest = (PeriodicLocationUploadRequest) i.c();
            fsrb fsrbVar = fsrb.a;
            if (!fsrbVar.lK().ar() || periodicLocationUploadRequest.d >= fsrbVar.lK().t()) {
                ((eluo) ((eluo) cdhh.a.h()).ai((char) 5846)).x("Adding new client request");
                cdkc cdkcVar = a2.c;
                final Account account = new Account(str, "com.google");
                p = cdkcVar.p(new ekut() { // from class: cdjx
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        cddp cddpVar = (cddp) obj;
                        Map unmodifiableMap = DesugarCollections.unmodifiableMap(cddpVar.c);
                        Account account2 = account;
                        cdds cddsVar = (cdds) unmodifiableMap.get(account2.name);
                        if (cddsVar == null) {
                            cddsVar = cdds.a;
                        }
                        PeriodicLocationUploadRequest periodicLocationUploadRequest2 = periodicLocationUploadRequest;
                        fgrc fgrcVar = (fgrc) cddpVar.iQ(5, null);
                        fgrcVar.X(cddpVar);
                        cddk cddkVar = (cddk) fgrcVar;
                        String str3 = account2.name;
                        fgrc fgrcVar2 = (fgrc) cddsVar.iQ(5, null);
                        fgrcVar2.X(cddsVar);
                        cddq cddqVar = (cddq) fgrcVar2;
                        String str4 = account2.name;
                        fgrc v = cddv.a.v();
                        cddd c = cdke.c(periodicLocationUploadRequest2);
                        if (!v.b.L()) {
                            v.U();
                        }
                        fgri fgriVar = v.b;
                        cddv cddvVar = (cddv) fgriVar;
                        c.getClass();
                        cddvVar.e = c;
                        cddvVar.b |= 4;
                        if (!fgriVar.L()) {
                            v.U();
                        }
                        fgri fgriVar2 = v.b;
                        cddv cddvVar2 = (cddv) fgriVar2;
                        str4.getClass();
                        cddvVar2.b |= 8;
                        cddvVar2.f = str4;
                        if (!fgriVar2.L()) {
                            v.U();
                        }
                        ekvi ekviVar = i4;
                        String str5 = str2;
                        cddv cddvVar3 = (cddv) v.b;
                        cddvVar3.b |= 16;
                        cddvVar3.g = str5;
                        if (ekviVar.h()) {
                            String str6 = (String) ekviVar.c();
                            if (!v.b.L()) {
                                v.U();
                            }
                            cddv cddvVar4 = (cddv) v.b;
                            cddvVar4.b |= 64;
                            cddvVar4.i = str6;
                        }
                        long j = periodicLocationUploadRequest2.d;
                        if (j != 0) {
                            long currentTimeMillis = System.currentTimeMillis() + j;
                            if (!v.b.L()) {
                                v.U();
                            }
                            cddv cddvVar5 = (cddv) v.b;
                            cddvVar5.b |= 1;
                            cddvVar5.c = currentTimeMillis;
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (!v.b.L()) {
                            v.U();
                        }
                        cddv cddvVar6 = (cddv) v.b;
                        cddvVar6.b |= 2;
                        cddvVar6.d = currentTimeMillis2;
                        cddqVar.a(str5, (cddv) v.Q());
                        cddkVar.l(str3, (cdds) cddqVar.Q());
                        return (cddp) cddkVar.Q();
                    }
                }, fsrb.F() ? ekvi.j(new cdkb(7, ekvi.j(account), ekvi.j(elgo.l(str2)))) : ektg.a);
            } else {
                ((eluo) ((eluo) cdhh.a.h()).ai((char) 5847)).x("Removing newly received client request");
                p = a2.c.j(new Account(str, "com.google"), elgo.l(str2), 3);
            }
            ((eqcy) eqdl.f(eqdl.g(eqgb.h(p), new eqdv() { // from class: cdgs
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    return cdhh.this.d(cdhg.FORCE);
                }
            }, cdno.b()), new ekut() { // from class: cdgt
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    ausn ausnVar = cdhh.a;
                    String str3 = true != fsrb.J() ? null : str;
                    String str4 = str2;
                    int i5 = cdkf.a;
                    int e = cdkh.e(str4);
                    fgrc v = edrt.a.v();
                    fgrc v2 = edsq.a.v();
                    edrz f = cdkh.f(e);
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    edsq edsqVar = (edsq) v2.b;
                    f.getClass();
                    fgsa fgsaVar = edsqVar.d;
                    if (!fgsaVar.c()) {
                        edsqVar.d = fgri.E(fgsaVar);
                    }
                    edsqVar.d.add(f);
                    if (!v.b.L()) {
                        v.U();
                    }
                    edrt edrtVar = (edrt) v.b;
                    edsq edsqVar2 = (edsq) v2.Q();
                    edsqVar2.getClass();
                    edrtVar.c = edsqVar2;
                    edrtVar.b = 1;
                    edrt edrtVar2 = (edrt) v.Q();
                    if (str3 == null) {
                        bxgk.v().f(edrtVar2);
                    } else {
                        bxgg.v().i(edrtVar2, str3);
                    }
                    return null;
                }
            }, cdno.b())).v(fsrb.b(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            ((eluo) ((eluo) ((eluo) b.i()).s(e)).ai((char) 5879)).x("Failed to add new client request");
        }
    }

    private static void f(Intent intent) {
        ekvi i = ekvi.i((NoticeAckedUpdateRequest) atzs.b(intent, "com.google.android.gms.locationsharingreporter.service.reporting.periodic.NOTICE_UPDATE_REQUEST", NoticeAckedUpdateRequest.CREATOR));
        ekvi i2 = ekvi.i(intent.getStringExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACCOUNT_NAME"));
        ekvi i3 = ekvi.i(intent.getStringExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.CALLING_PACKAGE"));
        if (!i.h() || !i2.h() || !i3.h()) {
            ((eluo) ((eluo) b.j()).ai((char) 5880)).x("Received notice update request with incomplete information, ignoring it");
            return;
        }
        try {
            cdhh.a().b((String) i2.c(), (NoticeAckedUpdateRequest) i.c()).get(fsrb.a.lK().i(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            ((eluo) ((eluo) ((eluo) b.i()).s(e)).ai((char) 5882)).x("Failed to handle notice update request");
        }
    }

    private static void g(Intent intent) {
        ekvi i = ekvi.i(intent.getStringExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACCOUNT_NAME"));
        if (!i.h()) {
            ((eluo) ((eluo) b.j()).ai((char) 5885)).x("Received refresh reporting state request with incomplete information, ignoring it");
            return;
        }
        try {
            ((eqcy) cdhh.a().c((String) i.c())).v(fsrb.l(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            ((eluo) ((eluo) ((eluo) b.i()).s(e)).ai((char) 5884)).x("Failed to refresh reporting state for account");
        }
    }

    private static void h(Intent intent) {
        ekvi i = ekvi.i((StartLocationReportingRequest) atzs.b(intent, "com.google.android.gms.locationsharingreporter.service.reporting.periodic.START_REPORTING_REQUEST", StartLocationReportingRequest.CREATOR));
        ekvi i2 = ekvi.i(intent.getStringExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACCOUNT_NAME"));
        ekvi i3 = ekvi.i(intent.getStringExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.CALLING_PACKAGE"));
        if (!i.h() || !i2.h() || !i3.h()) {
            ((eluo) ((eluo) b.j()).ai((char) 5886)).x("Received start reporting request with incomplete information, ignoring it");
            return;
        }
        try {
            final cdhh a2 = cdhh.a();
            final String str = (String) i2.c();
            final StartLocationReportingRequest startLocationReportingRequest = (StartLocationReportingRequest) i.c();
            ((eluo) ((eluo) cdhh.a.h()).ai((char) 5848)).x("Adding new start reporting request");
            ((eqcy) eqdl.g(eqgb.h(eqdl.g(eqgb.h(a2.b(str, startLocationReportingRequest.e)), new eqdv() { // from class: cdgl
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    return cdhh.this.c.o(new Account(str, "com.google"), startLocationReportingRequest);
                }
            }, cdno.a())), new eqdv() { // from class: cdgr
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    return cdhh.this.d(cdhg.FORCE);
                }
            }, cdno.b())).v(fsrb.b(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            ((eluo) ((eluo) ((eluo) b.i()).s(e)).ai((char) 5888)).x("Failed to add new start reporting request");
        }
    }

    private static void i(Intent intent) {
        eqgl p;
        ekvi i = ekvi.i((StopLocationReportingRequest) atzs.b(intent, "com.google.android.gms.locationsharingreporter.service.reporting.periodic.STOP_REPORTING_REQUEST", StopLocationReportingRequest.CREATOR));
        ekvi i2 = ekvi.i(intent.getStringExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACCOUNT_NAME"));
        ekvi i3 = ekvi.i(intent.getStringExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.CALLING_PACKAGE"));
        if (!i.h() || !i2.h() || !i3.h()) {
            ((eluo) ((eluo) b.j()).ai((char) 5889)).x("Received stop reporting request with incomplete information, ignoring it");
            return;
        }
        try {
            final cdhh a2 = cdhh.a();
            final String str = (String) i2.c();
            ekvi i4 = ekvi.i(((StopLocationReportingRequest) i.c()).a);
            if (i4.h()) {
                cdkc cdkcVar = a2.c;
                final Account account = new Account(str, "com.google");
                final LocationShare locationShare = (LocationShare) i4.c();
                p = cdkcVar.p(new ekut() { // from class: cdjc
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        int a3;
                        cddp cddpVar = (cddp) obj;
                        ausn ausnVar = cdkc.a;
                        Map unmodifiableMap = DesugarCollections.unmodifiableMap(cddpVar.d);
                        Account account2 = account;
                        cddg cddgVar = (cddg) unmodifiableMap.get(account2.name);
                        if (cddgVar == null || (a3 = cddf.a(cddgVar.d)) == 0 || a3 != 3) {
                            return cddpVar;
                        }
                        cdcw a4 = cdke.a(locationShare);
                        cdcw cdcwVar = cddgVar.e;
                        if (cdcwVar == null) {
                            cdcwVar = cdcw.a;
                        }
                        if (!cdcwVar.equals(a4)) {
                            return cddpVar;
                        }
                        fgrc fgrcVar = (fgrc) cddpVar.iQ(5, null);
                        fgrcVar.X(cddpVar);
                        cddk cddkVar = (cddk) fgrcVar;
                        cddkVar.m(account2.name);
                        return (cddp) cddkVar.Q();
                    }
                }, ektg.a);
            } else {
                p = eqgf.a;
            }
            ((eqcy) eqdl.g(eqgb.h(p), new eqdv() { // from class: cdgz
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    return cdhh.this.c(str);
                }
            }, cdno.b())).v(fsrb.a.lK().j(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            ((eluo) ((eluo) ((eluo) b.i()).s(e)).ai((char) 5891)).x("Failed to handle stop reporting request");
        }
    }

    private static void j() {
        try {
            ((eqcy) cdhh.a().h()).v(fsrb.m(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            ((eluo) ((eluo) ((eluo) b.i()).s(e)).ai((char) 5895)).x("Failed to stop periodic location reporting");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        if (!fsrb.D()) {
            j();
        }
        if (intent == null) {
            ((eluo) ((eluo) b.j()).ai((char) 5894)).x("Received null intent, ignoring it");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            ((eluo) ((eluo) b.j()).ai((char) 5893)).x("Received intent with null action");
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
                e(intent);
                break;
            case 1:
                h(intent);
                break;
            case 2:
                i(intent);
                break;
            case 3:
                cdhi a2 = cdhi.a();
                if (LocationResult.d(intent)) {
                    ekvi i = ekvi.i(LocationResult.c(intent));
                    ekvi i2 = i.h() ? ekvi.i(((LocationResult) i.c()).a()) : ektg.a;
                    if (!i2.h()) {
                        ((eluo) ((eluo) cdhi.a.j()).ai((char) 5870)).x("Skipping upload, location result has no locations");
                        break;
                    } else {
                        cdhi.e();
                        if (!fsrb.u()) {
                            a2.b.a((Location) i2.c(), elgx.k(a2.c));
                            break;
                        } else {
                            Location location = (Location) i2.c();
                            ekvi c2 = a2.c();
                            if (!a2.f(location)) {
                                ausn ausnVar = cdhi.a;
                                ((eluo) ((eluo) ausnVar.h()).ai((char) 5866)).x("Received in the callback location isn't accurate enough");
                                cdkf.l(2);
                                ekvi b2 = a2.b(c2);
                                if (!b2.h()) {
                                    cdkf.l(8);
                                    ((eluo) ((eluo) ausnVar.h()).ai((char) 5867)).x("Failed to get accurate enough location, not uploading anything");
                                    break;
                                } else {
                                    ((eluo) ((eluo) ausnVar.h()).ai((char) 5868)).x("Obtained more accurate location, uploading it");
                                    Location location2 = (Location) b2.c();
                                    cdkf.l(true != a2.f(location2) ? 4 : 5);
                                    a2.b.a(location2, elgx.k(a2.c));
                                    break;
                                }
                            } else {
                                ((eluo) ((eluo) cdhi.a.h()).ai((char) 5869)).x("Received in the callback location is accurate enough, uploading it");
                                cdkf.l(3);
                                a2.b.a(location, elgx.k(a2.c));
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                if (fsrb.y()) {
                    cdgc b3 = cdgc.b();
                    intent.getStringExtra("com.google.android.gms.locationsharingreporter.service.reporting.periodic.ACCOUNT_NAME");
                    b3.e();
                    break;
                }
                break;
            case 5:
                g(intent);
                break;
            case 6:
                f(intent);
                break;
            default:
                ((eluo) ((eluo) b.j()).ai((char) 5892)).B("Received intent with unknown action: %s", action);
                break;
        }
    }
}

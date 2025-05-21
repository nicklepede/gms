package com.google.android.gms.semanticlocationhistory.service;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.semanticlocation.PlaceEnterEvent;
import com.google.android.gms.semanticlocation.PlaceExitEvent;
import com.google.android.gms.semanticlocation.SemanticLocationEvent;
import com.google.android.gms.semanticlocation.SemanticLocationState;
import com.google.android.gms.semanticlocationhistory.db.backup.OdlhBackupService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.batchactivity.CyclingProcessingService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.historicalbusyness.HistoricalBusynessProcessingService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.historicalbusyness.TransientHistoricalBusynessProcessingService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.storevisits.StoreVisitsProcessingService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.uploads.BatchDeidentifiedDataUploadService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.wifi.WifiPlaceVisitProcessingService;
import com.google.android.gms.semanticlocationhistory.edit.EditUploadJob;
import com.google.android.gms.semanticlocationhistory.federated.BrellaFrequentInvocationService;
import com.google.android.gms.semanticlocationhistory.federated.BrellaInvocationService;
import com.google.android.gms.semanticlocationhistory.federated.FederatedJobHistoryService;
import com.google.android.gms.semanticlocationhistory.federated.FederatedScheduleService;
import com.google.android.gms.semanticlocationhistory.federated.FederatedTaskIdentityDataService;
import com.google.android.gms.semanticlocationhistory.federated.regionfetcher.RegionMddDownloadScheduleService;
import com.google.android.gms.semanticlocationhistory.federated.regionfetcher.RegionMddMaintenanceService;
import com.google.android.gms.semanticlocationhistory.pulp.PulpInferenceService;
import com.google.android.gms.semanticlocationhistory.pulp.PulpMddDownloadScheduleService;
import com.google.android.gms.semanticlocationhistory.pulp.PulpMddMaintenanceService;
import com.google.android.gms.semanticlocationhistory.reinference.PassiveWifiReinferenceService;
import com.google.android.gms.semanticlocationhistory.service.SemanticLocationHistoryIntentOperation;
import com.google.android.gms.semanticlocationhistory.topplace.TopPlaceProcessingService;
import defpackage.asej;
import defpackage.asot;
import defpackage.bwth;
import defpackage.byjl;
import defpackage.czix;
import defpackage.cziy;
import defpackage.czje;
import defpackage.czlk;
import defpackage.czwq;
import defpackage.dahq;
import defpackage.daht;
import defpackage.damo;
import defpackage.dbbd;
import defpackage.dbeq;
import defpackage.dbev;
import defpackage.dbew;
import defpackage.dbez;
import defpackage.dfaq;
import defpackage.dfbl;
import defpackage.doci;
import defpackage.dxkm;
import defpackage.eiho;
import defpackage.eiig;
import defpackage.ejgq;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensa;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.ensm;
import defpackage.enss;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fefi;
import defpackage.fegx;
import defpackage.frxn;
import defpackage.vks;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SemanticLocationHistoryIntentOperation extends IntentOperation {
    public static final asot a = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "IntentOperation");
    private daht b;
    private dbeq c;
    private dahq d;
    private czje e;
    private czlk f;

    private final void f(final Context context) {
        ensi h = ensi.h(c().b());
        enqc enqcVar = new enqc() { // from class: dber
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                final SemanticLocationHistoryIntentOperation semanticLocationHistoryIntentOperation = SemanticLocationHistoryIntentOperation.this;
                String str = (String) obj;
                eitj c = czlp.c(context, semanticLocationHistoryIntentOperation.b());
                if (c.isEmpty()) {
                    return semanticLocationHistoryIntentOperation.e(str);
                }
                if (!str.isEmpty() && c.contains(new Account(str, "com.google"))) {
                    return ensm.a;
                }
                final String str2 = ((Account) c.get(0)).name;
                ensi h2 = ensi.h(semanticLocationHistoryIntentOperation.e(str));
                enqc enqcVar2 = new enqc() { // from class: dbet
                    @Override // defpackage.enqc
                    public final enss a(Object obj2) {
                        return SemanticLocationHistoryIntentOperation.this.c().f(str2);
                    }
                };
                enre enreVar = enre.a;
                return enps.g(enps.g(h2, enqcVar2, enreVar), new enqc() { // from class: dbeu
                    @Override // defpackage.enqc
                    public final enss a(Object obj2) {
                        String str3 = str2;
                        return str3.isEmpty() ? ensm.a : doci.b(SemanticLocationHistoryIntentOperation.this.d().c(str3));
                    }
                }, enreVar);
            }
        };
        enre enreVar = enre.a;
        ensj.t(enps.g(h, enqcVar, enreVar), new dbev(this), enreVar);
    }

    public final czje a() {
        if (this.e == null) {
            this.e = new czje();
        }
        return this.e;
    }

    public final czlk b() {
        if (this.f == null) {
            this.f = new czlk(a());
        }
        return this.f;
    }

    public final dahq c() {
        if (this.d == null) {
            this.d = new dahq();
        }
        return this.d;
    }

    public final dbeq d() {
        if (this.c == null) {
            this.c = new dbeq(AppContextProvider.a());
        }
        return this.c;
    }

    public final enss e(String str) {
        dfaq b;
        if (str.isEmpty()) {
            return ensm.a;
        }
        dbeq d = d();
        if (str.isEmpty()) {
            d.b.e("CurrentSemanticLocationUnregisterFailedEmptyAccount");
            b = dfbl.b();
        } else {
            PendingIntent a2 = d.a();
            if (a2 == null) {
                b = dfbl.b();
            } else {
                ((ejhf) ((ejhf) dbeq.a.h()).ah((char) 10584)).x("Unregistering for CSL.");
                b = d.b(str).b(a2);
            }
        }
        return enps.g(doci.b(b), new enqc() { // from class: dbes
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                enss b2;
                dxkm dxkmVar = SemanticLocationHistoryIntentOperation.this.c().b;
                synchronized (dxkmVar) {
                    b2 = dxkmVar.b(new eiho() { // from class: dage
                        @Override // defpackage.eiho
                        public final Object apply(Object obj2) {
                            dbas dbasVar = (dbas) obj2;
                            asot asotVar = dahq.a;
                            fecj fecjVar = (fecj) dbasVar.iB(5, null);
                            fecjVar.X(dbasVar);
                            dbao dbaoVar = (dbao) fecjVar;
                            if (!dbaoVar.b.L()) {
                                dbaoVar.U();
                            }
                            dbas dbasVar2 = (dbas) dbaoVar.b;
                            dbas dbasVar3 = dbas.a;
                            dbasVar2.b &= -17;
                            dbasVar2.i = dbas.a.i;
                            return (dbas) dbaoVar.Q();
                        }
                    }, enre.a);
                }
                return b2;
            }
        }, enre.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        int i;
        char c2;
        enre enreVar;
        enss f;
        enss g;
        enre enreVar2;
        enss b;
        if (!frxn.Q()) {
            ((ejhf) ((ejhf) a.h()).ah((char) 10601)).x("Module is disabled");
            return;
        }
        if (!czix.a()) {
            ((ejhf) ((ejhf) a.h()).ah((char) 10600)).x("Unsupported form factor");
            return;
        }
        if (intent.getAction() == null) {
            ((ejhf) ((ejhf) a.j()).ah((char) 10599)).x("Invalid intent");
            return;
        }
        asot asotVar = a;
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 10592)).B("Handling action %s", intent.getAction());
        String action = intent.getAction();
        eiig.x(action);
        int i2 = 1;
        switch (action.hashCode()) {
            case -1239299127:
                if (action.equals("com.google.android.gms.location.reporting.SETTINGS_CHANGED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1184851779:
                if (action.equals("android.location.PROVIDERS_CHANGED")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -544318258:
                if (action.equals("com.google.android.gms.phenotype.COMMITTED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -511271086:
                if (action.equals("android.location.MODE_CHANGED")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -326905577:
                if (action.equals("com.google.android.gms.semanticlocationhistory.service.CSL_FEED")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -177095062:
                if (action.equals("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            Context a2 = AppContextProvider.a();
            if (bwth.q(this)) {
                ((ejhf) ((ejhf) asotVar.h()).ah((char) 10595)).x("Device settings changed to ENABLED. Scheduling periodic tasks.");
                dbez.a(a2);
                return;
            }
            ((ejhf) ((ejhf) asotVar.h()).ah((char) 10594)).x("Device settings changed to DISABLED. Cancelling periodic tasks.");
            cziy.a(a2, StoreVisitsProcessingService.a, "StoreVisitsProcessing");
            cziy.a(a2, WifiPlaceVisitProcessingService.a, "WifiPlaceVisit");
            cziy.a(a2, BatchDeidentifiedDataUploadService.a, "BatchDeidentifiedDataUpload");
            cziy.a(a2, OdlhBackupService.a, "OdlhBackup");
            cziy.a(a2, EditUploadJob.a, "EditUploadJob");
            asot asotVar2 = PulpInferenceService.a;
            byjl.a(a2).d("PulpInference", PulpInferenceService.b);
            String str = PulpMddDownloadScheduleService.a;
            byjl.a(a2).d("PulpMddRefreshDownloadTask", PulpMddDownloadScheduleService.a);
            String str2 = PulpMddMaintenanceService.a;
            byjl.a(a2).d("PulpMddMaintenanceTask", PulpMddMaintenanceService.a);
            FederatedScheduleService.d(a2);
            FederatedTaskIdentityDataService.d(a2);
            FederatedJobHistoryService.d(a2);
            BrellaInvocationService.e(a2, true);
            BrellaInvocationService.e(a2, false);
            asot asotVar3 = HistoricalBusynessProcessingService.a;
            byjl.a(a2).d("HistoricalBusyness", HistoricalBusynessProcessingService.b);
            asot asotVar4 = TransientHistoricalBusynessProcessingService.a;
            byjl.a(a2).d("TransientHistoricalBusyness", TransientHistoricalBusynessProcessingService.b);
            String str3 = CyclingProcessingService.a;
            byjl.a(a2).d("CyclingActivity", CyclingProcessingService.a);
            asot asotVar5 = TopPlaceProcessingService.a;
            byjl.a(a2).d("TopPlaceProcessing", TopPlaceProcessingService.b);
            String str4 = PassiveWifiReinferenceService.a;
            byjl.a(a2).d("PassiveWifiReinference", PassiveWifiReinferenceService.a);
            String str5 = RegionMddDownloadScheduleService.a;
            byjl.a(a2).d("RegionMddRefreshDownloadTask", RegionMddDownloadScheduleService.a);
            String str6 = RegionMddMaintenanceService.a;
            byjl.a(a2).d("RegionMddMaintenanceTask", RegionMddMaintenanceService.a);
            BrellaFrequentInvocationService.d(a2);
            return;
        }
        if (c == 2) {
            if (!vks.c(intent).isEmpty()) {
                a().f("AccountRemovalCount", r0.size());
            }
            f(AppContextProvider.a());
            return;
        }
        if (c == 3) {
            if ("com.google.android.gms.semanticlocationhistory".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
                ((ejhf) ((ejhf) asotVar.h()).ah((char) 10596)).x("Phenotype flags changed");
                return;
            }
            return;
        }
        if (c == 4) {
            f(AppContextProvider.a());
            return;
        }
        if (c != 5) {
            ((ejhf) ((ejhf) asotVar.j()).ah((char) 10593)).B("Unexpected action %s", intent.getAction());
            return;
        }
        SemanticLocationState a3 = SemanticLocationState.a(intent);
        if (a3 != null) {
            ejgq h = asotVar.h();
            List<SemanticLocationEvent> list = a3.b;
            ((ejhf) ((ejhf) h).ah((char) 10598)).z("SemanticLocationState with %d SemanticLocationEvent(s) received.", list.size());
            if (this.b == null) {
                this.b = new daht(b(), a());
            }
            final daht dahtVar = this.b;
            final damo damoVar = new damo(dahtVar.c);
            czje czjeVar = damoVar.b;
            czjeVar.e("LiveBusynessTotalProcessingAttempts");
            final ArrayList arrayList = new ArrayList();
            for (final SemanticLocationEvent semanticLocationEvent : list) {
                czwq czwqVar = czwq.a;
                enss i3 = ensj.i(czwqVar);
                int i4 = semanticLocationEvent.c;
                if (i4 == i2) {
                    PlaceEnterEvent placeEnterEvent = semanticLocationEvent.d;
                    if (placeEnterEvent == null) {
                        czjeVar.e("LiveBusynessEmptyEnterEvents");
                        i = i2;
                        i3 = ensj.i(czwqVar);
                    } else {
                        czjeVar.k("LiveBusynessEnterEventProbabilityDist", damo.a(placeEnterEvent.b));
                        final String uuid = UUID.randomUUID().toString();
                        final long j = placeEnterEvent.d.a.a;
                        final fefi j2 = fegx.j(semanticLocationEvent.a);
                        fecj v = dbbd.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fecp fecpVar = v.b;
                        i = i2;
                        dbbd dbbdVar = (dbbd) fecpVar;
                        uuid.getClass();
                        dbbdVar.b |= 1;
                        dbbdVar.c = uuid;
                        if (!fecpVar.L()) {
                            v.U();
                        }
                        dbbd dbbdVar2 = (dbbd) v.b;
                        j2.getClass();
                        dbbdVar2.d = j2;
                        dbbdVar2.b |= 2;
                        final dbbd dbbdVar3 = (dbbd) v.Q();
                        dxkm dxkmVar = damoVar.c.b;
                        synchronized (dxkmVar) {
                            eiho eihoVar = new eiho() { // from class: dahd
                                @Override // defpackage.eiho
                                public final Object apply(Object obj) {
                                    dbas dbasVar = (dbas) obj;
                                    asot asotVar6 = dahq.a;
                                    dbbe dbbeVar = dbasVar.e;
                                    if (dbbeVar == null) {
                                        dbbeVar = dbbe.a;
                                    }
                                    dbbd dbbdVar4 = dbbdVar3;
                                    fecj fecjVar = (fecj) dbbeVar.iB(5, null);
                                    fecjVar.X(dbbeVar);
                                    dbbb dbbbVar = (dbbb) fecjVar;
                                    dbbdVar4.getClass();
                                    if (!dbbbVar.b.L()) {
                                        dbbbVar.U();
                                    }
                                    ((dbbe) dbbbVar.b).b().put(Long.valueOf(j), dbbdVar4);
                                    dbbe dbbeVar2 = (dbbe) dbbbVar.Q();
                                    fecj fecjVar2 = (fecj) dbasVar.iB(5, null);
                                    fecjVar2.X(dbasVar);
                                    dbao dbaoVar = (dbao) fecjVar2;
                                    if (!dbaoVar.b.L()) {
                                        dbaoVar.U();
                                    }
                                    dbas dbasVar2 = (dbas) dbaoVar.b;
                                    dbbeVar2.getClass();
                                    dbasVar2.e = dbbeVar2;
                                    dbasVar2.b |= 1;
                                    return (dbas) dbaoVar.Q();
                                }
                            };
                            enreVar2 = enre.a;
                            b = dxkmVar.b(eihoVar, enreVar2);
                        }
                        i3 = enps.f(ensi.h(b), new eiho() { // from class: damk
                            @Override // defpackage.eiho
                            public final Object apply(Object obj) {
                                asot asotVar6 = damo.a;
                                fecj v2 = czwq.a.v();
                                if (!v2.b.L()) {
                                    v2.U();
                                }
                                long j3 = j;
                                fecp fecpVar2 = v2.b;
                                czwq czwqVar2 = (czwq) fecpVar2;
                                czwqVar2.b |= 1;
                                czwqVar2.c = j3;
                                if (!fecpVar2.L()) {
                                    v2.U();
                                }
                                fecp fecpVar3 = v2.b;
                                czwq czwqVar3 = (czwq) fecpVar3;
                                czwqVar3.d = 1;
                                czwqVar3.b |= 2;
                                if (!fecpVar3.L()) {
                                    v2.U();
                                }
                                fefi fefiVar = j2;
                                fecp fecpVar4 = v2.b;
                                czwq czwqVar4 = (czwq) fecpVar4;
                                fefiVar.getClass();
                                czwqVar4.e = fefiVar;
                                czwqVar4.b |= 4;
                                if (!fecpVar4.L()) {
                                    v2.U();
                                }
                                String str7 = uuid;
                                czwq czwqVar5 = (czwq) v2.b;
                                str7.getClass();
                                czwqVar5.b |= 8;
                                czwqVar5.f = str7;
                                return (czwq) v2.Q();
                            }
                        }, enreVar2);
                    }
                    czjeVar.e("LiveBusynessTotalEnterEventsProcessed");
                } else {
                    i = i2;
                    if (i4 == 2) {
                        PlaceExitEvent placeExitEvent = semanticLocationEvent.e;
                        if (placeExitEvent == null) {
                            czjeVar.e("LiveBusynessEmptyExitEvents");
                            g = ensj.i(czwqVar);
                        } else {
                            final long j3 = placeExitEvent.d.a.a;
                            dxkm dxkmVar2 = damoVar.c.b;
                            synchronized (dxkmVar2) {
                                enss a4 = dxkmVar2.a();
                                eiho eihoVar2 = new eiho() { // from class: daha
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // defpackage.eiho
                                    public final Object apply(Object obj) {
                                        asot asotVar6 = dahq.a;
                                        dbbe dbbeVar = ((dbas) obj).e;
                                        if (dbbeVar == null) {
                                            dbbeVar = dbbe.a;
                                        }
                                        long j4 = j3;
                                        dbbd dbbdVar4 = dbbd.a;
                                        feea feeaVar = dbbeVar.b;
                                        Long valueOf = Long.valueOf(j4);
                                        return feeaVar.containsKey(valueOf) ? (dbbd) feeaVar.get(valueOf) : dbbdVar4;
                                    }
                                };
                                enreVar = enre.a;
                                f = enps.f(a4, eihoVar2, enreVar);
                            }
                            g = enps.g(ensi.h(f), new enqc() { // from class: daml
                                @Override // defpackage.enqc
                                public final enss a(Object obj) {
                                    enss b2;
                                    final String str7 = ((dbbd) obj).c;
                                    boolean isEmpty = str7.isEmpty();
                                    final long j4 = j3;
                                    damo damoVar2 = damo.this;
                                    if (isEmpty) {
                                        damoVar2.b.e("LiveBusynessTotalExitEventsDropped");
                                        return ensj.i(czwq.a);
                                    }
                                    final SemanticLocationEvent semanticLocationEvent2 = semanticLocationEvent;
                                    PlaceExitEvent placeExitEvent2 = semanticLocationEvent2.e;
                                    if (placeExitEvent2 != null) {
                                        damoVar2.b.k("LiveBusynessExitEventProbabilityDist", damo.a(placeExitEvent2.b));
                                    }
                                    dxkm dxkmVar3 = damoVar2.c.b;
                                    synchronized (dxkmVar3) {
                                        b2 = dxkmVar3.b(new eiho() { // from class: dagw
                                            @Override // defpackage.eiho
                                            public final Object apply(Object obj2) {
                                                dbas dbasVar = (dbas) obj2;
                                                asot asotVar6 = dahq.a;
                                                dbbe dbbeVar = dbasVar.e;
                                                if (dbbeVar == null) {
                                                    dbbeVar = dbbe.a;
                                                }
                                                long j5 = j4;
                                                fecj fecjVar = (fecj) dbbeVar.iB(5, null);
                                                fecjVar.X(dbbeVar);
                                                dbbb dbbbVar = (dbbb) fecjVar;
                                                dbbbVar.a(j5);
                                                dbbe dbbeVar2 = (dbbe) dbbbVar.Q();
                                                fecj fecjVar2 = (fecj) dbasVar.iB(5, null);
                                                fecjVar2.X(dbasVar);
                                                dbao dbaoVar = (dbao) fecjVar2;
                                                if (!dbaoVar.b.L()) {
                                                    dbaoVar.U();
                                                }
                                                dbas dbasVar2 = (dbas) dbaoVar.b;
                                                dbbeVar2.getClass();
                                                dbasVar2.e = dbbeVar2;
                                                dbasVar2.b |= 1;
                                                return (dbas) dbaoVar.Q();
                                            }
                                        }, enre.a);
                                    }
                                    return enps.f(ensi.h(b2), new eiho() { // from class: damn
                                        @Override // defpackage.eiho
                                        public final Object apply(Object obj2) {
                                            asot asotVar6 = damo.a;
                                            fecj v2 = czwq.a.v();
                                            if (!v2.b.L()) {
                                                v2.U();
                                            }
                                            long j5 = j4;
                                            fecp fecpVar2 = v2.b;
                                            czwq czwqVar2 = (czwq) fecpVar2;
                                            czwqVar2.b |= 1;
                                            czwqVar2.c = j5;
                                            if (!fecpVar2.L()) {
                                                v2.U();
                                            }
                                            SemanticLocationEvent semanticLocationEvent3 = semanticLocationEvent2;
                                            czwq czwqVar3 = (czwq) v2.b;
                                            czwqVar3.d = 2;
                                            czwqVar3.b = 2 | czwqVar3.b;
                                            fefi j6 = fegx.j(semanticLocationEvent3.a);
                                            if (!v2.b.L()) {
                                                v2.U();
                                            }
                                            fecp fecpVar3 = v2.b;
                                            czwq czwqVar4 = (czwq) fecpVar3;
                                            j6.getClass();
                                            czwqVar4.e = j6;
                                            czwqVar4.b |= 4;
                                            if (!fecpVar3.L()) {
                                                v2.U();
                                            }
                                            String str8 = str7;
                                            czwq czwqVar5 = (czwq) v2.b;
                                            str8.getClass();
                                            czwqVar5.b |= 8;
                                            czwqVar5.f = str8;
                                            return (czwq) v2.Q();
                                        }
                                    }, enre.a);
                                }
                            }, enreVar);
                        }
                        i3 = g;
                        czjeVar.e("LiveBusynessTotalExitEventsProcessed");
                    } else if (i4 == 3) {
                        czjeVar.e("LiveBusynessTotalOngoingEventsUnprocessed");
                    } else {
                        c2 = 4;
                        if (i4 == 4 || i4 == 5 || i4 == 6) {
                            czjeVar.e("LiveBusynessTotalActivityEventsUnprocessed");
                        }
                        arrayList.add(i3);
                        i2 = i;
                    }
                }
                c2 = 4;
                arrayList.add(i3);
                i2 = i;
            }
            ensa a5 = ensj.a(arrayList);
            Callable callable = new Callable() { // from class: damm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i5 = eitj.d;
                    eite eiteVar = new eite();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        try {
                            czwq czwqVar2 = (czwq) ensj.r((enss) it.next());
                            if (!czwqVar2.equals(czwq.a)) {
                                damo damoVar2 = damo.this;
                                eiteVar.i(czwqVar2);
                                damoVar2.b.e("LiveBusynessTotalOutputsAdded");
                            }
                        } catch (ExecutionException e) {
                            ((ejhf) ((ejhf) ((ejhf) damo.a.j()).s(e)).ah((char) 10286)).x("Failed to get LiveBusynessOutput.");
                        }
                    }
                    return eiteVar.g();
                }
            };
            enre enreVar3 = enre.a;
            final enss a6 = a5.a(callable, enreVar3);
            final enss b2 = dahtVar.d.b();
            enss[] enssVarArr = new enss[2];
            enssVarArr[0] = a6;
            enssVarArr[i2] = b2;
            ensj.t(ensj.b(enssVarArr).a(new Callable() { // from class: dahr
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v12 */
                /* JADX WARN: Type inference failed for: r12v16 */
                /* JADX WARN: Type inference failed for: r12v2, types: [int] */
                /* JADX WARN: Type inference failed for: r12v4 */
                /* JADX WARN: Type inference failed for: r12v5 */
                /* JADX WARN: Type inference failed for: r12v6 */
                /* JADX WARN: Type inference failed for: r12v7, types: [int] */
                /* JADX WARN: Type inference failed for: r13v1, types: [int] */
                /* JADX WARN: Type inference failed for: r13v5 */
                /* JADX WARN: Type inference failed for: r13v6 */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    boolean z;
                    boolean z2;
                    ?? r12;
                    daht dahtVar2 = daht.this;
                    enss enssVar = b2;
                    enss enssVar2 = a6;
                    boolean z3 = false;
                    try {
                        String str7 = (String) ensj.r(enssVar);
                        eitj eitjVar = (eitj) ensj.r(enssVar2);
                        czje czjeVar2 = dahtVar2.c;
                        czjeVar2.e("LiveBusynessProcessingSuccess");
                        if (eitjVar.isEmpty()) {
                            czjeVar2.e("LiveBusynessEmptyOutput");
                            return false;
                        }
                        if (str7.isEmpty()) {
                            czjeVar2.e("LiveBusynessEmptyAccountName");
                            return false;
                        }
                        Account account = new Account(str7, "com.google");
                        czlk czlkVar = dahtVar2.b;
                        if (!czlp.e(czlkVar, account)) {
                            return false;
                        }
                        if (dahtVar2.e == null) {
                            dahtVar2.e = new dann(czlkVar, czjeVar2);
                        }
                        dann dannVar = dahtVar2.e;
                        Account account2 = new Account(str7, "com.google");
                        if (dannVar.b(account2)) {
                            z2 = true;
                            if (eitjVar.isEmpty()) {
                                dannVar.a.k("DeidentifiedUploadStatus", 6);
                                z = false;
                            } else {
                                eite eiteVar = new eite();
                                int size = eitjVar.size();
                                int i5 = 0;
                                while (i5 < size) {
                                    czwq czwqVar2 = (czwq) eitjVar.get(i5);
                                    int i6 = czwqVar2.d;
                                    int a7 = czwp.a(i6);
                                    ?? r13 = a7;
                                    if (a7 == 0) {
                                        r13 = z2;
                                    }
                                    if (r13 - 1 == z2) {
                                        r12 = 2;
                                    } else {
                                        int a8 = czwp.a(i6);
                                        ?? r122 = a8;
                                        if (a8 == 0) {
                                            r122 = z2;
                                        }
                                        r12 = r122 + (-1) == 2 ? 3 : z2;
                                    }
                                    fecj v2 = etsl.a.v();
                                    if (!v2.b.L()) {
                                        v2.U();
                                    }
                                    fecp fecpVar2 = v2.b;
                                    z = z3;
                                    try {
                                        etsl etslVar = (etsl) fecpVar2;
                                        etslVar.d = r12 - 1;
                                        etslVar.b |= 2;
                                        boolean z4 = z2;
                                        eitj eitjVar2 = eitjVar;
                                        long j4 = czwqVar2.c;
                                        if (!fecpVar2.L()) {
                                            v2.U();
                                        }
                                        etsl etslVar2 = (etsl) v2.b;
                                        etslVar2.b |= z4 ? 1 : 0;
                                        etslVar2.c = j4;
                                        fefi fefiVar = czwqVar2.e;
                                        if (fefiVar == null) {
                                            fefiVar = fefi.a;
                                        }
                                        if (!v2.b.L()) {
                                            v2.U();
                                        }
                                        fecp fecpVar3 = v2.b;
                                        etsl etslVar3 = (etsl) fecpVar3;
                                        fefiVar.getClass();
                                        etslVar3.e = fefiVar;
                                        etslVar3.b |= 4;
                                        String str8 = czwqVar2.f;
                                        if (!fecpVar3.L()) {
                                            v2.U();
                                        }
                                        etsl etslVar4 = (etsl) v2.b;
                                        str8.getClass();
                                        etslVar4.b |= 8;
                                        etslVar4.f = str8;
                                        etsl etslVar5 = (etsl) v2.Q();
                                        fecj v3 = etrk.a.v();
                                        if (!v3.b.L()) {
                                            v3.U();
                                        }
                                        etrk etrkVar = (etrk) v3.b;
                                        etslVar5.getClass();
                                        etrkVar.c = etslVar5;
                                        etrkVar.b = z4 ? 1 : 0;
                                        eiteVar.i((etrk) v3.Q());
                                        i5++;
                                        eitjVar = eitjVar2;
                                        z2 = z4 ? 1 : 0;
                                        z3 = z;
                                    } catch (ExecutionException e) {
                                        e = e;
                                        ((ejhf) ((ejhf) ((ejhf) daht.a.j()).s(e)).ah((char) 10213)).x("Failed to fetch data for deidentified Live Busyness upload.");
                                        dahtVar2.c.e("LiveBusynessProcessingFailure");
                                        return Boolean.valueOf(z);
                                    }
                                }
                                z = z3;
                                z2 = dannVar.c(account2, eiteVar.g());
                            }
                        } else {
                            z = false;
                            z2 = false;
                        }
                        czjeVar2.e(z2 ? "LiveBusynessUploadSuccess" : "LiveBusynessUploadFailure");
                        return Boolean.valueOf(z2);
                    } catch (ExecutionException e2) {
                        e = e2;
                        z = false;
                    }
                }
            }, enreVar3), new dbew(this), enreVar3);
        }
    }
}

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
import defpackage.auid;
import defpackage.ausn;
import defpackage.bzbx;
import defpackage.casd;
import defpackage.dbsv;
import defpackage.dbsw;
import defpackage.dbtc;
import defpackage.dbvg;
import defpackage.dcgr;
import defpackage.dcry;
import defpackage.dcsb;
import defpackage.dcww;
import defpackage.ddll;
import defpackage.ddoy;
import defpackage.ddpd;
import defpackage.ddpe;
import defpackage.ddph;
import defpackage.dhlw;
import defpackage.dhmr;
import defpackage.dqmr;
import defpackage.dzwm;
import defpackage.ekut;
import defpackage.ekvl;
import defpackage.eltz;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqft;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgf;
import defpackage.eqgl;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgub;
import defpackage.fgvq;
import defpackage.fush;
import defpackage.xgt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SemanticLocationHistoryIntentOperation extends IntentOperation {
    public static final ausn a = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "IntentOperation");
    private dcsb b;
    private ddoy c;
    private dcry d;
    private dbtc e;
    private dbvg f;

    private final void f(final Context context) {
        eqgb h = eqgb.h(c().b());
        eqdv eqdvVar = new eqdv() { // from class: ddoz
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                final SemanticLocationHistoryIntentOperation semanticLocationHistoryIntentOperation = SemanticLocationHistoryIntentOperation.this;
                String str = (String) obj;
                elgo c = dbvl.c(context, semanticLocationHistoryIntentOperation.b());
                if (c.isEmpty()) {
                    return semanticLocationHistoryIntentOperation.e(str);
                }
                if (!str.isEmpty() && c.contains(new Account(str, "com.google"))) {
                    return eqgf.a;
                }
                final String str2 = ((Account) c.get(0)).name;
                eqgb h2 = eqgb.h(semanticLocationHistoryIntentOperation.e(str));
                eqdv eqdvVar2 = new eqdv() { // from class: ddpb
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj2) {
                        return SemanticLocationHistoryIntentOperation.this.c().f(str2);
                    }
                };
                eqex eqexVar = eqex.a;
                return eqdl.g(eqdl.g(h2, eqdvVar2, eqexVar), new eqdv() { // from class: ddpc
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj2) {
                        String str3 = str2;
                        return str3.isEmpty() ? eqgf.a : dqmr.b(SemanticLocationHistoryIntentOperation.this.d().c(str3));
                    }
                }, eqexVar);
            }
        };
        eqex eqexVar = eqex.a;
        eqgc.t(eqdl.g(h, eqdvVar, eqexVar), new ddpd(this), eqexVar);
    }

    public final dbtc a() {
        if (this.e == null) {
            this.e = new dbtc();
        }
        return this.e;
    }

    public final dbvg b() {
        if (this.f == null) {
            this.f = new dbvg(a());
        }
        return this.f;
    }

    public final dcry c() {
        if (this.d == null) {
            this.d = new dcry();
        }
        return this.d;
    }

    public final ddoy d() {
        if (this.c == null) {
            this.c = new ddoy(AppContextProvider.a());
        }
        return this.c;
    }

    public final eqgl e(String str) {
        dhlw b;
        if (str.isEmpty()) {
            return eqgf.a;
        }
        ddoy d = d();
        if (str.isEmpty()) {
            d.b.e("CurrentSemanticLocationUnregisterFailedEmptyAccount");
            b = dhmr.b();
        } else {
            PendingIntent a2 = d.a();
            if (a2 == null) {
                b = dhmr.b();
            } else {
                ((eluo) ((eluo) ddoy.a.h()).ai((char) 10590)).x("Unregistering for CSL.");
                b = d.b(str).b(a2);
            }
        }
        return eqdl.g(dqmr.b(b), new eqdv() { // from class: ddpa
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                eqgl b2;
                dzwm dzwmVar = SemanticLocationHistoryIntentOperation.this.c().b;
                synchronized (dzwmVar) {
                    b2 = dzwmVar.b(new ekut() { // from class: dcqm
                        @Override // defpackage.ekut
                        public final Object apply(Object obj2) {
                            ddla ddlaVar = (ddla) obj2;
                            ausn ausnVar = dcry.a;
                            fgrc fgrcVar = (fgrc) ddlaVar.iQ(5, null);
                            fgrcVar.X(ddlaVar);
                            ddkw ddkwVar = (ddkw) fgrcVar;
                            if (!ddkwVar.b.L()) {
                                ddkwVar.U();
                            }
                            ddla ddlaVar2 = (ddla) ddkwVar.b;
                            ddla ddlaVar3 = ddla.a;
                            ddlaVar2.b &= -17;
                            ddlaVar2.i = ddla.a.i;
                            return (ddla) ddkwVar.Q();
                        }
                    }, eqex.a);
                }
                return b2;
            }
        }, eqex.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        int i;
        char c2;
        eqex eqexVar;
        eqgl f;
        eqgl g;
        eqex eqexVar2;
        eqgl b;
        if (!fush.Q()) {
            ((eluo) ((eluo) a.h()).ai((char) 10607)).x("Module is disabled");
            return;
        }
        if (!dbsv.a()) {
            ((eluo) ((eluo) a.h()).ai((char) 10606)).x("Unsupported form factor");
            return;
        }
        if (intent.getAction() == null) {
            ((eluo) ((eluo) a.j()).ai((char) 10605)).x("Invalid intent");
            return;
        }
        ausn ausnVar = a;
        ((eluo) ((eluo) ausnVar.h()).ai((char) 10598)).B("Handling action %s", intent.getAction());
        String action = intent.getAction();
        ekvl.y(action);
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
            if (bzbx.q(this)) {
                ((eluo) ((eluo) ausnVar.h()).ai((char) 10601)).x("Device settings changed to ENABLED. Scheduling periodic tasks.");
                ddph.a(a2);
                return;
            }
            ((eluo) ((eluo) ausnVar.h()).ai((char) 10600)).x("Device settings changed to DISABLED. Cancelling periodic tasks.");
            dbsw.a(a2, StoreVisitsProcessingService.a, "StoreVisitsProcessing");
            dbsw.a(a2, WifiPlaceVisitProcessingService.a, "WifiPlaceVisit");
            dbsw.a(a2, BatchDeidentifiedDataUploadService.a, "BatchDeidentifiedDataUpload");
            dbsw.a(a2, OdlhBackupService.a, "OdlhBackup");
            dbsw.a(a2, EditUploadJob.a, "EditUploadJob");
            ausn ausnVar2 = PulpInferenceService.a;
            casd.a(a2).d("PulpInference", PulpInferenceService.b);
            String str = PulpMddDownloadScheduleService.a;
            casd.a(a2).d("PulpMddRefreshDownloadTask", PulpMddDownloadScheduleService.a);
            String str2 = PulpMddMaintenanceService.a;
            casd.a(a2).d("PulpMddMaintenanceTask", PulpMddMaintenanceService.a);
            FederatedScheduleService.d(a2);
            FederatedTaskIdentityDataService.d(a2);
            FederatedJobHistoryService.d(a2);
            BrellaInvocationService.e(a2, true);
            BrellaInvocationService.e(a2, false);
            ausn ausnVar3 = HistoricalBusynessProcessingService.a;
            casd.a(a2).d("HistoricalBusyness", HistoricalBusynessProcessingService.b);
            ausn ausnVar4 = TransientHistoricalBusynessProcessingService.a;
            casd.a(a2).d("TransientHistoricalBusyness", TransientHistoricalBusynessProcessingService.b);
            String str3 = CyclingProcessingService.a;
            casd.a(a2).d("CyclingActivity", CyclingProcessingService.a);
            ausn ausnVar5 = TopPlaceProcessingService.a;
            casd.a(a2).d("TopPlaceProcessing", TopPlaceProcessingService.b);
            String str4 = PassiveWifiReinferenceService.a;
            casd.a(a2).d("PassiveWifiReinference", PassiveWifiReinferenceService.a);
            String str5 = RegionMddDownloadScheduleService.a;
            casd.a(a2).d("RegionMddRefreshDownloadTask", RegionMddDownloadScheduleService.a);
            String str6 = RegionMddMaintenanceService.a;
            casd.a(a2).d("RegionMddMaintenanceTask", RegionMddMaintenanceService.a);
            BrellaFrequentInvocationService.d(a2);
            return;
        }
        if (c == 2) {
            if (!xgt.c(intent).isEmpty()) {
                a().f("AccountRemovalCount", r0.size());
            }
            f(AppContextProvider.a());
            return;
        }
        if (c == 3) {
            if ("com.google.android.gms.semanticlocationhistory".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
                ((eluo) ((eluo) ausnVar.h()).ai((char) 10602)).x("Phenotype flags changed");
                return;
            }
            return;
        }
        if (c == 4) {
            f(AppContextProvider.a());
            return;
        }
        if (c != 5) {
            ((eluo) ((eluo) ausnVar.j()).ai((char) 10599)).B("Unexpected action %s", intent.getAction());
            return;
        }
        SemanticLocationState a3 = SemanticLocationState.a(intent);
        if (a3 != null) {
            eltz h = ausnVar.h();
            List<SemanticLocationEvent> list = a3.b;
            ((eluo) ((eluo) h).ai((char) 10604)).z("SemanticLocationState with %d SemanticLocationEvent(s) received.", list.size());
            if (this.b == null) {
                this.b = new dcsb(b(), a());
            }
            final dcsb dcsbVar = this.b;
            final dcww dcwwVar = new dcww(dcsbVar.c);
            dbtc dbtcVar = dcwwVar.b;
            dbtcVar.e("LiveBusynessTotalProcessingAttempts");
            final ArrayList arrayList = new ArrayList();
            for (final SemanticLocationEvent semanticLocationEvent : list) {
                dcgr dcgrVar = dcgr.a;
                eqgl i3 = eqgc.i(dcgrVar);
                int i4 = semanticLocationEvent.c;
                if (i4 == i2) {
                    PlaceEnterEvent placeEnterEvent = semanticLocationEvent.d;
                    if (placeEnterEvent == null) {
                        dbtcVar.e("LiveBusynessEmptyEnterEvents");
                        i = i2;
                        i3 = eqgc.i(dcgrVar);
                    } else {
                        dbtcVar.k("LiveBusynessEnterEventProbabilityDist", dcww.a(placeEnterEvent.b));
                        final String uuid = UUID.randomUUID().toString();
                        final long j = placeEnterEvent.d.a.a;
                        final fgub j2 = fgvq.j(semanticLocationEvent.a);
                        fgrc v = ddll.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        fgri fgriVar = v.b;
                        i = i2;
                        ddll ddllVar = (ddll) fgriVar;
                        uuid.getClass();
                        ddllVar.b |= 1;
                        ddllVar.c = uuid;
                        if (!fgriVar.L()) {
                            v.U();
                        }
                        ddll ddllVar2 = (ddll) v.b;
                        j2.getClass();
                        ddllVar2.d = j2;
                        ddllVar2.b |= 2;
                        final ddll ddllVar3 = (ddll) v.Q();
                        dzwm dzwmVar = dcwwVar.c.b;
                        synchronized (dzwmVar) {
                            ekut ekutVar = new ekut() { // from class: dcrl
                                @Override // defpackage.ekut
                                public final Object apply(Object obj) {
                                    ddla ddlaVar = (ddla) obj;
                                    ausn ausnVar6 = dcry.a;
                                    ddlm ddlmVar = ddlaVar.e;
                                    if (ddlmVar == null) {
                                        ddlmVar = ddlm.a;
                                    }
                                    ddll ddllVar4 = ddllVar3;
                                    fgrc fgrcVar = (fgrc) ddlmVar.iQ(5, null);
                                    fgrcVar.X(ddlmVar);
                                    ddlj ddljVar = (ddlj) fgrcVar;
                                    ddllVar4.getClass();
                                    if (!ddljVar.b.L()) {
                                        ddljVar.U();
                                    }
                                    ((ddlm) ddljVar.b).b().put(Long.valueOf(j), ddllVar4);
                                    ddlm ddlmVar2 = (ddlm) ddljVar.Q();
                                    fgrc fgrcVar2 = (fgrc) ddlaVar.iQ(5, null);
                                    fgrcVar2.X(ddlaVar);
                                    ddkw ddkwVar = (ddkw) fgrcVar2;
                                    if (!ddkwVar.b.L()) {
                                        ddkwVar.U();
                                    }
                                    ddla ddlaVar2 = (ddla) ddkwVar.b;
                                    ddlmVar2.getClass();
                                    ddlaVar2.e = ddlmVar2;
                                    ddlaVar2.b |= 1;
                                    return (ddla) ddkwVar.Q();
                                }
                            };
                            eqexVar2 = eqex.a;
                            b = dzwmVar.b(ekutVar, eqexVar2);
                        }
                        i3 = eqdl.f(eqgb.h(b), new ekut() { // from class: dcws
                            @Override // defpackage.ekut
                            public final Object apply(Object obj) {
                                ausn ausnVar6 = dcww.a;
                                fgrc v2 = dcgr.a.v();
                                if (!v2.b.L()) {
                                    v2.U();
                                }
                                long j3 = j;
                                fgri fgriVar2 = v2.b;
                                dcgr dcgrVar2 = (dcgr) fgriVar2;
                                dcgrVar2.b |= 1;
                                dcgrVar2.c = j3;
                                if (!fgriVar2.L()) {
                                    v2.U();
                                }
                                fgri fgriVar3 = v2.b;
                                dcgr dcgrVar3 = (dcgr) fgriVar3;
                                dcgrVar3.d = 1;
                                dcgrVar3.b |= 2;
                                if (!fgriVar3.L()) {
                                    v2.U();
                                }
                                fgub fgubVar = j2;
                                fgri fgriVar4 = v2.b;
                                dcgr dcgrVar4 = (dcgr) fgriVar4;
                                fgubVar.getClass();
                                dcgrVar4.e = fgubVar;
                                dcgrVar4.b |= 4;
                                if (!fgriVar4.L()) {
                                    v2.U();
                                }
                                String str7 = uuid;
                                dcgr dcgrVar5 = (dcgr) v2.b;
                                str7.getClass();
                                dcgrVar5.b |= 8;
                                dcgrVar5.f = str7;
                                return (dcgr) v2.Q();
                            }
                        }, eqexVar2);
                    }
                    dbtcVar.e("LiveBusynessTotalEnterEventsProcessed");
                } else {
                    i = i2;
                    if (i4 == 2) {
                        PlaceExitEvent placeExitEvent = semanticLocationEvent.e;
                        if (placeExitEvent == null) {
                            dbtcVar.e("LiveBusynessEmptyExitEvents");
                            g = eqgc.i(dcgrVar);
                        } else {
                            final long j3 = placeExitEvent.d.a.a;
                            dzwm dzwmVar2 = dcwwVar.c.b;
                            synchronized (dzwmVar2) {
                                eqgl a4 = dzwmVar2.a();
                                ekut ekutVar2 = new ekut() { // from class: dcri
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // defpackage.ekut
                                    public final Object apply(Object obj) {
                                        ausn ausnVar6 = dcry.a;
                                        ddlm ddlmVar = ((ddla) obj).e;
                                        if (ddlmVar == null) {
                                            ddlmVar = ddlm.a;
                                        }
                                        long j4 = j3;
                                        ddll ddllVar4 = ddll.a;
                                        fgst fgstVar = ddlmVar.b;
                                        Long valueOf = Long.valueOf(j4);
                                        return fgstVar.containsKey(valueOf) ? (ddll) fgstVar.get(valueOf) : ddllVar4;
                                    }
                                };
                                eqexVar = eqex.a;
                                f = eqdl.f(a4, ekutVar2, eqexVar);
                            }
                            g = eqdl.g(eqgb.h(f), new eqdv() { // from class: dcwt
                                @Override // defpackage.eqdv
                                public final eqgl a(Object obj) {
                                    eqgl b2;
                                    final String str7 = ((ddll) obj).c;
                                    boolean isEmpty = str7.isEmpty();
                                    final long j4 = j3;
                                    dcww dcwwVar2 = dcww.this;
                                    if (isEmpty) {
                                        dcwwVar2.b.e("LiveBusynessTotalExitEventsDropped");
                                        return eqgc.i(dcgr.a);
                                    }
                                    final SemanticLocationEvent semanticLocationEvent2 = semanticLocationEvent;
                                    PlaceExitEvent placeExitEvent2 = semanticLocationEvent2.e;
                                    if (placeExitEvent2 != null) {
                                        dcwwVar2.b.k("LiveBusynessExitEventProbabilityDist", dcww.a(placeExitEvent2.b));
                                    }
                                    dzwm dzwmVar3 = dcwwVar2.c.b;
                                    synchronized (dzwmVar3) {
                                        b2 = dzwmVar3.b(new ekut() { // from class: dcre
                                            @Override // defpackage.ekut
                                            public final Object apply(Object obj2) {
                                                ddla ddlaVar = (ddla) obj2;
                                                ausn ausnVar6 = dcry.a;
                                                ddlm ddlmVar = ddlaVar.e;
                                                if (ddlmVar == null) {
                                                    ddlmVar = ddlm.a;
                                                }
                                                long j5 = j4;
                                                fgrc fgrcVar = (fgrc) ddlmVar.iQ(5, null);
                                                fgrcVar.X(ddlmVar);
                                                ddlj ddljVar = (ddlj) fgrcVar;
                                                ddljVar.a(j5);
                                                ddlm ddlmVar2 = (ddlm) ddljVar.Q();
                                                fgrc fgrcVar2 = (fgrc) ddlaVar.iQ(5, null);
                                                fgrcVar2.X(ddlaVar);
                                                ddkw ddkwVar = (ddkw) fgrcVar2;
                                                if (!ddkwVar.b.L()) {
                                                    ddkwVar.U();
                                                }
                                                ddla ddlaVar2 = (ddla) ddkwVar.b;
                                                ddlmVar2.getClass();
                                                ddlaVar2.e = ddlmVar2;
                                                ddlaVar2.b |= 1;
                                                return (ddla) ddkwVar.Q();
                                            }
                                        }, eqex.a);
                                    }
                                    return eqdl.f(eqgb.h(b2), new ekut() { // from class: dcwv
                                        @Override // defpackage.ekut
                                        public final Object apply(Object obj2) {
                                            ausn ausnVar6 = dcww.a;
                                            fgrc v2 = dcgr.a.v();
                                            if (!v2.b.L()) {
                                                v2.U();
                                            }
                                            long j5 = j4;
                                            fgri fgriVar2 = v2.b;
                                            dcgr dcgrVar2 = (dcgr) fgriVar2;
                                            dcgrVar2.b |= 1;
                                            dcgrVar2.c = j5;
                                            if (!fgriVar2.L()) {
                                                v2.U();
                                            }
                                            SemanticLocationEvent semanticLocationEvent3 = semanticLocationEvent2;
                                            dcgr dcgrVar3 = (dcgr) v2.b;
                                            dcgrVar3.d = 2;
                                            dcgrVar3.b = 2 | dcgrVar3.b;
                                            fgub j6 = fgvq.j(semanticLocationEvent3.a);
                                            if (!v2.b.L()) {
                                                v2.U();
                                            }
                                            fgri fgriVar3 = v2.b;
                                            dcgr dcgrVar4 = (dcgr) fgriVar3;
                                            j6.getClass();
                                            dcgrVar4.e = j6;
                                            dcgrVar4.b |= 4;
                                            if (!fgriVar3.L()) {
                                                v2.U();
                                            }
                                            String str8 = str7;
                                            dcgr dcgrVar5 = (dcgr) v2.b;
                                            str8.getClass();
                                            dcgrVar5.b |= 8;
                                            dcgrVar5.f = str8;
                                            return (dcgr) v2.Q();
                                        }
                                    }, eqex.a);
                                }
                            }, eqexVar);
                        }
                        i3 = g;
                        dbtcVar.e("LiveBusynessTotalExitEventsProcessed");
                    } else if (i4 == 3) {
                        dbtcVar.e("LiveBusynessTotalOngoingEventsUnprocessed");
                    } else {
                        c2 = 4;
                        if (i4 == 4 || i4 == 5 || i4 == 6) {
                            dbtcVar.e("LiveBusynessTotalActivityEventsUnprocessed");
                        }
                        arrayList.add(i3);
                        i2 = i;
                    }
                }
                c2 = 4;
                arrayList.add(i3);
                i2 = i;
            }
            eqft a5 = eqgc.a(arrayList);
            Callable callable = new Callable() { // from class: dcwu
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i5 = elgo.d;
                    elgj elgjVar = new elgj();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        try {
                            dcgr dcgrVar2 = (dcgr) eqgc.r((eqgl) it.next());
                            if (!dcgrVar2.equals(dcgr.a)) {
                                dcww dcwwVar2 = dcww.this;
                                elgjVar.i(dcgrVar2);
                                dcwwVar2.b.e("LiveBusynessTotalOutputsAdded");
                            }
                        } catch (ExecutionException e) {
                            ((eluo) ((eluo) ((eluo) dcww.a.j()).s(e)).ai((char) 10292)).x("Failed to get LiveBusynessOutput.");
                        }
                    }
                    return elgjVar.g();
                }
            };
            eqex eqexVar3 = eqex.a;
            final eqgl a6 = a5.a(callable, eqexVar3);
            final eqgl b2 = dcsbVar.d.b();
            eqgl[] eqglVarArr = new eqgl[2];
            eqglVarArr[0] = a6;
            eqglVarArr[i2] = b2;
            eqgc.t(eqgc.b(eqglVarArr).a(new Callable() { // from class: dcrz
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
                    dcsb dcsbVar2 = dcsb.this;
                    eqgl eqglVar = b2;
                    eqgl eqglVar2 = a6;
                    boolean z3 = false;
                    try {
                        String str7 = (String) eqgc.r(eqglVar);
                        elgo elgoVar = (elgo) eqgc.r(eqglVar2);
                        dbtc dbtcVar2 = dcsbVar2.c;
                        dbtcVar2.e("LiveBusynessProcessingSuccess");
                        if (elgoVar.isEmpty()) {
                            dbtcVar2.e("LiveBusynessEmptyOutput");
                            return false;
                        }
                        if (str7.isEmpty()) {
                            dbtcVar2.e("LiveBusynessEmptyAccountName");
                            return false;
                        }
                        Account account = new Account(str7, "com.google");
                        dbvg dbvgVar = dcsbVar2.b;
                        if (!dbvl.e(dbvgVar, account)) {
                            return false;
                        }
                        if (dcsbVar2.e == null) {
                            dcsbVar2.e = new dcxv(dbvgVar, dbtcVar2);
                        }
                        dcxv dcxvVar = dcsbVar2.e;
                        Account account2 = new Account(str7, "com.google");
                        if (dcxvVar.b(account2)) {
                            z2 = true;
                            if (elgoVar.isEmpty()) {
                                dcxvVar.a.k("DeidentifiedUploadStatus", 6);
                                z = false;
                            } else {
                                elgj elgjVar = new elgj();
                                int size = elgoVar.size();
                                int i5 = 0;
                                while (i5 < size) {
                                    dcgr dcgrVar2 = (dcgr) elgoVar.get(i5);
                                    int i6 = dcgrVar2.d;
                                    int a7 = dcgq.a(i6);
                                    ?? r13 = a7;
                                    if (a7 == 0) {
                                        r13 = z2;
                                    }
                                    if (r13 - 1 == z2) {
                                        r12 = 2;
                                    } else {
                                        int a8 = dcgq.a(i6);
                                        ?? r122 = a8;
                                        if (a8 == 0) {
                                            r122 = z2;
                                        }
                                        r12 = r122 + (-1) == 2 ? 3 : z2;
                                    }
                                    fgrc v2 = ewid.a.v();
                                    if (!v2.b.L()) {
                                        v2.U();
                                    }
                                    fgri fgriVar2 = v2.b;
                                    z = z3;
                                    try {
                                        ewid ewidVar = (ewid) fgriVar2;
                                        ewidVar.d = r12 - 1;
                                        ewidVar.b |= 2;
                                        boolean z4 = z2;
                                        elgo elgoVar2 = elgoVar;
                                        long j4 = dcgrVar2.c;
                                        if (!fgriVar2.L()) {
                                            v2.U();
                                        }
                                        ewid ewidVar2 = (ewid) v2.b;
                                        ewidVar2.b |= z4 ? 1 : 0;
                                        ewidVar2.c = j4;
                                        fgub fgubVar = dcgrVar2.e;
                                        if (fgubVar == null) {
                                            fgubVar = fgub.a;
                                        }
                                        if (!v2.b.L()) {
                                            v2.U();
                                        }
                                        fgri fgriVar3 = v2.b;
                                        ewid ewidVar3 = (ewid) fgriVar3;
                                        fgubVar.getClass();
                                        ewidVar3.e = fgubVar;
                                        ewidVar3.b |= 4;
                                        String str8 = dcgrVar2.f;
                                        if (!fgriVar3.L()) {
                                            v2.U();
                                        }
                                        ewid ewidVar4 = (ewid) v2.b;
                                        str8.getClass();
                                        ewidVar4.b |= 8;
                                        ewidVar4.f = str8;
                                        ewid ewidVar5 = (ewid) v2.Q();
                                        fgrc v3 = ewhc.a.v();
                                        if (!v3.b.L()) {
                                            v3.U();
                                        }
                                        ewhc ewhcVar = (ewhc) v3.b;
                                        ewidVar5.getClass();
                                        ewhcVar.c = ewidVar5;
                                        ewhcVar.b = z4 ? 1 : 0;
                                        elgjVar.i((ewhc) v3.Q());
                                        i5++;
                                        elgoVar = elgoVar2;
                                        z2 = z4 ? 1 : 0;
                                        z3 = z;
                                    } catch (ExecutionException e) {
                                        e = e;
                                        ((eluo) ((eluo) ((eluo) dcsb.a.j()).s(e)).ai((char) 10219)).x("Failed to fetch data for deidentified Live Busyness upload.");
                                        dcsbVar2.c.e("LiveBusynessProcessingFailure");
                                        return Boolean.valueOf(z);
                                    }
                                }
                                z = z3;
                                z2 = dcxvVar.c(account2, elgjVar.g());
                            }
                        } else {
                            z = false;
                            z2 = false;
                        }
                        dbtcVar2.e(z2 ? "LiveBusynessUploadSuccess" : "LiveBusynessUploadFailure");
                        return Boolean.valueOf(z2);
                    } catch (ExecutionException e2) {
                        e = e2;
                        z = false;
                    }
                }
            }, eqexVar3), new ddpe(this), eqexVar3);
        }
    }
}

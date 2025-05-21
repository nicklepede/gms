package com.google.android.gms.ipa.base;

import android.provider.MediaStore;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ipa.base.IpaGcmTaskChimeraService;
import com.google.android.gms.ipa.mediastoreindexer.BatchIndexingIntentOperation;
import com.google.android.gms.ipa.mediastoreindexer.CorporaMaintenanceIntentOperation;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.asej;
import defpackage.asot;
import defpackage.bont;
import defpackage.bopm;
import defpackage.byiv;
import defpackage.byiw;
import defpackage.byix;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykm;
import defpackage.byko;
import defpackage.byll;
import defpackage.byln;
import defpackage.ejhf;
import defpackage.fnck;
import defpackage.fnde;
import defpackage.fpgv;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class IpaGcmTaskChimeraService extends GmsTaskChimeraService {
    public static final /* synthetic */ int a = 0;
    private static final asot b = asot.b("GmscoreIpa", asej.PLATFORM_DATA_INDEXER);
    private static final byiv c = new byiv(MediaStore.Files.getContentUri("external"), 1);
    private static final byiv d = new byiv(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, 1);

    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ipa.base.IpaGcmTaskChimeraService.d(android.content.Context):void");
    }

    private static byix e() {
        byiw byiwVar = new byiw();
        byiwVar.t("MediaStoreInstantIndexTask");
        byiwVar.j = "com.google.android.gms.ipa.base.IpaGcmTaskService";
        byiwVar.v(1);
        byiwVar.x(0, 0);
        byiwVar.c(c);
        if (fpgv.k()) {
            byiwVar.c(d);
        }
        return byiwVar.b();
    }

    private static byko f(String str, int i) {
        byko bykoVar = new byko();
        bykoVar.j = "com.google.android.gms.ipa.base.IpaGcmTaskService";
        bykoVar.q(str);
        bykoVar.l(false);
        bykoVar.m(i);
        bykoVar.v(2);
        return bykoVar;
    }

    private static byll g(boolean z) {
        if (fnck.j()) {
            byko f = f("MediaStoreCorporaMaintenance", (int) fpgv.a.a().r());
            if (!fpgv.q()) {
                f.e();
                f.j();
            }
            return f.b();
        }
        long seconds = TimeUnit.DAYS.toSeconds(fpgv.f());
        long seconds2 = TimeUnit.HOURS.toSeconds(fpgv.e());
        bykm bykmVar = new bykm();
        bykmVar.t("MediaStoreCorporaMaintenance");
        bykmVar.i(fpgv.r());
        bykmVar.y(2, 2);
        bykmVar.x(!fpgv.q() ? 1 : 0, 1);
        bykmVar.f(!fpgv.q() ? 1 : 0, 1);
        bykmVar.j = "com.google.android.gms.ipa.base.IpaGcmTaskService";
        bykmVar.u(z);
        if (fnde.f()) {
            bykmVar.j(byki.a(seconds));
        } else {
            bykmVar.a = seconds;
            bykmVar.b = seconds2;
        }
        return bykmVar.b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        char c2;
        String str = bylnVar.a;
        switch (str.hashCode()) {
            case -1102736980:
                if (str.equals("AppUsageReportGeneration")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -245101092:
                if (str.equals("MediaStoreCorporaMaintenance")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 985841773:
                if (str.equals("LogDiffBetweenMediastoreAndIcing")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 1884131794:
                if (str.equals("MediaStoreBatchIndexingTask")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1994427955:
                if (str.equals("MediaStoreInstantIndexTask")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 2117151161:
                if (str.equals("AppsCorpusMaintenance")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            startService(IntentOperation.getStartIntent(this, CorporaMaintenanceIntentOperation.class, "com.google.android.gms.ipa.mediastoreindexer.REINDEX"));
        } else if (c2 == 1) {
            startService(IntentOperation.getStartIntent(this, BatchIndexingIntentOperation.class, "com.google.android.gms.ipa.mediastoreindexer.BATCH_INDEX"));
        } else if (c2 == 2) {
            try {
                bopm bopmVar = bopm.b;
                synchronized (bopm.class) {
                    if (bopm.b == null) {
                        bopm.b = new bopm(this);
                    }
                    bopm.b.onChange(false);
                }
            } finally {
                byjl a2 = byjl.a(this);
                if (fpgv.m() && fpgv.o()) {
                    a2.f(e());
                }
            }
        } else if (c2 == 3) {
            bont.a().b(new Runnable() { // from class: bonj
                @Override // java.lang.Runnable
                public final void run() {
                    int i = IpaGcmTaskChimeraService.a;
                    bonb c3 = bonb.c();
                    if (c3 != null) {
                        c3.a();
                    }
                }
            });
        } else if (c2 == 4) {
            bont.a().b(new Runnable() { // from class: bonk
                /* JADX WARN: Removed duplicated region for block: B:14:0x008e  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 485
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.bonk.run():void");
                }
            });
        } else if (c2 != 5) {
            ((ejhf) ((ejhf) b.i()).ah(5351)).B("Unrecognized task tag: %s", bylnVar.a);
        } else {
            bont.a().b(new Runnable() { // from class: bonl
                @Override // java.lang.Runnable
                public final void run() {
                    int a3;
                    int a4;
                    asot asotVar = bopf.a;
                    boqq boqqVar = new boqq(9);
                    IpaGcmTaskChimeraService ipaGcmTaskChimeraService = IpaGcmTaskChimeraService.this;
                    bory boryVar = new bory(ipaGcmTaskChimeraService.getContentResolver(), null);
                    borr borrVar = new borr(boryVar);
                    bors borsVar = new bors(boryVar);
                    cyjp cyjpVar = new cyjp();
                    cyjpVar.a = "MediastoreIndexer";
                    cyjq cyjqVar = new cyjq(cyjpVar);
                    aqwv aqwvVar = cyjo.a;
                    cyqo cyqoVar = new cyqo(ipaGcmTaskChimeraService, cyjqVar);
                    ((ejhf) bopf.a.h()).x("Starting mediastore diff logging operation");
                    if (fpgv.o() && fpgv.p()) {
                        boqp boqpVar = new boqp();
                        boqpVar.b((int) (asny.a(ipaGcmTaskChimeraService, "mediastore-indexer.db") >> 10));
                        bosc a5 = borrVar.a(0L, null);
                        int a6 = a5 != null ? a5.a() : -1;
                        if (a6 > 0) {
                            int a7 = bopf.a("internal.3p:MusicRecording", cyqoVar);
                            if (a7 != -1) {
                                boqpVar.f(a6 - a7);
                            } else {
                                boqpVar.f(JGCastService.FLAG_USE_TDLS);
                            }
                            int a8 = bopf.a("internal.3p:MusicAlbum", cyqoVar);
                            borz a9 = borsVar.a(bort.ALBUM);
                            if (a9 != null) {
                                try {
                                    a3 = a9.a();
                                    a9.close();
                                } finally {
                                }
                            } else {
                                a3 = -1;
                            }
                            if (a8 == -1 || a3 == -1) {
                                boqpVar.c(JGCastService.FLAG_USE_TDLS);
                            } else {
                                boqpVar.c(a3 - a8);
                            }
                            int a10 = bopf.a("internal.3p:MusicGroup", cyqoVar);
                            a9 = borsVar.a(bort.ARTIST);
                            if (a9 != null) {
                                try {
                                    a4 = a9.a();
                                    a9.close();
                                } finally {
                                }
                            } else {
                                a4 = -1;
                            }
                            if (a10 == -1 || a4 == -1) {
                                boqpVar.d(JGCastService.FLAG_USE_TDLS);
                            } else {
                                boqpVar.d(a4 - a10);
                            }
                            boqpVar.e();
                            boqqVar.e(boqpVar);
                            bons.a().d(boqqVar.a());
                        }
                    }
                }
            });
        }
        return 0;
    }
}

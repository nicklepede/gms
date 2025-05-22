package com.google.android.gms.ipa.base;

import android.provider.MediaStore;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ipa.base.IpaGcmTaskChimeraService;
import com.google.android.gms.ipa.mediastoreindexer.BatchIndexingIntentOperation;
import com.google.android.gms.ipa.mediastoreindexer.CorporaMaintenanceIntentOperation;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bqvj;
import defpackage.bqxc;
import defpackage.carn;
import defpackage.caro;
import defpackage.carp;
import defpackage.casd;
import defpackage.cata;
import defpackage.cate;
import defpackage.catg;
import defpackage.caud;
import defpackage.cauf;
import defpackage.eluo;
import defpackage.fpuj;
import defpackage.fpvd;
import defpackage.fsah;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class IpaGcmTaskChimeraService extends GmsTaskChimeraService {
    public static final /* synthetic */ int a = 0;
    private static final ausn b = ausn.b("GmscoreIpa", auid.PLATFORM_DATA_INDEXER);
    private static final carn c = new carn(MediaStore.Files.getContentUri("external"), 1);
    private static final carn d = new carn(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, 1);

    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ipa.base.IpaGcmTaskChimeraService.d(android.content.Context):void");
    }

    private static carp e() {
        caro caroVar = new caro();
        caroVar.t("MediaStoreInstantIndexTask");
        caroVar.j = "com.google.android.gms.ipa.base.IpaGcmTaskService";
        caroVar.v(1);
        caroVar.x(0, 0);
        caroVar.c(c);
        if (fsah.k()) {
            caroVar.c(d);
        }
        return caroVar.b();
    }

    private static catg f(String str, int i) {
        catg catgVar = new catg();
        catgVar.j = "com.google.android.gms.ipa.base.IpaGcmTaskService";
        catgVar.q(str);
        catgVar.l(false);
        catgVar.m(i);
        catgVar.v(2);
        return catgVar;
    }

    private static caud g(boolean z) {
        if (fpuj.j()) {
            catg f = f("MediaStoreCorporaMaintenance", (int) fsah.a.lK().r());
            if (!fsah.q()) {
                f.e();
                f.j();
            }
            return f.b();
        }
        long seconds = TimeUnit.DAYS.toSeconds(fsah.f());
        long seconds2 = TimeUnit.HOURS.toSeconds(fsah.e());
        cate cateVar = new cate();
        cateVar.t("MediaStoreCorporaMaintenance");
        cateVar.i(fsah.r());
        cateVar.y(2, 2);
        cateVar.x(!fsah.q() ? 1 : 0, 1);
        cateVar.f(!fsah.q() ? 1 : 0, 1);
        cateVar.j = "com.google.android.gms.ipa.base.IpaGcmTaskService";
        cateVar.u(z);
        if (fpvd.f()) {
            cateVar.j(cata.a(seconds));
        } else {
            cateVar.a = seconds;
            cateVar.b = seconds2;
        }
        return cateVar.b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        char c2;
        String str = caufVar.a;
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
                bqxc bqxcVar = bqxc.b;
                synchronized (bqxc.class) {
                    if (bqxc.b == null) {
                        bqxc.b = new bqxc(this);
                    }
                    bqxc.b.onChange(false);
                }
            } finally {
                casd a2 = casd.a(this);
                if (fsah.m() && fsah.o()) {
                    a2.f(e());
                }
            }
        } else if (c2 == 3) {
            bqvj.a().b(new Runnable() { // from class: bquz
                @Override // java.lang.Runnable
                public final void run() {
                    int i = IpaGcmTaskChimeraService.a;
                    bqur c3 = bqur.c();
                    if (c3 != null) {
                        c3.a();
                    }
                }
            });
        } else if (c2 == 4) {
            bqvj.a().b(new Runnable() { // from class: bqva
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.bqva.run():void");
                }
            });
        } else if (c2 != 5) {
            ((eluo) ((eluo) b.i()).ai(5364)).B("Unrecognized task tag: %s", caufVar.a);
        } else {
            bqvj.a().b(new Runnable() { // from class: bqvb
                @Override // java.lang.Runnable
                public final void run() {
                    int a3;
                    int a4;
                    ausn ausnVar = bqwv.a;
                    bqyg bqygVar = new bqyg(9);
                    IpaGcmTaskChimeraService ipaGcmTaskChimeraService = IpaGcmTaskChimeraService.this;
                    bqzo bqzoVar = new bqzo(ipaGcmTaskChimeraService.getContentResolver(), null);
                    bqzh bqzhVar = new bqzh(bqzoVar);
                    bqzi bqziVar = new bqzi(bqzoVar);
                    datn datnVar = new datn();
                    datnVar.a = "MediastoreIndexer";
                    dato datoVar = new dato(datnVar);
                    aszk aszkVar = datm.a;
                    dbam dbamVar = new dbam(ipaGcmTaskChimeraService, datoVar);
                    ((eluo) bqwv.a.h()).x("Starting mediastore diff logging operation");
                    if (fsah.o() && fsah.p()) {
                        bqyf bqyfVar = new bqyf();
                        bqyfVar.b((int) (aurs.a(ipaGcmTaskChimeraService, "mediastore-indexer.db") >> 10));
                        bqzs a5 = bqzhVar.a(0L, null);
                        int a6 = a5 != null ? a5.a() : -1;
                        if (a6 > 0) {
                            int a7 = bqwv.a("internal.3p:MusicRecording", dbamVar);
                            if (a7 != -1) {
                                bqyfVar.f(a6 - a7);
                            } else {
                                bqyfVar.f(JGCastService.FLAG_USE_TDLS);
                            }
                            int a8 = bqwv.a("internal.3p:MusicAlbum", dbamVar);
                            bqzp a9 = bqziVar.a(bqzj.ALBUM);
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
                                bqyfVar.c(JGCastService.FLAG_USE_TDLS);
                            } else {
                                bqyfVar.c(a3 - a8);
                            }
                            int a10 = bqwv.a("internal.3p:MusicGroup", dbamVar);
                            a9 = bqziVar.a(bqzj.ARTIST);
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
                                bqyfVar.d(JGCastService.FLAG_USE_TDLS);
                            } else {
                                bqyfVar.d(a4 - a10);
                            }
                            bqyfVar.e();
                            bqygVar.e(bqyfVar);
                            bqvi.a().d(bqygVar.a());
                        }
                    }
                }
            });
        }
        return 0;
    }
}

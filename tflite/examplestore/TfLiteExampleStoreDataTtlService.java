package com.google.android.gms.tflite.examplestore;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.chimera.modules.tflite.AppContextProvider;
import com.google.android.gms.common.Feature;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.tflite.examplestore.TfLiteExampleStoreDataTtlService;
import defpackage.bsmk;
import defpackage.cauf;
import defpackage.dhqq;
import defpackage.ekut;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgl;
import defpackage.fvgv;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TfLiteExampleStoreDataTtlService extends GmsTaskBoundService {
    public static final InAppTrainerOptions a;
    public static final String b;

    static {
        bsmk bsmkVar = new bsmk();
        bsmkVar.e("tflite_brella_session");
        bsmkVar.d("tflite/package_usage");
        bsmkVar.a = 12;
        a = bsmkVar.a();
        b = TfLiteExampleStoreDataTtlService.class.getName();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        dhqq a2 = dhqq.a();
        final long millis = TimeUnit.DAYS.toMillis(fvgv.a.lK().a());
        return eqdl.g(a2.b.a(new ekut() { // from class: dhqp
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                eqgo eqgoVar = dhqq.a;
                ((dhqh) obj).a(millis);
                return null;
            }
        }), new eqdv() { // from class: dhqm
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                InAppTrainerOptions inAppTrainerOptions = TfLiteExampleStoreDataTtlService.a;
                final dhqi dhqiVar = dhqq.a().b;
                return eqdl.g(eqgc.n(new eqdu() { // from class: dhqf
                    @Override // defpackage.eqdu
                    public final eqgl a() {
                        SQLiteDatabase readableDatabase = dhqi.this.a.getReadableDatabase();
                        try {
                            boolean z = true;
                            Cursor rawQuery = readableDatabase.rawQuery(String.format("SELECT COUNT(*) as total FROM %s", "collections"), new String[0]);
                            try {
                                rawQuery.moveToNext();
                                int columnIndex = rawQuery.getColumnIndex("total");
                                if (columnIndex == -1) {
                                    z = false;
                                }
                                ekvl.r(z, "column `total` index is -1");
                                eqgl i = eqgc.i(Integer.valueOf(rawQuery.getInt(columnIndex)));
                                if (rawQuery != null) {
                                    rawQuery.close();
                                }
                                if (readableDatabase != null) {
                                    readableDatabase.close();
                                }
                                return i;
                            } finally {
                            }
                        } catch (Throwable th) {
                            if (readableDatabase != null) {
                                try {
                                    readableDatabase.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                }, dhqiVar.c), new eqdv() { // from class: dhql
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj2) {
                        Integer num = (Integer) obj2;
                        InAppTrainerOptions inAppTrainerOptions2 = TfLiteExampleStoreDataTtlService.a;
                        bsmi a3 = bsmj.a(AppContextProvider.a(), TfLiteExampleStoreDataTtlService.a);
                        if (fvgv.c() && num.intValue() != 0) {
                            return eqdl.f(dqmr.b(a3.a()), new ekut() { // from class: dhqk
                                @Override // defpackage.ekut
                                public final Object apply(Object obj3) {
                                    InAppTrainerOptions inAppTrainerOptions3 = TfLiteExampleStoreDataTtlService.a;
                                    return 0;
                                }
                            }, eqex.a);
                        }
                        atfn atfnVar = new atfn();
                        atfnVar.a = new atfd() { // from class: bsqa
                            @Override // defpackage.atfd
                            public final void d(Object obj3, Object obj4) {
                                bsqf bsqfVar = (bsqf) obj3;
                                aszs aszsVar = bsqg.a;
                                ((bsqn) bsqfVar.H()).a(new bsqe((dhma) obj4), bsxa.a(bsqfVar.r));
                            }
                        };
                        atfnVar.c = new Feature[]{amnt.a};
                        return eqdl.f(dqmr.b(((atad) a3).ji(atfnVar.a())), new ekut() { // from class: dhqj
                            @Override // defpackage.ekut
                            public final Object apply(Object obj3) {
                                InAppTrainerOptions inAppTrainerOptions3 = TfLiteExampleStoreDataTtlService.a;
                                return 0;
                            }
                        }, eqex.a);
                    }
                }, eqex.a);
            }
        }, eqex.a);
    }
}

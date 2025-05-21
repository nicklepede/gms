package com.google.android.gms.tflite.examplestore;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.chimera.modules.tflite.AppContextProvider;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.tflite.examplestore.TfLiteExampleStoreDataTtlService;
import defpackage.bqeu;
import defpackage.byln;
import defpackage.dffk;
import defpackage.eiho;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.enss;
import defpackage.fsls;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TfLiteExampleStoreDataTtlService extends GmsTaskBoundService {
    public static final InAppTrainerOptions a;
    public static final String b;

    static {
        bqeu bqeuVar = new bqeu();
        bqeuVar.e("tflite_brella_session");
        bqeuVar.d("tflite/package_usage");
        bqeuVar.a = 12;
        a = bqeuVar.a();
        b = TfLiteExampleStoreDataTtlService.class.getName();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        dffk a2 = dffk.a();
        final long millis = TimeUnit.DAYS.toMillis(fsls.a.a().a());
        return enps.g(a2.b.a(new eiho() { // from class: dffj
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                ensv ensvVar = dffk.a;
                ((dffb) obj).a(millis);
                return null;
            }
        }), new enqc() { // from class: dffg
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                InAppTrainerOptions inAppTrainerOptions = TfLiteExampleStoreDataTtlService.a;
                final dffc dffcVar = dffk.a().b;
                return enps.g(ensj.n(new enqb() { // from class: dfez
                    @Override // defpackage.enqb
                    public final enss a() {
                        SQLiteDatabase readableDatabase = dffc.this.a.getReadableDatabase();
                        try {
                            boolean z = true;
                            Cursor rawQuery = readableDatabase.rawQuery(String.format("SELECT COUNT(*) as total FROM %s", "collections"), new String[0]);
                            try {
                                rawQuery.moveToNext();
                                int columnIndex = rawQuery.getColumnIndex("total");
                                if (columnIndex == -1) {
                                    z = false;
                                }
                                eiig.q(z, "column `total` index is -1");
                                enss i = ensj.i(Integer.valueOf(rawQuery.getInt(columnIndex)));
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
                }, dffcVar.c), new enqc() { // from class: dfff
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.enqc
                    public final enss a(Object obj2) {
                        Integer num = (Integer) obj2;
                        InAppTrainerOptions inAppTrainerOptions2 = TfLiteExampleStoreDataTtlService.a;
                        bqes a3 = bqet.a(AppContextProvider.a(), TfLiteExampleStoreDataTtlService.a);
                        if (fsls.c() && num.intValue() != 0) {
                            return enps.f(doci.b(a3.a()), new eiho() { // from class: dffe
                                @Override // defpackage.eiho
                                public final Object apply(Object obj3) {
                                    InAppTrainerOptions inAppTrainerOptions3 = TfLiteExampleStoreDataTtlService.a;
                                    return 0;
                                }
                            }, enre.a);
                        }
                        arcy arcyVar = new arcy();
                        arcyVar.a = new arco() { // from class: bqil
                            @Override // defpackage.arco
                            public final void d(Object obj3, Object obj4) {
                                bqiq bqiqVar = (bqiq) obj3;
                                aqxd aqxdVar = bqir.a;
                                bqip bqipVar = new bqip((dfau) obj4);
                                Context context = bqiqVar.r;
                                ((bqiy) bqiqVar.H()).a(bqipVar, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
                            }
                        };
                        arcyVar.c = new Feature[]{akmi.a};
                        return enps.f(doci.b(((aqxo) a3).iT(arcyVar.a())), new eiho() { // from class: dffd
                            @Override // defpackage.eiho
                            public final Object apply(Object obj3) {
                                InAppTrainerOptions inAppTrainerOptions3 = TfLiteExampleStoreDataTtlService.a;
                                return 0;
                            }
                        }, enre.a);
                    }
                }, enre.a);
            }
        }, enre.a);
    }
}

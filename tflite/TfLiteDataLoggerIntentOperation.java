package com.google.android.gms.tflite;

import android.content.ContentValues;
import android.content.Intent;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.tflite.AppContextProvider;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.tflite.examplestore.TfLiteExampleStoreDataTtlService;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykm;
import defpackage.bykn;
import defpackage.dffk;
import defpackage.eiho;
import defpackage.eixf;
import defpackage.feay;
import defpackage.fecj;
import defpackage.fsls;
import defpackage.fzkp;
import defpackage.fzkq;
import defpackage.fzkr;
import defpackage.fzks;
import defpackage.fzkt;
import defpackage.fzkv;
import j$.time.Instant;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class TfLiteDataLoggerIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!fsls.c() || intent == null || !Objects.equals(intent.getAction(), "com.google.android.gms.tflite.LOG_PRIVATE_AGGREGATED_DATA")) {
            fsls.c();
            return;
        }
        String stringExtra = intent.getStringExtra("package_name");
        if (stringExtra == null) {
            return;
        }
        fecj v = fzks.a.v();
        fzkp fzkpVar = (fzkp) fzkq.a.v();
        fzkpVar.a(feay.A(stringExtra));
        if (!v.b.L()) {
            v.U();
        }
        fzks fzksVar = (fzks) v.b;
        fzkq fzkqVar = (fzkq) fzkpVar.Q();
        fzkqVar.getClass();
        fzksVar.c = fzkqVar;
        fzksVar.b = 1;
        fzks fzksVar2 = (fzks) v.Q();
        dffk a = dffk.a();
        fecj v2 = fzkr.a.v();
        fzkt fzktVar = (fzkt) fzkv.a.v();
        fzktVar.k("package_name", fzksVar2);
        if (!v2.b.L()) {
            v2.U();
        }
        fzkr fzkrVar = (fzkr) v2.b;
        fzkv fzkvVar = (fzkv) fzktVar.Q();
        fzkvVar.getClass();
        fzkrVar.c = fzkvVar;
        fzkrVar.b |= 1;
        final List h = eixf.h(eixf.d((fzkr) v2.Q()), new eiho() { // from class: dffh
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                return ((fzkr) obj).ng();
            }
        });
        InAppTrainerOptions inAppTrainerOptions = TfLiteExampleStoreDataTtlService.a;
        bykm bykmVar = new bykm();
        bykmVar.t("TfLiteDataTtlService");
        bykmVar.w(TfLiteExampleStoreDataTtlService.b);
        bykmVar.j(byki.EVERY_DAY);
        bykmVar.v(1);
        bykmVar.r(false);
        bykmVar.g(2);
        bykmVar.f(1, 1);
        bykn b = bykmVar.b();
        byjl.a(AppContextProvider.a()).f(b);
        byki.a(b.a);
        a.b.a(new eiho() { // from class: dffi
            public final /* synthetic */ String a = "/tflite_package_usage_collection";

            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                dffb dffbVar = (dffb) obj;
                ensv ensvVar = dffk.a;
                for (feay feayVar : h) {
                    String str = this.a;
                    ContentValues contentValues = new ContentValues();
                    dnlf dnlfVar = dffbVar.b;
                    contentValues.put("time", Long.valueOf(Instant.now().toEpochMilli()));
                    contentValues.put("collection_name", str);
                    contentValues.put("value", feayVar.M());
                    dffbVar.a.insertWithOnConflict("collections", null, contentValues, 5);
                    int i = dffc.e;
                }
                SQLiteDatabase sQLiteDatabase = dffbVar.a;
                long queryNumEntries = DatabaseUtils.queryNumEntries(sQLiteDatabase, "collections") - dffbVar.c;
                if (queryNumEntries > 0) {
                    sQLiteDatabase.delete("collections", String.format("id IN (SELECT id FROM %s ORDER BY id ASC LIMIT ?)", "collections"), new String[]{String.valueOf(queryNumEntries)});
                    int i2 = dffc.e;
                }
                return null;
            }
        }).hn(new Runnable() { // from class: dfef
            @Override // java.lang.Runnable
            public final void run() {
            }
        }, dffk.a);
    }
}

package com.google.android.gms.tflite;

import android.content.ContentValues;
import android.content.Intent;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.tflite.AppContextProvider;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.tflite.examplestore.TfLiteExampleStoreDataTtlService;
import defpackage.casd;
import defpackage.cata;
import defpackage.cate;
import defpackage.catf;
import defpackage.dhqq;
import defpackage.ekut;
import defpackage.elkk;
import defpackage.fgpr;
import defpackage.fgrc;
import defpackage.fvgv;
import defpackage.gchj;
import defpackage.gchk;
import defpackage.gchl;
import defpackage.gchm;
import defpackage.gchn;
import defpackage.gchp;
import j$.time.Instant;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class TfLiteDataLoggerIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!fvgv.c() || intent == null || !Objects.equals(intent.getAction(), "com.google.android.gms.tflite.LOG_PRIVATE_AGGREGATED_DATA")) {
            fvgv.c();
            return;
        }
        String stringExtra = intent.getStringExtra("package_name");
        if (stringExtra == null) {
            return;
        }
        fgrc v = gchm.a.v();
        gchj gchjVar = (gchj) gchk.a.v();
        gchjVar.a(fgpr.A(stringExtra));
        if (!v.b.L()) {
            v.U();
        }
        gchm gchmVar = (gchm) v.b;
        gchk gchkVar = (gchk) gchjVar.Q();
        gchkVar.getClass();
        gchmVar.c = gchkVar;
        gchmVar.b = 1;
        gchm gchmVar2 = (gchm) v.Q();
        dhqq a = dhqq.a();
        fgrc v2 = gchl.a.v();
        gchn gchnVar = (gchn) gchp.a.v();
        gchnVar.k("package_name", gchmVar2);
        if (!v2.b.L()) {
            v2.U();
        }
        gchl gchlVar = (gchl) v2.b;
        gchp gchpVar = (gchp) gchnVar.Q();
        gchpVar.getClass();
        gchlVar.c = gchpVar;
        gchlVar.b |= 1;
        final List h = elkk.h(elkk.d((gchl) v2.Q()), new ekut() { // from class: dhqn
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                return ((gchl) obj).nD();
            }
        });
        InAppTrainerOptions inAppTrainerOptions = TfLiteExampleStoreDataTtlService.a;
        cate cateVar = new cate();
        cateVar.t("TfLiteDataTtlService");
        cateVar.w(TfLiteExampleStoreDataTtlService.b);
        cateVar.j(cata.EVERY_DAY);
        cateVar.v(1);
        cateVar.r(false);
        cateVar.g(2);
        cateVar.f(1, 1);
        catf b = cateVar.b();
        casd.a(AppContextProvider.a()).f(b);
        cata.a(b.a);
        a.b.a(new ekut() { // from class: dhqo
            public final /* synthetic */ String a = "/tflite_package_usage_collection";

            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                dhqh dhqhVar = (dhqh) obj;
                eqgo eqgoVar = dhqq.a;
                for (fgpr fgprVar : h) {
                    String str = this.a;
                    ContentValues contentValues = new ContentValues();
                    dpvo dpvoVar = dhqhVar.b;
                    contentValues.put("time", Long.valueOf(Instant.now().toEpochMilli()));
                    contentValues.put("collection_name", str);
                    contentValues.put("value", fgprVar.M());
                    dhqhVar.a.insertWithOnConflict("collections", null, contentValues, 5);
                    int i = dhqi.e;
                }
                SQLiteDatabase sQLiteDatabase = dhqhVar.a;
                long queryNumEntries = DatabaseUtils.queryNumEntries(sQLiteDatabase, "collections") - dhqhVar.c;
                if (queryNumEntries > 0) {
                    sQLiteDatabase.delete("collections", String.format("id IN (SELECT id FROM %s ORDER BY id ASC LIMIT ?)", "collections"), new String[]{String.valueOf(queryNumEntries)});
                    int i2 = dhqi.e;
                }
                return null;
            }
        }).hD(new Runnable() { // from class: dhpl
            @Override // java.lang.Runnable
            public final void run() {
            }
        }, dhqq.a);
    }
}

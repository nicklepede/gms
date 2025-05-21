package com.google.android.gms.drive.service;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import defpackage.anya;
import defpackage.aqto;
import defpackage.aruu;
import defpackage.asng;
import defpackage.eitj;
import defpackage.ejcb;
import java.io.File;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class ModuleInitializer extends anya {
    private static final aruu b = new aruu("ModuleInitializer");
    static final int a = 230200000;
    private static final eitj c = eitj.l("com.google.android.gms.drive.deprecation.UpgradeDialogActivity");

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        eitj eitjVar = c;
        int i = ((ejcb) eitjVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            asng.H(this, (String) eitjVar.get(i2), true);
        }
    }

    @Override // defpackage.anya
    public final void b(Intent intent, int i) {
        if (aqto.b >= a) {
            File databasePath = getApplicationContext().getDatabasePath("DocList.db");
            if (databasePath.exists()) {
                aruu aruuVar = b;
                if (aruuVar.e(4)) {
                    Log.i("ModuleInitializer", aruuVar.a("Deleting Drive module's database file."));
                }
                if (SQLiteDatabase.deleteDatabase(databasePath)) {
                    return;
                }
                aruuVar.b("ModuleInitializer", "Failed to delete Drive module's database file.");
            }
        }
    }
}

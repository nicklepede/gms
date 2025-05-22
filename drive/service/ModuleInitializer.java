package com.google.android.gms.drive.service;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import defpackage.apzs;
import defpackage.aswd;
import defpackage.atxj;
import defpackage.aura;
import defpackage.elgo;
import defpackage.elpg;
import java.io.File;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ModuleInitializer extends apzs {
    private static final atxj b = new atxj("ModuleInitializer");
    static final int a = 230200000;
    private static final elgo c = elgo.l("com.google.android.gms.drive.deprecation.UpgradeDialogActivity");

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        elgo elgoVar = c;
        int i = ((elpg) elgoVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            aura.H(this, (String) elgoVar.get(i2), true);
        }
    }

    @Override // defpackage.apzs
    public final void b(Intent intent, int i) {
        if (aswd.b >= a) {
            File databasePath = getApplicationContext().getDatabasePath("DocList.db");
            if (databasePath.exists()) {
                atxj atxjVar = b;
                if (atxjVar.e(4)) {
                    Log.i("ModuleInitializer", atxjVar.a("Deleting Drive module's database file."));
                }
                if (SQLiteDatabase.deleteDatabase(databasePath)) {
                    return;
                }
                atxjVar.b("ModuleInitializer", "Failed to delete Drive module's database file.");
            }
        }
    }
}

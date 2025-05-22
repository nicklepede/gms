package com.google.android.gms.dtdi.core.appcapabilitiesmatching;

import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.dtdi.core.database.appcapabilitiesmatching.AppCapabilitiesMatchingDatabase;
import defpackage.ausn;
import defpackage.baey;
import defpackage.baiy;
import defpackage.bapu;
import defpackage.eluo;
import defpackage.fxuw;
import defpackage.fxxm;
import defpackage.fycs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class AppCapabilitiesInfoDatabaseCleanupIntentOperation extends IntentOperation {
    private static final ausn b = baey.a("ACIDCleanupIntentOperation");
    public bapu a;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        bapu v = AppCapabilitiesMatchingDatabase.m.a().v();
        fxxm.f(v, "<set-?>");
        this.a = v;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Object a;
        fxxm.f(intent, "intent");
        if (fxxm.n("android.intent.action.PACKAGE_FULLY_REMOVED", intent.getAction())) {
            intent.getAction();
            Uri data = intent.getData();
            String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
            if (schemeSpecificPart == null || schemeSpecificPart.length() == 0) {
                return;
            }
            try {
                a = fycs.a(fxuw.a, new baiy(this, schemeSpecificPart, null));
                if (((Number) a).intValue() > 0) {
                    ((eluo) b.h()).B("onHandleIntent: deleted info for package %s", schemeSpecificPart);
                }
            } catch (SQLiteException e) {
                ((eluo) ((eluo) b.j()).s(e)).B("Failed to delete info for package %s", schemeSpecificPart);
            }
        }
    }
}

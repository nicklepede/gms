package com.google.android.gms.dtdi.core.appcapabilitiesmatching;

import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.dtdi.core.database.appcapabilitiesmatching.AppCapabilitiesMatchingDatabase;
import defpackage.asot;
import defpackage.ayay;
import defpackage.ayez;
import defpackage.aylw;
import defpackage.ejhf;
import defpackage.fuyy;
import defpackage.fvbo;
import defpackage.fvgu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class AppCapabilitiesInfoDatabaseCleanupIntentOperation extends IntentOperation {
    private static final asot b = ayay.a("ACIDCleanupIntentOperation");
    public aylw a;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        aylw v = AppCapabilitiesMatchingDatabase.l.a().v();
        fvbo.f(v, "<set-?>");
        this.a = v;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Object a;
        fvbo.f(intent, "intent");
        if (fvbo.n("android.intent.action.PACKAGE_FULLY_REMOVED", intent.getAction())) {
            intent.getAction();
            Uri data = intent.getData();
            String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
            if (schemeSpecificPart == null || schemeSpecificPart.length() == 0) {
                return;
            }
            try {
                a = fvgu.a(fuyy.a, new ayez(this, schemeSpecificPart, null));
                if (((Number) a).intValue() > 0) {
                    ((ejhf) b.h()).B("onHandleIntent: deleted info for package %s", schemeSpecificPart);
                }
            } catch (SQLiteException e) {
                ((ejhf) ((ejhf) b.j()).s(e)).B("Failed to delete info for package %s", schemeSpecificPart);
            }
        }
    }
}

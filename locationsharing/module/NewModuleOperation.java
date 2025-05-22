package com.google.android.gms.locationsharing.module;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.apzs;
import defpackage.aued;
import defpackage.dhpk;
import defpackage.fspt;
import defpackage.ilr;
import defpackage.ilt;
import defpackage.inc;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class NewModuleOperation extends apzs {
    private final void e(String str, String str2) {
        ilr ilrVar = new ilr();
        ilrVar.d(str2);
        ilrVar.e(str);
        ilt iltVar = new ilt(this);
        iltVar.n(2131233502);
        iltVar.r(str);
        iltVar.j(str2);
        iltVar.o(ilrVar);
        iltVar.l = -1;
        iltVar.x = true;
        iltVar.i(true);
        Intent className = new Intent().setClassName(this, "com.google.android.gms.locationsharing.settings.ManageExistingSharesActivity");
        inc incVar = new inc(this);
        incVar.e(new ComponentName(this, "com.google.android.gms.locationsharing.settings.ManageExistingSharesActivity"));
        incVar.b(className);
        ArrayList arrayList = incVar.a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        iltVar.g = PendingIntent.getActivities(incVar.b, 0, intentArr, 134217728, null);
        aued.f(this).u(0, dhpk.LOCATION_SHARING_MODULEFOOD, iltVar.b());
    }

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        if (fspt.a.lK().n()) {
            if (intent.hasExtra(IntentOperation.EXTRA_PREVIOUS_VERSION)) {
                e("Location Sharing Modulefood Updated", "We've updated LS Modulefood, send bugs to location-sharing-eng@");
            } else {
                e("Welcome to Location Sharing Modulefood!", "You joined gmscore-locationsharing@ and are in our modulefood, thanks!");
            }
        }
    }
}

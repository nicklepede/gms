package com.google.android.gms.locationsharing.module;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.anya;
import defpackage.asbo;
import defpackage.dfee;
import defpackage.fpwa;
import defpackage.ikb;
import defpackage.ikd;
import defpackage.ilm;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class NewModuleOperation extends anya {
    private final void e(String str, String str2) {
        ikb ikbVar = new ikb();
        ikbVar.d(str2);
        ikbVar.e(str);
        ikd ikdVar = new ikd(this);
        ikdVar.g(2131233436);
        ikdVar.m(str);
        ikdVar.l(str2);
        ikdVar.v(ikbVar);
        ikdVar.l = -1;
        ikdVar.x = true;
        ikdVar.k(true);
        Intent className = new Intent().setClassName(this, "com.google.android.gms.locationsharing.settings.ManageExistingSharesActivity");
        ilm ilmVar = new ilm(this);
        ilmVar.e(new ComponentName(this, "com.google.android.gms.locationsharing.settings.ManageExistingSharesActivity"));
        ilmVar.b(className);
        ArrayList arrayList = ilmVar.a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        ikdVar.g = PendingIntent.getActivities(ilmVar.b, 0, intentArr, 134217728, null);
        asbo.f(this).u(0, dfee.LOCATION_SHARING_MODULEFOOD, ikdVar.b());
    }

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        if (fpwa.a.a().n()) {
            if (intent.hasExtra(IntentOperation.EXTRA_PREVIOUS_VERSION)) {
                e("Location Sharing Modulefood Updated", "We've updated LS Modulefood, send bugs to location-sharing-eng@");
            } else {
                e("Welcome to Location Sharing Modulefood!", "You joined gmscore-locationsharing@ and are in our modulefood, thanks!");
            }
        }
    }
}

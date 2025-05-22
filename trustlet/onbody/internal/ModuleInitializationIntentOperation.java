package com.google.android.gms.trustlet.onbody.internal;

import android.content.Intent;
import com.google.android.gms.trustlet.onbody.discovery.PromoteScreenLockAndOnbodyChimeraActivity;
import com.google.android.gms.trustlet.onbody.discovery.WebpageOnbodyPromotionChimeraActivity;
import defpackage.apzs;
import defpackage.auid;
import defpackage.ausn;
import defpackage.diwv;
import defpackage.djek;
import defpackage.djev;
import defpackage.eqex;
import defpackage.eqgc;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ModuleInitializationIntentOperation extends apzs {
    public static final ausn a = ausn.b("Trustlet_Onbody", auid.TRUSTLET_ONBODY);
    final Collection b = Arrays.asList(djek.d(), PromoteScreenLockAndOnbodyChimeraActivity.j, WebpageOnbodyPromotionChimeraActivity.j);

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        for (diwv diwvVar : this.b) {
            String b = diwvVar.b();
            if (diwvVar.c()) {
                eqgc.t(diwvVar.a(), new djev(this, b), eqex.a);
            }
        }
    }
}

package com.google.android.gms.trustlet.onbody.internal;

import android.content.Intent;
import com.google.android.gms.trustlet.onbody.discovery.PromoteScreenLockAndOnbodyChimeraActivity;
import com.google.android.gms.trustlet.onbody.discovery.WebpageOnbodyPromotionChimeraActivity;
import defpackage.anya;
import defpackage.asej;
import defpackage.asot;
import defpackage.dglq;
import defpackage.dgtf;
import defpackage.dgtq;
import defpackage.enre;
import defpackage.ensj;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ModuleInitializationIntentOperation extends anya {
    public static final asot a = asot.b("Trustlet_Onbody", asej.TRUSTLET_ONBODY);
    final Collection b = Arrays.asList(dgtf.d(), PromoteScreenLockAndOnbodyChimeraActivity.j, WebpageOnbodyPromotionChimeraActivity.j);

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        for (dglq dglqVar : this.b) {
            String b = dglqVar.b();
            if (dglqVar.c()) {
                ensj.t(dglqVar.a(), new dgtq(this, b), enre.a);
            }
        }
    }
}

package com.google.android.gms.trustagent.common.framework;

import android.content.Intent;
import com.google.android.gms.trustagent.common.service.PreferenceChimeraService;
import com.google.android.gms.trustagent.common.ui.ConfirmUserCredentialAndStartChimeraActivity;
import defpackage.anya;
import defpackage.asej;
import defpackage.asot;
import defpackage.dglq;
import defpackage.dglr;
import defpackage.enre;
import defpackage.ensj;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ModuleInitializer extends anya {
    public static final asot a = asot.b("TrustAgent", asej.TRUSTAGENT);
    private final List b = Arrays.asList(ConfirmUserCredentialAndStartChimeraActivity.j, PreferenceChimeraService.b);

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        for (dglq dglqVar : this.b) {
            String b = dglqVar.b();
            if (dglqVar.c()) {
                ensj.t(dglqVar.a(), new dglr(this, b), enre.a);
            }
        }
    }
}

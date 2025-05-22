package com.google.android.gms.trustagent.common.framework;

import android.content.Intent;
import com.google.android.gms.trustagent.common.service.PreferenceChimeraService;
import com.google.android.gms.trustagent.common.ui.ConfirmUserCredentialAndStartChimeraActivity;
import defpackage.apzs;
import defpackage.auid;
import defpackage.ausn;
import defpackage.diwv;
import defpackage.diww;
import defpackage.eqex;
import defpackage.eqgc;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ModuleInitializer extends apzs {
    public static final ausn a = ausn.b("TrustAgent", auid.TRUSTAGENT);
    private final List b = Arrays.asList(ConfirmUserCredentialAndStartChimeraActivity.j, PreferenceChimeraService.b);

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        for (diwv diwvVar : this.b) {
            String b = diwvVar.b();
            if (diwvVar.c()) {
                eqgc.t(diwvVar.a(), new diww(this, b), eqex.a);
            }
        }
    }
}

package com.google.android.gms.trustagent.settings;

import android.content.Intent;
import com.google.android.gms.trustagent.common.ui.ConfirmUserCredentialAndStartChimeraActivity;
import defpackage.dglm;
import j$.util.Optional;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TrustAgentSearchEntryPointChimeraActivity extends dglm {
    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStart() {
        super.onStart();
        startActivity(ConfirmUserCredentialAndStartChimeraActivity.b(this, new Intent().setClassName(this, "com.google.android.gms.trustagent.GoogleTrustAgentPersonalUnlockingSettings"), (String) Optional.empty().orElse(null)));
        finish();
    }
}

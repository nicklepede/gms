package com.google.android.gms.trustagent.settings;

import android.content.Intent;
import com.google.android.gms.trustagent.common.ui.ConfirmUserCredentialAndStartChimeraActivity;
import defpackage.diwr;
import j$.util.Optional;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TrustAgentSearchEntryPointChimeraActivity extends diwr {
    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStart() {
        super.onStart();
        startActivity(ConfirmUserCredentialAndStartChimeraActivity.b(this, new Intent().setClassName(this, "com.google.android.gms.trustagent.GoogleTrustAgentPersonalUnlockingSettings"), (String) Optional.empty().orElse(null)));
        finish();
    }
}

package com.google.android.gms.semanticlocation.service;

import android.content.Intent;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SemanticLocationDebugSettingsIntentOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        return new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.semanticlocation.debug.DebugActivity"), 2, "Semantic Location Debug", aqlc.SEMANTICLOCATIONHISTORY_DEBUG_ITEM, auiq.DEFAULT_SEMANTICLOCATION);
    }
}

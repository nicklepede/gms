package com.google.android.gms.semanticlocation.service;

import android.content.Intent;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SemanticLocationDebugSettingsIntentOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        return new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.semanticlocation.debug.DebugActivity"), 2, "Semantic Location Debug", aojj.SEMANTICLOCATIONHISTORY_DEBUG_ITEM, asew.DEFAULT_SEMANTICLOCATION);
    }
}

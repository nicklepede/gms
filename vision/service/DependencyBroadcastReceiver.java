package com.google.android.gms.vision.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.dknx;
import defpackage.ektg;
import defpackage.ekvi;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class DependencyBroadcastReceiver extends BroadcastReceiver {
    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        intent.getAction();
        if (intent.getAction() == null && !intent.hasExtra("com.google.android.gms.vision.DEPENDENCIES")) {
            dknx.e(context, new ArrayList(), false, true, intent.getIntExtra("ttl", 30), ektg.a);
            return;
        }
        String stringExtra = intent.getStringExtra("com.google.android.gms.vision.DEPENDENCIES");
        if (stringExtra != null) {
            dknx.c(context, stringExtra, false, intent.hasExtra("retry_backoff_in_seconds") ? ekvi.j(Long.valueOf(intent.getLongExtra("retry_backoff_in_seconds", 0L))) : ektg.a);
        }
    }
}

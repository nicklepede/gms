package com.google.android.gms.vision.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.dicm;
import defpackage.eigb;
import defpackage.eiid;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class DependencyBroadcastReceiver extends BroadcastReceiver {
    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        intent.getAction();
        if (intent.getAction() == null && !intent.hasExtra("com.google.android.gms.vision.DEPENDENCIES")) {
            dicm.e(context, new ArrayList(), false, true, intent.getIntExtra("ttl", 30), eigb.a);
            return;
        }
        String stringExtra = intent.getStringExtra("com.google.android.gms.vision.DEPENDENCIES");
        if (stringExtra != null) {
            dicm.c(context, stringExtra, false, intent.hasExtra("retry_backoff_in_seconds") ? eiid.j(Long.valueOf(intent.getLongExtra("retry_backoff_in_seconds", 0L))) : eigb.a);
        }
    }
}

package com.google.android.gms.stats;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.stats.eastworld.EastworldAlarmOperation;
import defpackage.anya;
import defpackage.derd;
import defpackage.eiig;
import defpackage.fsif;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class StatsInitChimeraIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        boolean z = (i & 8) != 0;
        boolean z2 = (i & 4) != 0;
        if (z2 || z) {
            PlatformStatsCollectorChimeraService.e(this);
        }
        if (z2 || z || (i & 2) != 0) {
            Intent startIntent = IntentOperation.getStartIntent(this, EastworldAlarmOperation.class, "com.google.android.gms.stats.eastworld.action.EASTWORLD_ALARM");
            eiig.x(startIntent);
            startIntent.putExtra("extra_for_init_intent", true);
            startService(startIntent);
            if (fsif.d()) {
                derd.c();
            }
        }
    }
}

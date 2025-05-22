package com.google.android.gms.stats;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.stats.eastworld.EastworldAlarmOperation;
import defpackage.apzs;
import defpackage.dhcg;
import defpackage.ekvl;
import defpackage.fvdd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class StatsInitChimeraIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        boolean z = (i & 8) != 0;
        boolean z2 = (i & 4) != 0;
        if (z2 || z) {
            PlatformStatsCollectorChimeraService.e(this);
        }
        if (z2 || z || (i & 2) != 0) {
            Intent startIntent = IntentOperation.getStartIntent(this, EastworldAlarmOperation.class, "com.google.android.gms.stats.eastworld.action.EASTWORLD_ALARM");
            ekvl.y(startIntent);
            startIntent.putExtra("extra_for_init_intent", true);
            startService(startIntent);
            if (fvdd.d()) {
                dhcg.c();
            }
        }
    }
}

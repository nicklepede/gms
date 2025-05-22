package com.google.android.gms.nearby.mediums;

import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.mediums.NearFieldCommunication$1;
import defpackage.clol;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class NearFieldCommunication$1 extends TracingBroadcastReceiver {
    public final /* synthetic */ clol a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearFieldCommunication$1(clol clolVar) {
        super("nearby", "DiscoveryReceiver");
        this.a = clolVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        final Tag tag;
        if (!"android.nfc.action.TAG_DISCOVERED".equals(intent.getAction()) || (tag = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG")) == null) {
            return;
        }
        this.a.b(new Runnable() { // from class: cloj
            @Override // java.lang.Runnable
            public final void run() {
                NearFieldCommunication$1.this.a.c(tag);
            }
        });
    }
}

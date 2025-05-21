package com.google.android.gms.nearby.mediums;

import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.mediums.NearFieldCommunication$1;
import defpackage.cjgg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class NearFieldCommunication$1 extends TracingBroadcastReceiver {
    public final /* synthetic */ cjgg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearFieldCommunication$1(cjgg cjggVar) {
        super("nearby", "DiscoveryReceiver");
        this.a = cjggVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        final Tag tag;
        if (!"android.nfc.action.TAG_DISCOVERED".equals(intent.getAction()) || (tag = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG")) == null) {
            return;
        }
        this.a.b(new Runnable() { // from class: cjge
            @Override // java.lang.Runnable
            public final void run() {
                NearFieldCommunication$1.this.a.c(tag);
            }
        });
    }
}

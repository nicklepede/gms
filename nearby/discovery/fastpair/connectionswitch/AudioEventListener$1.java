package com.google.android.gms.nearby.discovery.fastpair.connectionswitch;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.discovery.fastpair.connectionswitch.AudioEventListener$1;
import defpackage.cgrw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class AudioEventListener$1 extends TracingBroadcastReceiver {
    public final /* synthetic */ cgrw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioEventListener$1(cgrw cgrwVar) {
        super("OutgoingCallStateListener");
        this.a = cgrwVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, final Intent intent) {
        this.a.b(new Runnable() { // from class: cgrp
            @Override // java.lang.Runnable
            public final void run() {
                String action = intent.getAction();
                if (action == null || !action.equals("android.intent.action.NEW_OUTGOING_CALL")) {
                    return;
                }
                AudioEventListener$1 audioEventListener$1 = AudioEventListener$1.this;
                String b = cgiw.OUTGOING_CALL.b(cfdm.a.nextInt());
                cfcp a = cgiv.a(cgiv.c(b, chnt.SMART_AUDIO_SOURCE_SWITCHING), b);
                ((ejhf) a.d().ah(6640)).x("FastPair: AudioEventListener receive new outgoing call");
                cgst cgstVar = audioEventListener$1.a.q;
                eiig.x(cgstVar);
                cgstVar.i(cicv.CALL_OUTGOING, a);
            }
        });
    }
}
